package com.fran.Ejercicio1POOfeb2020;

public class Cuenta {
	
	private String nombre;
	private double tipoInteres;
	private String numeroCuenta;
	private double saldo;

	
	/**
	 * Constructor vacio
	 */
	public Cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** 
	 * Constructor con todos los parámetros
	 * 
	 * @param nombre
	 * @param tipoInteres
	 * @param numeroCuenta
	 * @param saldo
	 */
	
	public Cuenta(String nombre, String numeroCuenta, double tipoInteres,  double saldo) {
		this.nombre = nombre;
		this.tipoInteres = tipoInteres;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;		
	}
	
	/**
	 * Constructor de copia
	 * 
	 * @param c
	 */
	
	public Cuenta(Cuenta c) {
		this.nombre = c.nombre;
		this.tipoInteres = c.tipoInteres;
		this.numeroCuenta = c.numeroCuenta;
		this.saldo = c.saldo;		
	}
	
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return el tipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}
	/**
	 * @param tipoInteres el tipoInteres a establecer
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	/**
	 * @return el numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @param numeroCuenta el numeroCuenta a establecer
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	/**
	 * @return el saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo el saldo a establecer
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	
	/**
	 * Método ingreso
	 * @param n
	 * @return
	 */
	
	  public boolean ingreso(double n) {
	      if (n < 0) {
	    	  return false;
	      } 
	      else {
	          saldo = saldo + n;
	          return true;
	      }
	  }
	
	  /**
	   * Método reintegro
	   * 
	   * @param n
	   * @return
	   */
	  
	  public boolean reintegro(double n) {
	      boolean reintegroCorrecto = true;
	      if (n < 0) {
	          reintegroCorrecto = false;
	          return reintegroCorrecto;	// return false; es lo mismo que las dos lineas.
	      } 
	      
	      if (saldo >= n) {	// Tengo dinero y lo resto
	          saldo -= n;
	      } else {	// el numero n es mayor o igual a 0 pero no hay suficiente saldo
	          reintegroCorrecto = false;
	      }
	      return reintegroCorrecto;
	  }
	  
	  /**
	   * Método transferencia
	   * 
	   * @param cuentadestino
	   * @param importe
	   * @return
	   */
	  
	  public boolean transferencia(Cuenta cuentadestino, double importe) {
		  if(importe<0) {	// intento dar dinero negativo
			  return false;
		  }
		  if(importe>saldo) {	// Intento dar m�s dinero del que tengo
			  return false;
		  }
		  else {	// intento dar menos dinero del que tengo y eso si lo puedo hacer
			  reintegro(importe);
			  cuentadestino.ingreso(importe);
			  return true;
		  }
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  

}
