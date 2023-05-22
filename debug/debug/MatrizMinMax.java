package debug;
import java.util.Scanner;
public class MatrizMinMax {
	
	private int[][] mat;
	
	
	public static void main(String[] ar) {
		MatrizMinMax ma=new MatrizMinMax();
        ma.cargar();
        System.out.println("La matriz es: \n");
        ma.imprimir();
        

        
    }  

	    
	    public void cargar() {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Cuantas fila tiene la matriz:");
	        int filas=sc.nextInt();
	        System.out.print("Cuantas columnas tiene la matriz:");
	        int columnas=sc.nextInt();
	        mat=new int[filas][columnas];
	        for(int f=0;f<mat.length;f++) {
	            for(int c=0;c<mat[f].length;c++) {
	               
	                mat[f][c]= (int) (Math.random()*9+1);
	            }
	        }
	        sc.close();
	    }
	    
	    public void imprimir() {
	        for(int f=0;f<mat.length;f++) {
	            for(int c=0;c<mat[f].length;c++) {
	                System.out.print( mat[ f][ c] + "  ");
	            }
	            System.out.println( );
	        }
	    }
	    
	    
	    
	    
	}


