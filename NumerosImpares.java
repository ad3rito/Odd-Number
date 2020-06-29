import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] argss){
        Scanner entrada = new Scanner(System.in);
        int num, contPar = 0, contImpar = 0;
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Introduza o " + i + " numero");
            num = entrada.nextInt();
            
            if(num % 2 == 1){
                contImpar++;
            }

        }
        
        System.out.println("Foram introduzidos " + contImpar + " numeros impares \n");
        
    }
}