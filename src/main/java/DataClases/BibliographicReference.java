package DataClases;

import java.util.List;

/**
 * Created by Ian on 13/5/2017.
 */
public class BibliographicReference {
    private int publicationYear;
    private List<Exercise> exercises;
    private List<Author> authors;

    public BibliographicReference(int publicationYear){
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
