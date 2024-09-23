package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		if (telefono != null && telefono.getOperadora() == "movi") {
			telefono.setTieneWhatsapp(true);
		}
	}

	public int contarMovi(Telefono tlf1, Telefono tlf2, Telefono tlf3) {
		int totalMovi = 0;
		if (tlf1.getOperadora() == "movi") {
			totalMovi++;
		}
		if (tlf2.getOperadora() == "movi") {
			totalMovi++;
		}
		if (tlf3.getOperadora() == "movi") {
			totalMovi++;
		}

		return totalMovi;
	}

	public int contarClaro(Telefono tlf1, Telefono tlf2, Telefono tlf3, Telefono tlf4) {
		int totalClaro = 0;
		if (tlf1.getOperadora() == "claro") {
			totalClaro++;
		}
		if (tlf2.getOperadora() == "claro") {
			totalClaro++;
		}
		if (tlf3.getOperadora() == "claro") {
			totalClaro++;
		}
		if (tlf4.getOperadora() == "claro") {
			totalClaro++;
		}

		return totalClaro;
	}
}
