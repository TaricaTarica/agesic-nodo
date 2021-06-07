package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import datatypes.DTPersona;


public class Persona {
	private int ci;
	private LocalDate fnac;
	private String tipo;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Persona(int ci, LocalDate fnac, String tipo) {
		super();
		this.ci = ci;
		this.fnac = fnac;
		this.tipo = tipo;
	}
	
	public Persona(DTPersona p) {
		this.ci = p.getCi();
		this.fnac = LocalDate.parse(p.getFnac(), DateTimeFormatter.ofPattern("d/MM/yyyy"));
		this.tipo = p.getTipo();
	}
	
	public int getCi() {
		return ci;
	}
	
	public void setCi(int ci) {
		this.ci = ci;
	}
	
	public LocalDate getFnac() {
		return fnac;
	}
	
	public void setFnac(LocalDate fnac) {
		this.fnac = fnac;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
