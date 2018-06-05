package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String d1 = request.getParameter("data1");
		String d2 = request.getParameter("data2");
		String d3 = request.getParameter("data3");
		request.setAttribute("d1", d1);
		request.getSession().setAttribute("d2", d2);
		//HttpSession session = request.getSession();
		//session.setAttribute("d2", d2);
		request.getServletContext().setAttribute("d3", d3);
		//ServletContext application = request.getServletContext();
		//application.setAttribute("d3", d3);
		PrintWriter out = response.getWriter();
		out.println("D1 is "+ d1+"D2 is "+ d2+"D3 is "+ d3);
		RequestDispatcher rd = request.getRequestDispatcher("/Servlet2");
		rd.forward(request, response);
	}

}
