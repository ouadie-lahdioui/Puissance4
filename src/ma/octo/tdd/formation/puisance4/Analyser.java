package ma.octo.tdd.formation.puisance4;

public class Analyser {

	private static final int NUMBER_OF_TOKENS_WITH_SAME_COLOR_TO_WIN = 4;
	private Grid grid;

	public Analyser(Grid grid) {
		this.grid = grid;
	}

	public Color getWinner() {
		Color winnerBasedOnColumn = winnerBasedOnColumns();
		return winnerBasedOnColumn;
	}

	private Color winnerBasedOnColumns() {

		for (int columnIndex = 0; columnIndex < grid.COLUMNS; columnIndex++) {

			int nbrOfSameColorOccurrence = 0;

			for (int ligneIndex = 1; ligneIndex < grid.LINES; ligneIndex++) {

				if (nbrOfSameColorOccurrence == NUMBER_OF_TOKENS_WITH_SAME_COLOR_TO_WIN - 1) {
					return grid.getColorOfTokenAt(columnIndex, ligneIndex - 1);
				}

				if (grid.getColorOfTokenAt(columnIndex, ligneIndex - 1) != grid.getColorOfTokenAt(columnIndex, ligneIndex)) {
					nbrOfSameColorOccurrence = 0;
				} else {
					nbrOfSameColorOccurrence++;
				}

			}
		}

		return null;

	}

}
