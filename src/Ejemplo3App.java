import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @author eromerop
 *
 */
public class Ejemplo3App {

  /**
   * @param args
   */
  public static void main(String[] args) {

    System.out.println("CREACION DE STREAMS");
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    stream.forEach(p -> System.out.println(p));
    System.out.println();

    // Obtencion de stream a partir de una lista
    System.out.println("OBTENCION DE STREAM A PARTIR DE UNA LISTA");
    // 1. Creacion de la lista
    List<Integer> list = new ArrayList<Integer>();
    // 2. Inicializacion de la lista. La rellenamos de numeros
    for (int i = 1; i < 10; i++) {
      list.add(i);
    }

    // 3. Creacion del stream a partir de la lista
    Stream<Integer> stream2 = list.stream();
    stream2.forEach(p -> System.out.println(p));

    System.out.println();
    System.out.println("CREACION DE UN STREAM DE NUMEROS DE FORMA ALEATORIA");
    Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
    randomNumbers.limit(20).forEach(System.out::println);

  }

}
