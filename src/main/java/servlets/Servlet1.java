package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

	
    /*@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd=req.getRequestDispatcher("Servlet2");
		rd.forward(req, resp);
		PrintWriter pw=resp.getWriter();
		pw.write("<html><body><h1> This is servlet1");
		
	}*/
    @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd=req.getRequestDispatcher("Servlet2");
		
		PrintWriter pw=resp.getWriter();
		pw.write("<html><body><h1> This is servlet1");
		rd.include(req, resp);
		pw.write("<html><body><h1> This is servlet");

	}
	
}
