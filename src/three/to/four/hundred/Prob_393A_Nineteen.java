package three.to.four.hundred;
import java.io.IOException;
import java.util.Scanner;

/*
 * nineteen.
 */
public class Prob_393A_Nineteen {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] in =  input.toCharArray();
		int hash[] = new int[256]; 
		for(int i = 0 ; i<in.length ; i++){
			hash[in[i]]++;
		}
		int n = (hash['n']-1)/2;
		int i = hash['i'];
		int t = hash['t'];
		int e = hash['e']/3;
		System.out.println(Math.min(Math.min(n,i), Math.min(t, e)));
	}
}