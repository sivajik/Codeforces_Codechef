package cc.DSALearningSeries.Week01;

import java.util.ArrayList;
import java.util.List;

public class Prob02_FLOW007 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int T = scanner.nextInt();
		while (T > 0) {
			int i = scanner.nextInt();
			list.add(reverse(i));
			T--;
		}
		for (int elem : list) {
			System.out.println(elem);
		}
	}

	private static Integer reverse(int i) {
		int res = 0;
		while (i > 0) {
			int reminder = i % 10;
			res = (res * 10) + reminder;
			i = i / 10;
		}
		return res;
	}

}
