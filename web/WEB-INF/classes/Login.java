
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Login", urlPatterns = "/")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		PrintWriter writer = resp.getWriter();
		writer.println("<html>");

		if("admin".equals(username) && "admin".equals(password)) {
			writer.println("<h1>Welcome "+username+" to website</h1>");
		} else{
			writer.println("<h1>Login Error</h1>");
		}

		writer.println("</html>");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/layouts/index.jsp");
		rd.include(req, resp);
	}
}
