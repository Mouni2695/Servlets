package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DestinationServlet
 */
@WebServlet("/destination")
public class DestinationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DestinationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String name=(String) request.getAttribute("name");
		//String name=request.getParameter("name");
		pw.write("<html><body><h1> This is DestinationServlet "+name );

		/*HttpSession session=request.getSession(false);
		String name1=session.getAttribute("name").toString();
		String address=session.getAttribute("address").toString();
		pw.write("<html><body><h1> This is DestinationServlet "+name1 +" with address "+address);
		response.sendRedirect("firstServlet");*/
	}

}
