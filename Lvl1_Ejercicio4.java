import java.util.Scanner;

public class Lvl1_Ejercicio4 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese un numero para ver su factorial:");//Lo puse para que se vea mas amigable
        int numero= scan.nextInt();
        scan.close();
        int factorial=1;
        int x=numero;

        while (numero!=0) {
          factorial=factorial*numero;
          numero--;
        }
        System.out.println("El Factorial de "+x+" es: "+factorial);
        }
    }
