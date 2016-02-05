package ma.octo.tdd.formation.puisance4;

public class Grid {

	public static final int COLUMNS = 7;
	public static final int LINES = 6;

	private Token[][] board = new Token[COLUMNS][LINES];

	public Color getColorOfTokenAt(int column, int line) {
		if(column <= COLUMNS && line <= LINES) {
			return board[column][line].getColor();
		}
		return null;
	}
	
	public void putTokenAt(int column, Token token) {
		int numberOfTokensInColumn = getNumberOfTokensInColumn(column);
		board[column][numberOfTokensInColumn] = token;
	}

	@Override
	public String toString() {
		return "Fake string :P";
	}
	private int getNumberOfTokensInColumn(int column) {
		for (int row = 0; row < LINES; row++) {
			if (board[column][row] == null) {
				return row;
			}
		}
		return 0;
	}

}
