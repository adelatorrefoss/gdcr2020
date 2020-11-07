package gameoflife;

import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import java.nio.Buffer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GameOfLife {

	private Board board = new Board();;

	@Test
	public void grid_empty_remains_empty() {
		assertEquals(false, board.position(0,0).status);
		assertEquals(false, board.position(0,1).status);
		assertEquals(false, board.position(0,2).status);
		assertEquals(false, board.position(1,0).status);
		assertEquals(false, board.position(1,1).status);
		assertEquals(false, board.position(1,2).status);
		assertEquals(false, board.position(2,0).status);
		assertEquals(false, board.position(2,1).status);
		assertEquals(false, board.position(2,2).status);
	}

	private class Cell {
		public boolean status = false;
	}

	private class Board {
		private Cell[][] grid;

		public Board() {
			this.grid = new Cell[3][3];
			grid[0][0] = new Cell();
			grid[0][1] = new Cell();
			grid[0][2] = new Cell();
			grid[1][0] = new Cell();
			grid[1][1] = new Cell();
			grid[1][2] = new Cell();
			grid[2][0] = new Cell();
			grid[2][1] = new Cell();
			grid[2][2] = new Cell();
		}

		public Cell position(int x, int y) {
			return grid[x][y];
		}
	}
}
