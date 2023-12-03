package com;

public class Cuenta {

	private String nCuenta;
	private int nTarjeta;
	private String cliente;
	private double saldoDisponible;
	/*
	 * Solo se modela una cuenta genérica con valores estáticos Si tuviesemos varios
	 * tipos de cuenta, no cabe tener valores estáticos
	 */
	private static double min = 100;
	private static double max = 20000;

	public Cuenta() {

	}

	public Cuenta(String nCuenta, int nTarjeta, String cliente, double saldoDisponible) {
		super();
		this.nCuenta = nCuenta;
		this.nTarjeta = nTarjeta;
		this.cliente = cliente;
		this.saldoDisponible = saldoDisponible;
	}

	public String getnCuenta() {
		return nCuenta;
	}

	public void setnCuenta(String nCuenta) {
		this.nCuenta = nCuenta;
	}

	public int getnTarjeta() {
		return nTarjeta;
	}

	public void setnTarjeta(int nTarjeta) {
		this.nTarjeta = nTarjeta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public static double getMin() {
		return min;
	}

	public static void setMin(double min) {
		Cuenta.min = min;
	}

	public static double getMax() {
		return max;
	}

	public static void setMax(double max) {
		Cuenta.max = max;
	}

}
