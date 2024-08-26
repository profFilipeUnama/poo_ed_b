 
import java.util.Scanner;
public class Desafio1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número ");
        int numero = leitura.nextInt();
        System.out.println(""); 
        for(int i = 1; i <= numero; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
