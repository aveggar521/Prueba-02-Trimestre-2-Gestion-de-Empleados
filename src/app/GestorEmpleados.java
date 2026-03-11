package app;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import domain.Empleado;
import domain.Plantilla;
import util.Consola;
import util.IEntradaSalida;

public class GestorEmpleados {
  private Plantilla plantilla;
  private Consola IEntradaSalida;

  public GestorEmpleados(Plantilla plantilla, IEntradaSalida consola) {

  }

  public void ejecutar() {

  }

  private void listarTodos() {

  }

  private void listarPorFiltro() {

  }

  private void listarEmpleados(List<Empleado> empleados) {

  }

  private void ordenarPorNombre(List<Empleado> empleados) {
    Collections.sort(empleados, Comparator.comparing(Empleado::GetNombre));
  }
}
