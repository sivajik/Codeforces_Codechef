package cc.longchallenges.aug2020;

import java.util.Scanner;

public class Prob02_LINCHESS {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalRows = scanner.nextInt();

		int[] output = new int[totalRows];
		// totalRows *= 2;
		int j = 0;
		while (totalRows > 0) {
			int totalPs = scanner.nextInt();
			int kPos = scanner.nextInt();
			int[] pPositions = new int[totalPs];
			int i = 0;
			while (totalPs > 0) {
				pPositions[i++] = scanner.nextInt();
				totalPs--;
			}
			output[j++] = whoIsWinner(pPositions, kPos);
			totalRows--;
		}

		for (int eachOutput : output) {
			System.out.println(eachOutput);
		}
	}

	private static int whoIsWinner(int[] pPositions, int kPos) {
		int min = Integer.MAX_VALUE;
		int winner = -1;
		for (int eachPPosition : pPositions) {
			if (eachPPosition == kPos) {
				return eachPPosition;
			} else if (eachPPosition > kPos) {
				continue;
			} else {
				if ((kPos - eachPPosition) < eachPPosition) {
					continue;
				}

				if ((kPos - eachPPosition) % eachPPosition == 0) {
					int val = (kPos - eachPPosition) / eachPPosition;
					if (val < min) {
						min = val;
						winner = eachPPosition;
					}
				}
			}
		}
		return winner;
	}

}
