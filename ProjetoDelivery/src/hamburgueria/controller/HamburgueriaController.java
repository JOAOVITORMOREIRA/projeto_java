package hamburgueria.controller;

import java.util.ArrayList;
import hamburgueria.model.Clientes;
import hamburgueria.model.Pedido;

import hamburgueria.repository.HamburgueriaRepository;

public class HamburgueriaController implements HamburgueriaRepository {

	private ArrayList<Clientes> listaClientes = new ArrayList<Clientes>();
	int id = 0;
	
	private ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
	int numeroPedido = 0;
	
	// ------------METODOS DA CLASSE CLIENTE: ------------
	
	@Override
	public void cadastrar(Clientes cliente) {
		listaClientes.add(cliente);
		System.out.println("Foi criado o cadastro do cliente com id: " + cliente.getId() + " com sucesso!");
		
	}
	@Override
	public void procurarPorId(int id) {
		var cliente = buscarNaCollection(id);

		if(cliente != null)
			cliente.visualizar();
		else
			System.out.println("O cliente não foi encontrado!");
		
	}
	@Override
	public void listarTodosClientes() {
		for (var cliente : listaClientes) {
			cliente.visualizar();
		}
		
	}
	@Override
	public void atualizar(Clientes cliente) {
		if (listaClientes.contains(cliente.getNome())) {
			//criar método para atualizar dados do cliente
		}else {
			System.out.println("O cliente não está cadastrado!");
		}
		
	}
	
	// Métodos Auxiliares

	public int gerarId() {
		return ++id; // pre incremento
	};
	
	
	public Clientes buscarNaCollection(int id) {
		for(var cliente : listaClientes) {
			if (cliente.getId() == id) {
				return cliente;
			}
		}
		return null;
	}
	
	
	
	
	
	
	// ------------ MÉTODOS DA CLASSE PEDIDO: ------------
	
	@Override
	public void fazerPedido(Pedido pedido) {
		listaPedidos.add(pedido);
		System.out.println("Pedido número " + pedido.getNumeroPedido() + " foi criado com sucesso!");
		
	}
	
	@Override
	public void listarTodosPedidos() {
		for (var pedido : listaPedidos) {
			pedido.visualizar();
		}
	}
	
	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}
	
	// Métodos Auxiliares
	
	public int gerarNumeroPedido() {
		return ++numeroPedido; // pre incremento
	};
	
}
