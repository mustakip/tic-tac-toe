package com.tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);


  private static void start(Game game) {
    System.out.println("Welcome to tic-tac-toe");
    for(int i = 0; i < 9; i++) {
      String playerName = game.getCurrentPlayerName();
      int cellNo = getUserInput(playerName);
      System.out.println("int is " + cellNo);
      boolean isWon = game.play(cellNo);
      System.out.println(game.printBoard());
      if(isWon) {
        System.out.println(playerName + " has won");
        return;
      }
    }
    System.out.println("com.tictactoe.Game draw");
  }

  public static void main(String[] args) {
    Game game = initializeGame();
    Main.start(game);
  }

  private static Game initializeGame() {
    List<Player> players = Main.getPlayers();
    Board board = new Board();
    return new Game(players, board);
  }


  private static ArrayList getPlayers() {
    System.out.println("Player1 Name: ");
    String player1Name = scanner.nextLine();
    System.out.println("Player2 Name: ");
    String player2Name = scanner.nextLine();
    Player player1 = new Player(player1Name, 'X');
    Player player2 = new Player(player2Name, 'O');
    return new ArrayList<>(Arrays.asList(player1, player2));
  }

  private static int getUserInput(String playerName) {
    System.out.println(playerName + "'s turn");
    return scanner.nextInt();
  }
}
