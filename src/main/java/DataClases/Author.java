package DataClases;

import java.util.List;

/**
 * Created by Ian on 13/5/2017.
 */
public class Author {
    private String firstName;
    private String lastName;
    private String secondLastName;
    private List<BibliographicReference> references;

    public Author(String firstName, String lastName, String secondLastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public List<BibliographicReference> getReferences() {
        return references;
    }

    public void setReferences(List<BibliographicReference> references) {
        this.references = references;
    }
}
