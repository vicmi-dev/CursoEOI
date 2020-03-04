package com.fran.coleccionesfeb2020;

import java.util.HashSet;
import java.util.Set;

public class ListaCuentas {
	// Inicialización de la variable ejemploSet
	private Set<Cuenta> cuentas = new HashSet<Cuenta>();
	private Set<Cuenta> cuentas2 = new HashSet<Cuenta>();
	private int cuentastotal;

	// Constructor x defecto o vacio.
	public ListaCuentas() {
		
	}

	public ListaCuentas(Set<Cuenta> cuentas) {
		super();
		this.cuentas = cuentas;
		this.cuentastotal = cuentas.size();
	}
	
	public ListaCuentas(Set<Cuenta> cuentas, Set<Cuenta> cuentas2) {
		super();
		this.cuentas = cuentas;
		this.cuentas2 = cuentas2;
		this.cuentastotal = cuentas.size() + cuentas2.size();
	}

	public Set<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(Set<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	public int getCuentastotal() {
		return cuentastotal;
	}

	public void setCuentastotal(int cuentastotal) {
		this.cuentastotal = cuentastotal;
	}	
	

	@Override
	public String toString() {
		return "ListaCuentas [cuentas=" + cuentas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cuentas == null) ? 0 : cuentas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaCuentas other = (ListaCuentas) obj;
		if (cuentas == null) {
			if (other.cuentas != null)
				return false;
		} else if (!cuentas.equals(other.cuentas))
			return false;
		return true;
	}
	
	

	
	

}
