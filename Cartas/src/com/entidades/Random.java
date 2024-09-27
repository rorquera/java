package com.entidades;

public class Random {
	public static int obtenerPosicion() {
		int min = 0;
		int max = 51;
		return (int) (Math.random() * (max - min + 1)) + min;
	}
}
