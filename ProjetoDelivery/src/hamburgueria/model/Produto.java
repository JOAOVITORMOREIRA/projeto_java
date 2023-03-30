package hamburgueria.model;

import java.text.NumberFormat;

public class Produto {
	
	private String nome;
    private double preco;
    
    public Produto() {
    }
    
    public  Produto (String nome, double preco) {
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

    public void visualizar() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + formatarPreco());
    }
    public String formatarPreco() {
        NumberFormat formatador = NumberFormat.getCurrencyInstance();
        return formatador.format(preco);
    }
	

}
