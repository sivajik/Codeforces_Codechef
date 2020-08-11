package cc.longchallenges.aug2020;

import java.util.Scanner;

public class Prob03_CRDGAME3 {

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

		for (int i = 0; i < inputs.length; i += 2) {
			int[] op = whoIsWinner(Integer.parseInt(inputs[i]), Integer.parseInt(inputs[i + 1]));
			System.out.println(op[0] + " " + op[1]);
		}
	
	}

	private static int[] whoIsWinner(int chefPower, int rickPower) {
		int chefMinDigits = getMinDigitsWithPower(chefPower);
		int rickMindigits = getMinDigitsWithPower(rickPower);
		int winner = chefMinDigits == rickMindigits ? 1 : (chefMinDigits < rickMindigits ? 0 : 1);
		int winnerDigits = Math.min(chefMinDigits, rickMindigits);
		return new int[] { winner, winnerDigits };
	}

	private static int getMinDigitsWithPower(int reqSum) {
		return (reqSum/9) + (reqSum % 9 != 0  ? 1 : 0); 
	}

}
