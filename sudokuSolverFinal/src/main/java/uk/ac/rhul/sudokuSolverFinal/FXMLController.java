package uk.ac.rhul.sudokuSolverFinal;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class FXMLController implements Initializable {
	 public static int BOARD_SIZE = 9;
	 
	 private static int[][] inputBoard;
	 
	 private TextField[][] textFieldGrid;
    
	
	 @FXML
	private Label label;
	
	@FXML
	private Button solvebtn;
	
	 @FXML
	    private TextField textField1;

	    @FXML
	    private TextField textField10;

	    @FXML
	    private TextField textField11;

	    @FXML
	    private TextField textField12;

	    @FXML
	    private TextField textField13;

	    @FXML
	    private TextField textField14;

	    @FXML
	    private TextField textField15;

	    @FXML
	    private TextField textField16;

	    @FXML
	    private TextField textField17;

	    @FXML
	    private TextField textField18;

	    @FXML
	    private TextField textField19;

	    @FXML
	    private TextField textField2;

	    @FXML
	    private TextField textField20;

	    @FXML
	    private TextField textField21;

	    @FXML
	    private TextField textField22;

	    @FXML
	    private TextField textField23;

	    @FXML
	    private TextField textField24;

	    @FXML
	    private TextField textField25;

	    @FXML
	    private TextField textField26;

	    @FXML
	    private TextField textField27;

	    @FXML
	    private TextField textField28;

	    @FXML
	    private TextField textField29;

	    @FXML
	    private TextField textField3;

	    @FXML
	    private TextField textField30;

	    @FXML
	    private TextField textField31;

	    @FXML
	    private TextField textField32;

	    @FXML
	    private TextField textField33;

	    @FXML
	    private TextField textField34;

	    @FXML
	    private TextField textField35;

	    @FXML
	    private TextField textField36;

	    @FXML
	    private TextField textField37;

	    @FXML
	    private TextField textField38;

	    @FXML
	    private TextField textField39;

	    @FXML
	    private TextField textField4;

	    @FXML
	    private TextField textField40;

	    @FXML
	    private TextField textField41;

	    @FXML
	    private TextField textField42;

	    @FXML
	    private TextField textField43;

	    @FXML
	    private TextField textField44;

	    @FXML
	    private TextField textField45;

	    @FXML
	    private TextField textField46;

	    @FXML
	    private TextField textField47;

	    @FXML
	    private TextField textField48;

	    @FXML
	    private TextField textField49;

	    @FXML
	    private TextField textField5;

	    @FXML
	    private TextField textField50;

	    @FXML
	    private TextField textField51;

	    @FXML
	    private TextField textField52;

	    @FXML
	    private TextField textField53;

	    @FXML
	    private TextField textField54;

	    @FXML
	    private TextField textField55;

	    @FXML
	    private TextField textField56;

	    @FXML
	    private TextField textField57;

	    @FXML
	    private TextField textField58;

	    @FXML
	    private TextField textField59;

	    @FXML
	    private TextField textField6;

	    @FXML
	    private TextField textField60;

	    @FXML
	    private TextField textField61;

	    @FXML
	    private TextField textField62;

	    @FXML
	    private TextField textField63;

	    @FXML
	    private TextField textField64;

	    @FXML
	    private TextField textField65;

	    @FXML
	    private TextField textField66;

	    @FXML
	    private TextField textField67;

	    @FXML
	    private TextField textField68;

	    @FXML
	    private TextField textField69;

	    @FXML
	    private TextField textField7;

	    @FXML
	    private TextField textField70;

	    @FXML
	    private TextField textField71;

	    @FXML
	    private TextField textField72;

	    @FXML
	    private TextField textField73;

	    @FXML
	    private TextField textField74;

	    @FXML
	    private TextField textField75;

	    @FXML
	    private TextField textField76;

	    @FXML
	    private TextField textField77;

	    @FXML
	    private TextField textField78;

	    @FXML
	    private TextField textField79;

	    @FXML
	    private TextField textField8;

	    @FXML
	    private TextField textField80;

	    @FXML
	    private TextField textField81;

	    @FXML
	    private TextField textField9;
	    
	    @FXML private Button resetbtn;
	    
	    @FXML private Button generatebtn;
	    
	    @FXML private Button easybtn;
	    
	    @FXML private Button medbtn;
	    
	    @FXML private Button hardbtn;
	    
	    @FXML void easybutton(ActionEvent event) {
	    	int[][] sudokuBoard = {
	  	    	  {1, 2, 8, 0, 0, 0, 3, 0, 0},
	  		      {0, 0, 0, 0, 1, 0, 0, 0, 7},
	  		      {0, 4, 0, 6, 0, 0, 0, 8, 0},
	  		      {4, 0, 9, 1, 0, 3, 0, 0, 0},
	  		      {3, 0, 7, 0, 2, 0, 6, 0, 5},
	  		      {0, 0, 0, 5, 0, 7, 1, 0, 4},
	  		      {0, 6, 0, 0, 0, 4, 0, 1, 0},
	  		      {9, 0, 0, 0, 8, 0, 0, 0, 0},
	  		      {0, 0, 1, 0, 0, 0, 4, 2, 8} 
	  	    };
	  	    	this.inputBoard = create2DArray();
	  	    	for (int i = 0; i < this.inputBoard.length; i++) {
	  		        for (int j = 0; j < this.inputBoard[0].length; j++) {
	  		            String value = Integer.toString(sudokuBoard[i][j]);
	  		            this.textFieldGrid[i][j].setText(value);
	  		        }
	  		    }
	    }
	    
	    @FXML void medbutton(ActionEvent event) {
	    	int[][] sudokuBoard = {
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
	  	    	this.inputBoard = create2DArray();
	  	    	for (int i = 0; i < this.inputBoard.length; i++) {
	  		        for (int j = 0; j < this.inputBoard[0].length; j++) {
	  		            String value = Integer.toString(sudokuBoard[i][j]);
	  		            this.textFieldGrid[i][j].setText(value);
	  		        }
	  		    }
	    }
	    
	    @FXML void hardbutton(ActionEvent event) {
	    	int[][] sudokuBoard = {
	  	    	  {0, 2, 5, 0, 0, 0, 0, 9, 1},
	  		      {1, 0, 3, 0, 0, 6, 0, 0, 0},
	  		      {0, 0, 0, 0, 0, 0, 0, 0, 0},
	  		      {0, 0, 0, 2, 5, 0, 0, 0, 7},
	  		      {0, 3, 0, 0, 4, 1, 0, 5, 0},
	  		      {0, 0, 2, 0, 7, 0, 0, 0, 9},
	  		      {0, 1, 0, 0, 0, 8, 9, 2, 0},
	  		      {0, 0, 0, 0, 0, 0, 0, 7, 8},
	  		      {0, 4, 0, 0, 2, 0, 3, 0, 0} 
	  	    };
	  	    	this.inputBoard = create2DArray();
	  	    	for (int i = 0; i < this.inputBoard.length; i++) {
	  		        for (int j = 0; j < this.inputBoard[0].length; j++) {
	  		            String value = Integer.toString(sudokuBoard[i][j]);
	  		            this.textFieldGrid[i][j].setText(value);
	  		        }
	  		    }
	    }
	    
	    
	    
	    @FXML
	    void resetbutton(ActionEvent event) {
	    	for (int i = 0; i < this.inputBoard.length; i++) {
		        for (int j = 0; j < inputBoard[0].length; j++) {
		            String value = "";
		            this.textFieldGrid[i][j].setText(value);
		        }
		    }
		}
	    
	    @FXML
	    void generatebutton(ActionEvent event) {
	    	int[][] sudokuBoard = {
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
	    	this.inputBoard = create2DArray();
	    	for (int i = 0; i < this.inputBoard.length; i++) {
		        for (int j = 0; j < this.inputBoard[0].length; j++) {
		            String value = Integer.toString(sudokuBoard[i][j]);
		            this.textFieldGrid[i][j].setText(value);
		        }
		    }
		}

	@FXML
	void solvebutton(ActionEvent event) {
		System.out.println("Board has been solved!");
		// this fnction needs to call a fucntion that converts in tinput into an 2D array.
		
		
		this.inputBoard = create2DArray();
		solve(this.inputBoard);
		printBoard(this.inputBoard);
		insertSudokuOutput();
	
	}
	
	private int getIntegerValue(TextField textfield) {
		String value = textfield.getText();
		if (value.equals("")) {
			return 0;
		}
		return Integer.parseInt(value);
	}
	
	
	private int[][] create2DArray() {
		int[] row1 = {getIntegerValue(textField1), getIntegerValue(textField2), getIntegerValue(textField3), getIntegerValue(textField4), getIntegerValue(textField5), getIntegerValue(textField6), getIntegerValue(textField7), getIntegerValue(textField8), getIntegerValue(textField9)};
		int[] row2 = {getIntegerValue(textField10), getIntegerValue(textField11), getIntegerValue(textField12), getIntegerValue(textField13), getIntegerValue(textField14), getIntegerValue(textField15), getIntegerValue(textField16), getIntegerValue(textField17), getIntegerValue(textField18)};
		int[] row3 = {getIntegerValue(textField19), getIntegerValue(textField20), getIntegerValue(textField21), getIntegerValue(textField22), getIntegerValue(textField23), getIntegerValue(textField24), getIntegerValue(textField25), getIntegerValue(textField26), getIntegerValue(textField27)};
		int[] row4 = {getIntegerValue(textField28), getIntegerValue(textField29), getIntegerValue(textField30), getIntegerValue(textField31), getIntegerValue(textField32), getIntegerValue(textField33), getIntegerValue(textField34), getIntegerValue(textField35), getIntegerValue(textField36)};
		int[] row5 = {getIntegerValue(textField37), getIntegerValue(textField38), getIntegerValue(textField39), getIntegerValue(textField40), getIntegerValue(textField41), getIntegerValue(textField42), getIntegerValue(textField43), getIntegerValue(textField44), getIntegerValue(textField45)};
		int[] row6 = {getIntegerValue(textField46), getIntegerValue(textField47), getIntegerValue(textField48), getIntegerValue(textField49), getIntegerValue(textField50), getIntegerValue(textField51), getIntegerValue(textField52), getIntegerValue(textField53), getIntegerValue(textField54)};
		int[] row7 = {getIntegerValue(textField55), getIntegerValue(textField56), getIntegerValue(textField57), getIntegerValue(textField58), getIntegerValue(textField59), getIntegerValue(textField60), getIntegerValue(textField61), getIntegerValue(textField62), getIntegerValue(textField63)};
		int[] row8 = {getIntegerValue(textField64), getIntegerValue(textField65), getIntegerValue(textField66), getIntegerValue(textField67), getIntegerValue(textField68), getIntegerValue(textField69), getIntegerValue(textField70), getIntegerValue(textField71), getIntegerValue(textField72)};
		int[] row9 = {getIntegerValue(textField73), getIntegerValue(textField74), getIntegerValue(textField75), getIntegerValue(textField76), getIntegerValue(textField77), getIntegerValue(textField78), getIntegerValue(textField79), getIntegerValue(textField80), getIntegerValue(textField81)};
	
		
		
		TextField[] textFieldRow1 = {textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8, textField9};
		TextField[] textFieldRow2 =	{textField10, textField11, textField12, textField13, textField14, textField15, textField16, textField17, textField18};
		TextField[] textFieldRow3 =	{textField19, textField20, textField21, textField22, textField23, textField24, textField25, textField26, textField27};	
		TextField[] textFieldRow4 = {textField28, textField29, textField30, textField31, textField32, textField33, textField34, textField35, textField36};
		TextField[] textFieldRow5 =	{textField37, textField38, textField39, textField40, textField41, textField42, textField43, textField44, textField45};
		TextField[] textFieldRow6 =	{textField46, textField47, textField48, textField49, textField50, textField51, textField52, textField53, textField54};
		TextField[] textFieldRow7 =	{textField55, textField56, textField57, textField58, textField59, textField60, textField61, textField62, textField63};
		TextField[] textFieldRow8 =	{textField64, textField65, textField66, textField67, textField68, textField69, textField70, textField71, textField72};
		TextField[] textFieldRow9 =	{textField73, textField74, textField75, textField76, textField77, textField78, textField79, textField80, textField81};
									
		//this.textFieldGrid = {textFieldRow1, textFieldRow2, textFieldRow3, textFieldRow4, textFieldRow5, textFieldRow6, textFieldRow7, textFieldRow8, textFieldRow9};
			this.textFieldGrid = new TextField[9][9];
			this.textFieldGrid[0] = textFieldRow1;
			this.textFieldGrid[1] = textFieldRow2;
			this.textFieldGrid[2] = textFieldRow3;
			this.textFieldGrid[3] = textFieldRow4;
			this.textFieldGrid[4] = textFieldRow5;
			this.textFieldGrid[5] = textFieldRow6;
			this.textFieldGrid[6] = textFieldRow7;
			this.textFieldGrid[7] = textFieldRow8;
			this.textFieldGrid[8] = textFieldRow9;
			



			
		
		int[][] board = {row1, row2, row3, row4, row5, row6, row7, row8, row9};
		
		return board;
		
	}
	
	public void insertSudokuOutput() {
	    for (int i = 0; i < this.inputBoard.length; i++) {
	        for (int j = 0; j < inputBoard[0].length; j++) {
	            String value = inputBoard[i][j] != 0 ? Integer.toString(inputBoard[i][j]) : "";
	            this.textFieldGrid[i][j].setText(value);
	        }
	    }
	}

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
      
      @Override
      public void initialize(URL url, ResourceBundle rb) {
          // TODO
      }
}



