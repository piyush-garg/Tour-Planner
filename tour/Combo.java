package tour;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import java.util.*;

/**
 * Servlet implementation class combo
 */
@WebServlet("/combo")
public class Combo extends HttpServlet {
	Hotel c=new Hotel();
	Attraction cu=new Attraction();
	Place cur=new Place();
	private static final long serialVersionUID = 1L;
	//public static LinkedList<Struct> l1=new LinkedList<Struct>();
	public static Struct pl=new Struct();
	int i;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Combo() {
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
	Place createPlace(int pid)
	{
		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		try{
			Connection con = DriverManager.getConnection("jdbc:db2://localhost:50000/project","ADMIN","nishanttyagi1398");
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=null;
			String sql="select * from destination where id="+pid;
			rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				cur.setName(rs.getString("name"));
				cur.setId(rs.getInt("id"));
				cur.setState(rs.getString("state"));
				cur.setCountry(rs.getString("country"));
				cur.setImage(rs.getString("image"));
			}

		}catch(SQLException r){
			r.printStackTrace();
		}
		return cur;
	}
	Attraction createAttraction(int id)
	{

		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		try{
			Connection con = DriverManager.getConnection("jdbc:db2://localhost:50000/project","ADMIN","nishanttyagi1398.");
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=null;
			String sql="select * from attraction where id="+id;
			rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				cu.setName(rs.getString("name"));
				cu.setId(rs.getInt("id"));
				cu.setPid(rs.getInt("pid"));
				cu.setImage(rs.getString("image"));
				cu.setDescription(rs.getString("description"));
			}

		}catch(SQLException r){
			r.printStackTrace();
		}
		return cu;
	}
	Hotel createHotel(int hId)
	{

		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		try{
			Connection con = DriverManager.getConnection("jdbc:db2://localhost:50000/project","ADMIN","nishanttyagi1398.");
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=null;
			String sql="select * from hotel where hid="+hId;
			rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				c.setName(rs.getString("name"));
				c.setHid(rs.getInt("hid"));
				c.setPid(rs.getInt("pid"));
				c.setArea(rs.getString("area"));
				c.setStreet(rs.getString("street"));
				c.setImage(rs.getString("image"));
				c.setCap1(rs.getInt("c1"));
				c.setRate1(rs.getInt("r1"));
				System.out.println("ghjkghl");
			}

		}catch(SQLException r){

			r.printStackTrace();
		}
		return c;
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String city;
		int hid;
		Cookie cookie = null;
		Cookie[] cookies = null;
		// Get an array of Cookies associated with this domain
		cookies = request.getCookies();

		if( cookies != null ){
			for (int i = 0; i < cookies.length; i++){
				cookie = cookies[i];
				if(cookie.getName( ).equals("placeId"))
				{
					city=cookie.getValue( );
					System.out.println("city"+city);
					pl.setP(createPlace(Integer.parseInt(cookie.getValue())));
					//System.out.println("mnb"+pl.getP().getName());
				}
				if(cookie.getName( ).equals("hotelId"))
				{
					hid=Integer.parseInt(cookie.getValue( ));
					System.out.println("hid"+hid);
					pl.setH(createHotel(hid));
					System.out.println("mnb"+pl.getH().getName());	
				}
			}
			 Cookie vtype = new Cookie("vtype",request.getParameter("myradio")); 
			 Cookie from=new Cookie("from",request.getParameter("from"));  
			 Cookie to=new Cookie("to",request.getParameter("to"));  	
			 Cookie seats=new Cookie("seats",request.getParameter("seats")); 
			 System.out.println("from"+request.getParameter("from"));
			vtype.setMaxAge(60*60*24); 
			 from.setMaxAge(60*60*24); 
			 to.setMaxAge(60*60*24); 
			 seats.setMaxAge(60*60*24); 
			 response.addCookie(seats);
			   response.addCookie( vtype);
			   response.addCookie( from);
			     response.addCookie( to);

			
		int i=0;
			for(String e:ChoseAttraction.val)
			{
				System.out.println(e);
				pl.att[i]=createAttraction(Integer.parseInt(e));
				i++;
			}
			response.sendRedirect("Itenary.jsp");
			}
	}
}

