package clases;

/**
 * @author eromerop
 *
 */
public class Gamusino {
  private String nombre;

  private int peso;

  private int altura;

  public Gamusino(String nombre, int peso, int altura) {

    super();
    this.nombre = nombre;
    this.peso = peso;
    this.altura = altura;
  }

  /**
   * @return nombre
   */
  public String getNombre() {

    return this.nombre;
  }

  /**
   * @param nombre new value of {@link #getnombre}.
   */
  public void setNombre(String nombre) {

    this.nombre = nombre;
  }

  /**
   * @return peso
   */
  public int getPeso() {

    return this.peso;
  }

  /**
   * @param peso new value of {@link #getpeso}.
   */
  public void setPeso(int peso) {

    this.peso = peso;
  }

  /**
   * @return altura
   */
  public int getAltura() {

    return this.altura;
  }

  /**
   * @param altura new value of {@link #getaltura}.
   */
  public void setAltura(int altura) {

    this.altura = altura;
  }

  @Override
  public String toString() {

    return "Gamusino [nombre=" + this.nombre + ", peso=" + this.peso + ", altura=" + this.altura + "]";
  }

}
