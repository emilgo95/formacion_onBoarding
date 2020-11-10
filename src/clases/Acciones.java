package clases;

import interfaces.SaludoInterfaz;

/**
 * @author eromerop
 *
 */
public class Acciones implements SaludoInterfaz {

  public Acciones() {

  }

  @Override
  public void despedir() {

    System.out.println("Adios!!!");

  }

}
