import java.util.Scanner;

public class Lvl1Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre y Apellido:");
        String nombreApellido = scan.nextLine();

        System.out.println("Edad:");
        String edad = scan.nextLine();

        System.out.println("Direccion:");
        String direccion = scan.nextLine();

        System.out.println("Ciudad:");
        String ciudad = scan.nextLine();
        scan.close();
        System.out.println("=============REGISTRO=============");
        System.out.println(ciudad +" - "+ direccion +" - "+ edad +" - "+ nombreApellido);
    }
    
}
