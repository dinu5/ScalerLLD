package tictactoe.model;

import tictactoe.strateggies.winningStrategies.WinningStrategies;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameState gameState;
    private int nextMovePlayerIndex;
    private List<WinningStrategies> winningStrategies;
    private Player winner;

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Game(int dimension, List<Player> players, List<WinningStrategies> winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.nextMovePlayerIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
        this.moves = new ArrayList<>();
        this.winningStrategies = winningStrategies;

    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void printBoard(){

        board.printBoard();
    }
    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getNextMovePlayerIndex() {
        return nextMovePlayerIndex;
    }

    public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
        this.nextMovePlayerIndex = nextMovePlayerIndex;
    }

    public List<WinningStrategies> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategies> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public void makeMove() {
        Player currentPlayer = players.get(nextMovePlayerIndex);
        System.out.println("It's "+currentPlayer.getName()+"'s turn");
        Move move = currentPlayer.makeMove(board);
        if(!validate(move)){
            System.out.println("Invalid move");
            throw new RuntimeException("invalid move");
        }
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Cell cell = board.getBoard().get(row).get(col);
        cell.setCellState(CellState.FILLED);
        cell.setPlayer(players.get(nextMovePlayerIndex));
        nextMovePlayerIndex = (nextMovePlayerIndex + 1) % players.size();
        Move finalMove = new Move(currentPlayer,cell);
        moves.add(finalMove);
        if(checkWinner(move)){
            winner = currentPlayer;
            gameState = GameState.COMPLETED;

        }else if(moves.size()==board.getDimension()*board.getDimension()){
            gameState = GameState.DRAW;
        }
    }

    private boolean checkWinner(Move move) {
        for(WinningStrategies winningStrategies : winningStrategies){
            if(winningStrategies.checkWinner(board,move)) return true;
        }
        return false;
    }

    private boolean validate(Move move) {
        Cell cell = move.getCell();
        return validateRowCol(cell);
    }

    private boolean validateRowCol(Cell cell) {
        int row = cell.getRow();
        int col = cell.getCol();
        if(row<0 || row>=board.getDimension() || col<0 || col>=board.getDimension()){
            return false;
        }
        //now we have to check whether the cell is not empty or not
        if(!board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY)){
            return false;
        }
        return true;
    }

    public static class Builder{
        int dimension;
        private List<Player> players;
        private List<WinningStrategies> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategies> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public int getDimension() {
            return dimension;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public List<WinningStrategies> getWinningStrategies() {
            return winningStrategies;
        }

        //        private List<Move> moves;
//        private GameState gameState;
//        private int nextMovePlayerIndex;
        public Builder() {
            this.dimension = 0;
            this.players = new ArrayList<>();
            this.winningStrategies = new ArrayList<>();
        }
        public Game build(){
            validation();
            return new Game(dimension,players,winningStrategies);
        }

        private void validation() {
            System.out.println("validation is completed");
        }

    }
}
