package uk.ac.rhul.sudokuSolverFinal;

//method that gets the position of an empty cell / cell by getting the row and column
public class Position {
  
  private int row;
  private int col;
  
  public Position(int row, int col) {
    this.row = row;
    this.col = col;
  }
  
  //method to get the row of a cell
  public int getRow() {
    return this.row;
  }
  //method to get column of cell
  public int getCol() {
    return this.col;
  }

}
