package DataClases;

/**
 * Created by Ian on 5/18/2017.
 */
public class Book extends BibliographicReference {
    private String ISBN;
    private String editorial;
    private String title;
    private int page;

    public Book(int publicationYear, String ISBN, String editorial, String title, int page){
        super(publicationYear);
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.title = title;
        this.page = page;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getTitle() {
        return title;
    }

    public int getPage() {
        return page;
    }
}
