package ma.octo.tdd.formation.puisance4.test;

import org.junit.Assert;
import org.junit.Test;

import ma.octo.tdd.formation.puisance4.Analyser;
import ma.octo.tdd.formation.puisance4.Color;
import ma.octo.tdd.formation.puisance4.Grid;
import ma.octo.tdd.formation.puisance4.Token;

public class AnalyserTest {

	@Test
	public void shouldReturnNullWhenGridIsEmpty() {
		
		Grid grid = new Grid();
		Analyser analyser = new Analyser(grid);
		
		Assert.assertEquals(analyser.getWinner(), Color.EMPTY);
	}
	
	@Test
	public void shouldReturnEmptyWhenGridHasOneRedTokenInTheSameColumn() {
		
		Grid grid = new Grid();
		grid.putTokenAt(0, new Token(Color.RED));
		
		Analyser analyser = new Analyser(grid);
		
		Assert.assertEquals(analyser.getWinner(), Color.EMPTY);
	}

	@Test
	public void shouldReturnEmptyWhenGridHas2RedTokenInTheSameColumn() {
		
		Grid grid = new Grid();
		grid.putTokenAt(0, new Token(Color.RED));
		grid.putTokenAt(0, new Token(Color.RED));
		
		Analyser analyser = new Analyser(grid);
		
		Assert.assertEquals(analyser.getWinner(), Color.EMPTY);
	}
	
	@Test
	public void shouldReturnRedWhenGridHas4RedTokensInTheSameColum() {
		
		Grid grid = new Grid();
		grid.putTokenAt(0, new Token(Color.RED));
		grid.putTokenAt(0, new Token(Color.RED));
		grid.putTokenAt(0, new Token(Color.RED));
		grid.putTokenAt(0, new Token(Color.RED));
		
		Analyser analyser = new Analyser(grid);
		
		Assert.assertEquals(analyser.getWinner(), Color.RED);
	}
	
	@Test
	public void shouldReturnEmptyWhenGridHasRedAndYellowTokensInTheSameColum() {
		
		Grid grid = new Grid();
		grid.putTokenAt(0, new Token(Color.RED));
		grid.putTokenAt(0, new Token(Color.YELLOW));
		
		Analyser analyser = new Analyser(grid);
		
		Assert.assertEquals(analyser.getWinner(), Color.EMPTY);
	}
	
	@Test
	public void shouldReturnEmptyWhenGridHasRedAnd2YellowTokensInTheSameColum() {
		
		Grid grid = new Grid();
		grid.putTokenAt(0, new Token(Color.RED));
		grid.putTokenAt(0, new Token(Color.YELLOW));
		grid.putTokenAt(0, new Token(Color.YELLOW));
		
		Analyser analyser = new Analyser(grid);
		
		Assert.assertEquals(analyser.getWinner(), Color.EMPTY);
	}
	
	@Test
	public void shouldReturnEmptyWhenGridHas2RedAnd2YellowTokensInTheSameColum() {
		
		Grid grid = new Grid();
		grid.putTokenAt(0, new Token(Color.RED));
		grid.putTokenAt(0, new Token(Color.RED));
		grid.putTokenAt(0, new Token(Color.YELLOW));
		grid.putTokenAt(0, new Token(Color.YELLOW));
		
		Analyser analyser = new Analyser(grid);
		
		Assert.assertEquals(analyser.getWinner(), Color.EMPTY);
	}
	
	@Test
	public void shouldReturnRedWhenGridHasYellowAnd4RedTokensInTheSameColum() {
		
		Grid grid = new Grid();
		grid.putTokenAt(0, new Token(Color.RED));
		grid.putTokenAt(0, new Token(Color.RED));
		grid.putTokenAt(0, new Token(Color.RED));
		grid.putTokenAt(0, new Token(Color.RED));
		grid.putTokenAt(0, new Token(Color.YELLOW));
		
		Analyser analyser = new Analyser(grid);
		
		Assert.assertEquals(analyser.getWinner(), Color.RED);
	}	
}
