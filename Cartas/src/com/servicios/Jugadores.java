package com.servicios;

import java.util.ArrayList;

public class Jugadores {
	private ArrayList<String> jugadores;

	public Jugadores() {
		jugadores = new ArrayList<String>();
	}

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}

	public void jugar() {
		Juego juego = new Juego(jugadores);
		juego.entregarCartas(5);

		for (int i = 0; i < jugadores.size(); i++) {
			juego.devolverTotal(i);
			System.out.println("Id Jugador: " + jugadores.get(i) + " Total: " + juego.devolverTotal(i));
		}
	}
}
