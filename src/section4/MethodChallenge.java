package section4;

public class MethodChallenge {
  public static void main(String[] args) {
    displayHighScorePosition("Al", calculateHighScorePosition(100));
    displayHighScorePosition("Lee", calculateHighScorePosition(500));
    displayHighScorePosition("Mike", calculateHighScorePosition(100));
    displayHighScorePosition("Arj", calculateHighScorePosition(50));
  }

  public static void displayHighScorePosition(String playerName, int position) {
    System.out.println(playerName + " managed to get into position " + position + " on the high score table");
  }

  public static int calculateHighScorePosition( int playerScore) {
    if (playerScore >= 1000) {
      return 1;
    } else if (playerScore >= 500) {
      return 2;
    } else if (playerScore >= 100) {
      return 3;
    }
    return 4;
  }
}
