package DataClases;

import java.util.Date;

/**
 * Created by Ian on 13/5/2017.
 */
public class ExerciseLog extends LogEntry {
    Exercise exercise;

    public ExerciseLog(Date date, ActionType type, int artificial_key, Administrator administrator,Exercise exercise) {
        super(date, type, artificial_key, administrator);
        this.exercise = exercise;
    }
}
