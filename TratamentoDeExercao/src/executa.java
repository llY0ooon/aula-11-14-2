import java.util.Scanner;

public class executa {

	public static void main(String[] args) {

		for (int i = 0; i == 0;)
			try {
				Scanner l = new Scanner(System.in);
				Numeros n = new Numeros();

				// int n1 = 0;
				double re;
				// int n2 = 0;

				System.out.println("primeiro Numero:");
				n.n1 = l.nextInt();
				System.out.println("Segundo Numero:");
				n.n2 = l.nextInt();

				n.validaNumeros();
				re = n.dividir();

				System.out.println("valor: " + re);
				i = 1;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

	}

}
