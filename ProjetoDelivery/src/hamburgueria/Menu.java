package hamburgueria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import hamburgueria.model.ClientePF;
import hamburgueria.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;
		String cliente, endereco, telefone, cpf, pedido;
		float valor;

		ClientePF pf1 = new ClientePF(01, "João Vitor", "joao@email.com", "rua 1 n1, jaragua", "(11)9.1111-2222",
				"111.222.333-44");
		pf1.visualizar();

		while (true) {

			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND
					+ "*************************************************                                                                                                                                                                                               ");

			System.out.println(
					"*************************************************                                                                                                                                                                                                ");
			System.out.println(
					"                                                                                                                                                                                                                                                 ");
			System.out.println(
					"        🍔     HAMBURGUERIA SIRIGUEIJO      🍔                                                                                                                                                                                                                                                    ");
			System.out.println(
					"                                                                                                                                                                                                                                                                                                 ");
			System.out.println(
					"*************************************************                                                                                                                                                                                                                                                ");
			System.out.println(
					"                                                                                                                                                                                                                                                                                                 ");
			System.out.println(
					"              1-Cadastrar Clientes                                                                                                                                                                                                                                                               ");
			System.out.println(
					"              2-Fazer Pedido                                                                                                                                                                                                                                                                     ");
			System.out.println(
					"              3-Valor do Pedido                                                                                                                                                                                                                                                                  ");
			System.out.println(
					"              4-Listar Todos os Pedidos                                                                                                                                                                                                                                                          ");
			System.out.println(
					"              5-Listar Todos os Clientes                                                                                                                                                                                                                                                         ");
			System.out.println(
					"              6-Cancelar Pedido                                                                                                                                                                                                                                                                  ");
			System.out.println(
					"              7-Sair                                                                                                                                                                                                                                                                             ");
			System.out.println(
					"                                                                                                                                                                                                                                                                                                 ");
			System.out.println(
					"*************************************************                                                                                                                                                                                                                                                ");
			System.out.println(
					"                                                                                                                                                                                                                                                                                                 ");
			System.out.println(
					"Digite a opção desejada:                                                                                                                                                                                                                                                                        ");
			System.out.println(
					"                                                                                                                                                                                                                                                                                                 ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 7) {
				System.out.println(Cores.TEXT_YELLOW
						+ "\nHamburgueria Sirigueijo: Aqui Gostamos de Dinheiro!$$                                                                                                                                                                                                                                                ");
				System.out.println(Cores.TEXT_CYAN
						+ "\n                  Volte Sempre!                                                                                                                                                                                                ");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1:
				System.out.println(
						"Cadastrar Clientes\n                                                                                                                                                                                                ");

				System.out.println(
						"Digite o nome do cliente:                                                                                                                                                                                                 ");
				leia.skip("\\R");
				cliente = leia.nextLine();

				System.out.println(
						"Digite o CPF do cliente:                                                                                                                                                                                                 ");
				cpf = leia.nextLine();

				System.out.println(
						"Digite o endereço do cliente:                                                                                                                                                                                                 ");
				endereco = leia.nextLine();

				System.out.println(
						"Digite o telefone do cliente:                                                                                                                                                                                                 ");
				telefone = leia.nextLine();

				keyPress();
				break;

			case 2:
				System.out.println(
						"Fazer Pedido\n                                                                                                                                                                                                ");

				System.out.println(
						"Digite o pedido do cliente:                                                                                                                                                                                                 ");
				leia.skip("\\R");
				pedido = leia.nextLine();

				keyPress();
				break;

			case 3:
				System.out.println(
						"Valor do Pedido\n                                                                                                                                                                                                ");

				keyPress();
				break;

			case 4:
				System.out.println(
						"Listar todos os pedidos\n                                                                                                                                                                                                ");

				keyPress();
				break;

			case 5:
				System.out.println(
						"Listar os clientes\n                                                                                                                                                                                                ");

				keyPress();
				break;

			case 6:
				System.out.println(
						"Cancelar pedido\n                                                                                                                                                                                                ");

				keyPress();
				break;
			default:
				System.out.println(
						"\nOpção Invalida!\n                                                                                                                                                                                                ");

				keyPress();
				break;
			}
		}

	}

	public static void sobre() {
		System.out.println(Cores.TEXT_WHITE
				+ "\n   Projeto Criado por:                                                                                                                                                                                                                           ");
		System.out.println(Cores.TEXT_WHITE
				+ "\n   GitHub:                                                                                                                                                                                                                                       ");
		System.out.println(
				"*************************************************                                                                                                                                                                                                ");
		System.out.println(
				"                                                                                                                                                                                                                                                 ");
		System.out.println(
				"   Projeto Criado por:                                                                                                                                                                                                                           ");
		System.out.println(
				"                                                                                                                                                                                                                                                 ");
		System.out.println(
				"*************************************************                                                                                                                                                                                                ");
		System.out.println(
				"   Ana Vieira                                                                                                                                                                                                                                    ");
		System.out.println(
				"   GitHub: https://github.com/Aninhahouse                                                                                                                                                                                                        ");
		System.out.println(
				"                                                                                                                                                                                                                                                ");
		System.out.println(
				"*************************************************                                                                                                                                                                                                ");
		System.out.println(
				"                                                                                                                                                                                                                                                 ");
		System.out.println(
				"*************************************************                                                                                                                                                                                                ");
		System.out.println(
				"   Andressa Camillo                                                                                                                                                                                                                              ");
		System.out.println(
				"   GitHub: https://github.com/Andressacamillo                                                                                                                                                                                                    ");
		System.out.println(
				"                                                                                                                                                                                                                                                 ");
		System.out.println(
				"*************************************************                                                                                                                                                                                                ");
		System.out.println(
				"                                                                                                                                                                                                                                                 ");
		System.out.println(
				"*************************************************                                                                                                                                                                                                ");
		System.out.println(
				"   Bruno Kauã                                                                                                                                                                                                                                    ");
		System.out.println(
				"   Ghttps://github.com/brunokauaal                                                                                                                                                                                                               ");
		System.out.println(
				"                                                                                                                                                                                                                                                 ");
		System.out.println(
				"*************************************************                                                                                                                                                                                                ");
		System.out.println(
				"                                                                                                                                                                                                                                                 ");
		System.out.println(
				"*************************************************                                                                                                                                                                                                ");
		System.out.println(
				"   Giselle Souza                                                                                                                                                                                                                                 ");
		System.out.println(
				"   GitHub: https://github.com/gisellesouzaa                                                                                                                                                                                                      ");
		System.out.println(
				"                                                                                                                                                                                                                                                 ");
		System.out.println(
				"*************************************************                                                                                                                                                                                                ");
		System.out.println(
				"                                                                                                                                                                                                                                                 ");
		System.out.println(
				"*************************************************                                                                                                                                                                                                ");
		System.out.println(
				"   João Vitor Moreira                                                                                                                                                                                                                            ");
		System.out.println(
				"   GitHub: https://github.com/JOAOVITORMOREIRA                                                                                                                                                                                                   ");
		System.out.println(
				"                                                                                                                                                                                                                                                 ");
		System.out.println(
				"*************************************************                                                                                                                                                                                                ");
		System.out.println(
				"                                                                                                                                                                                                                                                 ");
		System.out.println(
				"*************************************************                                                                                                                                                                                                ");
		System.out.println(
				"   Yngrid Padilha                                                                                                                                                                                                                                ");
		System.out.println(
				"   GitHub: https://github.com/yngridp                                                                                                                                                                                                            ");
		System.out.println(
				"                                                                                                                                                                                                                                                 ");
		System.out.println(
				"*************************************************                                                                                                                                                                                                ");
		System.out.println(
				"                                                                                                                                                                                                                                                 ");
	}

	public static void keyPress() {

		try {
			System.out.println(Cores.TEXT_RESET + "Pressione a tecla enter para continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Erro de digitação!");
		}
	}

}
