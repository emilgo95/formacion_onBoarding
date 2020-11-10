import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import clases.Gamusino;

/**
 * @author eromerop
 *
 */
public class Ejemplo2App {

  @FunctionalInterface
  public interface ICalculadoraLambda {
    public int operacion(int x, int y);
  }

  public static void main(String[] args) {

    // Parte 1 del ejemplo 2. Implementar comportamiento de funcion lambda en la variable definida.
    calculadoraLambda();

    // Parte 2 del ejemplo 2. Ordenación de colección de gamusinos.
    ordenaGamusinos();

    // Parte 3 del ejemplo 3. Agrupación de gamuisinos.
    filtrarGamusinos();
  }

  public static void calculadoraLambda() {

    // Ejemplo2. Con Lambda declaramos dos variables que definen un uso diferente de la función.
    ICalculadoraLambda iSuma = (x, y) -> x + y;

    System.out.println("El resultado de sumar 4 + 5 es " + iSuma.operacion(4, 5));

    ICalculadoraLambda iMultiplicacion = (x, y) -> x * y;
    System.out.println("El resultado de multiplicar 4 * 5 es " + iMultiplicacion.operacion(4, 5));

    System.out.println("\n#######################################################################\n");

  }

  public static void ordenaGamusinos() {

    List<Gamusino> listaGamusinos = getListaGamusinos();

    // Los gamusinos con muy codiciados. Su valor se calcula en funcion de su peso.
    // Queremos ordenarlos de mayor a menor peso.

    // Imprimimos los valores de la lista usando Lambda functions.
    listaGamusinos.forEach(gamusino -> System.out.println(gamusino));

    // Ordenamos por peso haciendo uso de las Lambda functions. Primero los de mayor peso.
    listaGamusinos.sort((Gamusino g1, Gamusino g2) -> g2.getPeso() - g1.getPeso());

    // Imprimimos su valor tras ordenarlos.
    System.out.println("\n_________________  Ordenamos por peso descendente  ____________________\n");
    listaGamusinos.forEach(gamusino -> System.out.println(gamusino));

    // Nótese que sería igual de sencillo redefinir la ordenación por altura de menor a mayor.
    listaGamusinos.sort((Gamusino g1, Gamusino g2) -> g1.getAltura() - g2.getAltura());
    System.out.println("\n_________________  Ordenamos por altura ascendente  ___________________\n");
    listaGamusinos.forEach(gamusino -> System.out.println(gamusino));
  }

  public static void filtrarGamusinos() {

    System.out.println("\n____________  Filtrar Gamusinos cuyo nombre empieza por P  _____________\n");

    List<Gamusino> listaGamusinosFiltrados = getListaGamusinos().stream().filter(p -> p.getNombre().startsWith("P"))
        .collect(Collectors.toList());

    System.out.println(listaGamusinosFiltrados);
  }

  private static List<Gamusino> getListaGamusinos() {

    // Generamos 3 gamusinos para nuestra prueba.
    Gamusino gamusino1 = new Gamusino("Pedro", 80, 105);
    Gamusino gamusino2 = new Gamusino("Patxi", 90, 115);
    Gamusino gamusino3 = new Gamusino("David", 75, 95);

    List<Gamusino> listaGamusinos = new ArrayList<Gamusino>();
    listaGamusinos.add(gamusino1);
    listaGamusinos.add(gamusino2);
    listaGamusinos.add(gamusino3);

    return listaGamusinos;
  }

}
