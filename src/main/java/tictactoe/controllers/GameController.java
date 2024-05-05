package tictactoe.controllers;

import tictactoe.model.Game;
import tictactoe.model.GameState;
import tictactoe.model.Player;
import tictactoe.strateggies.winningStrategies.WinningStrategies;

import java.util.List;

public class GameController {

    public Game startGame(int dimension, List<Player> players, List<WinningStrategies> winningStrategies){
        return Game.getBuilder().setDimension(dimension)
                         .setPlayers(players)
                         .setWinningStrategies(winningStrategies)
                         .build();
    }
    public GameState getGameState(Game game){
        return game.getGameState();
    }
    public void printBoard(Game game){
        game.printBoard();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }
    public Player getWinner(Game game){
        return game.getWinner();
    }
}
