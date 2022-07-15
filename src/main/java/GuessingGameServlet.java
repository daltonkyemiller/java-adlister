import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessingGameServlet", urlPatterns = "/guess")
public class GuessingGameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/guess-game.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random random = new Random();
        int guess = Integer.parseInt(req.getParameter("guess"));
        int randomNum = random.nextInt(3) + 1;
        System.out.println("Guess: " + guess);
        System.out.println("Random number: " + randomNum);

        if (guess > 3 || guess < 1) resp.sendRedirect("/guess");
        else if (guess == randomNum) {
            resp.sendRedirect("/correct");
        } else {
            resp.sendRedirect("/incorrect");
        }
    }
}
