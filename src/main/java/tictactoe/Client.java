package tictactoe;

import tictactoe.controllers.GameController;
import tictactoe.model.*;
import tictactoe.strateggies.winningStrategies.ColWinningStrategy;
import tictactoe.strateggies.winningStrategies.DiagonalWinningStrategy;
import tictactoe.strateggies.winningStrategies.RowWinningStrategy;
import tictactoe.strateggies.winningStrategies.WinningStrategies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Main is getting called");
        Scanner scanner = new Scanner(System.in);
        int dimension = 4;
        //Symbol symbol = new Symbol();
        Player ayushee = new Player("ayushee",new Symbol('0'), PlayerType.HUMAN);
        Player bot = new Player("bot",new Symbol('0'), PlayerType.HUMAN);
        List<Player> players = new ArrayList<>();
        players.add(ayushee);
        players.add(bot);
        List<WinningStrategies> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());
        GameController gameController = new GameController();
        Game game = gameController.startGame(dimension,players,winningStrategies);


        // Let's play!!
        while(gameController.getGameState(game).equals(GameState.IN_PROGRESS)){
            gameController.printBoard(game);
            gameController.makeMove(game);
        }
    }
}
