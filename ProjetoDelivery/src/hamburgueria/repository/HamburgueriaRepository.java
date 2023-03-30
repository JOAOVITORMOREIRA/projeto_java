package hamburgueria.repository;

import hamburgueria.model.Clientes;

public interface HamburgueriaRepository {
	
	//M�ddodos de cliente
	public void cadastrar(Clientes cliente);
	public void procurarPorId(int numero);
	public void listarTodosClientes();
	public void atualizar(Clientes cliente);
	
	//M�dodos de pedido
	public void listarTodosPedidos();
	public void deletar(int numero);

	//M�todos 
	public void fazerPedido(int numero, float valor);
	//public void transferir(int numeroOrigem, int numeroDestino, float valor); 
	
/*
 * Menu usado como base:
1 - Cadastrar cliente
2 - Fazer Pedido
3 - Listar Todos os Pedidos
4 - Listar Todos os Clientes
5 – Cancelar Pedido
6 - Atualizar cliente
7 - Sair
*/

}
