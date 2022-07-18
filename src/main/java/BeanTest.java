import beans.Author;
import beans.Quote;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Quote quote = new Quote("blbhkamdlkmsdlkansd", new Author("firstName", "lastName"));
        Quote quote1 = new Quote("You miss 100 shots every time you take a shot", new Author("Michael", "Jordan"));
        Quote quote2 = new Quote("You can fail there isn't try", new Author("Yoda", "The Force"));
        Quote quote3 = new Quote("You can't always get what you want", new Author("John", "Doe"));
        Quote quote4 = new Quote("You can always get what you want", new Author("John", "Doe"));

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote);
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);
        quotes.add(quote4);

        for (Quote q : quotes) {
            System.out.println("Quote: " + q.getQuote());
            System.out.println("Author: " + q.getAuthor().getFirstName() + " " + q.getAuthor().getLastName());
        }
    }
}
