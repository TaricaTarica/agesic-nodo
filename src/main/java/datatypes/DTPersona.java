package datatypes;

import java.io.Serializable;
import entidades.Persona;

public class DTPersona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ci;
	private String fnac;
	private String tipo;
	
	public DTPersona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DTPersona(int ci, String fnac, String tipo) {
		super();
		this.ci = ci;
		this.fnac = fnac;
		this.tipo = tipo;
	}
	
	public DTPersona(Persona p) {
		this.ci = p.getCi();
		this.fnac = p.getFnac().toString();
		this.tipo = p.getTipo();
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getFnac() {
		return fnac;
	}

	public void setFnac(String fnac) {
		this.fnac = fnac;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
