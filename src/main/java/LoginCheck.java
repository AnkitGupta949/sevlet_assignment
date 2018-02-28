import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginCheck extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter=resp.getWriter();
        String un=req.getParameter("username");
        String pwd=req.getParameter("password");



        if(un.equals("ankit") && pwd.equals("ankit")){

                 resp.sendRedirect("/blog.jsp");

        }
        else{
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("index.jsp");
            requestDispatcher.include(req,resp);
            printWriter.write("<p style='color:red'>Please Enter Correct Credential</p>");
        }

    }
}
