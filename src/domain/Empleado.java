package domain;

public abstract class Empleado {
  private String dni;
  private String nombre;
  private String apellidos;
  private double sueldoBase;

  public Empleado(String dni, String nombre, String apellidos, double sueldoBase) {
    this.dni = dni;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.sueldoBase = sueldoBase;
  }

  public String GetDni() {
    return this.dni;
  }

  public String GetNombre() {
    return this.nombre;
  }

  public String GetApellidos() {
    return this.apellidos;
  }

  public double GetSueldoBase() {
    return this.sueldoBase;
  }

  public void setSueldoBase(double sueldoBase) {
    this.sueldoBase = sueldoBase;
  }

//  public abstract double getSueldo() {
//    
//  }
}
