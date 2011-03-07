/**
 * 
 * Implementation of Towers of Hanoi. 
 * 
 * Uses example from textbook (Data Structures, Koffman & Wolfgang) and our own 
 * understanding of recursive methods.
 * 
 * @author Team 42
 *
 */
public class TowersOfHanoi {
	
	
	/**
	 * 
	 * Moves discs from starting peg to destination using recursion.
	 * Look at supplied diagrams explaining the logic behind this.
	 * 
	 * @param n Number of disks
	 * @param startPeg Starting peg
	 * @param tempPeg Temporary peg
	 * @param destPeg Destination peg
	 */
	public static void showMoves(int n, String startPeg, String tempPeg, String destPeg) {
		if (n==1) {
			// Only one disc, so we're allowed to move.
			System.out.println("Move " + n + " from " + startPeg + " to " + destPeg + "\n");
		} else {
			showMoves(n-1, startPeg, destPeg, tempPeg); // Keep digging down the tree to find allowed move.
			System.out.println("Move " + n + " from " + startPeg + " to " + destPeg + "\n"); // Top disc(s) have moved, so were allowed to move.
			showMoves(n-1, tempPeg, startPeg, destPeg); // Let former top disc know that it should move.
		}		
	}
	
	/**
	 * Calls showMoves() with 3 discs.
	 * L = Left = Start peg
	 * M = Middle = Temp peg
	 * R = Right = Destination peg
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		showMoves(3, "L", "M", "R");
	}

}
