import java.util.Random;

public class TicTaqToe {

    //Variables
    Random randomToss = new Random();
    String playBoard[] = new String [9];
    int playerPosition = 10;
    int computerPosition = 10;

    public static void main(String[] args) {
        TicTaqToe obj = new TicTaqToe();
        obj.resetBoard();
    }

    //Function resetBoard() is used for resetting board
    public void resetBoard() {
        for(int i = 0; i < 9; i++)
        {
            playBoard[i] = "\0";
        }
        System.out.println("Board Reset Successful");
        playerTurn();
    }

    public boolean playerToss() {
        boolean toss = randomToss.nextBoolean();
        return toss;
    }

    public String playerTurn() {
        boolean playerTurn = playerToss();
        if(playerTurn == true) {
            System.out.println("Player will Play");
            return "Player";
        } else {
            System.out.println("Computer will Play");
            return "Computer";
        }
    }
}
