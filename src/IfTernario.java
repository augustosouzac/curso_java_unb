import java.util.Scanner;

public class IfTernario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String resposta;
		if (x % 2 == 0) {
			resposta = "par";
		} else {
			resposta = "impar";
		}
		System.out.println(resposta);

	}

}
