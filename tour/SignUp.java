package tour;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
/**
 * Servlet implementation class gh
 */
@WebServlet("/checkLogin")
public class SignUp extends HttpServlet {
	static HashMap<String,String> hm = new HashMap<String,String>();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			response.setContentType("text/html");

		System.out.println("ffffds");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("user");
		ServletContext context=request.getServletContext();
		HttpSession session=request.getSession();
		if(user!=null && user!="")
		{
			session.setAttribute("asd",user);
			context.setAttribute("user", user);
		}
		out.println("hello "+user+"\n"+"session user"+(String)session.getAttribute("asd")+"context"+(String)context.getAttribute("user"));
		 }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String sex=request.getParameter("x");	
		String email=request.getParameter("email");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		hm.put(username, password);
		String dob=request.getParameter("dob");
		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		try{
			Connection con = DriverManager.getConnection("jdbc:db2://localhost:50000/project","ADMIN","piyushgarg1594.");
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String sql = "INSERT INTO customer values"+
					" ('"+fname+"','"+lname+"','"+sex+"','"+email+"','"+username+"','"+password+"')";
			stmt.executeUpdate(sql);     
		}catch(SQLException r){
			r.printStackTrace();
		}
	}
}
