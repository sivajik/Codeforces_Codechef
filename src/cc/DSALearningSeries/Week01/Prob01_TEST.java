package cc.DSALearningSeries.Week01;

import java.util.ArrayList;
import java.util.List;

public class Prob01_TEST {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int T = scanner.nextInt();
		while (T != 42) {
			list.add(T);
			T = scanner.nextInt();
		}
		for (int elem : list) {
			System.out.println(elem);
		}
	}

}
