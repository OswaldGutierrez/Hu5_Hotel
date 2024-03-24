package hotelP1;

/**
 *
 * @author Oswald David
 */
import java.util.Scanner;

public class LecturaDatos {
    
    Scanner entrada = new Scanner (System.in);

    public String leerString(String mensaje){
        System.out.println(mensaje+": ");
        return entrada.nextLine() ;
    }
    
    public int leerInt(String mensaje){
        System.out.println(mensaje+": ");
        int dato = entrada.nextInt();
        return dato;
    }

    public float leerFloat(String mensaje){
        System.out.println(mensaje);
        float datoFloat = entrada.nextFloat();
        return datoFloat;
    }

    public double leerDouble(String mensaje){
        System.out.println(mensaje);
        double datoDouble = entrada.nextDouble();
        return datoDouble;
    }


    public int leeryValidarInt(String mensaje) {
        int dato;
        do {
            System.out.print(mensaje + "\n");
            while (!entrada.hasNextInt()) {
                System.out.println("Valor no válido");
                entrada.next();
                System.out.print("Ingrese un valor válido. \n");
            }
            dato = entrada.nextInt();
            if(dato < 0){
                System.out.println("El número debe ser positivo");
            }
        } while (dato <= 0);
        return dato;
    }
    
    
    public int leerOpciones() {
        int dato;
        do {
            while (!entrada.hasNextInt()) {
                System.out.println("Ingrese una de las opciones mostradas.");
                entrada.next();
            }
            dato = entrada.nextInt();
            if(dato != 1 && dato != 2) {
                System.out.println("Ingrese una opción válida.");
                System.out.println("Opción 1 para reservar. \nOpción 2 para continuar su proceso.");
            }
        } while (dato != 1 && dato != 2);
        return dato;
    }
    
    public int leerPagos() {
        int dato;
        do {
            while (!entrada.hasNextInt()) {
                System.out.println("Ingrese una de las opciones mostradas.");
                entrada.next();
            }
            dato = entrada.nextInt();
            if(dato != 1 && dato != 2 && dato != 3) {
                System.out.println("Ingrese una opción válida.");
                System.out.println("Opción 1 para Transferencias. \nOpción 2 para efectivo. \nOpción 3 para Tarjetas.");
            }
        } while (dato != 1 && dato != 2 && dato != 3);
        return dato;
    }
    
    public int leerHabitaciones(String mensaje) {
        int dato;
        do {
            System.out.print(mensaje + "\n");
            while (!entrada.hasNextInt()) {
                System.out.println("¡Valor no válido!");
                entrada.next();
                System.out.print("Ingrese un número (1-5) para escoger su habitación. \n");
            }
            dato = entrada.nextInt();
            if(dato < 0){
                System.out.println("Los números disponibles en nuestras habitaciones van desde el 1 hasta el 5.");
            }
        } while (dato <= 0);
        return dato;
    }
    
    public int leerPiso(String mensaje) {
        int dato;
        do {
            System.out.print(mensaje + "\n");
            while (!entrada.hasNextInt()) {
                System.out.println("¡Valor no válido!");
                entrada.next();
                System.out.print("Ingrese un número (1 o 2) para escoger su piso. \n");
            }
            dato = entrada.nextInt();
            if(dato < 0){
                System.out.println("Solo contamos con 2 niveles en nustro hotel.");
            }
        } while (dato <= 0);
        return dato;
    }
    
}
