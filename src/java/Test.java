import javax.servlet.http.*;
import java.sql.*;
public class Test extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res){
        try{
            String question1=req.getParameter("Please tell me your user name");
            String question2=req.getParameter("Please enter your Account Number");
            String question3=req.getParameter("Please enter your registered email");
            String question4=req.getParameter("Are you paying your EMI/LOAN?");
            String question5=req.getParameter("If 'No' do you have any problem to pay?(Yes/No)");
            String question6=req.getParameter("If 'Yes' please mention the reason here.(else reply N/A)");
            String question7=req.getParameter("Do you require any 'Moratorium'?");
            String question8=req.getParameter("If you require 'Moratorium' mention period in months");
            String question9=req.getParameter("If require any other help please mention below,THANK YOU.");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusa","root","");
            Statement st=con.createStatement();
            String sql="insert into response values('"+question1+"','"+question2+"','"+question3+"','"+question4+"','"+question5+"','"+question6+"','"+question7+"','"+question8+"','"+question9+"')";
            st.executeUpdate(sql);
            res.sendRedirect("/content/chatBot1.html");
        }
        catch(Exception e){
                System.out.println(e);
                
        }
    }
}