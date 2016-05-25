package edu.fema.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OiMundoServlet
 */
@WebServlet("/OiMundoServlet")
public class OiMundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public OiMundoServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body><h1>Oi Mundo - Teste ServLet</h1>");
		out.print("<h3>Tecnologias: <br/>");
		out.print("Sistema operacional Linux Ubuntu 16.04 LST <br/>");
		out.print("Tecnologia Java EE 7 - Maven <br/>");
		out.print("Eclipse Java EE IDE for Web Developers. <br/>");
		out.print("Version: Neon Milestone 6 (4.6.0M6) <br/>");
		out.print("Banco de dados relacional MySQL Server version: 5.7.11 (Ubuntu) <br/>");
		out.print("Servidor de aplicações - Apache Tomcat/8.0.33</h3>");
		out.print("Prof. Domingos - FEMA");
		out.print("</body>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
