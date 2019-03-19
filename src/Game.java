import java.util.Collection;
import java.util.List;

class Game {
  private List<Player> players;
  private Board board;
  private List winningCombinations;
  private Player currentPlayer;

  Game(List<Player> players, Board board) {
    this.players = players;
    this.board = board;
    this.currentPlayer = players.get(0);
    winningCombinations = Combinations.COMBINATIONS.getCombinations();
  }

  boolean play(int cellNo) {
    Character symbol = currentPlayer.getSymbol();
    board.placeMark(cellNo, symbol);
    currentPlayer.play(cellNo);
    if(hasWon(currentPlayer)) {
      return true;
    }
    nextPlayer();
    return false;
  }

  private boolean hasWon(Player player) {
    List<Integer> playerMoves = player.getMoves();
    return winningCombinations.stream().anyMatch(combination -> playerMoves.containsAll((Collection<?>) combination));
  }

  private void nextPlayer() {
    int index = this.players.indexOf(currentPlayer);
    int nextPlayerIndex = (index + 1) % this.players.size();
    this.currentPlayer = this.players.get(nextPlayerIndex);

  }

  String getCurrentPlayerName() {
    return currentPlayer.getName();
  }

  String printBoard() {
    return board.printable();
  }
}
