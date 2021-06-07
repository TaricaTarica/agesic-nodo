package controladores;

import java.util.List;

import javax.ejb.Local;

import datatypes.DTPersona;

@Local
public interface ControladorPersonaLocal {
	
	public DTPersona buscarPersona(int ci); 
	
	public List<DTPersona> listarPersonas();
}
