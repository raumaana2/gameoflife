import java.util.concurrent.TimeUnit;

public class GameOfLifeLoop {
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