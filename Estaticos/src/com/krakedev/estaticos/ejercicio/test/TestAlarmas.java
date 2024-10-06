package com.krakedev.estaticos.ejercicio.test;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {
	public static void main(String[] args) {
		Alarma alarma1 = new Alarma(DiasSemana.LUNES, 10, 8);
		Alarma alarma2 = new Alarma(DiasSemana.MARTES, 5, 15);
		Alarma alarma3 = new Alarma(DiasSemana.MIERCOLES, 7, 10);
		Alarma alarma4 = new Alarma(DiasSemana.JUEVES, 13, 51);
		Alarma alarma5 = new Alarma(DiasSemana.VIERNES, 18, 22);
		AdminAlarmas admAlarmas = new AdminAlarmas();
		admAlarmas.agregarAlarma(alarma1);
		admAlarmas.agregarAlarma(alarma2);
		admAlarmas.agregarAlarma(alarma3);
		admAlarmas.agregarAlarma(alarma4);
		admAlarmas.agregarAlarma(alarma5);

		for (Alarma alarma : admAlarmas.getAlarmas()) {
			System.out.println(alarma);
		}
	}
}
