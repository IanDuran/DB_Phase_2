package DataClases;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Ian on 13/5/2017.
 */
public class Student extends User{
    private String studentId;
    private Date lastLogin;
    private List<Exercise> favorites;
    private Map<Answer, AnswerReport> reported;
    private Map<Exercise, Doubt> doubts;

    public Student(String userName, String firstName, String firstLastName,
                   String secondLastName, String email, String password, Date birthDate,
                   boolean isEnabled, String studentId){
        super(userName, firstName, firstLastName, secondLastName, email, password, birthDate, isEnabled);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public List<Exercise> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Exercise> favorites) {
        this.favorites = favorites;
    }

    public Map<Answer, AnswerReport> getReported() {
        return reported;
    }

    public void setReported(Map<Answer, AnswerReport> reported) {
        this.reported = reported;
    }

    public Map<Exercise, Doubt> getDoubts() {
        return doubts;
    }

    public void setDoubts(Map<Exercise, Doubt> doubts) {
        this.doubts = doubts;
    }
}
