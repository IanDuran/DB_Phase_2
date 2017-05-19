package DataClases;

import java.util.List;

/**
 * Created by Ian on 5/18/2017.
 */
public class PracticalAnswer extends Answer {
    private List<Procedure> procedures;

    public PracticalAnswer(boolean isVisible, boolean isCorrect, Exercise exercise, AnswerLog log){
        super(isVisible,isCorrect, exercise, log);
    }

    public List<Procedure> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<Procedure> procedures) {
        this.procedures = procedures;
    }
}
