package datos;

import java.util.List;

import javax.ejb.Local;

import entidades.Persona;

@Local
public interface DatosPersonaLocal {
	public Persona buscarPersona(int ci); 
	
	public List<Persona> listarPersonas();
}
