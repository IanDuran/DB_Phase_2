package DataClases;

import java.util.Date;

/**
 * Created by Ian on 13/5/2017.
 */
public class LogEntry {
    Date date;
    ActionType type;
    int artificial_id;
    Administrator administrator;


    public LogEntry(Date date, ActionType type, int artificial_id, Administrator administrator){
        this.administrator = administrator;
        this.artificial_id = artificial_id;
        this.date = date;
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ActionType getType() {
        return type;
    }

    public void setType(ActionType type) {
        this.type = type;
    }

    public int getArtificial_id() {
        return artificial_id;
    }

    public void setArtificial_id(int artificial_id) {
        this.artificial_id = artificial_id;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

}
