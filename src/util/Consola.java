package util;

import java.util.Scanner;

public class Consola {
  private Object sc;

  public Consola() {
    this.sc = new Scanner(System.in);
  }

  public void imprimir(String texto) {
    System.out.print(texto);
  }

  public void escribirLinea(String texto) {
    System.out.println(texto);
  }

  public String leerTexto(String mensaje) {
    return mensaje;

  }

  private void cleanInput() {

  }

  public int leerEntero(int entero) {
    return entero;
  }

  public double leerImporte(double importe) {
    return importe;
  }

}
