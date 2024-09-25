package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		telefonos = new ArrayList<Telefono>();
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	/**
	 * METODO IMPRIMIR DEL REQUERIMIENTO 3
	 */
//	public void imprimir() {
//		System.out.println("Cédula: " + cedula);
//		System.out.println("Nombre: " + nombre);
//		System.out.println("Apellido: " + apellido);
//		if (direccion == null) {
//			System.out.println("Dirección: No tiene asociada una dirección");
//		} else {
//			System.out.println("Dirección:");
//			System.out.println("  Calle Principal: " + direccion.getCallePrincipal());
//			System.out.println("  Calle Secundaria: " + direccion.getCalleSecundaria());
//		}
//	}

	/**
	 * METODO IMPRIMIR DEL REQUERIMIENTO 4
	 */
//	public void imprimir() {
//		System.out.println("***" + nombre + " " + apellido + "****");
//		if (direccion == null) {
//			System.out.println("Dirección: No tiene asociada una dirección");
//		} else {
//			System.out.println("Dirección: " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
//		}
//	}

	/**
	 * METODO IMPRIMIR DEL REQUERIMIENTO 7
	 */
	public void imprimir() {
		System.out.println("Información del Contacto:");
		System.out.println("Cédula: " + cedula);
		System.out.println("Nombre: " + nombre + " " + apellido);
		if (direccion == null) {
			System.out.println("Dirección: No tiene asociada una dirección");
		} else {
			System.out.println("Dirección:");
			System.out.println("  Calle Principal: " + direccion.getCallePrincipal());
			System.out.println("  Calle Secundaria: " + direccion.getCalleSecundaria());
		}
	}

	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}

	public void mostrarTelefonos() {
		System.out.println("Teléfonos con estado 'C':");
		for (Telefono telefono : telefonos) {
			if (telefono.getEstado().equals("C")) {
				System.out.println("Número: " + telefono.getNumero() + ", Tipo: " + telefono.getTipo());
			}
		}
	}

	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> telefonosIncorrectos = new ArrayList<Telefono>();
		for (Telefono telefono : telefonos) {
			if (telefono.getEstado().equals("E")) {
				telefonosIncorrectos.add(telefono);
			}
		}
		return telefonosIncorrectos;
	}
}
