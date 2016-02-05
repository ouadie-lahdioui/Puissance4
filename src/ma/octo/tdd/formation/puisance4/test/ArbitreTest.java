package ma.octo.tdd.formation.puisance4.test;

import org.junit.Assert;
import org.junit.Test;

import ma.octo.tdd.formation.puisance4.Arbitre;
import ma.octo.tdd.formation.puisance4.Color;
import ma.octo.tdd.formation.puisance4.Grid;

public class ArbitreTest {

	@Test
	public void shouldSayYellowAtStartUp() {
		Arbitre arbitre = new Arbitre();
		Assert.assertEquals(arbitre.whosNext(), Color.YELLOW);
	}
	
	@Test
	public void shouldSayRedWhenYellowPlayed() {
		// Given
		Arbitre arbitre = new Arbitre();
		Grid grid = new Grid();
		
		// When
		arbitre.setGrid(grid);
		arbitre.play(Color.YELLOW);
		
		// Then
		Assert.assertEquals(arbitre.whosNext(), Color.RED);
	}
	
}
