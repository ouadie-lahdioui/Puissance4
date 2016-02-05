package ma.octo.tdd.formation.puisance4.test;
import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Matchers;

import ma.octo.tdd.formation.puisance4.Arbitre;
import ma.octo.tdd.formation.puisance4.Color;
import ma.octo.tdd.formation.puisance4.Grid;
import ma.octo.tdd.formation.puisance4.externalDependancy.IPrinter;
import ma.octo.tdd.formation.puisance4.externalDependancy.IUserInput;
import ma.octo.tdd.formation.puisance4.Puissance4;

public class Puissance4Test {

	public static void main(String[] args) {
		
	}

	@Test
	public void shouldGetYellowWhenIStubTheConsoleInput() {
		// Given
		Grid  grid = new Grid();
		IUserInput userInput = mock(IUserInput.class);
		Puissance4 puissance4 = new Puissance4(grid, userInput);
		
		// When
		when(userInput.getPlayedColumn()).thenReturn("0");
		puissance4.waitColumn();
		
		// Then
		Assert.assertEquals(Color.YELLOW, grid.getColorOfTokenAt(0, 0));
	}
	
	@Test
	public void shouldCallPrintWhenIShowTheNextPlayer() {
		// Given
		Grid  grid = new Grid();
		Arbitre arbitre = new Arbitre(grid);
		IPrinter consolePrinter = mock(IPrinter.class);
		Puissance4 puissance4 = new Puissance4(arbitre, consolePrinter);
		
		// When
		puissance4.printNextPlayer();
		
		// Then
		verify(consolePrinter, times(1)).print(Matchers.any());
	}
}
