public class WorkDiary {

    private int id;
    private String Hous_Name;
    private String WorkDiary;
    private String Work_time;
    private String Work_man;
    private int Work_empl;
    private String Work_cont1;
    private String Work_cont2;
    private String Work_cont3;
    private String Work_cont4;
    private String Work_cont5;
    private String Work_contetc;

    public WorkDiary(int id, String hous_Name, String workDiary, String work_time, String work_man, int work_empl, String work_cont1, String work_cont2, String work_cont3, String work_cont4, String work_cont5, String work_contetc) {
        this.id = id;
        Hous_Name = hous_Name;
        WorkDiary = workDiary;
        Work_time = work_time;
        Work_man = work_man;
        Work_empl = work_empl;
        Work_cont1 = work_cont1;
        Work_cont2 = work_cont2;
        Work_cont3 = work_cont3;
        Work_cont4 = work_cont4;
        Work_cont5 = work_cont5;
        Work_contetc = work_contetc;
    }

    public int getId() {
        return id;
    }

    public String getHous_Name() {
        return Hous_Name;
    }

    public String getWorkDiary() {
        return WorkDiary;
    }

    public String getWork_time() {
        return Work_time;
    }

    public String getWork_man() {
        return Work_man;
    }

    public int getWork_empl() {
        return Work_empl;
    }

    public String getWork_cont1() {
        return Work_cont1;
    }

    public String getWork_cont2() {
        return Work_cont2;
    }

    public String getWork_cont3() {
        return Work_cont3;
    }

    public String getWork_cont4() {
        return Work_cont4;
    }

    public String getWork_cont5() {
        return Work_cont5;
    }

    public String getWork_contetc() {
        return Work_contetc;
    }
}
