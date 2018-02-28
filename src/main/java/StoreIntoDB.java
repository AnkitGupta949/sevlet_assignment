import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;

public class StoreIntoDB extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter=resp.getWriter();
        int xid=Integer.parseInt(req.getParameter("blogid"));
        String data=req.getParameter("blogdata");
        DBConnection dbConnection=new DBConnection();
        String msg=dbConnection.save(xid,data);
        if(!msg.equals("error")){
            printWriter.write(msg);
        }
        else{
            printWriter.write("your blog is not stored :"+msg);
        }

    }
}

