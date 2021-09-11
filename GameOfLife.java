public class GameOfLife {
	public String[][] MainBoard;

	public GameOfLife(int rows, int columns) {
		MainBoard = RandomState(rows, columns);
	}

	public String[][] DeadState(int rows, int columns) {
		String[][] DeadBoard = new String[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				DeadBoard[i][j] = " ";
			}
		}

		return DeadBoard;
	}

 	public String[][] RandomState(int rows, int columns) {
		String[][] RandomBoard = new String[rows][columns];
		double RandomNumber = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				RandomNumber = Math.random();
				if (RandomNumber >= 0.5) {
					RandomBoard[i][j] = "ඞ";
				} else {
					RandomBoard[i][j] = " ";
				}
				
			}
		}

		return RandomBoard;
	}

	public void RenderState(String[][] board) {
		int columns = board[0].length;
        int rows = board.length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
	}
	
	public String[][] getBoard() {
		return MainBoard;
	}

	public void NextState(String[][] board) {
		String[][] NextBoardState = board;
		
	}

}
