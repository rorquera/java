package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;

	public Naipe() {
		numerosPosibles = new ArrayList<Numero>();
		cartas = new ArrayList<Carta>();
		Numero numero = new Numero("A", 11);
		numerosPosibles.add(numero);
		Numero numero1 = new Numero("2", 2);
		numerosPosibles.add(numero1);
		Numero numero2 = new Numero("3", 3);
		numerosPosibles.add(numero2);
		Numero numero3 = new Numero("4", 4);
		numerosPosibles.add(numero3);
		Numero numero4 = new Numero("5", 5);
		numerosPosibles.add(numero4);
		Numero numero5 = new Numero("6", 6);
		numerosPosibles.add(numero5);
		Numero numero6 = new Numero("7", 7);
		numerosPosibles.add(numero6);
		Numero numero7 = new Numero("8", 8);
		numerosPosibles.add(numero7);
		Numero numero8 = new Numero("9", 9);
		numerosPosibles.add(numero8);
		Numero numero9 = new Numero("10", 10);
		numerosPosibles.add(numero9);
		Numero numero10 = new Numero("J", 10);
		numerosPosibles.add(numero10);
		Numero numero11 = new Numero("Q", 10);
		numerosPosibles.add(numero11);
		Numero numero12 = new Numero("K", 10);
		numerosPosibles.add(numero12);

		Palos palo = new Palos();
		for (Numero num : numerosPosibles) {
			Carta cartaCN = new Carta(num, palo.getCorazonNegro());
			Carta cartaCR = new Carta(num, palo.getCorazonRojo());
			Carta cartaT = new Carta(num, palo.getTrebol());
			Carta cartaD = new Carta(num, palo.getDiamante());
			cartas.add(cartaCN);
			cartas.add(cartaCR);
			cartas.add(cartaT);
			cartas.add(cartaD);
		}
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public ArrayList<Carta> barajar() {
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		int posicion = 0;
		Carta carta;
		for (int i = 1; i <= 100; i++) {
			posicion = Random.obtenerPosicion();
			carta = cartas.get(posicion);
			if (carta.getEstado().equals("N")) {
				auxiliar.add(carta);
				carta.setEstado("C");
			}
		}
		for (Carta card : cartas) {
			if (card.getEstado().equals("N")) {
				auxiliar.add(card);
			}
		}

		return auxiliar;
	}

}
