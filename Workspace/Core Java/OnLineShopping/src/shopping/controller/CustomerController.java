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
import shopping.service.CustomerService;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw = response.getWriter();
		String cname = request.getParameter("cname");
		String password = request.getParameter("password");
		RequestDispatcher rd1 = request.getRequestDispatcher("CustomerDashboard");
		RequestDispatcher rd2 = request.getRequestDispatcher("customerLogin.jsp");
		Customer cc = new Customer();
		cc.setCname(cname);
		cc.setPassword(password);
		CustomerService cs = new CustomerService();
		String result = cs.checkCustomerInfo(cc);
		if(result.equals("success")) {
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
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		String cname = request.getParameter("cname");
		String password = request.getParameter("password");
		
		RequestDispatcher rd = request.getRequestDispatcher("customerLogin.jsp");
		Customer cc = new Customer();
		cc.setCname(cname);
		cc.setPassword(password);
		
		CustomerService cs = new CustomerService();
		String result	 = cs.storeCustomerInfo(cc);
		pw.print(result);
		rd.include(request, response);
	}

}
