package programacao;

import java.util.Scanner;

/**
 * @author Elizeu
 */
public class Programacao {

    public static void main(String[] args) {

        //Laço de repetição FOR -> Tabuada
        int tabuada = 9;
        for (int i = 0; i < 10; i++) {
            System.out.println("Resultado FOR: " + tabuada + " x " + i + " = " + tabuada * i);
        }
        System.out.println("");

        //WHILE -> 
        int contador = 0;
        while (contador < 100) {
            System.out.println("WHILE - Contador é menor que 100: (" + contador + ")");
            contador += 3;
        }
        System.out.println("");

        //DO WHILE -> Verificar um contador
        do {
            System.out.println("WHILE - Contador é menor que 100: (" + contador + ")");
            contador += 3;
        } while (contador < 100);
        System.out.println("Terminou o DO WHILE");
        
        double a = 10.2;
        double b = 5.9;
        System.out.println("");
        soma(a,b);   
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a primeira nota:");
        double nota1 = entrada.nextDouble();
        System.out.println("Informe a segunda nota:");
        double nota2 = entrada.nextDouble();
        System.out.println("Informe a terceira nota:");
        double nota3 = entrada.nextDouble();
        System.out.println("\nResultado");
        media3(nota1, nota2, nota3);
        System.out.println("");
        
        System.out.println("Informe a primeira nota:");
        double n1 = entrada.nextDouble();
        System.out.println("Informe a segunda nota:");
        double n2 = entrada.nextDouble();
        System.out.println("Informe a terceira nota:");
        double n3 = entrada.nextDouble();
        System.out.println("Informe a quarta nota:");
        double n4 = entrada.nextDouble();
        System.out.println("Informe a quinta nota:");
        double n5 = entrada.nextDouble();
        System.out.println("\nResultado");
        media5(n1, n2, n3, n4, n5);
        System.out.println("");
    }
    
    private static void soma(double n1, double n2){
        System.out.println("Soma: " + (n1 + n2)); 
    }
    
    private static void media3(double nota1, double nota2, double nota3){
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média: " + media);
    }
    
    private static void media5(double nota1, double nota2, double nota3, double nota4, double nota5){
        double media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("Média: " + media);
    }
}
