

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Fourthservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Fourthservlet() {
        super();
      
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		//fetch data from servlets.
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		String s3=request.getParameter("t3");
		String s4=request.getParameter("t4");
		String s5=request.getParameter("t5");
		String s6=request.getParameter("t6");
		PrintWriter w=response.getWriter();
		w.println(s1+"<br>"+s2+"<br>"+s3+"<br>"+s4+"<br>"+s5+"<br>"+s6+"<br>");
		
}
	

}
