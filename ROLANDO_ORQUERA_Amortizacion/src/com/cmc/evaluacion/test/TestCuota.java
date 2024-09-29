package com.cmc.evaluacion.test;

import com.cmc.evaluacion.CalculadoraAmortizacion;
import com.cmc.evaluacion.Prestamo;

public class TestCuota {
    public static void main(String[] args) {
        Prestamo préstamo = new Prestamo(5000, 12, 12);
        double cuota = CalculadoraAmortizacion.calcularCuota(préstamo);
        System.out.println("Cuota: " + cuota);
    }
}
