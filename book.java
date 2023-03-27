import ecs100.*;
/**
 * Creates a book that has info like the 
 * id, title, author, yr published, pages, genre and cover
 *
 * @author Gabrielle
 * @version 27/3/23
 */
public class book
{
    // instance variables
    private int id;
    private String title;
    private String author;
    private int yearPublished;
    private int pages;
    private String genre;
    private String image;

    /**
     * Constructor for objects of class book
     */
    public book(int id, String nm, String auth, int pub, int pgs, String gen, String img)
    {
        // initialise instance variables
        this.id = id;
        this.title = nm;
        this.author = auth;
        this.yearPublished = pub;
        this.pages = pgs;
        this.genre = gen;
        this.image = img;
    }

    /**
     * Prints the information of the book
     */
    public void getInfo()
    {
        UI.println("ID: " + id);
        UI.println("Title: " + title);
        UI.println("Author: " + author);
        UI.println("Year Published: " + yearPublished);
        UI.println("Pages: " + pages);
        UI.println("Genre: " + genre);
        UI.drawImage(image, 50, 50, 500, 200);
    }
}
