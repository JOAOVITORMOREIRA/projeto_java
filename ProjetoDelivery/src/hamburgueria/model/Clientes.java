package hamburgueria.model;

public abstract class Clientes {
	
	private int id;
	private String nome;
	private String email;
	private String endereco;
	private String telefone;
	private int tipo;
	
	
	public Clientes(int id, String nome, String email, String endereco, String telefone, int tipo) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	
	public void visualizar() {
		
		String tipo = "";
		
		switch (this.tipo) {
		
		case 1 : tipo = "Cliente Pessoa Fisica";
		break;
		case 2 : tipo = "Cliente Pessoa Juridica";
		break;
		
		}
		
		System.out.println("*************************************************");
		System.out.println("                 DADOS DO CLIENTE                ");
		System.out.println("*************************************************");
		System.out.println("ID do cliente: " + this.id);
		System.out.println("Nome do cliente: " + this.nome);
		System.out.println("Endere�o do cliente:: " + this.endereco);
		System.out.println("Telefone do cliente: " + this.telefone);
		System.out.println("Email do cliente: " + this.email);
		
	}
	
}
