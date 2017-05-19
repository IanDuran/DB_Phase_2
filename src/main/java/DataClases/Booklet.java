package DataClases;

/**
 * Created by Ian on 5/18/2017.
 */
public class Booklet extends BibliographicReference {
    private String title;
    private int page;

    public Booklet(int publicationYear, String title, int page){
        super(publicationYear);
        this.title = title;
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public int getPage() {
        return page;
    }
}
