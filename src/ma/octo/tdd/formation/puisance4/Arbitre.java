package ma.octo.tdd.formation.puisance4;

public class Arbitre {

	private Color nextPlayer = getNextPlayer(null);

	private Grid grid = new Grid();
	
	public Arbitre(Grid grid2) {
		this.grid = grid;
	}

	public Color whosNext() {
		return nextPlayer;
	}

	public void play(Color color) {
		nextPlayer = getNextPlayer(color);
	}

	private Color getNextPlayer(Color color) {
		
		Color player = Color.YELLOW;
		
		if (color != null) {
			switch (color) {
			case RED:
				player = Color.YELLOW;
				break;
			case YELLOW:
				player = Color.RED;
				break;
			default:
				player = Color.YELLOW;
				break;
			}
		}
		
		return player;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}
}
