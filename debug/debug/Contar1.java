package debug;

	//Programa que cuenta el número de palabras de un texto.                                  
	import java.util.Scanner;
	import java.lang.String;


	public class Contar1 {
	  
		public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     String frase;
	     System.out.print("Introduce una frase: ");
	     frase = sc.nextLine();
	     System.out.println("Número de palabras: " + contarPalabras(frase));                                             
	     sc.close();
		}
		//Método que recibe un String y devuelve el número de palabras que contiene
		public static int contarPalabras(String s) {
		int contador = 1, pos=-1;
		s = s.trim(); //eliminar los posibles espacios en blanco al principio y al final                              
		if (s.isEmpty()) { //si la cadena está vacía
		    contador = 0;
		    
		} else {
		        pos = s.indexOf(" "); 
		        while (pos != -1) {   
		               contador++;    
		               pos = s.indexOf(" ",pos+1);                        

		        }  
		        
		}
		return contador;
		}
	}
