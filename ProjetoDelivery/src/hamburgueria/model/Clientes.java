package hamburgueria.model;

public class Clientes {
	
	private int id;
	private String nome;
	private String email;
	private String endereco;
	private String telefone;
	
	public Clientes(int id, String nome, String email, String endereco, String telefone) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
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
	
	public void visualizar() {
		
		System.out.println("*************************************************");
		System.out.println("                 DADOS DO CLIENTE                ");
		System.out.println("*************************************************");
		System.out.println("ID do cliente: ");
		System.out.println("Nome do cliente: " + this.nome);
		System.out.println("Endereço do cliente:: " + this.endereco);
		System.out.println("Telefone do cliente: " + this.telefone);
		System.out.println("Email do cliente: " + this.email);
		
	}
	
}
