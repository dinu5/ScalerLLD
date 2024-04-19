package concurrency2.mergesort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(4,1,3,5,2);


        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(list,executorService);
        Future<List<Integer>> sorted = executorService.submit(mergeSorter);
        List<Integer> sortedList = sorted.get();
        System.out.println(sortedList);
        executorService.shutdown();
    }
}
