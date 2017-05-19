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
    private SourceCode sourceCodeAnswer;
    private ImageAnswer imageAnswer;
    private NumericAnswer numericAnswer;
    private TextAnswer textAnswer;

    public Answer(boolean isVisible, boolean isCorrect, Exercise exercise, AnswerLog log){
        this.isVisible = isVisible;
        this.isCorrect = isCorrect;
        this.exercise = exercise;
        this.log = log;
        sourceCodeAnswer = null;
        imageAnswer = null;
        numericAnswer = null;
        textAnswer = null;
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

    public SourceCode getSourceCodeAnswer() {
        return sourceCodeAnswer;
    }

    public void setSourceCodeAnswer(SourceCode sourceCodeAnswer) {
        this.sourceCodeAnswer = sourceCodeAnswer;
    }

    public ImageAnswer getImageAnswer() {
        return imageAnswer;
    }

    public void setImageAnswer(ImageAnswer imageAnswer) {
        this.imageAnswer = imageAnswer;
    }

    public NumericAnswer getNumericAnswer() {
        return numericAnswer;
    }

    public void setNumericAnswer(NumericAnswer numericAnswer) {
        this.numericAnswer = numericAnswer;
    }

    public TextAnswer getTextAnswer() {
        return textAnswer;
    }

    public void setTextAnswer(TextAnswer textAnswer) {
        this.textAnswer = textAnswer;
    }
}
