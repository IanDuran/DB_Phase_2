package DataClases;

/**
 * Created by Ian on 5/18/2017.
 */
public class SourceCode {
    private String code;
    private String language;

    public SourceCode(String code, String language){
        this.code = code;
        this.language = language;
    }

    public String getCode() {
        return code;
    }

    public String getLanguage() {
        return language;
    }
}
