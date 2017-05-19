package DataClases;

import java.util.Date;

/**
 * Created by Ian on 13/5/2017.
 */
public class AnswerLog extends LogEntry {
    Answer answer;

    public AnswerLog(Date date, ActionType type, int artificial_key, Administrator administrator,Answer answer) {
        super(date, type, artificial_key, administrator);
        this.answer = answer;
    }
}