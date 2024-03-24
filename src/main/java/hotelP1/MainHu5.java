package hotelP1;

/**
 *
 * @author Oswald David
 */
public class MainHu5 {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Recepcionista recepcionista = new Recepcionista();

        
        System.out.println("Bienvenido al Hotel Hilton. \nEl Hotel Hilton cuenta con 2 pisos y 5 habitaciones en cada uno de ellos.");
        recepcionista.mostrarEstadoHabitaciones(hotel);
        recepcionista.gestionarReservas(hotel);
        recepcionista.mostrarEstadoHabitaciones(hotel);
        recepcionista.hacerChecksOut(hotel);
        
        System.out.println("Como recepcionista, muestro el informe del listado de las habitaciones ocupadas y disponibles.");
        recepcionista.mostrarEstadoHabitaciones(hotel);

        
    }
    
}
