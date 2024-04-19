package tictactoe.strateggies.winningStrategies;

import tictactoe.model.Board;
import tictactoe.model.Move;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategies{
    static Map<Integer, Map<Character,Integer>> map = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int dimension = board.getDimension();
        char symbol = move.getPlayer().getSymbol().getaChar();
        if(!map.containsKey(row)){
            map.put(row,new HashMap<>());
        }
        Map<Character,Integer> currRow = map.get(row);
        if(!currRow.containsKey(symbol)){
            currRow.put(symbol,0);
        }else{
            currRow.put(symbol,currRow.get(symbol)+1);
        }
        return currRow.get(symbol)==dimension;
    }
}
