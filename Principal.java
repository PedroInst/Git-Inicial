import java.time.LocalTime;

public class Principal {
    
    public static void main(String[] args){
        
        System.out.println("Hola Mundo");
        System.out.println();

        hora();
    }

    public static void hora() {

        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);
    }
}
