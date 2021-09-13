public class CellNeighboursTest {
    public static void main(String[] args) {
        int[][] test = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int columns = test[0].length;
        int rows = test.length;

        int x = 0;
        int y = 1;

        System.out.println("rows = " + rows + " columns = " + columns);

        for (int i = Math.max(0, x - 1); i <= Math.min(x + 1, rows); i++) {
            for (int j = Math.max(0, y - 1); j <= Math.min(y + 1, columns); j++) {
                if (i == x & j == y) {
			    	continue;
				}
                


                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}