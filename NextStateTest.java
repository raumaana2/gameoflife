public class NextStateTest {
    public static void main(String[] args) {
        GameOfLifeStates test = new GameOfLifeStates();
        int[][] test1 = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };

        /*
            expected:
            000
            000
            000
        */

        int[][] test2 = {
            {0,1,0},
            {0,0,0},
            {0,0,0}
        };

        /*
            expected:
            000
            000
            000
        */

        int[][] test3 = {
            {0,0,0},
            {0,1,0},
            {0,0,0}
        };

        /*
            expected:
            000
            000
            000
        */

        int[][] test4 = {
            {0,0,0},
            {0,0,0},
            {0,1,0}
        };

        /*
            expected:
            000
            000
            000
        */

        int[][] test5 = {
            {1,1,0},
            {0,0,0},
            {0,0,0}
        };

        /*
            expected:
            000
            000
            000
        */

        int[][] test6 = {
            {0,0,1},
            {0,1,1},
            {0,0,0}
        };

        /*
            expected:
            000
            110
            000
        */

        test.RenderState(test.NextState(test1));
        System.out.println();

        test.RenderState(test.NextState(test2));
        System.out.println();
        test.RenderState(test.NextState(test3));
        System.out.println();
        test.RenderState(test.NextState(test4));
        System.out.println();
        test.RenderState(test.NextState(test5));
        System.out.println();
        test.RenderState(test.NextState(test6));





   
        

    }
}