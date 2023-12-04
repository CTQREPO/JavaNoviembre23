package com;

import java.util.Date;

public class CajeroBasico extends Cajero_Concepto implements IOperacionesFinancieras {

	public CajeroBasico() {
		this.setFolio(0);
	}
	
	@Override
	public Object[] retirar(String numTarjeta, double monto) {

		Cuenta aux = null;
		int posicion = 0;
		Ticket ticket = null;
		Object[] valores = new Object[2];

		// Itera sobre la lista
		for (int i = 0; i < this.getCuentas().size(); i++) {
			// Que exista la cuenta

			if (this.getCuentas().get(i).getnCuenta().equals(numTarjeta)) {

				aux = this.getCuentas().get(i);
				posicion = i;
				break;
			}
		}

		// Si el auxiliar tiene una cuenta
		if (aux != null) {

			// Que me alcance - fondos suficientes
			if (aux.getSaldoDisponible() < monto) {
				System.out.println("Fondos insuficientes.");
			} // Validar que la cantidad no deje a la cuenta debajo del minimo
			else if ((aux.getSaldoDisponible() - monto) < aux.getMin()) {
				System.out.println("El retiro dejaría debajo del mínimo a la cuenta.");
			} // Retiro del efectivo - actualizar el saldo de la cuenta
			else {
				// Afecta los aldos
				aux.setSaldoDisponible(aux.getSaldoDisponible() - monto);
				// Actualizo la informacion en la DB
				this.getCuentas().set(posicion, aux);
				// Crear ticket
				ticket = new Ticket(this.getDireccion(), this.getFolio() + 1, "RETIRO", aux.getnCuenta(), new Date(),
						monto);
				// Actualiza el folio
				this.setFolio(this.getFolio() + 1);

				// INSTANCIO LAS POSICIONES DEL ARRAY "VALORES"
				valores[0] = ticket;
				valores[1] = monto;
			}

			// Retornar el valor

		} else {// Si la cuenta no existe o el campo está vacío
			System.out.println("Datos incorrectos.");

		}

		return valores;
	}

	@Override
	public void consultarSaldo(String numTarjeta) {
		// TODO Auto-generated method stub
		Cuenta aux = null;
		
		for (int i = 0; i < this.getCuentas().size(); i++) {
			// Que exista la cuenta

			
			if (this.getCuentas().get(i).getnCuenta().equals(numTarjeta)) {
				aux = this.getCuentas().get(i);
				break;
			}
		}
		
		if(aux!=null) {
			System.out.println("Tu saldo es: "+aux.getSaldoDisponible());
		}else {
			System.out.println("La cuenta asociada al número de tarjeta no existe.");
		}
		
		
	}

}
