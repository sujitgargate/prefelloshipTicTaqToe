public class TicTaqToe {

    //Variables
    String playBoard[] = new String [9];

    public static void main(String[] args) {
        TicTaqToe obj = new TicTaqToe();
        obj.resetBoard();
    }

    //Function resetBoard() is used for resetting board
    public void resetBoard() {
        for(int i = 0; i < 9; i++)
        {
            //Allocating null to every position of array
            playBoard[i] = "\0";
        }
        System.out.println("Board Reset Successful");
    }
}
