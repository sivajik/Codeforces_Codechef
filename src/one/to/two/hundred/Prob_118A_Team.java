package one.to.two.hundred;

import java.io.IOException;
import java.util.Scanner;

public class Prob_118A_Team {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		String op = modify(ip);
		System.out.println(op);
	}

	private static String modify(String ip) {
		StringBuilder sbr = new StringBuilder();

		for (char c : ip.toCharArray()) {
			char u = Character.toUpperCase(c);
			if (u == 'A' || u == 'E' || u == 'I' || u == 'O' || u == 'U' || u == 'Y') {
				continue;
			} else {
				sbr.append('.');
				if (c == u) {
					sbr.append(Character.toLowerCase(c));
				} else {
					sbr.append(c);
				}
			}
		}
		return sbr.toString();
	}

}
