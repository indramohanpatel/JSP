import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowData extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		//for printing the response
		PrintWriter out = res.getWriter();
		out.println("Hello");
		
		System.out.println("Hello");
		String username = req.getParameter("name");
		int userage = Integer.parseInt(req.getParameter("age"));
		long usermobile = Long.parseLong(req.getParameter("mobile"));
		String useremail = req.getParameter("email");
		String[] userqualification = req.getParameterValues("qualification"); 
		
		out.println("Username : "+ username );
		if(userage < 18) {
			out.println("Age : " + userage);
		}else if(18 <= userage && userage < 50) {
			out.println("Age : " + userage);
		}else if(50 <= userage) {
			out.println("Age : " + userage);
		}
		out.println("Mobile : "+ usermobile );
		out.println("Email : " + useremail);
		for(String s : userqualification) {
			out.println("Qualification : "+ s);
		}
	}

}
