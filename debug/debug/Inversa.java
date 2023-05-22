package debug;
import java.util.Random;
import java.util.Scanner;
public class Inversa {

	  public static void main(String[] args) {
	    int[][] matriz = new int[3][3]; // Creamos una matriz de 3x3
	    Random rand = new Random();
	    Scanner scanner = new Scanner(System.in);

	    int opcion;
	    do {
	      System.out.println("\nMenú:");
	      System.out.println("1. Rellenar matriz con números aleatorios");
	      System.out.println("2. Imprimir matriz");
	      System.out.println("0. Salir");
	      System.out.print("Ingrese una opción: ");
	      opcion = scanner.nextInt();
	      scanner.close();
	      switch (opcion) {
	        case 1:
	          // Llenamos la matriz con números aleatorios del 0 al 9
	          for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	              matriz[i][j] = rand.nextInt(10);
	            }
	          }
	          System.out.println("Matriz rellenada con números aleatorios del 0 al 9.");
	          break;

	        case 2:
	          // Imprimimos la matriz
	          for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	              System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	          }
	          break;

	        case 0:
	          System.out.println("Saliendo del programa.");
	          break;

	        default:
	          System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
	          break;
	      }
	    } while (opcion != 0);
	  }
	}
