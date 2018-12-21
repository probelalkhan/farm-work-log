import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {

    private static DbConnect mInstance = null;

    public static DbConnect getInstance() {
        if (mInstance == null)
            mInstance = new DbConnect();
        return mInstance;
    }

    public Connection getConnection(){
        Connection con = null;
        try {
            Class.forName(Config.DB_DRIVER);
            con = DriverManager.getConnection(
                    Config.DB_HOST+":"+ Config.DB_PORT + "/"+Config.DB_NAME, Config.DB_USER, Config.DB_PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

}
