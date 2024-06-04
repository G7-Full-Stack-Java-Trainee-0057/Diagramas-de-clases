package composition;

import java.util.ArrayList;
import java.util.List;

public class Casa {

    private List<Habitacion> habitaciones;

    public Casa() {
        this.habitaciones = new ArrayList<Habitacion>();
    }

    public void addHabitacion(String nombre) {
        Habitacion habitacion = new Habitacion(nombre);
        habitaciones.add(habitacion);
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    
}