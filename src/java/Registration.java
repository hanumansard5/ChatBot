import javax.servlet.http.*;
import java.sql.*;
public class Registration extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        {
		try 
                {
			String un=request.getParameter("username");
			String eml=request.getParameter("email");
			String pn=request.getParameter("phone");
			String dob=request.getParameter("date");
			String acn=request.getParameter("acc_number");
			String atm=request.getParameter("atm_number");
			String edate=request.getParameter("expiry");
			String pws=request.getParameter("pwd");
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusa","root","");
                        Statement st=con.createStatement();
                        String sql="insert into registrationtable values('"+un+"','"+eml+"',"+pn+",'"+dob+"',"+acn+","+atm+",'"+edate+"','"+pws+"' )";
                        st.executeUpdate(sql);
                        response.sendRedirect("/index.htm");   
                } 
                catch (Exception e){
                    Cookie c = new Cookie("error","true");
                    try{
                        response.sendRedirect("/content/register.html");
                    }catch(Exception e1){}
                }
	}
}
