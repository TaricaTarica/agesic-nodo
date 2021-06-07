package servicios;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import controladores.ControladorPersonaLocal;
import datatypes.DTPersona;

@WebService
public class ServicioAgesic {
	
	@EJB
	ControladorPersonaLocal cpl;
	
	@WebMethod
	public DTPersona obtenerPersona(int ci) {
		return cpl.buscarPersona(ci);
	}
}
