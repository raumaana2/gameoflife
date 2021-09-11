public class GameOfLife {
	public int[][] MainBoard;

	public GameOfLife(int width, int height) {
		MainBoard = RandomState(width, height);
	}

	public int[][] DeadState(int width, int height) {
		int[][] DeadBoard = new int[width][height];

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				DeadBoard[i][j] = 0;
			}
		}

		return DeadBoard;
	}

 	public int[][] RandomState(int width, int height) {
		int[][] RandomBoard = new int[width][height];
		double RandomNumber = 0;
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
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

	public void PrintBoard() {

	}
	

}
