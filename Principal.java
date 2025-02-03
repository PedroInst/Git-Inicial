import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        System.out.println("Hola Mundo");
        System.out.println();

        hora();
        System.out.println();


        System.out.println(Arrays.toString(info()));
    }

    public static void hora() {
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);
    }

    public static Usuario[] info() {

        String nombre;
        String apell;
        String email;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la cantidad de usuarios: ");
        int num = teclado.nextInt();

        Usuario[] array = new Usuario[num];

        teclado.nextLine(); // Consumir el salto de línea pendiente

        for (int i = 0; i < array.length; i++) {

            System.out.println("Introduce el nombre del usuario: ");
            nombre = teclado.nextLine();

            System.out.println("Introduce el apellido del usuario: ");
            apell = teclado.nextLine();

            System.out.println("Introduce el email del usuario: ");
            email = teclado.nextLine();

            array[i] = new Usuario(nombre, apell, email);
        }

        return array;
    }
}
