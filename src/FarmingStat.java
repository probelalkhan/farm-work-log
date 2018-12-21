
public class FarmingStat {
    private int id;
    private String sFarm_Item;
    private String sFarm_Vari;
    private String Nongin;
    private int Hold;
    private String Farm_Loc;
    private int Farm_Size;
    private String Ceo_tel;
    private String Ceo_educ;
    private int Nong_empl;
    private String Class_jak;
    private String Tech_cmpy;
    private String Cmpy_tel;
    private String Hous_name;
    private int Hous_type;
    private int Hous_mo;
    private int Hous_size;
    private int Hous_cnt;
    private String Nong_Meth;
    private String Nong_etc;

    public FarmingStat(int id, String sFarm_Item, String sFarm_Vari, String nongin, int hold, String farm_Loc, int farm_Size, String ceo_tel, String ceo_educ, int nong_empl, String class_jak, String tech_cmpy, String cmpy_tel, String hous_name, int hous_type, int hous_mo, int hous_size, int hous_cnt, String nong_Meth, String nong_etc) {
        this.id = id;
        this.sFarm_Item = sFarm_Item;
        this.sFarm_Vari = sFarm_Vari;
        Nongin = nongin;
        Hold = hold;
        Farm_Loc = farm_Loc;
        Farm_Size = farm_Size;
        Ceo_tel = ceo_tel;
        Ceo_educ = ceo_educ;
        Nong_empl = nong_empl;
        Class_jak = class_jak;
        Tech_cmpy = tech_cmpy;
        Cmpy_tel = cmpy_tel;
        Hous_name = hous_name;
        Hous_type = hous_type;
        Hous_mo = hous_mo;
        Hous_size = hous_size;
        Hous_cnt = hous_cnt;
        Nong_Meth = nong_Meth;
        Nong_etc = nong_etc;
    }

    public int getId() {
        return id;
    }

    public String getsFarm_Item() {
        return sFarm_Item;
    }

    public String getsFarm_Vari() {
        return sFarm_Vari;
    }

    public String getNongin() {
        return Nongin;
    }

    public int getHold() {
        return Hold;
    }

    public String getFarm_Loc() {
        return Farm_Loc;
    }

    public int getFarm_Size() {
        return Farm_Size;
    }

    public String getCeo_tel() {
        return Ceo_tel;
    }

    public String getCeo_educ() {
        return Ceo_educ;
    }

    public int getNong_empl() {
        return Nong_empl;
    }

    public String getClass_jak() {
        return Class_jak;
    }

    public String getTech_cmpy() {
        return Tech_cmpy;
    }

    public String getCmpy_tel() {
        return Cmpy_tel;
    }

    public String getHous_name() {
        return Hous_name;
    }

    public int getHous_type() {
        return Hous_type;
    }

    public int getHous_mo() {
        return Hous_mo;
    }

    public int getHous_size() {
        return Hous_size;
    }

    public int getHous_cnt() {
        return Hous_cnt;
    }

    public String getNong_Meth() {
        return Nong_Meth;
    }

    public String getNong_etc() {
        return Nong_etc;
    }
}
