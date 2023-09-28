package uk.ac.rhul.sudokuSolverFinal;

public class SudokuSolver {
  
  public static int BOARD_SIZE = 9; // setting the board size to 9 and giving it a variable name to call
  
  private static int[][] sudokuBoard = {
      {0, 0, 0, 2, 6, 0, 7, 0, 1},
      {6, 8, 0, 0, 7, 0, 0, 9, 0},
      {1, 9, 0, 0, 0, 4, 5, 0, 0},
      {8, 2, 0, 1, 0, 0, 0, 4, 0},
      {0, 0, 4, 6, 0, 2, 9, 0, 0},
      {0, 5, 0, 0, 0, 3, 0, 2, 8},
      {0, 0, 9, 3, 0, 0, 0, 7, 4},
      {0, 4, 0, 0, 5, 0, 0, 3, 6},
      {7, 0, 3, 0, 1, 8, 0, 0, 0} 
    };

  public static void main(String[] args) {
    
    
    // solve board to complete the full board and print board to print the board we have solved
    
    solve(sudokuBoard);
    printBoard(sudokuBoard);
    
  }
   // method to print the board that we have solved using the solver
  public static void printBoard(int[][] board) {
    for(int i = 0; i < BOARD_SIZE; i++) {
      if((i % 3 == 0) && (i != 0)) {
        System.out.println("-------------------");
      }
      
       // for loop that iterates between 0 and board size (9)
      for(int j = 0; j < BOARD_SIZE; j++) {
        if((j % 3 == 0) && (j != 0)) {
          System.out.print(" ");
          System.out.print(board[i][j]);
        } else {
          System.out.print(board[i][j]);
        }
      }
      System.out.println("");
    }
  }
  
  
  // method to find the empty cell in the sudoku board and returning its position
  public static Position findEmptyCell(int[][] board) {
    for(int i = 0; i < BOARD_SIZE; i++) {
      for(int j = 0; j < BOARD_SIZE; j++) {
        if(board[i][j] == 0) {
          return new Position(i, j);
        }
      }
    }
    return null;
  }
  
  // method that solves the board by finding an empty cell and recursively finding a value that follows the rules of sudoku
  // further goes to fill the empty cell with this value
  public static boolean solve(int[][] board) {
    Position emptyCell = findEmptyCell(board);
    
    if(emptyCell == null) {
      return true;
    }
    
    for(int i = 1; i<=9; i++) {
      if(Validate.isValid(board, i, emptyCell)) {
        board[emptyCell.getRow()][emptyCell.getCol()] = i;
        if(solve(board)) {
          return true;
        }
        
        board[emptyCell.getRow()][emptyCell.getCol()] = 0;
      }
    }
    
    return false;
  }
  
  
  
}
