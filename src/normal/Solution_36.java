package normal;

import java.util.HashSet;
import java.util.Set;

public class Solution_36 {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            if(!isValidRow(board, i) || !isValidColumn(board, i)){
                return false;
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(!isValidBox(board, i*3, j*3)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidRow(char[][] board, int rowIndex){
        Set<Character> set = new HashSet<>();
        for(int colIndex = 0; colIndex < 9; colIndex++){
            if(board[rowIndex][colIndex] != '.'){
                if(set.contains(board[rowIndex][colIndex])){
                    return false;
                }else{
                    set.add(board[rowIndex][colIndex]);
                }
            }
        }
        return true;
    }

    private boolean isValidColumn(char[][] board, int colIndex){
        Set<Character> set = new HashSet<>();
        for(int rowIndex = 0; rowIndex < 9; rowIndex++){
            if(board[rowIndex][colIndex] != '.'){
                if(set.contains(board[rowIndex][colIndex])){
                    return false;
                }else{
                    set.add(board[rowIndex][colIndex]);
                }
            }
        }
        return true;
    }

    private boolean isValidBox(char[][] board, int rowIndex, int colIndex){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[rowIndex + i][colIndex + j] != '.'){
                    if(set.contains(board[rowIndex + i][colIndex + j])){
                        return false;
                    }else{
                        set.add(board[rowIndex + i][colIndex + j]);
                    }
                }
            }
        }
        return true;
    }
}
