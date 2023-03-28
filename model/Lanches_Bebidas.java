package hamburgueria.model;

import java.util.Scanner;

public class Lanches_Bebidas {

  public static void main(String[] args) {
    
    Scanner leia = new Scanner(System.in);
    
   
    String[] hamburgueres = {"Burger de siri Clássico", "Burger de siri Cheddar", "Burger de siri Bacon", "Burger de siri Duplo"};
    double[] precosHamburgueres = {12.00, 15.00, 15.00, 20.00};
    
    
    String[] refrigerantes = {"Coca-Cola", "Guaraná", "Fanta", "Sprite", "Suco Natural"};
    double[] precosRefrigerantes = {5.00, 4.50, 4.50, 4.50, 7.00};
    
    
    System.out.println("Hambúrgueres: ");
    for (int i = 0; i < hamburgueres.length; i++) {
      System.out.println((i + 1) + ". " + hamburgueres[i] + " - R$" + precosHamburgueres[i]);
    }
    
  
    System.out.print("Escolha um hambúrguer (1-" + hamburgueres.length + "): ");
    int escolhaHamburguer = leia.nextInt();
    
   
    System.out.println("Bebidas: ");
    for (int i = 0; i < refrigerantes.length; i++) {
      System.out.println((i + 1) + ". " + refrigerantes[i] + " - R$" + precosRefrigerantes[i]);
    }
    
    
    System.out.print("Escolha uma bebida (1-" + refrigerantes.length + "): ");
    int escolhaRefrigerante = leia.nextInt();
    
    
    double total = precosHamburgueres[escolhaHamburguer - 1] + precosRefrigerantes[escolhaRefrigerante - 1];
    System.out.println("Total da compra: R$" + total);
    
    
    leia.close();
  }
}

