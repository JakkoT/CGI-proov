package org.example.cgi_sb;

public class Kohad {
        private int[][] grid;
        private final int size = 10; // Grid size of 10x10

        // Constructor
        public Kohad() {
            // Initialize the grid with size 10x10
            grid = new int[size][size];
            // Fill the grid with 0s
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    grid[i][j] = 0;
                }
            }
        }

        // Method to set a position to 1
        public void setPositionToOne(int x, int y) {
            // Check if the coordinates are within the grid bounds
            if (x >= 0 && x < size && y >= 0 && y < size) {
                grid[x][y] = 1;
            } else {
                System.out.println("Coordinates are out of bounds.");
            }
        }

    public int[][] getGrid() {
        return grid;
    }
}

