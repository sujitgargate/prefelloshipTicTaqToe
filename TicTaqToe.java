import java.util.Random;
import java.util.Scanner;

public class TicTaqToe {

    Random randomToss = new Random();
    String computerLetterOfPlay = null;
    String playerLetterOfPlay = null;
    String playBoard[] = new String [9];

    public static void main(String[] args) {
        TicTaqToe obj = new TicTaqToe();
import java.util.Random;
import java.util.Scanner;

public class UC3 {

    Random randomToss = new Random();
    String computerLetterOfPlay = null;
    String playerLetterOfPlay = null;
    String playBoard[] = new String [9];

    public static void main(String[] args) {
        UC3 obj = new UC3();
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

    //This method chooses between computer and player.
    public void playerTurn() {
        boolean playerTurn = playerToss();
        if(playerTurn == true) {
            System.out.println("Player will Play with letter "+playerLetterOfPlay());
        } else {
            System.out.println("Computer will Play with letter "+computerLetterOfPlay());
        }
    }

    public String allocateLetter(int selectLetter) {
        if(selectLetter == 1){
            computerLetterOfPlay = "X";
            return playerLetterOfPlay = "O";
        } else {
            computerLetterOfPlay = "O";
            return playerLetterOfPlay = "X";
        }
    }

    public String playerLetterOfPlay() {
        System.out.println("Enter The Letter You Want To Play With \nX. OR O.");
        Scanner sc = new Scanner(System.in);
        String letterOfPlay = sc.next();

        switch(letterOfPlay){
            case "O":
                return allocateLetter(1);
            case "X":
                return allocateLetter(2);
            default:
                System.out.println("Wrong Input");
        }
        return letterOfPlay;
    }

    //Choosing letter for computer Randomly.
    public String computerLetterOfPlay() {

        boolean playLetter = playerToss();
        if(playLetter == true) {
            return allocateLetter(1);
        } else {
            return allocateLetter(2);
        }
    }
}
