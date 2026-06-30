package icu.samnyan.aqua.sega.diva.model.response.ingame;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.diva.model.response.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StageResultResponse_getNblsslttnxttckt_183545665337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30339;

    public StageResultResponse_getNblsslttnxttckt_183545665337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30339 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term30534 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30535 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30539 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30339, term30339.getClass(), "chllng_kind", -886200503);
        setIntField(term30339, term30339.getClass(), "lv_num_old", 1136393691);
        setIntField(term30339, term30339.getClass(), "lv_pnt_old", -1288536479);
        setIntField(term30339, term30339.getClass(), "lv_num", 1092038167);
        setIntField(term30339, term30339.getClass(), "lv_pnt", 1879729823);
        setField(term30339, term30339.getClass(), "lv_str", "muefchpJiZ");
        setIntField(term30339, term30339.getClass(), "lv_efct_id", 1443855558);
        setIntField(term30339, term30339.getClass(), "lv_plt_id", -1933419449);
        setIntField(term30339, term30339.getClass(), "vcld_pts", -1804322375);
        setIntField(term30339, term30339.getClass(), "prsnt_vcld_pts", 1595814906);
        setIntField(term30339, term30339.getClass(), "cnp_cid", -834193529);
        setIntField(term30339, term30339.getClass(), "cnp_val", 335780735);
        setField(term30339, term30339.getClass(), "cnp_sp", "tuYaAqvYrh");
        setField(term30339, term30339.getClass(), "crwd_kind", "CIbhheukbR");
        setField(term30339, term30339.getClass(), "crwd_value", "VOHPpErtan");
        setField(term30339, term30339.getClass(), "crwd_str_0", "GDMUlolTNs");
        setField(term30339, term30339.getClass(), "crwd_str_1", "xpLvWisjzN");
        setIntField(term30339, term30339.getClass(), "cerwd_kind", -1541981599);
        setIntField(term30339, term30339.getClass(), "cerwd_value", 1605456363);
        setField(term30339, term30339.getClass(), "cerwd_str_0", "IKfozyyKEj");
        setField(term30339, term30339.getClass(), "cerwd_str_1", "thCjwQjRBL");
        setField(term30339, term30339.getClass(), "ttl_str_ary", "ojLrjltndD");
        setField(term30339, term30339.getClass(), "ttl_plt_id_ary", "VJtFSexKat");
        setField(term30339, term30339.getClass(), "ttl_desc_ary", "xPVddlPSQR");
        setField(term30339, term30339.getClass(), "skin_id_ary", "MxrhCLTMTH");
        setField(term30339, term30339.getClass(), "skin_name_ary", "kEehLMZcOU");
        setField(term30339, term30339.getClass(), "skin_illust_ary", "RhLliqMiOF");
        setField(term30339, term30339.getClass(), "skin_desc_ary", "jlhonEGrJH");
        setIntField(term30339, term30339.getClass(), "pdddt_flg", 2059896693);
        setIntField(term30535, term30535.getClass(), "year", 2010);
        setShortField(term30535, term30535.getClass(), "month", (short) 1);
        setShortField(term30535, term30535.getClass(), "day", (short) 17);
        setField(term30534, term30534.getClass(), "date", term30535);
        setByteField(term30539, term30539.getClass(), "hour", (byte) 13);
        setByteField(term30539, term30539.getClass(), "minute", (byte) 5);
        setByteField(term30539, term30539.getClass(), "second", (byte) 51);
        setIntField(term30539, term30539.getClass(), "nano", 362260580);
        setField(term30534, term30534.getClass(), "time", term30539);
        setField(term30339, term30339.getClass(), "pdddt_tm", term30534);
        setIntField(term30339, term30339.getClass(), "nblss_ltt_stts", 2109912812);
        setIntField(term30339, term30339.getClass(), "nblss_ltt_tckt", 1841286431);
        setIntField(term30339, term30339.getClass(), "nblss_ltt_is_opn", -1723168189);
        setIntField(term30339, term30339.getClass(), "nblss_ltt_prz", -675283917);
        setIntField(term30339, term30339.getClass(), "nblss_ltt_nxt_stts", -2093862988);
        setIntField(term30339, term30339.getClass(), "nblss_ltt_nxt_tckt", 1337828646);
        setField(term30339, term30339.getClass(), "my_qst_id", "RKcKwlEYZb");
        setField(term30339, term30339.getClass(), "my_qst_r_qid", "acPRDlpsid");
        setField(term30339, term30339.getClass(), "my_qst_r_knd", "YyojIzvxLZ");
        setField(term30339, term30339.getClass(), "my_qst_r_vl", "fxapaYlZea");
        setField(term30339, term30339.getClass(), "my_qst_r_nflg", "VJgREHwfRM");
        setField(term30339, term30339.getClass(), "my_ccd_r_qid", "kXnpLIZTAr");
        setField(term30339, term30339.getClass(), "my_ccd_r_hnd", "ZiMAmqpbzk");
        setField(term30339, term30339.getClass(), "my_ccd_r_vp", "UwJtBPAtSU");
        setField(term30339, term30339.getClass(), "cmd", "nBaMiSdFmS");
        setField(term30339, term30339.getClass(), "req_id", "ezwGsjqTai");
        setField(term30339, term30339.getClass(), "stat", "ngeHWMRjnn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNblss_ltt_nxt_tckt", argTypes, term30339, args);
    }

};


