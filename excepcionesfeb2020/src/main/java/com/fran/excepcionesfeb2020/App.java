package com.fran.excepcionesfeb2020;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void ejemplo1() {
    	int num,den;
    	String[] lista = new String[7];
    	num=4;
    	den=0;
    	int mayor,b;
    	mayor=  Integer.MAX_VALUE;
    	b=Integer.MAX_VALUE-10;
    	
    	if(b+15>Integer.MAX_VALUE) {
    		System.out.println("Te has pasado");
    	}
    	else {
    		System.out.println("Tienes" + (b+15) + " Euros");
    	}
    	
    	
    	try {
    		System.out.println("la multiplicación es: " + num * den);
			lista[8]="A";
    		System.out.println("la división es: " + num / den);

		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
			//System.out.println("Índice incorrecto");
		} catch(ArithmeticException e2) {
			e2.printStackTrace();
			//System.out.println("Fallo aritmético");
		}
    	finally {
    		System.out.println("la suma es: " + (num + den));
    		System.out.println("Dentro del finally");
    	}
		System.out.println("hola");
	}
	
	public static void ejemplo2() throws ArithmeticException {
		
		System.out.println(2 / 0);

	}
	
	public static void ejemplo3() {
		ejemplo2();
	}
	
	public static void ejemploConsola() {
		boolean salir=false;
		do {
			try {
				System.out.println("Introduzca un número entero: ");
				System.out.println(sc.nextInt());
				salir = true;	// No se ejecuta si no es un número entero
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Eso es un entero???");
				sc.next();
			}
		}while(salir==false);

	}
	
    public static void main ( String[] args ) 
    {
    	ejemploConsola();
    	System.out.println("Fin del programa");

    }
}
