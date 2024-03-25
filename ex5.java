import java.util.Scanner;

public class ex5 {
    
    public static String inverter(String palavra){

        String resultado ="";

        for (int i=palavra.length()-1; i>=0; i--){
           resultado += palavra.charAt(i);
        }
        
        return resultado;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Palavra original: ");
        String palavra = input.next();

        System.out.print("Palavra invertida: ");
        System.out.print(inverter(palavra));

        input.close();
    }
}
