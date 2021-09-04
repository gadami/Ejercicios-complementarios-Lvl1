import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Lvl1Ejercicio2 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int num1 = numero.nextInt();
        int num2 = numero.nextInt();
        numero.close();
        /* Aca declare las variables para que quede mas entendible y ordenado
        a mi parecer, pude haber puesto la resolucion directamente en el Print
        pero me parecio que quedaria no entendible, todo una mezcla a la hora 
        de leer codigo, aunque se que es un ejercicio obvio */
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;
        int modulo = num1 % num2;
        System.out.println("RESULTADOS:");
        System.out.println(num1+" + "+num2+" = "+suma);
        System.out.println(num1+" - "+num2+" = "+resta);
        System.out.println(num1+" * "+num2+" = "+multi);
        System.out.println(num1+" / "+num2+" = "+div);
        System.out.println(num1+" % "+num2+" = "+modulo);



    }
    
}
