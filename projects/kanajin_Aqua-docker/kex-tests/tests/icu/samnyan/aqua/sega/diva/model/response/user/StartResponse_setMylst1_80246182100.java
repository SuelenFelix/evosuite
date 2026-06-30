package icu.samnyan.aqua.sega.diva.model.response.user;

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
import static icu.samnyan.aqua.sega.diva.model.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StartResponse_setMylst1_80246182100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211134;

    public StartResponse_setMylst1_80246182100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term211582 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term211581 = ((Class) term211582).getDeclaredField((String) "SUCCESS");
        ((Field) term211581).setAccessible(true);
        Object enum502 = ((Field) term211581).get((Object) null);
        Class<? extends Object> term211850 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term211849 = ((Class) term211850).getDeclaredField((String) "NAME");
        ((Field) term211849).setAccessible(true);
        Object enum503 = ((Field) term211849).get((Object) null);
        Class<? extends Object> term212169 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term212168 = ((Class) term212169).getDeclaredField((String) "HARD");
        ((Field) term212168).setAccessible(true);
        Object enum504 = ((Field) term212168).get((Object) null);
        Class<? extends Object> term212438 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term212437 = ((Class) term212438).getDeclaredField((String) "EXTRA");
        ((Field) term212437).setAccessible(true);
        Object enum505 = ((Field) term212437).get((Object) null);
        Class<? extends Object> term212745 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term212744 = ((Class) term212745).getDeclaredField((String) "SILVER");
        ((Field) term212744).setAccessible(true);
        Object enum506 = ((Field) term212744).get((Object) null);
        term211134 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term211227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term211228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term211232 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term211134, term211134.getClass(), "pd_id", 694989162);
        setField(term211134, term211134.getClass(), "start_result", enum502);
        setIntField(term211134, term211134.getClass(), "accept_idx", -65504209);
        setIntField(term211134, term211134.getClass(), "start_idx", 1745199030);
        setField(term211134, term211134.getClass(), "player_name", "jvhvoAISsw");
        setIntField(term211134, term211134.getClass(), "hp_vol", -1440013173);
        setBooleanField(term211134, term211134.getClass(), "btn_se_vol", true);
        setIntField(term211134, term211134.getClass(), "btn_se_vol2", -288126597);
        setIntField(term211134, term211134.getClass(), "sldr_se_vol2", -218831961);
        setField(term211134, term211134.getClass(), "sort_kind", enum503);
        setIntField(term211134, term211134.getClass(), "lv_num", 826765055);
        setIntField(term211134, term211134.getClass(), "lv_pnt", 1358117317);
        setField(term211134, term211134.getClass(), "lv_str", "NkOntrweCo");
        setIntField(term211134, term211134.getClass(), "lv_efct_id", 229989439);
        setIntField(term211134, term211134.getClass(), "lv_plt_id", -1620126913);
        setField(term211134, term211134.getClass(), "mdl_eqp_ary", "hVtvnBKztu");
        setField(term211134, term211134.getClass(), "c_itm_eqp_ary", "VOpwlWudOv");
        setField(term211134, term211134.getClass(), "ms_itm_flg_ary", "eEXpzGjDgl");
        setIntField(term211228, term211228.getClass(), "year", 2016);
        setShortField(term211228, term211228.getClass(), "month", (short) 3);
        setShortField(term211228, term211228.getClass(), "day", (short) 20);
        setField(term211227, term211227.getClass(), "date", term211228);
        setByteField(term211232, term211232.getClass(), "hour", (byte) 0);
        setByteField(term211232, term211232.getClass(), "minute", (byte) 54);
        setByteField(term211232, term211232.getClass(), "second", (byte) 6);
        setIntField(term211232, term211232.getClass(), "nano", 183302469);
        setField(term211227, term211227.getClass(), "time", term211232);
        setField(term211134, term211134.getClass(), "mdl_eqp_tm", term211227);
        setField(term211134, term211134.getClass(), "mdl_have", "vGLuBgtHzA");
        setField(term211134, term211134.getClass(), "cstmz_itm_have", "iOiyjODkqg");
        setBooleanField(term211134, term211134.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term211134, term211134.getClass(), "use_mdl_pri", true);
        setBooleanField(term211134, term211134.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term211134, term211134.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term211134, term211134.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term211134, term211134.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term211134, term211134.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term211134, term211134.getClass(), "vcld_pts", -1095121979);
        setIntField(term211134, term211134.getClass(), "nxt_pv_id", -1674851914);
        setField(term211134, term211134.getClass(), "nxt_dffclty", enum504);
        setField(term211134, term211134.getClass(), "nxt_edtn", enum505);
        setField(term211134, term211134.getClass(), "cv_cid", "pgpXJLwACM");
        setField(term211134, term211134.getClass(), "cv_sc", "JgrZdrciib");
        setField(term211134, term211134.getClass(), "cv_rr", "mjPUAINebK");
        setField(term211134, term211134.getClass(), "cv_bv", "QdBJxwpNcu");
        setField(term211134, term211134.getClass(), "cv_bf", "jdwewuUtBW");
        setIntField(term211134, term211134.getClass(), "cnp_cid", -1891353352);
        setIntField(term211134, term211134.getClass(), "cnp_val", 113007640);
        setField(term211134, term211134.getClass(), "cnp_rr", enum506);
        setField(term211134, term211134.getClass(), "cnp_sp", "CXekzSdVWc");
        setField(term211134, term211134.getClass(), "my_lst_0", "heJZxFqAJC");
        setField(term211134, term211134.getClass(), "my_lst_1", "DGNjGJtXwQ");
        setField(term211134, term211134.getClass(), "my_lst_2", "BIFQrvbqSd");
        setField(term211134, term211134.getClass(), "my_lst_3", "wcVhMnVVMH");
        setField(term211134, term211134.getClass(), "my_lst_4", "EUWyNZxbWR");
        setField(term211134, term211134.getClass(), "dsp_clr_brdr", "TaoriKlxVP");
        setBooleanField(term211134, term211134.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term211134, term211134.getClass(), "dsp_clr_sts", false);
        setField(term211134, term211134.getClass(), "clr_sts", "CDKCMwdzTR");
        setBooleanField(term211134, term211134.getClass(), "rgo_sts", true);
        setField(term211134, term211134.getClass(), "my_qst_id", "ehviwWrUip");
        setField(term211134, term211134.getClass(), "my_qst_sts", "LNsNBvvYgQ");
        setField(term211134, term211134.getClass(), "my_qst_prgrs", "VGKsvldNNB");
        setField(term211134, term211134.getClass(), "my_qst_et", "pfyJIgGkiH");
        setField(term211134, term211134.getClass(), "p_std_ie_have", "lvQpEwdZeM");
        setField(term211134, term211134.getClass(), "p_std_se_have", "xtNmObxmHy");
        setField(term211134, term211134.getClass(), "cmd", "nComTwhtzu");
        setField(term211134, term211134.getClass(), "req_id", "gXyUtfRzMt");
        setField(term211134, term211134.getClass(), "stat", "RUmloTNkOF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xlEdrgoOEf";
        callMethod(klass, "setMy_lst_1", argTypes, term211134, args);
    }

};


