package com.cmc.evaluacion;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cuota;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		double monto = prestamo.getMonto();
		double interes = (prestamo.getInteres() / 12) / 100;
		double plazo = prestamo.getPlazo() * -1;
		return (monto * interes) / (1 - Math.pow((1 + interes), plazo));
	}

	public static void generarTabla(Prestamo prestamo) {
		double interes = (prestamo.getInteres() / 12) / 100;
		double saldoInicial = prestamo.getMonto();
		double valorCuotaFija = calcularCuota(prestamo);
		calcularValoresCuota(prestamo, interes, saldoInicial, valorCuotaFija);
	}

	public static void calcularValoresCuota(Prestamo prestamo, double interes, double saldoCapitalInicio,
			double cuotaFija) {
		double saldoInicial;
		double valorCuotaFija;
		double valorInteres;
		double valorCapital;
		double saldoFinal = 0;
		Cuota cuota;

		for (int i = 0; i < prestamo.getPlazo(); i++) {
			cuota = new Cuota(i + 1);
			saldoInicial = generarSaldoInicial(i, saldoCapitalInicio, saldoFinal);
			valorCuotaFija = cuotaFija;
			valorInteres = saldoInicial * interes;
			valorCapital = valorCuotaFija - valorInteres;
			saldoFinal = saldoInicial - valorCapital;

			if ((prestamo.getPlazo() - i == 1) && saldoFinal > 0 ) {
				valorCuotaFija += saldoFinal;
				saldoFinal = 0;
			}
			if ((prestamo.getPlazo() - i == 1) && saldoFinal < 0) {
				valorCuotaFija += saldoFinal;
				saldoFinal = 0;
			}

			agregarCuota(cuota, saldoInicial, valorCuotaFija, valorInteres, valorCapital, saldoFinal, prestamo);
		}

	}

	public static double generarSaldoInicial(int indice, double saldoCapitalInicial, double saldoCapitalFinal) {
		double saldoInicial = 0;
		if (indice == 0) {
			saldoInicial = saldoCapitalInicial;
		} else {
			saldoInicial = saldoCapitalFinal;
		}
		return Utilitario.redondear(saldoInicial);
	}

	public static void agregarCuota(Cuota cuota, double saldoInicial, double valorCuotaFija, double valorInteres,
			double valorCapital, double saldoFinal, Prestamo prestamo) {
		cuota.setCuota(valorCuotaFija);
		cuota.setInicio(saldoInicial);
		cuota.setInteres(valorInteres);
		cuota.setCapital(valorCapital);
		cuota.setSaldo(saldoFinal);

		prestamo.getCuotas().add(cuota);
	}

	public static void mostrarTabla(Prestamo prestamo) {
		int indice = 1;
		ArrayList<Cuota> cuotas = prestamo.getCuotas();
		System.out.println("Número     |Cuota     |Inicio     |Interés     |Abono        |Saldo");
		for (Cuota cuota : cuotas) {
			System.out.println(Utilitario.redondear(indice) + "        |" + Utilitario.redondear(cuota.getCuota())
					+ "    |" + Utilitario.redondear(cuota.getInicio()) + "     |"
					+ Utilitario.redondear(cuota.getInteres()) + "        |" + Utilitario.redondear(cuota.getCapital())
					+ "       |" + Utilitario.redondear(cuota.getSaldo()) + "]");
			indice++;
		}
	}
}
