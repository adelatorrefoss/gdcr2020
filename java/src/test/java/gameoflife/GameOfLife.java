package gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GameOfLife {

	private boolean grid[];

	@Test
	public void grid_empty_remains_empty() {
		initGrid();

		grid = nextTurn(grid);
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
		return grid;
	}
}


// mvn test && git commit -am working || git reset --hard
