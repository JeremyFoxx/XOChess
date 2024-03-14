/*   On a N x N board, two players play O or X on the board
 *   The one who first takes an entire row, or column or diagonal, wins.
 *   e.g. 
 *   3 x 3 board 
 *   
 *    O X O
 *    X O X
 *    X X O
 *
 *Then O wins
 *
 *This class is simple. We create a N x N board (N is an user input from the console),
 *which is a 2-D boolean array
 *randomly assign true or false to each element.
 *
 *Then print the result, if true, print X, else print O.
 */    


import java.util.Scanner;
import java.util.Random;


public class XOChess {
	
	
	/**
	 * Create a play board 
	 * @param row  the number of rows of the board
	 * @param col  the number of cols of the board
	 * @param seed
	 * @return
	 */
	public static boolean[][] makeBoard(int row, int col, long seed){
		//create a 2-D boolean array 
		//common mistake: assign values to parameters like row = 5;
		boolean[][] board = new boolean[row][col];
		//create a random object using given seed (type long)
	//  Scanner sc       = new Scanner(System.in);	
		Random generator = new Random(seed);
		//We can use the Random object to assign random values to each element in board
		//using nextBoolean() 
		/*A random generator generates pseudo-random numbers.
		 * This means it's generated from a function. Seed is the argument of the function f(seed) = ....
		 * Same seed will generate the same sequence.
		 */
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				//board[i][j] means everyone in board
				//random object named generator, calling the random member function nextBoolean()
				board[i][j] = generator.nextBoolean();
			}
		}
		//for value-returning methods, you must use "return" to return the thing you want
		return board;
	}
	
	/**
	 * print the given board
	 * @param board is a 2-D boolean array
	 */
	public static void printBoard(boolean[][] board) {
		//DO NOT assign values to parameters
		//e.g. common mistake: board = {};
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				if(board[i][j]) System.out.print("X ");
				else System.out.print("O ");
			}
			System.out.println();
		}
		//No keyword "return" since it is a void method
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please decide the size of the play board N ==> ");
		int n = sc.nextInt();
		System.out.println("Please enter a random seed ==> ");
		long seed = sc.nextLong();
		
		boolean[][] myBoard = makeBoard(n, n, seed);
		System.out.println("The result is:");
		printBoard(myBoard);
        sc.close();
	}

}
