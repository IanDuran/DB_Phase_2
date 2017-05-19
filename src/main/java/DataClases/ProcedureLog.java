package DataClases;

import java.util.Date;

/**
 * Created by Ian on 13/5/2017.
 */
public class ProcedureLog extends LogEntry {
    Procedure procedure;

    public ProcedureLog(Date date, ActionType type, int artificial_key, Administrator administrator,Procedure procedure) {
        super(date, type, artificial_key, administrator);
        this.procedure = procedure;
    }
}