package com.registrationProcess;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/CustomerRegistration")
public class CustomerRegistration extends HttpServlet
{
	
	private static final long serialVersionUID = 1345L;

   
    public CustomerRegistration() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		//response.setContentType("application/pdf");
		
		PrintWriter printWriter = response.getWriter();
		
		//get the values from client 
		
		String name = request.getParameter("user-name");
		String email = request.getParameter("email");
		String password = request.getParameter("psw");
		
		if(name != null)
		{
			printWriter.print("<h2>Customer name: <h2>"+name);
			printWriter.print("<br>");
			printWriter.print("<h2>Customer email: <h2>"+email);			
		}
		else
		{
			printWriter.print("<h2>something wrong in logic.............!<h2>");
		}
		
	}

}
