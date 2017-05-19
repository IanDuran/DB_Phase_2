package DataClases;

/**
 * Created by Ian on 13/5/2017.
 */
public class AnswerReport {
    String explanation;
    Student reportingStudent;
    Answer reportedAnswer;


    public AnswerReport(String explanation, Student reportingStudent, Answer reportedAnswer){
        this.explanation = explanation;
        this.reportedAnswer = reportedAnswer;
        this.reportingStudent = reportingStudent;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public Student getReportingStudent() {
        return reportingStudent;
    }

    public void setReportingStudent(Student reportingStudent) {
        this.reportingStudent = reportingStudent;
    }

    public Answer getReportedAnswer() {
        return reportedAnswer;
    }

    public void setReportedAnswer(Answer reportedAnswer) {
        this.reportedAnswer = reportedAnswer;
    }

}
