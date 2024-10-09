package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDate;

public class Persona {
	private String cedula;
	private String nombre;
	private String apellido;
	private double estatura;
	private LocalDate fechaNacimiento;
	private Time horaNacimiento;
	private BigDecimal cantidadAhorrada;
	private int numeroHijos;
	private EstadoCivil estadoCivil;

	public Persona() {

	}

	public Persona(String cedula, String nombre, String apellido, double estatura, LocalDate fechaNacimiento,
			Time horaNacimiento, BigDecimal cantidadAhorrada, int numeroHijos, EstadoCivil estadoCivil) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estatura = estatura;
		this.fechaNacimiento = fechaNacimiento;
		this.horaNacimiento = horaNacimiento;
		this.cantidadAhorrada = cantidadAhorrada;
		this.numeroHijos = numeroHijos;
		this.estadoCivil = estadoCivil;
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

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Time getHoraNacimiento() {
		return horaNacimiento;
	}

	public void setHoraNacimiento(Time horaNacimiento) {
		this.horaNacimiento = horaNacimiento;
	}

	public BigDecimal getCantidadAhorrada() {
		return cantidadAhorrada;
	}

	public void setCantidadAhorrada(BigDecimal cantidadAhorrada) {
		this.cantidadAhorrada = cantidadAhorrada;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estatura=" + estatura
				+ ", fechaNacimiento=" + fechaNacimiento + ", horaNacimiento=" + horaNacimiento + ", cantidadAhorrada="
				+ cantidadAhorrada + ", numeroHijos=" + numeroHijos + ", estadoCivil=" + estadoCivil + "]";
	}

}
