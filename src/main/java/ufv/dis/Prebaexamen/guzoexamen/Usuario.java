package ufv.dis.Prebaexamen.guzoexamen;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Usuario {
	
	String name;
	String lastname;
	String email;
	String dni;
	String fechanac;
	
	
	
	
	public Usuario(String name, String lastname, String email, String dni, String fechanac) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.dni = dni;
		this.fechanac = fechanac;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFechanac() {
		return fechanac;
	}
	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}
	
	public boolean adulto() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate edad = LocalDate.parse(fechanac, fmt);
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(edad, ahora);
		return periodo.getYears()>=18;
	}
	
	

}
