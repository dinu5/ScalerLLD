package tictactoe.strateggies.winningStrategies;

import tictactoe.model.Board;
import tictactoe.model.Move;

import java.util.HashMap;
import java.util.Map;

public class ColWinningStrategy implements WinningStrategies{
    static Map<Integer, Map<Character,Integer>> map = new HashMap();
    @Override
    public boolean checkWinner(Board board, Move move) {
//        System.out.println("Column check winner strategy is getting callled");
        int col = move.getCell().getCol();
        char symbol = move.getPlayer().getSymbol().getaChar();
        if(!map.containsKey(col)){
            map.put(col,new HashMap<Character,Integer>());
        }
        Map<Character,Integer> colMap = map.get(col);
        if(!colMap.containsKey(symbol)) {
            colMap.put(symbol,0);
        }
        colMap.put(symbol, colMap.get(symbol) + 1);
        return colMap.get(symbol).equals(board.getDimension());
    }
}
