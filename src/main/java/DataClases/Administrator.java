package DataClases;

import java.util.Date;
import java.util.List;

/**
 * Created by Ian on 13/5/2017.
 */
public class Administrator extends User{
    private String idCard;
    private List<LogEntry> logFiles;

    public Administrator(String userName, String firstName, String firstLastName,
                         String secondLastName, String email, String password, Date birthDate,
                         boolean isEnabled, String idCard){
        super(userName, firstName, firstLastName, secondLastName, email, password, birthDate, isEnabled);
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public List<LogEntry> getLogFiles() {
        return logFiles;
    }

    public void setLogFiles(List<LogEntry> logFiles) {
        this.logFiles = logFiles;
    }
}
