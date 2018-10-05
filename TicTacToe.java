//TicTacToe.java
 public class TicTacToe{
 	//creates a blank 2d array 
 	int[][] board =  new int[3][3];
 

 	public void makeBoard(){
 		// makes board
 		System.out.println("-------------");
 		for (int i = 0; i < 3; i++){
 			System.out.print("| ");
 			for (int j = 0; j < 3; j++){
 				System.out.print(board[i][j]+ " | ");
 			}
 		System.out.println();
 		System.out.println("------------");
 	}
 	}

 	public void makeMove(int player, int row, int col){
 		// adds value on the board
 			board[row][col] = player;
 	}

	public boolean legalPlay(int row, int col) {
		//checks if a number was 0-2 otherwise false
    	if ((row > 2 || col > 2) || (row < 0 || col < 0)){
        	return true;
        //checks if there is a changed value of 1 or 2, if so then false
    	} else if (board[row][col] == 1 || board[row][col] == 2) {
        	return true;
    	}else{
    		return false;
    	}
    	
	}


 	public boolean wonGame(){
 		// checks every crossway to see if there is a match

 		if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && (board[0][0] == 1 || board[0][0] == 2)) {
            return true;

        } else if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && (board[0][1] == 1 || board[0][1] == 2)) {
            return true;

        } else if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && (board[0][2] == 1 || board[0][2] == 2)) {
            return true;

        } else if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && (board[0][0] == 1 || board[0][0] == 2)) {
            return true;

        } else if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && (board[1][0] == 1 || board[1][0] == 2)) {
            return true;

        } else if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && (board[2][0] == 1 || board[2][0] == 2)) {
            return true;

        } else if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && (board[0][0] == 1 || board[0][0] == 2)) {
            return true;

        } else if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && (board[2][0] == 1 || board[2][0] == 2)) {
            return true;

        } else {
            return false;

        }

 	}

 	    public boolean tieGame() {
 	    	//checks each place on board is full to see if tie or not by looping through each time
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            if (board[i][j] == 0) {
               return false; 
            }
         }
      }
      return true; 
    }


}








 