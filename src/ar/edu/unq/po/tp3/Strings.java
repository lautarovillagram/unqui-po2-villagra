package ar.edu.unq.po.tp3;

public class Strings {

	public static void main(String[] args) {
		String a = "abc";
		String s = a;
		String t;
		Integer i;
		int n;

		System.out.println(s.length());
		// t.length(); indica que la variable no fue inicializada
//		1 + a;
		System.out.println(a.toUpperCase());
		System.out.println("Libertad".indexOf("r"));
		System.out.println("Universidad".lastIndexOf('i'));
		System.out.println("Quilmes".substring(2, 4));
		System.out.println((a.length() + a).startsWith("a"));
//		System.out.println(i);
//		System.out.println(n);
		// s == a;
		// a.substring(1, 3).equals("bc";)

	}

}
