package ma.octo.tdd.formation.puisance4;

import ma.octo.tdd.formation.puisance4.externalDependancy.IPrinter;
import ma.octo.tdd.formation.puisance4.externalDependancy.IUserInput;

public class Puissance4 {
	
	private IPrinter printer;
	private IUserInput userInput;
	private Grid grid;
	private Arbitre arbitre;

	public Puissance4(Grid grid, IUserInput userInput) {
		this.grid = grid;
		this.userInput = userInput;
	}

	public Puissance4(Arbitre arbitre, IPrinter printer) {
		this.arbitre = arbitre;
		this.printer = printer;
	}

	public void waitColumn() {
		Integer playedColumn = Integer.valueOf(userInput.getPlayedColumn());
		grid.putTokenAt(playedColumn, new Token(Color.YELLOW));
	}

	public void printNextPlayer() {
		Color nextPlayerColor = arbitre.whosNext();
		printer.print(nextPlayerColor);
	}

}
