package DataClases;

import java.util.List;
import java.util.Map;

/**
 * Created by Ian on 13/5/2017.
 */
public class Exercise {
    int artificial_Id;
    boolean visible;
    Difficulty difficulty ;
    String statement;
    boolean deleted;
    String snippet;
    List<Answer> answers;
    List<ExerciseLog> log;
    List<Topic> topics;
    List<BibliographicReference> references;
    Map<Student, Doubt> doubtingStudents;
    List<Student> studentsMarkedAsFavourite;

    public Exercise(int artificial_Id, boolean visible, Difficulty difficulty, String statement, boolean deleted, String snippet){
        this.artificial_Id = artificial_Id;
        this.visible = visible;
        this.difficulty = difficulty;
        this.statement = statement;
        this.deleted = deleted;
        this.snippet = snippet;
    }

    public int getArtificial_Id() {
        return artificial_Id;
    }

    public void setArtificial_Id(int artificial_Id) {
        this.artificial_Id = artificial_Id;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<ExerciseLog> getLog() {
        return log;
    }

    public void setLog(List<ExerciseLog> log) {
        this.log = log;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public List<BibliographicReference> getReferences() {
        return references;
    }

    public void setReferences(List<BibliographicReference> references) {
        this.references = references;
    }

    public Map<Student, Doubt> getDoubtingStudents() {
        return doubtingStudents;
    }

    public void setDoubtingStudents(Map<Student, Doubt> doubtingStudents) {
        this.doubtingStudents = doubtingStudents;
    }

    public List<Student> getStudentsMarkedAsFavourite() {
        return studentsMarkedAsFavourite;
    }

    public void setStudentsMarkedAsFavourite(List<Student> studentsMarkedAsFavourite) {
        this.studentsMarkedAsFavourite = studentsMarkedAsFavourite;
    }

}
