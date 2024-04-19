package tictactoe.strateggies.winningStrategies;

import tictactoe.model.Board;
import tictactoe.model.Move;

import java.util.HashMap;
import java.util.Map;

public class ColWinningStrategy implements WinningStrategies{
    static Map<Integer, Map<Character,Integer>> map = new HashMap();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int col = move.getCell().getCol();
        char symbol = move.getPlayer().getSymbol().getaChar();
        if(!map.containsKey(col)){
            map.put(col,new HashMap<Character,Integer>());
        }
        Map<Character,Integer> colMap = map.get(col);
        if(colMap.containsKey(symbol)) {
            colMap.put(symbol, colMap.get(symbol) + 1);
        }else{
            colMap.put(symbol,0);
        }
        return colMap.get(symbol)==board.getDimension();
    }
}
