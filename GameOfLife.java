import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class GameOfLifeLoop {
    private GameOfLifeStates states;
    private int[][] MainBoard;
    private int generation;
    public GameOfLifeLoop(int rows, int columns, int delay) {
        this.generation = 0;
        states = new GameOfLifeStates();
        MainBoard = states.RandomState(rows, columns);
        InfiniteLoop(delay);
    }

    public void InfiniteLoop(int delay) {
        states.RenderState(MainBoard);
        System.out.println("Generation: " + generation);
        int[][] board = MainBoard;
        while(true) {
            board = states.NextState(board);
            states.RenderState(board);
            generation++;
            System.out.println("Generation: " + generation);
            try {
                TimeUnit.MILLISECONDS.sleep(delay);   
            } catch(Exception e) {

            }
            
            
            System.out.print("\033[H\033[2J");
            
            
            
        }
    }
}

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

        GameOfLifeLoop game = new GameOfLifeLoop(row, column, delay);
    }
}