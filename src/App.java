
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author vitor
 */
public class App {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
			boolean c = false;
			while (!c) {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Digite o palindrome inicial(fim para terminar): ");
				String s = br.readLine();
				if (s.length() < 100) {
					if (s.equals("fim")) {
						c = true;
					} else {
						System.out.println("Maior palíndrome é: " + a(s));
					}
				} else {
					System.out.print("A cadeia de caracteres precisa ter no máximo 100 elementos");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static String a(String s) {
		String d = "";
		int e = s.length() - 1;
		for (int i = 0; i < e; i++) {
			// System.out.println("Valor de i: " + i);
			for (int z = i + 1; z < e + 2; z++) {
				// System.out.println("Valor de z: " + z);
				String p = s.substring(i, z);
				// System.out.println("Valor de p: " + p);
				if (b(p)) {
					if (p.length() > d.length()) {
						d = p;
					}
				}
			}
		}
		// System.out.println("Valor de d: " + d);
		return d;
	}

	public static Boolean b(String word) {
		String l = word;
		StringBuilder w = new StringBuilder(l);
		l = w.reverse().toString();

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != l.charAt(i)) {
				return false;
			}
		}
		// System.out.println("Valor de word: " + word);
		// System.out.println("Valor de w: " + w);
		return true;
	}
}
