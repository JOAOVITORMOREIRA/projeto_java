package hamburgueria.model;

public class ClientePF extends Clientes{
	
	private String cpf;

	
	public ClientePF(int id, String nome, String email, String endereco, String telefone, int tipo, String cpf) {
		super(id, nome, email, endereco, telefone, tipo);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("CPF do cliente: " + this.cpf);
	}

}
