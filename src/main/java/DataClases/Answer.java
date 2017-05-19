package DataClases;

import java.util.Map;

/**
 * Created by Ian on 13/5/2017.
 */
public class Answer {
    private boolean isVisible;
    private boolean isCorrect;
    private Exercise exercise;
    private AnswerLog log;
    private Map<Student, AnswerReport> reportingStudents;

    public Answer(boolean isVisible, boolean isCorrect, Exercise exercise, AnswerLog log){
        this.isVisible = isVisible;
        this.isCorrect = isCorrect;
        this.exercise = exercise;
        this.log = log;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public AnswerLog getLog() {
        return log;
    }

    public Map<Student, AnswerReport> getReportingStudents() {
        return reportingStudents;
    }

    public void setReportingStudents(Map<Student, AnswerReport> reportingStudents) {
        this.reportingStudents = reportingStudents;
    }
}
