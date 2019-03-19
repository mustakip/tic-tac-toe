package com.tictactoe;

import java.util.ArrayList;
import java.util.List;

class Player {
  private String name;
  private Character symbol;
  private List<Integer> moves;

  Player(String name, Character symbol) {
    this.name = name;
    this.symbol = symbol;
    this.moves = new ArrayList<>();
  }

  String getName() {
    return name;
  }

  Character getSymbol() {
    return symbol;
  }

  List<Integer> getMoves() {
    return moves = new ArrayList<>(this.moves);
  }

  void play(int cellNo) {
    this.moves.add(cellNo);
  }

}
