package util;

import java.util.Scanner;

public class Consola implements IEntradaSalida {
  private Object sc;

  public Consola() {
    this.sc = new Scanner(System.in);
  }

  @Override
  public void imprimir(String texto) {
    System.out.print(texto);
  }

  @Override
  public void imprimirLinea(String texto) {
    System.out.println(texto);
  }

  @Override
  public String leerTexto(String mensaje) {
    return null;
  }

  @Override
  public int leerEntero(String mensaje) {

    return 0;
  }

  @Override
  public double leerImporte(String mensaje) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void mostrarMenu() {

  }

  @Override
  public void limpiarPantalla() {

  }

  @Override
  public void pausa() {

  }

}
