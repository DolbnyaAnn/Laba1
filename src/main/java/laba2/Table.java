package laba2;

public class Table {
    private final int cols;
    private final int rows;
    int[][] values;

    public Table(int col, int row) {
        if (col < 1 || row < 1) {
            throw new IllegalArgumentException("Arguments must be greater than 0");
        }
        this.cols = col;
        this.rows = row;
        this.values = new int[row][col];
    }

    public int getValue(int row, int col) {
        return values[row][col];
    }

    public void setValue(int row, int col, int value) {
        values[row][col] = value;
    }

    public int row() {
        return rows;
    }

    public int col() {
        return cols;
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                out += values[i][j] + "\t";
            }
            out += "\n";
        }
        return out;
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += values[i][j];
            }
        }
        return (double) sum / (rows * cols);
    }
}
