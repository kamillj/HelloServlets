import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();

        String parameter1 = request.getParameter("parameter1");
        String parameter2 = request.getParameter("parameter2");
        String parameter3 = request.getParameter("parameter3");

        out.println("Wczytanie 3 parameterow z zadania :");
        out.println(parameter1);
        out.println(parameter2);
        out.println(parameter3);

        System.out.println(parameter1);
        System.out.println(parameter2);
        System.out.println(parameter3);
    }
}
