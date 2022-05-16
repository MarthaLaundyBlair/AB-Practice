package com.ab.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FIrstServlet
 */
@WebServlet("/FIrstServlet")
public class FIrstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FIrstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	
		//Step 1: Set content type of servlet response
		response.setContentType("text/html");
		
		//Step 2: Create a PrintWriter object using response object
		//coming from character stream class
		PrintWriter pw = response.getWriter();
		
		//Step 3: Write some reponse back to the Client
		pw.println("<body bgcolor='blue'>");
		pw.println("<h1> Welcome to Servlet API!!!</h1>");
		pw.println("</body>");
		
		//Step 4: Close Print Writer
		
		pw.close();
		
	
	
	
	
	
	
	
	
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
