<<<<<<< HEAD
class GameOfLifeLoop {
    private GameOfLifeStates states;
    private int[][] MainBoard;
    public GameOfLifeLoop(int rows, int columns) {
        states = new GameOfLifeStates();

        MainBoard = states.RandomState(rows, columns);



         
    }

    public void InfiniteLoop() {
        while(true) {
            states.RenderState(states.NextState(MainBoard));
        }
    }
}

public class GameOfLife {
    public static void main(String[] args) {
        GameOfLifeLoop test = new GameOfLifeLoop(1920, 1080);

        test.InfiniteLoop();
    }
=======
class GameOfLifeLoop {
    private GameOfLifeStates states;
    private int[][] MainBoard;
    public GameOfLifeLoop(int rows, int columns) {
        states = new GameOfLifeStates();

        MainBoard = states.RandomState(rows, columns);



         
    }

    public void InfiniteLoop() {
        while(true) {
            states.RenderState(states.NextState(MainBoard));
        }
    }
}

public class GameOfLife {
    public static void main(String[] args) {
        GameOfLifeLoop test = new GameOfLifeLoop(1920, 1080);

        test.InfiniteLoop();
    }
>>>>>>> 9399a178de4bae193034b63a6602c7a0911702a0
}