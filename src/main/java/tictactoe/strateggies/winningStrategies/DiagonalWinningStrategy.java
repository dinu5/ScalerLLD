package tictactoe.strateggies.winningStrategies;

import tictactoe.model.Board;
import tictactoe.model.Move;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategies{
    static Map<Character,Integer> leftDiaMap = new HashMap();
    static Map<Character,Integer> rightDiaMap = new HashMap();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        char symbol = move.getPlayer().getSymbol().getaChar();
        if(row==col){
            leftDiaMap.put(symbol,leftDiaMap.getOrDefault(symbol,0)+1);
            if(leftDiaMap.get(symbol)==board.getDimension()-1) return true;
        }
        if(row+col==board.getDimension()-1){
            rightDiaMap.put(symbol,rightDiaMap.getOrDefault(symbol,0)+1);
            if(rightDiaMap.get(symbol)==board.getDimension()-1) return true;
        }
        return false;
    }
}
