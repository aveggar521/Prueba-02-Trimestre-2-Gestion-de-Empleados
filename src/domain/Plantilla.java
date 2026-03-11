package domain;

import java.util.ArrayList;
import java.util.List;

public class Plantilla {
  private List<Empleado> empleados;

  Plantilla() {
    this.empleados = new ArrayList<>();
  }

  public void agregarEmpleado(String dni, String name, String apellidos, double sueldoBase) {
    empleados.add(new Tecnico(dni, name, apellidos, sueldoBase, 0));
  }

  public List<Empleado> getEmpleadosPorNombre(String filtroNombre) {
    return empleados;
  }
}
