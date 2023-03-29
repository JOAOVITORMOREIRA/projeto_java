package hamburgueria.model;

public class ClientePJ extends Clientes{
	
	private String cnpj;

	public ClientePJ(int id, String nome, String email, String endereco, String telefone, String cnpj) {
		super(id, nome, email, endereco, telefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Cnpj do cliente: " + this.cnpj);
	}

}
