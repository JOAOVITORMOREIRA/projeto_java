package hamburgueria.model;

public class Pedido {
	
	private int numeroPedido;
	private Clientes cliente;
	private Produto produtos;
	private int quantidadeProdutos;
	
	//Método construtor:
	public Pedido(int numeroPedido, Clientes cliente, Produto produtos, int quantidadeProdutos) {
		super();
		this.numeroPedido = numeroPedido;
		this.cliente = cliente;
		this.produtos = produtos;
		this.quantidadeProdutos = quantidadeProdutos;
	}

	//Métodos Getters e Setters
	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Produto getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto produtos) {
		this.produtos = produtos;
	}

	public int getQuantidadeProdutos() {
		return quantidadeProdutos;
	}

	public void setQuantidadeProdutos(int quantidadeProdutos) {
		this.quantidadeProdutos = quantidadeProdutos;
	}

	// Método visualizar
	public void visualizar() {
		System.out.println("*************************************************");
		System.out.println("                 DADOS DO PEDIDO                 ");
		System.out.println("*************************************************");
		System.out.println("Número do pedido:							 " );
		System.out.println("Nome do cliente: " + this.cliente.getNome());
		System.out.println("Nome do produto:: " + this.produtos.getNome());
		System.out.println("Preço: " + this.produtos.getPreco());
		System.out.println("Quantidade: " + this.quantidadeProdutos);
		
	}
	
	
	
	

}
