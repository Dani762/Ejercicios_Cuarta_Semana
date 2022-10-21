import java.io.*;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase, y detectaré si esta contiene una b o una v");
        String frase = sc.nextLine();
        boolean existeB = frase.contains("b");
        boolean existeP = frase.contains("p");
        boolean existeV = frase.contains("v");
        boolean existeU = frase.contains("u");
        if ((existeB & existeP) & (existeV & existeU)){
            System.out.println("Tu frase contiene todas las letras que me has pedido");
        }
        else{
            System.out.println("Tu frase no contiene al menos una letra que me has pedido");
        }

        }
}
