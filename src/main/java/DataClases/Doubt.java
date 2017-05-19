package DataClases;

/**
 * Created by Ian on 13/5/2017.
 */
public class Doubt {
    String doubt;
    Student doubtingStudent;
    Exercise exercise;
    boolean is_Solved;

    public Doubt(String doubt, Student doubtingStudent, Exercise exercise, boolean is_solved){
        this.doubt = doubt;
        this.doubtingStudent = doubtingStudent;
        this.exercise = exercise;
        this.is_Solved = is_solved;
    }

    public String getDoubt() {
        return doubt;
    }

    public void setDoubt(String doubt) {
        this.doubt = doubt;
    }

    public Student getDoubtingStudent() {
        return doubtingStudent;
    }

    public void setDoubtingStudent(Student doubtingStudent) {
        this.doubtingStudent = doubtingStudent;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public boolean isIs_Solved() {
        return is_Solved;
    }

    public void setIs_Solved(boolean is_Solved) {
        this.is_Solved = is_Solved;
    }

}
