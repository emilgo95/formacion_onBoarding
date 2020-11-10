import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author eromerop
 *
 */
public class Ejemplo4App {

  /**
   * @param args
   */

  @FunctionalInterface
  public interface Runnable {
    public abstract void run();
  }

  public static void main(String[] args) {

    List<String> memberNames = new ArrayList<>();
    memberNames.add("Amitabh");
    memberNames.add("Shekhar");
    memberNames.add("Aman");
    memberNames.add("Rahul");
    memberNames.add("Shahrukh");
    memberNames.add("Salman");
    memberNames.add("Yana");
    memberNames.add("Lokesh");

    // OPERACIONES
    // 1. Filter -> Recibe un predicado y filtra una lista segun un criterior establecido
    memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
    System.out.println();

    // 2. Map -> Convierte cada elemento del stream en otro objeto
    memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
    System.out.println();

    // 3. Sorted -> Muestra una vista ordenada del stream. Se le aplica un orden natural
    // a cada elemento del stream al no ser que le pasemos un Comparator
    memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

    // 4. collect -> Sirve para recoger todos los elementos de un stream y almacenarlos en una coleccion
    List<String> memNamesInUppercase = memberNames.stream().map(String::toUpperCase).collect(Collectors.toList());
    System.out.println();
    System.out.print(memNamesInUppercase);
    System.out.println();

    // 5. Match -> Sirve para comprobar si un predicado hace match con determinadas condiciones
    boolean matchedResult;

    // 5.1 anyMatch: Si hay alguna coicidencia con el patron introducido
    matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
    System.out.println(matchedResult);

    // 5.2 allMatch: Si todos los elementos coinciden con el patron introducido
    matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));
    System.out.println(matchedResult);

    // 5.3 noneMatch: Si no hay coincidencia con el patron introducido
    matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));
    System.out.println(matchedResult);

    // 6. Count -> Cuenta el numero de elementos que coinciden con un patron dado
    long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();
    long totalMatched2 = memberNames.stream().filter((s) -> s.endsWith("h")).count();

    System.out.println("El numero de elementos que comienzan con A es: " + totalMatched);
    System.out.println("El numero de elementos que terminan con h es: " + totalMatched2);

    IntStream infiniteNumberStream = IntStream.iterate(1, i -> i + 1);

    int[] intArray = infiniteNumberStream.limit(100).toArray();

    System.out.println(Arrays.toString(intArray));

    // Lista de puntos
    List<String> pointList = new ArrayList();
    pointList.add("1");
    pointList.add("2");
    pointList.forEach((p) -> System.out.print(p + " "));

  }

}
