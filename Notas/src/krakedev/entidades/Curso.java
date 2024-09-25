package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	ArrayList<Estudiante> estudiantes;

	public Curso() {
		estudiantes = new ArrayList<Estudiante>();
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		boolean existeEstudiante = false;
		for (Estudiante alumno : this.estudiantes) {
			if (alumno.getCedula().equals(estudiante.getCedula())) {
				existeEstudiante = true;
			}
		}
		if (existeEstudiante) {
			return "El estudiante con cédula " + estudiante.getCedula() + " existe dentro del curso.";
		} else {
			return null;
		}
	}

	public void matricularEstudiante(Estudiante estudiante) {
		if (buscarEstudiantePorCedula(estudiante) == null) {
			estudiantes.add(estudiante);
		}
	}

	public double calcularPromedioCurso() {
		double promedioGeneral = 0;
		for (Estudiante alumno : estudiantes) {
			promedioGeneral += alumno.calcularPromedioNotasEstudiante();
		}
		return promedioGeneral / estudiantes.size();
	}

	public void mostrar() {
		for (Estudiante estudiante : estudiantes) {
			System.out.println("Curso[nombre=" + estudiante.getNombre() + " apellido=" + estudiante.getApellido()
					+ " cedula=" + estudiante.getCedula() + " notas=");
			for (Nota nota : estudiante.getNotas()) {
				System.out.println(nota.getCalificacion());
			}
			System.out.println("promedio= " + estudiante.calcularPromedioNotasEstudiante());
		}
		System.out.println("Promedio general: " + calcularPromedioCurso() + "]");
	}
}
