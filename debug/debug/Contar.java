package debug;


import java.util.Scanner;

public class Contar {


//Holaaaaaaaaaaaaaaaaaaaaaaaaaa
	
	    public static void main(String[] args) {
	        
	    	Scanner sc = new Scanner(System.in);
	    	 System.out.print("Introduzca una frase : ");
	        String  str = sc.nextLine();	        
	        int vcount = 0, ccount = 0;

	        //converting all the chars to lowercase
	        str = str.toLowerCase();
	        for(int i = 0; i < str.length(); i++) { 
	        	char ch = str.charAt(i); 
	        	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
	        		vcount++; 
	        		} else if((ch >= 'a'&& ch <= 'z')) {
	        					ccount++;
	            }
	        	sc.close();
	        }
	        System.out.println("Numero de vocales: " + vcount);
	        System.out.println("Numero de Consonantes: " + ccount);
	    }
	}