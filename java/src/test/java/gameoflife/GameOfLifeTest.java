package gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GameOfLifeTest {

	private boolean grid[];

	@Test
	public void grid_empty_remains_empty() {
		initGrid();

		grid = nextTurn(grid);
		assertFalse(grid[0]);
		assertFalse(grid[1]);
		assertFalse(grid[2]);
	}

	@Test
	public void neighbours_are_one_or_less_then_dies() {
		// given
		initGrid();
		grid[0] = false;

		// when
		grid = nextTurn(grid);

		// then
		assertFalse(grid[0]);
		assertFalse(grid[1]);
		assertFalse(grid[2]);
	}

	private void initGrid() {
		grid =  new boolean[3];
		grid[0] = false;
		grid[1] = false;
		grid[2] = false;
	}

	private boolean[] nextTurn(boolean[] grid) {
				grid[0] = false;

		return grid;
	}
}


// mvn test && git commit -am working || git reset --hard
