package br.com.jonaskuhn.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( 
		urlPatterns = {"/OlaMundo"},
		initParams = {
                @WebInitParam(name = "param1", value = "value1"),
                @WebInitParam(name = "param2", value = "value2")}
		)

public class OlaMundo extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	/*A anota��o @Override serve para notificar o compilador
	que estamos sobrescrevendo o m�todo service da classe m�e. 
	Se, por acaso, errarmos o nome do m�todo ou trocarmos a ordem 
	dos par�metros, o compilador vai reclamar e voc� vai perceber 
	o erro ainda em tempo de compila��o.*/
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Primeira Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Oi mundo Servlet!</h1>");
        out.println("</body>");
        out.println("</html>");
	}

}
