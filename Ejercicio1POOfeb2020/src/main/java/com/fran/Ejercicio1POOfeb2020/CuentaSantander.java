package com.fran.Ejercicio1POOfeb2020;

public class CuentaSantander extends Cuenta {

	private double donaciones; // lleva acumulado de las donaciones

	public CuentaSantander() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CuentaSantander(Cuenta c) {
		super(c);
		this.donaciones=0;
	}

	public CuentaSantander(String nombre, String numeroCuenta, double tipoInteres, double saldo, double donaciones) {
		super(nombre, numeroCuenta, tipoInteres, saldo);
		this.donaciones= donaciones;
	}

	public double getDonaciones() {
		return donaciones;
	}

	public void setDonaciones(double donaciones) {
		this.donaciones = donaciones;
	}
	
	public boolean donacion(double cantidad) {
		if(cantidad<0 || cantidad>super.getSaldo()) {
			return false;
		}
		else {
			super.reintegro(cantidad);
			donaciones += cantidad;
			return true;
		}		
	}
	
	
	
}
