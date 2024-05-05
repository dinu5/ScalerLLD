package tictactoe.strateggies.botPlayingStrategies;

import tictactoe.model.Board;
import tictactoe.model.Cell;
import tictactoe.model.Move;

public interface BotPlayingStrategy {
    Cell makeMove(Board board);
}
