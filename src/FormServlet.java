import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FormServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.print("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>FormServlet example</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1 ALIGN=\"CENTER\">FormServlet example</h1>\n" +
                "\n" +
                "<form ACTION=\"http://localhost:8080/servlets/form\"\n" +
                "      METHOD=\"POST\">\n" +
                "    Parametr 1:\n" +
                "    <input TYPE=\"TEXT\" NAME=\"parametr1\"><br/>\n" +
                "    Parametr 2:\n" +
                "    <input TYPE=\"TEXT\" NAME=\"parametr2\"><br/>\n" +
                "    Parametr 3:\n" +
                "    <input TYPE=\"TEXT\" NAME=\"parametr3\"><br/>\n" +
                "    <input TYPE=\"SUBMIT\" VALUE=\"Wyslij\">\n" +
                "</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("Wczytanie 3 parametrow z zadania :");
        out.println(request.getParameter("parametr1"));
        out.println(request.getParameter("parametr2"));
        out.println(request.getParameter("parametr3"));

        System.out.println(request.getParameter("parametr1"));
        System.out.println(request.getParameter("parametr2"));
        System.out.println(request.getParameter("parametr3"));
    }
}
