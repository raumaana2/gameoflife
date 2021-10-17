public class GameOfLifeStates {
	public int[][] DeadState(int rows, int columns) {
		int[][] DeadBoard = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				DeadBoard[i][j] = 0;
			}
		}
		return DeadBoard;
	}

 	public int[][] RandomState(int rows, int columns) {
		int[][] RandomBoard = new int[rows][columns];
		double RandomNumber = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				RandomNumber = Math.random();
				if (RandomNumber >= 0.5) {
					RandomBoard[i][j] = 1;
				} else {
					RandomBoard[i][j] = 0;
				}
				
			}
		}

		return RandomBoard;
	}

	public void RenderState(int[][] board) {
		int columns = board[0].length;
        int rows = board.length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
				if (board[i][j] == 1) {
					System.out.print("X");
				} else {
					System.out.print("·");
				}
                
            }
            System.out.println();
        }
	}
	

	public int[][] NextState(int[][] InitialBoardState) {
		int columns = InitialBoardState[0].length;
		int rows = InitialBoardState.length;
		int[][] NextBoardState = new int[rows][columns];

		for (int x = 0; x < rows; x++ ) {

			for (int y = 0; y < columns; y++) {
				int neighbours = 0;
				for (int i = Math.max(0, x-1); i <= Math.min(x + 1, rows - 1); i++) {
					for (int j = Math.max(0, y - 1); j <= Math.min(y + 1, columns - 1); j++) {
						if (i == x & j == y) {
							continue;
						}
						if (InitialBoardState[i][j] == 1) {
							neighbours++;
						}
					} 
				}

				if (InitialBoardState[x][y] == 1) {
					if (neighbours == 2 | neighbours == 3) {
						NextBoardState[x][y] = 1;
					} else {
						NextBoardState[x][y] = 0;
					}

				} else if (InitialBoardState[x][y] == 0) {
					if (neighbours == 3) {
						NextBoardState[x][y] = 1;
					} else {
						NextBoardState[x][y] = 0;
					}
				}
			} 
		}

		return NextBoardState;
	}

}
