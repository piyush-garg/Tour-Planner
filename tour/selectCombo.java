package tour;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class selectCombo
 */
@WebServlet("/selectCombo")
public class selectCombo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectCombo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		String s=(String)session.getAttribute("username");

		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		try{
			Connection con = DriverManager.getConnection("jdbc:db2://localhost:50000/project","ADMIN","nishanttyagi1398.");
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=null;
			String sql="insert into bookcombo values('"+s+"',"+request.getParameter("bookAttraction")+")";
			stmt.executeUpdate(sql);

		}catch(SQLException r){
			r.printStackTrace();
		}
		response.sendRedirect("response.jsp");
	}

}
