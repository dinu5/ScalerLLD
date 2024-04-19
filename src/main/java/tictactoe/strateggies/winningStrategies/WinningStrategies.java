package tictactoe.strateggies.winningStrategies;

import tictactoe.model.Board;
import tictactoe.model.Move;

public interface WinningStrategies {
    public boolean checkWinner(Board board, Move move);
}
