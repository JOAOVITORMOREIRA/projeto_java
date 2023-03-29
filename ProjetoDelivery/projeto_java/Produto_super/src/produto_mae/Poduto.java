package produto_mae;

public class Poduto {
	
	private String nome;
    private double preco;

    public void Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimeDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }
	
	
}
