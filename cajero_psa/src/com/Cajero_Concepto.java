package com;

import java.util.List;

public class Cajero_Concepto {

	private String direccion;
	private int folio;
	private List<Cuenta> cuentas;

	public Cajero_Concepto() {

	}

	public Cajero_Concepto(String direccion, int folio, List<Cuenta> cuentas) {
		super();
		this.direccion = direccion;
		this.folio = folio;
		this.cuentas = cuentas;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String toString() {
		return "Cajero_Concepto [direccion=" + direccion + ", folio=" + folio + ", cuentas=" + cuentas + "]";
	}
}
