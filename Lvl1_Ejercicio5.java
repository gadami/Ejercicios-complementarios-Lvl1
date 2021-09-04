import java.util.Scanner;

public class Lvl1_Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Introduzca los siguientes Dos numeros para su multiplicacion:");
        int num1= scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        int i=1;
        int x = num1;

        while (i < num2) {
            x=x+ num1;
            i++;
        }
        System.out.println("La multiplicacion de "+num1+"*"+num2+"= "+x);
    
    }
    
}
