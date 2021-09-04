import java.util.Scanner;

public class Lvl1Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Potenciacion: Introduzca Dos numeros, Base \"a\" y Exponente \"n\":");
        int a = scan.nextInt();
        int n = scan.nextInt();
        int i =1;
        int x = a;

        while (i < n) {
           x*= a;
           i++; 
        }
        System.out.println(a+" elevado a "+n+" = "+x);
    }
}
