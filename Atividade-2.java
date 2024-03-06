import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        double num1 = 0.0;
        double num2 = 0.0;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira o primeiro valor");
    num1 = scanner.nextDouble();
    
    System.out.println("Insira o segundo valor");
    num2 = scanner.nextDouble();
    
    double numt = num1 - num2;
    
    System.out.println("Valor total " + numt );
    }
}
