package ma.octo.tdd.formation.puisance4.test;

import org.junit.Assert;
import org.junit.Test;

import ma.octo.tdd.formation.puisance4.Color;
import ma.octo.tdd.formation.puisance4.Grid;
import ma.octo.tdd.formation.puisance4.Token;

public class GridTest {

	@Test
	public void shouldBeEmptyAtStartUp() {
		// Given
		Grid grid = new Grid();
		
		// When
		
		// Then
		Assert.assertEquals(grid.getColorOfTokenAt(0, 0), null);
	}

	@Test
	public void shouldGetRedTokenWhenPutRedToken() {
		// Given
		Grid grid = new Grid();
		
		// When
		grid.putTokenAt(0, new Token(Color.RED));
		
		// Then
		Assert.assertEquals(grid.getColorOfTokenAt(0, 0), Color.RED);
	}
	
	@Test
	public void shouldGetRedTokenWhenInsert2RedTokensIn2Columns() {
		// Given
		Grid grid = new Grid();
		
		// When
		grid.putTokenAt(0, new Token(Color.RED));
		grid.putTokenAt(1, new Token(Color.RED));
		
		// Then
		Assert.assertEquals(grid.getColorOfTokenAt(0, 0), Color.RED);
		Assert.assertEquals(grid.getColorOfTokenAt(1, 0), Color.RED);
		Assert.assertEquals(grid.getColorOfTokenAt(2, 0), null);
	}
	
	@Test
	public void shouldGetRedTokenWhenInsert2RedTokensInTheSameColumn() {
		// Given
		Grid grid = new Grid();
		
		// When
		grid.putTokenAt(0, new Token(Color.RED));
		grid.putTokenAt(0, new Token(Color.RED));
		
		// Then
		Assert.assertEquals(grid.getColorOfTokenAt(0, 0), Color.RED);
		Assert.assertEquals(grid.getColorOfTokenAt(0, 1), Color.RED);
	}
	
	// TODO : les autres cas a tester 6 et 7 = cas extreem
	/*
	@Test
	public void shouldAcceptMultipleTokens() {
		// Given
		Grid puissance4 = new Grid();
		
		// When
		puissance4.putTokenAt(0, new Token(Color.RED));
		puissance4.putTokenAt(1, new Token(Color.YELLOW));
		
		// Then
		//Assert.assertEquals(puissance4.getColumn(1).length, 2);
	}
	
	@Test
	public void shouldNotAcceptMoreThan6Tokens() {
		
	}
	*/
}
