package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet3() {
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
   		PrintWriter out = response.getWriter();
   		out.println("D1 is "+ request.getAttribute("d1")+"D2 is "+ request.getSession().getAttribute("d2")+"D3 is "+ request.getServletContext().getAttribute("d3"));
   		RequestDispatcher rd = request.getRequestDispatcher("/DisplayPage.jsp");
   		rd.forward(request, response);
   	}

}
