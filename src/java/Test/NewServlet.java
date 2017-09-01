package Test;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {
    protected void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        
        String nm=request.getParameter("t1");
        PrintWriter out=response.getWriter();
        out.println("<html><body>");
        out.println("name of the customer is "+nm);
        out.println("</body></html>");
    }
   
    
    
}
