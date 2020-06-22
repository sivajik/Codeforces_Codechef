package zero.to.one.hundred;

import java.io.IOException;
import java.util.Scanner;

public class Prob_71A_WayTooLongWords {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Integer w = Integer.parseInt(sc.next());

		String[] inputs = new String[w];
		String[] outputs = new String[w];
		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = sc.next();
			outputs[i] = trimmed(inputs[i]);
		}

		for (String str : outputs) {
			System.out.println(str);
		}
	}

	private static String trimmed(String s) {
		if (s.length() <= 10) {
			return s;
		}
		return "" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1);
	}

}
