import java.util.Scanner;

public class ex2 {

    public static boolean pertence_fibonacci(int numero){

        if (numero==0){
            return true;
        }
        int a = 0;
        int b  = 1;

        while(b<numero){
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == numero;
    }

    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        int numero = input.nextInt();

        boolean resultado = pertence_fibonacci(numero);

        if (resultado){
            System.out.println("O numero " + numero + " pertence a sequencia");
        }
        else{
            System.out.println("O numero " + numero + " nao pertence a sequencia");

        }
        input.close();
    }
}
