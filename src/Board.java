import java.util.Arrays;
import java.util.List;

class Board {
  private List<Character> cells;

  Board() {
    this.cells = Arrays.asList(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ');
  }

  void placeMark(int index, Character symbol) {
    this.cells.set(index, symbol);
  }

  String printable() {
    String board = "";
    List<Character> top = cells.subList(1, 4);
    List<Character> middle = cells.subList(4, 7);
    List<Character> bottom = cells.subList(7, 10);
    board += top.toString() + "\n";
    board += middle.toString() + "\n";
    board += bottom.toString() + "\n";
    return board;
  }
}
