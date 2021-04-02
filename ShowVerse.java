package com.ch.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ch.data.Psalm31Verses;

/**
 * Servlet implementation class ShowVerse
 */
@WebServlet("/today")
public class ShowVerse extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowVerse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Psalm31Verses verse = new Psalm31Verses();
		
		
		String docType = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 "+"Transitional//EN\">\n";
		out.println(docType + 
					"<html>\n"+
					"<head><title>Psalm 31:"+(verse.getDayNo()+1)+" </title></head>\n"+
					"<h1>Psalm 31:"+(verse.getDayNo()+1)+"</h1>"+
					"<body bgcolor=\"#fdf5e6\">\n"+
					"<center><h2>\n"+
					verse.getVerse()+
					"</h2></center></body></html>");
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
