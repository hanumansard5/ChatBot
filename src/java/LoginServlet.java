import java.io.IOException;
import javax.servlet.http.*;
import java.sql.*;
public class LoginServlet extends HttpServlet 
{

    /**
     *
     * @param req
     * @param res
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
    {
        try{
            String name=req.getParameter("uname");
            String password=req.getParameter("pwd");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//            useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root",""
            Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusa","root","");   
            Statement stm=conn1.createStatement();
//            res.sendRedirect("/virtusa/content/chatBot1.html");
            String q="select * from registrationtable  where email='"+name+"' and password='"+password+"'";
            ResultSet rs=stm.executeQuery(q);
            int c=0;
            while(rs.next())
            {
                c++;
            }
            if(c==1){
                res.sendRedirect("content/chatBot1.html");
//                System.out.println("asffds");
            }
            else{
                
                Cookie ck=new Cookie("error","true");//creating cookie object
                ck.setMaxAge(14400);
                res.addCookie(ck);
                try{
                    res.sendRedirect("/index.htm");
                }catch(Exception e1){}
            }
        }catch(IOException | SQLException e){System.out.println(e);}
    }
    
}
