package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class YourServlet
 */
@WebServlet("/demo")
public class YourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YourServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name= request.getParameter("name");
		String nickname = request.getParameter("nname");
		out.println("<html><body>");
		out.println("<h1> The class was surprised for the water spill</h1>");
		out.println("<ul>");
		out.println(" <li>The name is "+ name);
		out.println(" <li>The name is "+ nickname);
		out.println("</ul>");
		out.println("</body></html>");
		
		
	}

}
