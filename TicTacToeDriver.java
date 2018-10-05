//TicTacToeDriver.java
import java.util.Scanner;

public class TicTacToeDriver{
	public static void main(String[]args){

		boolean play = true;
		int player = 1;
		Scanner scan = new Scanner(System.in);


		TicTacToe game = new TicTacToe();
		//prints out blank board for beginning
		game.makeBoard();

		while (play = true){

    		// starts off game with player 1, then changes after if statement until end 	
    		System.out.print("Player " + player + ": Choose a row 0-2: ");
    		int r = scan.nextInt();
    		System.out.print("Player " + player + ": Choose a column 0-2: ");
    		int c = scan.nextInt();

    		//makes sure that game play is legal, if it is illegal then it loops until its legal
    		while (game.legalPlay(r ,c )){
        		System.out.println("ILLEGAL PLAY!! Choose another coordinate.");
        		game.makeBoard();
        		System.out.print("Player " + player + ": Choose a row 0-2: ");
        		r=scan.nextInt();
        		System.out.print("Player " + player + ": Choose a column 0-2: ");
        		c=scan.nextInt();
    		}
    		//changes board number
    		game.makeMove(player ,r ,c );
    		//prints out updated board 
    		game.makeBoard();

    		//breaks if game is tie
    		if(game.tieGame()){
        		System.out.println("The game is a tie !");
        		break;
    		}
    		//breaks if someone won game 
    		if(game.wonGame()){
        		System.out.println("The winner is "+ player +" !");
        		break;

    		}

    		//changes player after checking if won or tie for the next turn 
    		if (player == 2){
    			player = 1 ;
    		}else if(player == 1){
        		player = 2;
        	}

		}

	}


}



