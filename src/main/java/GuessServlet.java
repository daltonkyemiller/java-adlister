import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = {"/correct", "/incorrect"})
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("/WEB-INF/correct.jsp").forward(req, resp);
        String path = req.getServletPath();
        System.out.println(path);
        if (path.equals("/correct")) {
            req.setAttribute("message", "You guessed correctly!");
        } else {
            req.setAttribute("message", "You guessed incorrectly!");
        }
        req.getRequestDispatcher("/WEB-INF/guess.jsp").forward(req, resp);
    }

}
