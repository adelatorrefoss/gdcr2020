package gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GameOfLife {

	public boolean[][] grid;

	@Test
	public void everything_is_dead_remains_dead() {
		initGrid();

		assertEquals(false, grid[0][0]);
		assertEquals(false, grid[0][1]);
		assertEquals(false, grid[0][2]);
		assertEquals(false, grid[1][0]);
		assertEquals(false, grid[1][1]);
		assertEquals(false, grid[1][2]);
		assertEquals(false, grid[2][0]);
		assertEquals(false, grid[2][1]);
		assertEquals(false, grid[2][2]);
	}

	@Test
	public void a_cell_who_has_less_than_two_neighbours() {
		initGrid();


	}

	private void initGrid() {
		grid = new boolean[3][3];
		grid[0][0] = false;
		grid[0][1] = false;
		grid[0][2] = false;
		grid[1][0] = false;
		grid[1][1] = false;
		grid[1][2] = false;
		grid[2][0] = false;
		grid[2][1] = false;
		grid[2][2] = false;
	}
}
