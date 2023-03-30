package hamburgueria.repository;

import hamburgueria.model.Clientes;
import hamburgueria.model.Pedido;

public interface HamburgueriaRepository {
	
	//M�ddodos de cliente
	public void cadastrar(Clientes cliente);
	public void procurarPorId(int numero);
	public void listarTodosClientes();
	public void atualizar(Clientes cliente);
	
	//M�dodos de pedido
	public void fazerPedido(Pedido pedido);
	public void listarTodosPedidos();
	public void deletar(int numero);
	
/*
 * Menu usado como base:
1 - Cadastrar cliente
  - Procurar cliente por Id
2 - Listar Todos os Clientes
3 - Atualizar cliente

4 - Fazer Pedido
5 - Listar Todos os Pedidos
6 – Cancelar Pedido

7 - Sair
*/

}
