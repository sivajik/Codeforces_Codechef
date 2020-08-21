package cc.DSALearningSeries.Week01;

import java.util.ArrayList;
import java.util.List;

public class Prob03_LAPIN {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		List<String> list = new ArrayList<>();
		int T = scanner.nextInt();
		while (T > 0) {
			String s = scanner.next();
			list.add(solve(s));
			T--;
		}
		for (String elem : list) {
			System.out.println(elem);
		}
	}

	private static String solve(String s) {
		String left, right;
		if (s.length() % 2 == 1) {
			left = s.substring(0, s.length() / 2);
			right = s.substring(s.length() / 2 + 1);
		} else {
			left = s.substring(0, s.length() / 2);
			right = s.substring(s.length() / 2);
		}

		int[] freq = new int[26];
		for (char c : left.toCharArray()) {
			freq[c - 'a']++;
		}
		for (char c : right.toCharArray()) {
			freq[c - 'a']--;
		}

		for (int i = 0; i < 26; i++) {
			if (freq[i] != 0) {
				return "NO";
			}
		}
		return "YES";
	}

}
