package br.com.jonaskuhn.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MinhaServlet", urlPatterns = { "/MetodoInit" }, 
initParams = {
		@WebInitParam(name = "param1", value = "value1"), 
		@WebInitParam(name = "param2", value = "value2") 
		}
)

public class MetodoInit extends HttpServlet {

	private static final long serialVersionUID = 1L;
	// Usando a sobrecarga do m�todo init() das Servlets:

	// c�digo omitido

	@SuppressWarnings("unused")
	private String parametro1;

	@SuppressWarnings("unused")
	private String parametro2;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		this.parametro1 = config.getInitParameter("param1");
		this.parametro2 = config.getInitParameter("param2");
	}

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<h2>Exemplo com InitParam Servlet</h2>");

		ServletConfig config = getServletConfig();
		
		//metodo maior
		//String parametro1 = config.getInitParameter("param1");
		//out.println("Valor do par�metro 1: " + parametro1);
		
		//Metodo mais eficiente
		out.println("Valor do par�metro 1: "
                + getServletConfig().getInitParameter("param1"));

		String parametro2 = config.getInitParameter("param2");
		out.println("<br>Valor do par�metro 1: " + parametro2);

		out.close();
	}
}
