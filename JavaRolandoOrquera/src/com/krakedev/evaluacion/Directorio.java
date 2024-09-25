package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public Directorio() {
		contactos = new ArrayList<Contacto>();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public boolean agregarContacto(Contacto contacto) {
		if (buscarPorCedula(contacto.getCedula()) == null) {
			contactos.add(contacto);
			fechaModificacion = new Date();
			return true;
		} else {
			return false;
		}
	}

	public Contacto buscarPorCedula(String cedula) {
		for (Contacto contacto : contactos) {
			if (contacto.getCedula().equals(cedula)) {
				return contacto;
			}
		}
		return null;
	}

	public String consultarUltimaModificacion() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return formatter.format(fechaModificacion);
	}

	public int contarPerdidos() {
		int totalContSinDireccion = 0;
		for (Contacto contacto : contactos) {
			if (contacto.getDireccion() == null) {
				totalContSinDireccion += 1;
			}
		}
		return totalContSinDireccion;
	}

	public int contarFijos() {
		int totalFijos = 0;
		for (Contacto contacto : contactos) {
			for (Telefono telefono : contacto.getTelefonos()) {
				if (telefono.getTipo() == "Convencional" && telefono.getEstado() == "C") {
					totalFijos += 1;
				}
			}
		}
		return totalFijos;
	}

	public void depurar() {
		for (Contacto contacto : contactos) {
			if (contacto.getDireccion() != null) {
				correctos.add(null);
			} else {
				incorrectos.add(null);
			}
		}
		contactos.clear();
	}
}
