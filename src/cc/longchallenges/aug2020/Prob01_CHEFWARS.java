package cc.longchallenges.aug2020;

import java.util.Scanner;

public class Prob01_CHEFWARS {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalRows = scanner.nextInt();
		String[] inputs = new String[totalRows * 2];
		int cnt = 0;
		while (totalRows > 0) {
			inputs[cnt++] = scanner.next();
			inputs[cnt++] = scanner.next();
			totalRows--;
		}

		for (int i = 0; i < inputs.length; i+=2) {
				System.out.println(
						whoIsWinner(Integer.parseInt(inputs[i]), Integer.parseInt(inputs[i+1])));
		}
	}

	private static int whoIsWinner(int darthPow, int chefPow) {
		if (chefPow > darthPow) {
			return 1;
		}

		while (chefPow > 0 && darthPow > 0) {
			darthPow -= chefPow;
			chefPow = chefPow / 2;
		}
		return chefPow == 0 && darthPow > 0 ? 0 : 1;
	}

}
