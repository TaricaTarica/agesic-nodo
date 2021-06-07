package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controladores.ControladorPersonaLocal;
import datatypes.DTPersona;

/**
 * Servlet implementation class ListarPersonas
 */
@WebServlet("/ListarPersonas")
public class ListarPersonas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	ControladorPersonaLocal cpl;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarPersonas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        List<DTPersona> personas = cpl.listarPersonas();
			if(!personas.isEmpty()) {
				out.println("<h1>Listado de Personas</h1>");
				out.println("<table style=\"width:100%\">");
				out.println("<tr>");
				out.println("<th>Ci</th>");
				out.println("<th>Fecha Nacimiento</th>");
				out.println("<th>Tipo</th>");
				out.println("</tr>");
				for(DTPersona p: personas) {
					out.println("<tr>");
					out.println("<th>"+ p.getCi() +"</th>");
					out.println("<th>"+ p.getFnac() +"</th>");
					out.println("<th>"+ p.getTipo() +"</th>");
					out.println("</tr>");
				}
				out.println("</table>");
			}else {
				out.println("<p>Tabla vacía(no deberías ver esto...)</p>");
			}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
		
}
