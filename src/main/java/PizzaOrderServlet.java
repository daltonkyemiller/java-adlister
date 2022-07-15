import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pizza-order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(req.getParameterMap().entrySet());
        String crust = req.getParameter("crust");
        String size = req.getParameter("size");
        String sauce = req.getParameter("sauce");
        String toppings[] = req.getParameterValues("toppings");
        String address = req.getParameter("address");

        System.out.println("Crust: " + crust);
        System.out.println("Size: " + size);
        System.out.println("Sauce: " + sauce);
        System.out.println("Toppings: ");
        for (String topping : toppings) {
            System.out.println("\t" + topping);
        }
        System.out.println("Address: " + address);
    }
}
