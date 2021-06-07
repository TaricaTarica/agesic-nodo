package controladores;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import datatypes.DTPersona;
import datos.DatosPersonaLocal;
import entidades.Persona;

/**
 * Session Bean implementation class ControladorPersona
 */
@Stateless
@LocalBean
public class ControladorPersona implements ControladorPersonaLocal {

	@EJB
	DatosPersonaLocal dpl;

    public ControladorPersona() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public DTPersona buscarPersona(int ci) {
    	Persona persona = dpl.buscarPersona(ci);
    	DTPersona retorno = null;
    	if(persona != null) {
    		retorno = new DTPersona(persona);
    	}
    	return retorno;
    }
    @Override
    public List<DTPersona> listarPersonas() {
    	List<Persona> personas = dpl.listarPersonas();
    	List<DTPersona> retorno = new ArrayList<>();
    	if(!personas.isEmpty()) {
    		for(Persona p: personas) {
    			retorno.add(new DTPersona(p));
    		}
    	}
    	return retorno;
    	
    }

}
