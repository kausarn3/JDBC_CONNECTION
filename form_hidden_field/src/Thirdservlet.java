

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Thirdservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Thirdservlet() {
        super();
  
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		PrintWriter w=response.getWriter();
		//fetch input data from servelets
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		String s3=request.getParameter("t3");
		String s4=request.getParameter("t4");
		String s5=request.getParameter("t5");
		w.println("<form action='Fourthservlet' method='post'>");
		w.println("Country:<input type='text' name='t6'><br><br>");
		w.println("<input type='submit'>");
		//stores the fetch data from Firstservlet and secondservlet in hidden fields.
		w.println("<input type='hidden' name='t1' value="+"'"+s1+"'>");
		w.println("<input type='hidden' name='t2' value="+"'"+s2+"'>");
		w.println("<input type='hidden' name='t3' value="+"'"+s3+"'>");
		w.println("<input type='hidden' name='t4' value="+"'"+s4+"'>");
		w.println("<input type='hidden' name='t5' value="+"'"+s5+"'>");
		w.println("</form>");
		//w.println(s1);
		}
}
