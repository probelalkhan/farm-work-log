import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbHandler {
    private static DbHandler mInstance = null;

    public static DbHandler getInstance() {
        if (mInstance == null)
            mInstance = new DbHandler();
        return mInstance;
    }

    public List<FarmingStat> getFarmingStats() {
        List<FarmingStat> farmingStats = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/zak", "root", "");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM farmingstat");
            while (rs.next()) {

                FarmingStat fs = new FarmingStat(
                        rs.getInt(0),
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getInt(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getInt(14),
                        rs.getInt(15),
                        rs.getInt(16),
                        rs.getInt(17),
                        rs.getString(18),
                        rs.getString(19)
                );
                farmingStats.add(fs);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return farmingStats;
    }

    public List<WorkDiary> getWorkDiaries() {
        List<WorkDiary> workDiaries = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/zak", "root", "");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM farmingstat");
            while (rs.next()) {

                WorkDiary wd = new WorkDiary(
                        rs.getInt(0),
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)
                );
                workDiaries.add(wd);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return workDiaries;
    }

}

