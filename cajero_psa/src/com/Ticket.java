package com;

import java.util.Date;

public class Ticket {

	private String ubicacion;
	private int folio;
	private String tipoOperacion;
	private String nCuenta;
	private Date fecha;
	private double monto;

	public Ticket() {

	}

	public Ticket(String ubicacion, int folio, String tipoOperacion, String nCuenta, Date fecha, double monto) {
		super();
		this.ubicacion = ubicacion;
		this.folio = folio;
		this.tipoOperacion = tipoOperacion;
		this.nCuenta = nCuenta;
		this.fecha = fecha;
		this.monto = monto;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public String getDireccion() {
		return nCuenta;
	}

	public void setDireccion(String direccion) {
		this.nCuenta = direccion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Ticket [ubicacion=" + ubicacion + ", folio=" + folio + ", tipoOperacion=" + tipoOperacion
				+ ", direccion=" + nCuenta + ", fecha=" + fecha + ", monto=" + monto + "]";
	}

}
