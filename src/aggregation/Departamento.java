package aggregation;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private List<Empleado> empleados;

    public Departamento() {
        this.empleados = new ArrayList<>();
    }

    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
