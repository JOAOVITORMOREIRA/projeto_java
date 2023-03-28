package produto;

public class produto {

	public static void main(String[] args) {
		produto produto1 = new Produto("Camisa",1);
	    
	    Produto produto2 = new Produto("Calça", 8);

	    // Exibindo informações dos produtos :D
	    System.out.println("Produto 1:");
	    System.out.println("Nome: " + produto1.getNome());
	    System.out.println("Preço: R$" + produto1.getPreço());
	   

	    System.out.println("Produto 2:");
	    System.out.println("Nome: " + produto2.getNome());
	    System.out.println("Preço: R$" + produto2.getPreço());
	   
	    produto1.visualizar();
	}

}
