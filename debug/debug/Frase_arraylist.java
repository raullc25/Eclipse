package debug;
import java.lang.String;
import java.util.Scanner;
public class Frase_arraylist {

	public static String[] cargarPalabras(String s) {

		int i = 0, n = 0;
		String palabra = "";
		String[] str = new String[100];

		if (s.isEmpty()) {
		} else {
			while (n < s.length()) {
				if (Character.isLetter(s.charAt(n))) {
					palabra += s.charAt(n);
				} else if ((s.charAt(n) == ' ') || ((s.charAt(n) == ',')) || (s.charAt(n) == '.')
						|| (s.charAt(n) == ';') || (s.charAt(n) == ':')
						|| (s.charAt(n) == ')' || (s.charAt(n) == '('))) {
					if (palabra.length() > 0) {
						str[i] = palabra;
						i++;
						palabra = "";
					}
				}
				n++;
			}

		}
		if (palabra.length() > 0)
			str[i] = palabra;
		return str;
	}

	public static void ShowArray(String[] a) {
		for (int x = 0; x < a.length; x++) {
			if (a[x] != null) {
				System.out.println(a[x]);
			}
		}
	}

	static void OrdenarArray(String A[]) {
		for (int x = 0; x < A.length; x++) {
			for (int i = 0; i < A.length - x - 1; i++) {
				if (A[i + 1] != null) {
					if (A[i].compareTo(A[i + 1]) > 0) {
						String tmp = A[i];
						A[i] = A[i + 1];
						A[i + 1] = tmp;
					}
				}
			}
		}
	}

	static void OrdenarReves(String A[]) {
		for (int x = 0; x < A.length; x++) {
			for (int i = 0; i < A.length - x - 1; i++) {
				if (A[i + 1] != null) {
					if (A[i].compareTo(A[i + 1]) < 0) {
						String tmp = A[i];
						A[i] = A[i + 1];
						A[i + 1] = tmp;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] str = new String[100];
		Scanner sc = new Scanner(System.in);
		String frase;
		System.out.print("Introduce una frase: ");
		frase = sc.nextLine();
		System.out.println("Esta es la frase normal: ");
		str = cargarPalabras(frase);
		ShowArray(str);
		System.out.println("Esta es la frase ordenada de a->z: ");
		OrdenarArray(str);
		ShowArray(str);
		System.out.println("Esta es la frase ordenada de z->a: ");
		OrdenarReves(str);
		ShowArray(str);
	}

}