package zero.to.one.hundred;

import java.io.IOException;
import java.util.Scanner;

public class Prob_231A_Team {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String totalRows = sc.nextLine();
		Integer rowsInt = Integer.parseInt(totalRows);

		int total = 0;
		for (int i = 0; i < rowsInt; i++) {
			String row = sc.nextLine();
			String[] tokens = row.split(" ");
			int rowSum = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]) + Integer.parseInt(tokens[2]);
			total += rowSum >= 2 ? 1 : 0;
		}
		System.out.println(total);
	}

}
