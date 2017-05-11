import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Ian on 5/10/2017.
 */
public class DBWriter {
    private final String USER = "root";
    private final String PASSWORD = "";//Pongan clave
    private final String DB_URL = "jdbc:mysql://localhost:3306/DBNAME";//Cambiar al nombre de la base que van a usar
    private Connection connection;
    private Statement statement;


    public DBWriter(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ResultSet executeQuery(String query){
        ResultSet rs = null;
        try {
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }

    public void executeUpdate(String update){
        try {
            statement = connection.createStatement();
            statement.executeUpdate(update);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void printQueryResult(String query){
        // Esto va a cambiar dependiendo de la estructura de los datos que nos de el profe
        ResultSet rs = this.executeQuery(query);
        try {
            while (rs.next()) {
                System.out.println("Book signature: " + rs.getString(1) + "\nBook title: " + rs.getString(3) + "\nBook edition: " + rs.getString(2));
                System.out.println();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
