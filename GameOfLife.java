import java.util.Scanner;
public class GameOfLife  {
    public static void main(String[] args) {
        int row;
        int column;
        int delay;
        while(true) {
            try {
                Scanner userinput = new Scanner(System.in);
                System.out.println("Please note entering an excessive size may not display properly on the terminal.");
                System.out.println("Enter an integer for size of rows");
                row = userinput.nextInt();
                System.out.println("Enter an integer for size of columns");
                column = userinput.nextInt();
                System.out.println("Enter an integer for delay in milliseconds");
                delay = userinput.nextInt();
                break;
            } catch (Exception e){
                System.out.println("Try again.");
                continue;
            }  
        }
        //run game
        GameOfLifeLoop game = new GameOfLifeLoop(row, column, delay);
    }
}