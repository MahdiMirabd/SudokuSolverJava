package uk.ac.rhul.sudokuSolverFinal;

public class Validate {
  
  public static int BOARD_SIZE = 9; // setting the board size to a variable named board_size
  
  // method to identify the box by number
  public static int findBoxIdentifier(int rowOrCol) {
    if((rowOrCol == 0) || (rowOrCol == 1) ||  (rowOrCol == 2)) {
      return 0;
    } else if ((rowOrCol == 3) || (rowOrCol == 4) || (rowOrCol == 5)){
      return 3;
    }
    return 6;
  }
  
  //method to check if a value in the cell is valid
  public static boolean isValid(int[][] board, int value, Position pos) {
    return isRowValid(board, value, pos.getRow()) &&
        isColValid(board, value, pos.getCol()) &&
        isBoxValid(board, value, pos);
  }
 
  //method that checks if the number is valid based off the row it is in
  public static boolean isRowValid(int[][] board, int value, int row) {
    for(int i = 0; i < BOARD_SIZE; i++) {
      if(board[row][i] == value) {
        return false;
      }
    }
    return true;
  }
  
  // method that checks if the number is valid based off the column it is in
  public static boolean isColValid(int[][] board, int value, int col) {
    for(int i = 0; i < BOARD_SIZE; i++) {
      if(board[i][col] == value) {
        return false;
      }
    }
    return true;
  }
  
  // method that checks if the value is valid within the 3x3 subsection it is in
  public static boolean isBoxValid(int[][] board, int value, Position pos) {
    int identifierRow = findBoxIdentifier(pos.getRow());
    int identifierCol = findBoxIdentifier(pos.getCol());
    
    for(int i = identifierRow; i < identifierRow + 3; i++) {
      for(int j = identifierCol; j < identifierCol + 3; j ++) {
        if (board[i][j] == value) {
          return false;
        }
      }
    }
    return true;
  }
  
  
  

}
