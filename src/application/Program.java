package application;

import chess.ChessMatch;

public class Program {
	
			
	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		/* I decided to change my OS and this push is a test to see if I 
		   made the transition correctly. One can only hope. */
		
	}
	
}
