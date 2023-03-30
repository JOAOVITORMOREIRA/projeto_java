package hamburgueria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import hamburgueria.model.ClientePF;
import hamburgueria.model.Produto;
import hamburgueria.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;
		String cliente, endereco, telefone, cpf, pedido,email;
		float valor;

		//testes
		ClientePF pf1 = new ClientePF(01, "João Vitor", "rua 1 n1, jaragua", "(11)9.1111-2222",
				"111.222.333-44","joao@email.com");
		pf1.visualizar();
		
		ClientePF pf2 = new ClientePF(02, "Maria Lucia", "Avenida Miguel Lima 404", "(11)9.9877-3214",
				"345.222.489-44","maria_504@gmail.com");
		pf2.visualizar();
		
		ClientePF pf3 = new ClientePF(02, "Bianca Souza", "rua 34-506 ", "(11)9.95516-5588",
				"346.222.4490-45","bi_souza@gmail.com");
		pf3.visualizar();
		
		

		Produto po =new Produto("Xtudo",24.00);
		po.visualizar();
		
		
		while (true) {

			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND
					+ "*************************************************                                                                                                                                                                                               ");

			System.out.println(
					"*************************************************                                                                                                                                                                                                ");
			System.out.println(
					"                                                                                                                                                                                                                                                 ");
			System.out.println(
					"        ðŸ�”     HAMBURGUERIA SIRIGUEIJO      ðŸ�”                                                                                                                                                                                                                                                    ");
			System.out.println(
					"                                                                                                                                                                                                                                                                                                 ");
			System.out.println(
					"*************************************************                                                                                                                                                                                                                                                ");
			System.out.println(
					"                                                                                                                                                                                                                                                                                                 ");
			System.out.println(
					"              1-Cadastrar Clientes                                                                                                                                                                                                                                                               ");
			System.out.println(
					"              2-Procurar cliente por Id                                                                                                                                                                                                                                                                   ");
			System.out.println(
					"              3-Listar Todos os Clientes                                                                                                                                                                                                                                                                ");
			System.out.println(
					"              4-Atualizar cliente                                                                                                                                                                                                                                                       ");
			System.out.println(
					"              5-Fazer Pedido                                                                                                                                                                                                                                                        ");
			System.out.println(
					"              6-Listar Todos os Pedidos                                                                                                                                                                                                                                                                ");
			System.out.println(
					"              7-Cancelar Pedido                                                                                                                                                                                                                                                                             ");
			System.out.println(
					"              8-Sair                                                                                                                                                                                                                                                                             ");
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

			if (opcao == 8) {
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
				
				System.out.println(
						"Digite o e-mail do cliente:                                                                                                                                                                                                 ");
				email = leia.nextLine();

				keyPress();
				break;

			case 2:
				System.out.println(
						"Procurar cliente por Id\n                                                                                                                                                                                                ");

				System.out.println(
						"Digite o id do cliente:                                                                                                                                                                                                 ");
				leia.skip("\\R");
				//idCliente = leia.nextLine();

				keyPress();
				break;

			case 3:
				System.out.println(
						"Listar Todos os Clientes\n                                                                                                                                                                                                ");

				keyPress();
				break;

			case 4:
				System.out.println(
						"Atualizar cliente\n                                                                                                                                                                                                ");

				keyPress();
				break;

			case 5:
				System.out.println(
						"Fazer Pedido\n                                                                                                                                                                                                ");

				keyPress();
				break;

			case 6:
				System.out.println(
						"Listar Todos os Pedidos\n                                                                                                                                                                                                ");

				keyPress();
				break;
			case 7:
				System.out.println(
						"Cancelar Pedido\n                                                                                                                                                                                                ");

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
				"   Bruno KauÃ£                                                                                                                                                                                                                                    ");
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
				"   JoÃ£o Vitor Moreira                                                                                                                                                                                                                            ");
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
			System.out.println("Erro de digitaÃ§Ã£o!");
		}
	}

}
