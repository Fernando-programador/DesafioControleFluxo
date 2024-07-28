import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner terminal = new Scanner(System.in);

		try {

			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = Integer.parseInt(terminal.nextLine());
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = Integer.parseInt(terminal.nextLine());

			Contador.contar(parametroUm, parametroDois);

		} catch (NumberFormatException number) {
			System.out.print(number.getLocalizedMessage());
			System.out.println(String.valueOf(" não é número interiro!!!"));
		}

		terminal.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		if (parametroUm > parametroDois) {
			System.out.println(new ParametrosInvalidosException().error());
		}

		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + (i));
		}

	}
}
