package interfaces;

/**
 * @author eromerop
 *
 */
public interface SaludoInterfaz {

  // Java 8 permite definir el comportamiento de un metodo de la interfaz por defecto
  // Es un comportamiento "similar" al heredar de una clase abstracta que ya implementa
  // algun metodo.
  default void saludar() {

    System.out.println("Hola mundo");
  }

  // Esta es la forma clasica de definir un metodo en una interfaz
  void despedir();
}
