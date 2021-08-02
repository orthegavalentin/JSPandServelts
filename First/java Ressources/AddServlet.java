import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	
	public void service(HttpServletRequest rqst,HttpServletResponse rsp) {
		
		int num1=Integer.parseInt(rqst.getParameter("num1"));
		int num2=Integer.parseInt(rqst.getParameter("num2"));
		
		int sum=num1+num2;
		
		
		try {
			PrintWriter out=rsp.getWriter();
			
			out.println("the sum of the values equals "+sum);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
