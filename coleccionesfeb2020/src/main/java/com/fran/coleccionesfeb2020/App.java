package com.fran.coleccionesfeb2020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



/**
 * Hello world!
 *
 */
public class App 
{

	public static void ejemplosSet() {
    	Set<String> ss = new HashSet<String>();
    	ss.add("hola");
    	ss.add("adiós");
    	ss.add("mundo cruel");
    	ss.add("hola");	// no lo introduce pero no falla
    	
    	System.out.println(ss);  // Imprime todo el conjunto
    	
    	int contador=0;
    	for(String s: ss) {		// for-each
    		contador++;
    		System.out.println(contador + ". " + s);    		
    	}
    	
    	System.out.println("El número de elementos totales es : " + ss.size());
    	ss.clear();	// Limpia la lista
    	System.out.println(ss);
    	ss.add("Fran".toLowerCase().concat(" García").toLowerCase());
    	ss.add("Adrián".toLowerCase());
    	ss.add("Juan".toLowerCase());
    	System.out.println(ss);
    	if(ss.contains("fran")) {	// Comprueba pertenencia de un elemento en una lista
    		System.out.println("La lista contiene a Fran");
    	}
    	else {
    		System.out.println("La lista NO contiene a Fran");
    	}
    	ss.remove("Fran".toLowerCase());	// Elimina un elemento siempre que exista
    	System.out.println(ss);
    	
    	/*for(String s: ss) {		// for-each
    		s = s.toUpperCase();
    		System.out.println(s);
    		ss.add(s.toUpperCase());
    		ss.remove(s);

    	}*/
    	
    	Set<String> ssMayusculas = new HashSet<String>();
    	for(String s: ss) {		// for-each
    		ssMayusculas.add(s.toUpperCase());
    	}
    	
    	//ss = ssMayusculas;  // Solo iguala posiciones de memoria
    	ss.addAll(ssMayusculas);  // Me permite añadir listas a otra lista
    	//ss.remove("ADRIÁN");
    	//ssMayusculas.remove("JUAN");
    	
    	Set<String> lista3 = new HashSet<String>(ss);  // Crea una lista copia de otra lista
    	lista3.remove("JUAN");
    	ss.remove("ADRIÁN");
    	
    	System.out.println(ssMayusculas);
    	System.out.println(ss);
    	System.out.println(lista3);
    	    	
    	Cuenta cuenta = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);
    	Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "1", 1.78, 315);
    	System.out.println(cuenta.toString());
    	if(cuenta.equals(cuenta2)) {
    		System.out.println("las cuentas son iguales");
    	}
    	else {
    		System.out.println("las cuentas son diferentes");
    	}
    	
    	ListaCuentas lc1 = new ListaCuentas();
    	Set<Cuenta> conjuntoCuentas = new HashSet<Cuenta>();
    	conjuntoCuentas.add(cuenta);
    	conjuntoCuentas.add(cuenta2);
    	ListaCuentas lc2 = new ListaCuentas(conjuntoCuentas);
    	ListaCuentas lc3 = new ListaCuentas(conjuntoCuentas,conjuntoCuentas);
    	ListaCuentas lc4 = lc3; // Alias
	}
	
	public static void ejemplosList() {
		List<String> listaCadenas = new ArrayList<String>();
		listaCadenas.add("Fran");
		listaCadenas.add("Nuria");
		listaCadenas.add("Ana");
		listaCadenas.add("Fran");
		System.out.println(listaCadenas);
		listaCadenas.remove("Fran");
		System.out.println(listaCadenas.get(2));
		System.out.println(listaCadenas.indexOf("Nuria"));
		System.out.println(listaCadenas.set(2, "Luis"));
		System.out.println(listaCadenas);
		listaCadenas.add(2, "Ronaldo");
		System.out.println(listaCadenas);
		listaCadenas.add(4, "Ronaldo");
		System.out.println(listaCadenas);
		System.out.println(listaCadenas.subList(0, listaCadenas.size()));
		List<String> listaCadenas2 = new ArrayList<String>(listaCadenas);
		List<String> listaCadenas3 = new ArrayList<String>(listaCadenas.subList(0, 2));
		System.out.println(listaCadenas3);
		listaCadenas3.add("Fran");
		listaCadenas3.sort(Comparator.naturalOrder());
		System.out.println(listaCadenas3);
		listaCadenas3.sort(Comparator.reverseOrder());
		System.out.println(listaCadenas3);
		
		
		List<Cuenta> listaCuentas = new ArrayList<Cuenta>();
    	Cuenta cuenta = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);
    	Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "1", 1.78, 315);
    	listaCuentas.add(cuenta);
    	listaCuentas.add(cuenta2);
		
	}
	
	
    public static void main( String[] args )
    {
    	//ejemplosSet();
    	ejemplosList();
    	
    }
}
