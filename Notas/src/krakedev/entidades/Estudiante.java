package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	public Estudiante(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		notas = new ArrayList<Nota>();
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public void agregarNota(Nota nuevaNota) {
		boolean existeCodigo = false;
		for (Nota nota : notas) {
			if (nuevaNota.getMateria().getCodigo().equals(nota.getMateria().getCodigo())) {
				existeCodigo = true;
			}
		}

		if (!existeCodigo && nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
			notas.add(nuevaNota);
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		boolean existeNota = false;
		for (Nota nota : notas) {
			if (nuevaNota >= 0 && nuevaNota <= 10 && nota.getMateria().getCodigo().equals(codigo)) {
				nota.setCalificacion(nuevaNota);
				existeNota = true;
			}
		}

		if (!existeNota) {
			System.out.println("No se encontró el código: " + codigo);
		}
	}

	public double calcularPromedioNotasEstudiante() {
		double promedio = 0;
		for (Nota nota : notas) {
			promedio += nota.getCalificacion();
		}
		return promedio / notas.size();
	}

	public void mostrar() {
		System.out.println("Estudiante[nombre=" + nombre + " apellido=" + apellido + " cedula=" + cedula + " notas=");
		for (Nota nota : notas) {
			System.out.println(nota.getCalificacion());
		}
		System.out.println("]");
	}
}
