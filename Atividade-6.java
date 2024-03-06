import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        String nome = "";
        double preco = 0.0;
        double desconto = 0.0;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira o nome do produto");
    nome = scanner.nextLine();
    
    System.out.println("Insira o preco do produto");
    preco = scanner.nextDouble();
    
    System.out.println("Insira o percentual de desconto");
    desconto = scanner.nextDouble();
    
    double valorP = preco-preco*(desconto/100);
    
    System.out.println("nome:" + nome);
    System.out.println("Valor a pagar" + valorP);

    }
}
