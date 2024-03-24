package hotelP1;

/**
 *
 * @author Oswald David
 */

public class Recepcionista {
    Ingresoss ingresoss = new Ingresoss();
    LecturaDatos lecturaDatos = new LecturaDatos();

    public void mostrarEstadoHabitaciones(Hotel hotel) {
        String[][] habitaciones = hotel.getHabitaciones();
        int contEspacio = 0;
        System.out.println("---------------------------");
        
        for (int piso = 0; piso < habitaciones.length; piso++) {
            System.out.println("Piso " + (piso + 1) + ":                   |");
            for (int habitacion = 0; habitacion < habitaciones[piso].length; habitacion++) {
                System.out.println("Habitación " + (habitacion + 1) + ": " + habitaciones[piso][habitacion] + "  |");
            }
            if (contEspacio == 0) {
                System.out.println("                          |");
                contEspacio++;
            }
        }
        System.out.println("---------------------------\n");
    }

    public void gestionarReservas(Hotel hotel) {
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("¿Desea reservar habitaciones?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            
            int opcion = lecturaDatos.leerOpciones();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ok, vamos a reservar.\n");
                    hotel.reservarHabitacion();
                }
                case 2 -> {
                    System.out.println("¡Gracias por utilizar nuestros servicios!\n");
                    continuar = false;
                }
                default -> System.out.println("Opción no válida. Por favor, ingrese 1 o 2.");
            }
        }
    }

    public void hacerChecksOut(Hotel hotel) {
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("¿Desea entregar habitaciones?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            
            int opcion = lecturaDatos.leerOpciones();
            
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ok, vemos que va de salida.\n");
                    int pisoEntregado = hotel.dejarHabitacionPrueba();
                    if (pisoEntregado != -1) {
                        ingresoss.procesarPago(pisoEntregado);
                    }
                }
                case 2 -> {
                    System.out.println("¡Gracias por utilizar nuestros servicios! Disfrute de su estadía.");
                    continuar = false;
                }
                default -> System.out.println("Opción no válida. Por favor, ingrese 1 o 2.");
            }
        }
    }

}
