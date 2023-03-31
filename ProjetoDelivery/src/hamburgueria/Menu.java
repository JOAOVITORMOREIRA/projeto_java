package hamburgueria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import hamburgueria.controller.HamburgueriaController;
import hamburgueria.model.ClientePF;
import hamburgueria.model.Pedido;
import hamburgueria.model.Produto;
import hamburgueria.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao, pedido, tipo = 0, id;
		String cliente, endereco, telefone, cpf, email;

		float valor;
		boolean seguir = true;

		HamburgueriaController clientes = new HamburgueriaController();
		HamburgueriaController listaPedido = new HamburgueriaController();

		// testes

		ClientePF pf1 = new ClientePF(01, "João Vitor", "joao@email.com", "rua 1 n1, jaragua", "(11)9.1111-2222", 1,
				"111.222.333-44");
		//clientes.cadastrar(pf1);

//		Produto po = new Produto("Xtudo", 24.00);
//		po.visualizar();

		while (true) {

			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND + "*************************************************");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("         🍔    HAMBURGUERIA SIRIGUEIJO    🍔      ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("              1-Cadastrar Clientes               ");
			System.out.println("              2-Procurar cliente por Id          ");
			System.out.println("              3-Listar Todos os Clientes         ");
			System.out.println("              4-Fazer Pedido                     ");
			System.out.println("              5-Sair                             ");
			System.out.println("                                                 ");
			System.out.println("*************************************************");
			System.out.println("                                                 ");
			System.out.println("Digite a opção desejada:                         ");
			System.out.println("                                                 " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 5) {
				System.out.println(Cores.TEXT_YELLOW + "\nHamburgueria Sirigueijo: Aqui Gostamos de Dinheiro!$$");
				System.out.println(Cores.TEXT_CYAN + "\n                  Volte Sempre!                         ");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1:
				System.out.println("Cadastrar Clientes\n");
				
				
				System.out.println("Digite o nome do cliente:");
				leia.skip("\\R");
				cliente = leia.nextLine();

				System.out.println("Digite o CPF do cliente:");
				cpf = leia.nextLine();

				System.out.println("Digite o endereço do cliente:");
				endereco = leia.nextLine();

				System.out.println("Digite o telefone do cliente:");
				telefone = leia.nextLine();

				System.out.println("Digite o e-mail do cliente:");
				email = leia.nextLine();

				clientes.cadastrar(new ClientePF(clientes.gerarId(), cliente, email, endereco, telefone, tipo, cpf));

				keyPress();
				break;

			case 2:
				System.out.println("Procurar cliente por Id\n");

				System.out.println("Digite o id do cliente:");
				id = leia.nextInt();

				clientes.procurarPorId(id);

				keyPress();
				break;

			case 3:
				System.out.println("Listar Todos os Clientes\n\n");
				clientes.listarTodosClientes();
				keyPress();
				break;
			
			case 4:
				System.out.println("------------ Fazer Pedido ------------\n");

				String[] hamburgueres = { "Burger de siri Classico", "Burger de siri Cheddar", "Burger de siri Bacon","Burger de siri Duplo" };
				double[] precosHamburgueres = { 12.00, 15.00, 15.00, 20.00 };

				String[] refrigerantes = { "Coca-Cola", "Guaraná", "Fanta", "Sprite", "Suco Natural" };
				double[] precosRefrigerantes = { 5.00, 4.50, 4.50, 4.50, 7.00 };

				int escolhaHamburguer;
				double totalPedido = 0;
				Produto produto1 = new Produto();
				Produto produto2 = new Produto();

				do {

					System.out.println("- Lista de Hambúrgueres:  ");
					for (int i = 0; i < hamburgueres.length; i++) {
						System.out.println((i + 1) + ". " + hamburgueres[i] + " - R$" + precosHamburgueres[i]);
					}

					System.out.print("Escolha um hamburguer (1-" + hamburgueres.length + "): ");

					escolhaHamburguer = leia.nextInt();

					if (escolhaHamburguer < 1 || escolhaHamburguer > hamburgueres.length + 1) {
						System.out.print("Opção inválida! \\n Digite novamente:");
						escolhaHamburguer = leia.nextInt();
					}

					produto1.setNome(hamburgueres[escolhaHamburguer - 1]);
					produto1.setPreco(precosHamburgueres[escolhaHamburguer - 1]);

					totalPedido = totalPedido + precosHamburgueres[escolhaHamburguer - 1];

					System.out.print("Deseja pedir mais um hamburguer? Digite S/N \n");
					String resposta = leia.next();

					if (resposta.toLowerCase().equals("n")) {
						seguir = false;
					} else if (!resposta.toLowerCase().equals("n") && !resposta.toLowerCase().equals("s")) {
						System.out.println("Opção inválida. Digite 'S' ou 'N' \n");
					}
					;

				} while (seguir == true);

				do {

					System.out.println("- Lista de Bebidas: ");
					for (int i = 0; i < refrigerantes.length; i++) {
						System.out.println((i + 1) + ". " + refrigerantes[i] + " - R$" + precosRefrigerantes[i]);
					}

					System.out.print("Escolha uma bebida (1-" + refrigerantes.length + "): ");
					int escolhaRefrigerante = leia.nextInt();

					produto2.setNome(refrigerantes[escolhaRefrigerante - 1]);
					produto2.setPreco(precosRefrigerantes[escolhaRefrigerante - 1]);
					
					totalPedido = totalPedido + precosRefrigerantes[escolhaRefrigerante - 1];

					seguir = true;

					System.out.print("Deseja pedir mais uma bebiba? Digite S/N \n");
					String resposta = leia.next();

					if (resposta.toLowerCase().equals("n")) {
						seguir = false;
					} else if (!resposta.toLowerCase().equals("n") && !resposta.toLowerCase().equals("s")) {
						System.out.println("Opção inválida. Digite 'S' ou 'N' \n");
					}
					;

				} while (seguir == true);

				Pedido pedido1 = new Pedido(6, pf1, produto1, 1);

				listaPedido.fazerPedido(pedido1);
				listaPedido.listarTodosPedidos();

				System.out.println("Valor total do pedido: R$ " + totalPedido + "    ");

				keyPress();
				break;

			default:
				System.out.println("\nOpção Invalida!\n");

				keyPress();
				break;
			}
		}

	}

	public static void sobre() {
		System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND + "*************************************************");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("   Projeto Criado por:                           ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("   Ana Vieira                                    ");
		System.out.println("   GitHub: https://github.com/Aninhahouse        ");
		System.out.println("                                                 ");
	//	System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("   Andressa Camillo                              ");
		System.out.println("   GitHub: https://github.com/Andressacamillo    ");
		System.out.println("                                                 ");
	//	System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("   Bruno Kauã                                    ");
		System.out.println("   Ghttps://github.com/brunokauaal               ");
		System.out.println("                                                 ");
//		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("   Giselle Souza                                 ");
		System.out.println("   GitHub: https://github.com/gisellesouzaa      ");
		System.out.println("                                                 ");
//		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("   João Vitor Moreira                            ");
		System.out.println("   GitHub: https://github.com/JOAOVITORMOREIRA   ");
		System.out.println("                                                 ");
	//	System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("   Yngrid Padilha                                ");
		System.out.println("   GitHub: https://github.com/yngridp            ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 " + Cores.TEXT_RESET);
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
