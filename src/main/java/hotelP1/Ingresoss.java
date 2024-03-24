package hotelP1;

/**
 *
 * @author Oswald David
 */

public class Ingresoss {
    LecturaDatos lecturaDatos = new LecturaDatos();

    private double totalAcumulado = 0;

    public void procesarPago(int piso) {
        double costoHabitacion = (piso == 1) ? 375000 : 415000;
        
        System.out.println("\nEl costo de la habitación en el piso " + piso + " es: $" + costoHabitacion);
        
        System.out.println("Seleccione el método de pago:");
        System.out.println("\t1. Transferencia");
        System.out.println("\t2. Efectivo");
        System.out.println("\t3. Tarjeta \t (Este método cuenta con un recargo del 10 porciento del costo de la habitación.)\n");
        
        int opcionPago = lecturaDatos.leerPagos();

        switch (opcionPago) {
            case 1 -> System.out.println("Ha seleccionado pago por transferencia. \nDebe pagar: " + costoHabitacion);
            case 2 -> System.out.println("Ha seleccionado pago en efectivo. \nDebe pagar: " + costoHabitacion);
            case 3 -> {
                costoHabitacion += costoHabitacion * 0.1;
                System.out.println("Ha seleccionado pago con tarjeta. \nDebe pagar: " + costoHabitacion);
            }
            default -> System.out.println("Opción de pago no válida.");
        }

        totalAcumulado += costoHabitacion;
        System.out.println("Total acumulado hasta el momento: $" + totalAcumulado + "\n");
    }
}

