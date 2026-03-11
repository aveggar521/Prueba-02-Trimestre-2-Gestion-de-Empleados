package domain;

public class Tecnico extends Empleado {
  private int categoria;

  public Tecnico(String dni, String nombre, String apellidos, double sueldoBase, int categoria) {
    super(dni, apellidos, apellidos, sueldoBase);
    this.categoria = categoria;
  }

  public double GetSueldo(double sueldoBase) {
    return sueldoBase + (categoria * 2);
  }

}
