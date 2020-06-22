package zero.to.one.hundred;

import java.io.IOException;
import java.util.Scanner;

public class Prob_4A_Watermelon {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Integer w = Integer.parseInt(sc.next());
		
		if (w%2 != 0) {
			System.out.println("NO");
		} else {
			if ( w == 2) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}

}
