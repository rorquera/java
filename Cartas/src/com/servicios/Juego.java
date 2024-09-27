package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<String> jugadores;

	public Juego() {
		naipe = new Naipe();
		naipeBarajado = naipe.barajar();
	}

	public Juego(ArrayList<String> idsJugadores) {
		cartasJugadores = new ArrayList<ArrayList<Carta>>();
		for (int i = 0; i < idsJugadores.size(); i++) {
			cartasJugadores.add(new ArrayList<Carta>());
		}
		jugadores = idsJugadores;
		naipe = new Naipe();
		naipeBarajado = naipe.barajar();
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	public void entregarCartas(int cartasPorJugador) {
		int posicion = 0;
		for (int i = 0; i < cartasPorJugador; i++) {
			for (int j = 0; j < jugadores.size(); j++) {
				cartasJugadores.get(j).add(naipeBarajado.get(posicion));
				posicion++;
			}
		}
	}

	public int devolverTotal(int idJugador) {
		int total = 0;
		ArrayList<Carta> cartas = cartasJugadores.get(idJugador);
		for (int j = 0; j < cartas.size(); j++) {
			Carta carta = cartas.get(j);
			total += carta.getNumero().getValor();
		}
		return total;
	}

	public String determinarGanador() {
		int total = 0;
		int puntajeMayor = 0;
		String ganador = "";
		for (int i = 0; i < cartasJugadores.size(); i++) {
			total = 0;
			ArrayList<Carta> cartas = cartasJugadores.get(i);
			for (int j = 0; j < cartas.size(); j++) {
				Carta carta = cartas.get(j);
				total += carta.getNumero().getValor();
			}
			if (total >= puntajeMayor) {
				puntajeMayor = total;
				ganador = jugadores.get(i);
			}
		}
		return ganador;
	}
}
