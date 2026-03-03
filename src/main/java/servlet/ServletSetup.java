package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import Main.AgeCalculator;

@WebServlet("/processAge")
public class ServletSetup extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String yearStr = request.getParameter("yearInput");
		int year = Integer.parseInt(yearStr);

		AgeCalculator service = new AgeCalculator();
		int age = service.calculateAge(year);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<head>");
		out.println("<link rel=\"stylesheet\" href=\"style.css\" />");
		out.println("</head>\n<main>");
		out.println("<h1>Your Result</h1>");
		out.println("<p>You are approximately " + age + " years old.</p>");
		out.println("<a href='index.html'>Go Back</a>");
		out.println("</main>");
	}
}
