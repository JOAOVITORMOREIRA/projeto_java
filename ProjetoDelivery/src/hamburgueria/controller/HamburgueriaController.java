package hamburgueria.controller;

import java.util.ArrayList;
import hamburgueria.model.Clientes;

import hamburgueria.repository.HamburgueriaRepository;

public class HamburgueriaController implements HamburgueriaRepository {

	private ArrayList<Clientes> listaClientes = new ArrayList<Clientes>();
	int numero = 0;
	
	@Override
	public void cadastrar(Clientes cliente) {
		listaClientes.add(cliente);
		System.out.println("Foi criado o cadastro do cliente com id: " + cliente.getId() + "com sucesso!");
		
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fazerPedido(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void listarTodosPedidos() {
		// TODO Auto-generated method stub
	}
	
	// Métodos Auxiliares

//	public int gerarId() {
//		return ++id; // pre incremento
//	};
	
	public Clientes buscarNaCollection(int id) {
		for(var cliente : listaClientes) {
			if (cliente.getId() == id) {
				return cliente;
			}
		}
		return null;
	}

}
