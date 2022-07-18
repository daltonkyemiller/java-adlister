package beans;

import java.io.Serializable;

public class Quote implements Serializable {
    private long id;
    private String quote;
    private Author author;

    public Quote() {
    }

    public Quote(long id, String quote, Author author) {
        this.id = id;
        this.quote = quote;
        this.author = author;
    }

    public Quote(String quote, Author author) {
        this.quote = quote;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getQuote() {
        return quote;
    }

    public Author getAuthor() {
        return author;
    }
}
