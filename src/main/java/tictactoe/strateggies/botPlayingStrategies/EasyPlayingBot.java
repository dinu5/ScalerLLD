package tictactoe.strateggies.botPlayingStrategies;

import tictactoe.model.Board;
import tictactoe.model.Cell;
import tictactoe.model.CellState;
import tictactoe.model.Move;

public class EasyPlayingBot implements BotPlayingStrategy{
    @Override
    public Cell makeMove(Board board){

        for(int i=0;i<board.getDimension();i++){
            for(int j=0;j<board.getDimension();j++){
                Cell cell = board.getBoard().get(i).get(j);
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return cell;
                }
            }
        }
        return null;
    }
}
