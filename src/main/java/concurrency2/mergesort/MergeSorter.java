package concurrency2.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>>{
    List<Integer> list;
    ExecutorService executorService;

    public MergeSorter(List<Integer> list,ExecutorService executorService) {
        this.list = list;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        int n = list.size();
        if(n==1) return list;
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        for(int i=0;i<n/2;i++){
            leftList.add(list.get(i));
        }
        for(int i=n/2;i<n;i++){
            rightList.add(list.get(i));
        }
        MergeSorter left = new MergeSorter(leftList,executorService);
        MergeSorter right = new MergeSorter(rightList,executorService);

        executorService = Executors.newCachedThreadPool();
        Future<List<Integer>> leftSorted = executorService.submit(left);
        Future<List<Integer>> rightSorted = executorService.submit(right);

        List<Integer> leftSortedList = leftSorted.get();
        List<Integer> rightSortedList = rightSorted.get();

        List<Integer> finalSorted = new ArrayList<>();

        int i = 0;
        int j =0;
        while(i<leftSortedList.size() && j<rightSortedList.size()){
            if(leftSortedList.get(i)<rightSortedList.get(j)){
                finalSorted.add(leftSortedList.get(i));
                i++;
            }else{
                finalSorted.add(rightSortedList.get(j));
                j++;
            }
        }
        while(i<leftSortedList.size()){
            finalSorted.add(leftSortedList.get(i));
            i++;
        }
        while(j<rightSortedList.size()){
            finalSorted.add(rightSortedList.get(j));
            j++;
        }
        return finalSorted;
    }
}
