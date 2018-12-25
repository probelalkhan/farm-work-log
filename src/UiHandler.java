import javax.swing.table.DefaultTableModel;
import java.util.List;

public class UiHandler {

    private static UiHandler mInstance = null;

    public static UiHandler getInstance() {
        if (mInstance == null)
            mInstance = new UiHandler();
        return mInstance;
    }

    public void displayWorkDiary(DefaultTableModel model, String date){
        model.setRowCount(0);

        List<WorkDiary> workDiaries = DbHandler.getInstance().getWorkDiaries(date);

        for (WorkDiary wd : workDiaries) {
            model.addRow(new Object[]{
                    wd.getHous_Name(),
                    wd.getWorkDiary(), //we don't have any work date in database
                    wd.getWork_time(),
                    wd.getWork_man(),
                    wd.getWork_empl(),
                    wd.getWork_cont1(),
                    wd.getWork_cont2(),
                    wd.getWork_cont3(),
                    wd.getWork_cont4(),
                    wd.getWork_cont5(),
                    wd.getWork_contetc()
            });
        }
    }

}
