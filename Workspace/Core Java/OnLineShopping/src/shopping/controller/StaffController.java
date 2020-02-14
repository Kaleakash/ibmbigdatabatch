package shopping.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shopping.bean.Customer;
import shopping.bean.Staff;
import shopping.service.CustomerService;
import shopping.service.StaffService;

/**
 * Servlet implementation class StaffController
 */
@WebServlet("/StaffController")
public class StaffController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		String sname = request.getParameter("sname");
		String password = request.getParameter("password");
		RequestDispatcher rd1 = request.getRequestDispatcher("StaffDashboard");
		RequestDispatcher rd2 = request.getRequestDispatcher("staffLogin.jsp");
		Staff sf = new Staff();
		sf.setSname(sname);
		sf.setPassword(password);
		StaffService ss = new StaffService();
		String result = ss.checkStaffInfo(sf);
		if(result.equals("success")) {
			//pw.println("Welcome "+sf.getSname());
			request.setAttribute("obj",sf.getSname());
			rd1.forward(request, response);
		}else {
			pw.println("Failure try once again!");
			rd2.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		String sname = request.getParameter("sname");
		String password = request.getParameter("password");
		
		RequestDispatcher rd = request.getRequestDispatcher("staffLogin.jsp");
		Staff sf  = new Staff();
		sf.setSname(sname);
		sf.setPassword(password);
		
		StaffService ss = new StaffService();
		String result	 = ss.storeStaffInfo(sf);
		pw.print(result);
		rd.include(request, response);

	}

}
