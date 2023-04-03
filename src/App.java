import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner (System.in);
        System.out.print("entre com um numero: ");
        int numero = teclado.nextInt();


        System.out.println( "O numero informado foi [" + numero +"]");



    }
}
