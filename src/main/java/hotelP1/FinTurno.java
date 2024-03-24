package hotelP1;

/**
 *
 * @author Oswald David
 */
public class FinTurno {
    private Hotel hotel;
    private Ingresoss ingresoss;
    private Recepcionista recepcionista;
    

    public FinTurno(Hotel hotel, Ingresoss ingresoss, Recepcionista recepcionista) {
        this.hotel = hotel;
        this.ingresoss = ingresoss;
        this.recepcionista = recepcionista;
    }

    public void entregarTurno() {

        System.out.println("\nComo recepcionista, muestro el informe del listado de las habitaciones ocupadas y disponibles.");
    }

}
