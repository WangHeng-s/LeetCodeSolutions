package normal;

import java.util.ArrayList;
import java.util.List;

public class Solution_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int total = rows * columns;
        List<Integer> order = new ArrayList<>(total);

        int rowIndex = 0, colIndex = 0;
        boolean[][] visited = new boolean[rows][columns];

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;

        for(int i = 0; i < total; i++){
            order.add(matrix[rowIndex][colIndex]);
            visited[rowIndex][colIndex] = true;

            int nextRowIndex = rowIndex + directions[directionIndex][0];
            int nextColIndex = colIndex + directions[directionIndex][1];

            if(nextColIndex >= columns || nextRowIndex >= rows || nextRowIndex < 0 || nextColIndex < 0 || visited[nextRowIndex][nextColIndex]){
                directionIndex = (directionIndex + 1) % 4;
            }
            rowIndex += directions[directionIndex][0];
            colIndex += directions[directionIndex][1];
        }
        return order;
    }
}
