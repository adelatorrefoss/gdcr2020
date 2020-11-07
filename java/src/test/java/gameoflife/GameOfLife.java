package gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameOfLife {

    private Board board = new Board();
    

    @Test
    public void grid_empty_remains_empty() {
        assertEquals(false, board.position(0, 0).status);
        assertEquals(false, board.position(0, 1).status);
        assertEquals(false, board.position(0, 2).status);
        assertEquals(false, board.position(1, 0).status);
        assertEquals(false, board.position(1, 1).status);
        assertEquals(false, board.position(1, 2).status);
        assertEquals(false, board.position(2, 0).status);
        assertEquals(false, board.position(2, 1).status);
        assertEquals(false, board.position(2, 2).status);
    }

    @Test
    public void cell_alone_then_dies() {
        board.position(1, 1).status = true;

        board.nextTurn();

        assertEquals(false, board.position(0, 0).status);
        assertEquals(false, board.position(0, 1).status);
        assertEquals(false, board.position(0, 2).status);
        assertEquals(false, board.position(1, 0).status);
        assertEquals(false, board.position(1, 1).status);
        assertEquals(false, board.position(1, 2).status);
        assertEquals(false, board.position(2, 0).status);
        assertEquals(false, board.position(2, 1).status);
        assertEquals(false, board.position(2, 2).status);
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

        public void nextTurn() {
            Cell cell = position(1, 1);
            int count = 0;

            for (int x = 0; x < 2; x++) {
                for (int y = 0; y < 2; y++) {
                    if (position(x, y).status) {
                        count++;
                    }
                }
            }
        }
    }
}
