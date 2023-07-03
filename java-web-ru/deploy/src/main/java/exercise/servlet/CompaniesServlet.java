package exercise.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import static exercise.Data.getCompanies;

public class CompaniesServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                throws IOException, ServletException {

        // BEGIN
        PrintWriter out = response.getWriter();
        String searchLine = request.getParameter("search");

        if (searchLine == null) {
            getCompanies().forEach(out::println);
            return;
        }

        List<String> filteredCompanies = getCompanies().stream()
                .filter(company -> company.contains(searchLine))
                .toList();

        if (filteredCompanies.isEmpty()) {
            out.println("Companies not found");
        }

        filteredCompanies.forEach(out::println);
        // END
    }
}
