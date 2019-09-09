

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Firstservlet() {
        super();
   
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response from server to display form.
		PrintWriter w=response.getWriter();
		w.println("<form action='Secondservlet' method='post'>");
		w.println("Name:<input type='text' name='t1' required><br><br>");
		w.println("City:<input type='text' name='t2'><br><br>");
		w.println("Age:<input type='text' name='t3'<br><br>");
		w.println("<input type='submit'<br><br>");
		w.println("</form>");
		
	}

}
