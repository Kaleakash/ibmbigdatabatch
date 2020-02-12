package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		RequestDispatcher rd1 = request.getRequestDispatcher("Dashboard");
		RequestDispatcher rd2 = request.getRequestDispatcher("index.html");
		try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "system", "tiger");
	PreparedStatement pstmt = 
con.prepareStatement("select * from login where username = ? and password = ?");
		String name = request.getParameter("user");
		String pass = request.getParameter("pass");
		pstmt.setString(1, name);
		pstmt.setString(2, pass);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			pw.println("<h1>Successfully Login</h1>");
			rd1.forward(request, response);
		}else {
			pw.println("<h7>Failure try once again</h7><br>");
			rd2.include(request, response);
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
