import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        double not1 = 0.0;
        double not2 = 0.0;
        double not3 = 0.0;
        double not4 = 0.0;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira a pimeira nota");
    not1 = scanner.nextDouble();
    
    System.out.println("Insira a segunda nota");
    not2 = scanner.nextDouble();
    
    System.out.println("Insira a terceira nota");
    not3 = scanner.nextDouble();
    
    System.out.println("Insira a quarta nota");
    not4 = scanner.nextDouble();
    
    double nott = (not1 + not2 + not3 + not4)/4;
    
    if(nott >= 6){
        System.out.println("Aprovado nota: " + nott);
    }else{
        System.out.println("Reprovado nota: " + nott);
    }
    
    }
}
