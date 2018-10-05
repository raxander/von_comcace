package _09_07;

/**
 * 
 * Steuerungselemente: continue, break, return
 *
 * Continue: -Iteration vorzeitig beenden break: -Schleife oder switch case verlassen
 *  return: -Eine Methode verlassen
 */
public class ContinueBreakReturn {
	private static void m() {
		int[][] ia = { { 1, -2, 3 }, { 1, 3,0, 5 }, { 5, 7, 9, 0, 2, 4, 6 } };
		int summe = 0;
		outer_loop:
		for (int i = 0; i < ia.length; i++) {//3 Iterationen
			//inner_loop:
				for (int j = 0; j < ia[i].length; j++) {
				if(ia[i][j] < 0) continue outer_loop;//i 0 j 0 -> i = 1, j 
				if(ia[i][j] == 0) break outer_loop;
				if(ia[i][j] == -17) return ;
				summe += ia[i][j];

			}//end of inner loop

		} // end of outer loop
	}//end of methode

	public static void main(String[] args) {
		
	
	

	}

}
