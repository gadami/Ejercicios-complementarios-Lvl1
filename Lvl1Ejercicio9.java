import java.util.Scanner;

public class Lvl1Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Introducir Palabra o frase:");
        String palabras = scan.nextLine();
        System.out.println("Caracter a Buscar:");
        String caracter = scan.nextLine();
        int i = palabras.indexOf(caracter);
        int contar=0;

        while (i!=-1) {
            contar++;
            i= palabras.indexOf(caracter,i+1);
        }
        System.out.println("El numero de veces que aparece "+"\""+caracter+"\""+" en "+"\""+palabras+"\""+" es:"+contar);
    }
}
