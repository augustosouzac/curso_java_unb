
public class StringPrograma {
	public static void main(String[] args) {
//
//		int i = 0;    // endereco 1 -> 0
//					  // enderec0 2 -> 0
//		int i2 = 0;
//		byte b = 0;
//		short s = 0;
//		long l = 0;
		// Wrapper Class;
//		Integer integer = i;
//		Integer integer2 = new Integer(0);
//		
//		if (integer.equals(integer2)) {
//			System.out.println("inteiros iguais");
//		} else {
//			System.out.println("são diferentes");
//		}
//		
		String s = "unb";
		String s1 = "unb";
		String s3 = new String("unb");
		String s4 = s;

		if (s.equals(s1)) {
			System.out.println("s e s1 são iguais");
		}
		if (s.equals(s3)) {
			System.out.println("s e s3 são iguais");
		} else {
			System.out.println("s e s3 não são iguais");
		}

		if (s.equals(s4)) {
			System.out.println("s e s4 são iguais");
		} else {
			System.out.println("s e s4 não são iguais");
		}

		if (s3.equals(s4)) {
			System.out.println("s3 e s4 são iguais");
		} else {
			System.out.println("s3 e s4 não são iguais");
		}

//		toUpperCase(), toLowerCase(), trim()
		s = "   Curso UNB  ";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.trim().toUpperCase().substring(6));
		System.out.println(s.trim().toUpperCase().substring(0, 5));
		System.out.println("|" + s + "|");
	}
}
