package com.cmc.evaluacion;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;

public class Banco {
	private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente buscarCliente(String cedula) {
		for (Cliente cliente : clientes) {
			if (cliente.getCedula().equals(cedula)) {
				return cliente;
			}
		}
		return null;
	}

	public void registrarCliente(Cliente cliente) {
		Cliente cli = buscarCliente(cliente.getCedula());
		if (cli == null) {
			clientes.add(cliente);
		} else {
			System.out.println("Cliente ya existe: " + cliente.getCedula());
		}
	}

	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		Cliente cli = buscarCliente(cedula);
		if (cli == null) {
			System.out.println("No es cliente del banco");
		} else {
			CalculadoraAmortizacion.generarTabla(prestamo);
			prestamos.add(prestamo);
			prestamo.setCedula(cedula);
		}
	}

	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		ArrayList<Prestamo> prestamosCliente = new ArrayList<Prestamo>();
		for (Prestamo prestamo : prestamos) {
			if (prestamo.getCedula().equals(cedula)) {
				prestamosCliente.add(prestamo);
			}
		}

		if (prestamosCliente.size() == 0) {
			return null;
		} else {
			return prestamosCliente;
		}
	}
}
