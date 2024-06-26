package hotelP1;

/**
 *
 * @author Oswald David
 */
public class Hotel {
    LecturaDatos lecturaDatos = new LecturaDatos();

    private final String[][] habitaciones;
    private int piso;
    private int numero;

    public String[][] getHabitaciones() {
        return habitaciones;
    }

    public Hotel() {
        this.habitaciones = new String[2][5];
        for (String[] pisosHab : habitaciones) {
            for (int habitacion = 0; habitacion < pisosHab.length; habitacion++) {
                pisosHab[habitacion] = "Disponible";
            }
        }
    }

    public void reservarHabitacion() {

        piso = lecturaDatos.leerPiso("¿En qué piso quiere su habitación?");
        numero = lecturaDatos.leerHabitaciones("¿Cuál de las habitaciones desea?");

        if (piso >= 1 && piso <= 2 && numero >= 1 && numero <= 5) {
            if (habitaciones[piso - 1][numero - 1].equals("Disponible")) {
                habitaciones[piso - 1][numero - 1] = "Ocupada";
                System.out.println("Habitación en el piso " + piso + " y número " + numero + " reservada con éxito.");
                System.out.println();
            } 
            else {
                System.out.println("La habitación en el piso " + piso + " y número " + numero + " ya está ocupada.");
            }
        }
        
        else {
            System.out.println("La habitación especificada no existe en el hotel.");
        }
    }

    public int dejarHabitacionPrueba() {
        int pisoEntregado = lecturaDatos.leerPiso("¿En qué piso se encuentra la habitación que entregará?");
        int numeroEntregado = lecturaDatos.leerHabitaciones("¿Qué número de habitación es?");

        if (pisoEntregado >= 1 && pisoEntregado <= 2 && numeroEntregado >= 1 && numeroEntregado <= 5) {
            if (habitaciones[pisoEntregado - 1][numeroEntregado - 1].equals("Ocupada")) {
                habitaciones[pisoEntregado - 1][numeroEntregado - 1] = "Disponible";
                System.out.println("Habitación en el piso " + pisoEntregado + " y número " + numeroEntregado + " ha finalizado su estadía.");
                return pisoEntregado;
            } else {
                System.out.println("La habitación en el piso " + pisoEntregado + " y número " + numeroEntregado + " ya ha sido abandonada.");
            }
        } else {
            System.out.println("La habitación especificada no existe en el hotel.");
        }
        return -1; //
    }

}
