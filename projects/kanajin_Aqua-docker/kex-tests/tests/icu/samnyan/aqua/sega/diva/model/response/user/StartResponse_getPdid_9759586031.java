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

public class StartResponse_getPdid_9759586031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3941;

    public StartResponse_getPdid_9759586031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4387 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term4386 = ((Class) term4387).getDeclaredField((String) "FAILED");
        ((Field) term4386).setAccessible(true);
        Object enum5 = ((Field) term4386).get((Object) null);
        Class<? extends Object> term4652 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term4651 = ((Class) term4652).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term4651).setAccessible(true);
        Object enum6 = ((Field) term4651).get((Object) null);
        Class<? extends Object> term4995 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term4994 = ((Class) term4995).getDeclaredField((String) "HARD");
        ((Field) term4994).setAccessible(true);
        Object enum7 = ((Field) term4994).get((Object) null);
        Class<? extends Object> term5264 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term5263 = ((Class) term5264).getDeclaredField((String) "ORIGINAL");
        ((Field) term5263).setAccessible(true);
        Object enum8 = ((Field) term5263).get((Object) null);
        Class<? extends Object> term5580 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term5579 = ((Class) term5580).getDeclaredField((String) "BRONZE");
        ((Field) term5579).setAccessible(true);
        Object enum9 = ((Field) term5579).get((Object) null);
        term3941 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term4041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4046 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3941, term3941.getClass(), "pd_id", 287287233);
        setField(term3941, term3941.getClass(), "start_result", enum5);
        setIntField(term3941, term3941.getClass(), "accept_idx", 962840079);
        setIntField(term3941, term3941.getClass(), "start_idx", 1540719661);
        setField(term3941, term3941.getClass(), "player_name", "XqgfKFvPSD");
        setIntField(term3941, term3941.getClass(), "hp_vol", 1265463001);
        setBooleanField(term3941, term3941.getClass(), "btn_se_vol", true);
        setIntField(term3941, term3941.getClass(), "btn_se_vol2", 335112684);
        setIntField(term3941, term3941.getClass(), "sldr_se_vol2", 1551099402);
        setField(term3941, term3941.getClass(), "sort_kind", enum6);
        setIntField(term3941, term3941.getClass(), "lv_num", -2027534003);
        setIntField(term3941, term3941.getClass(), "lv_pnt", 1063420942);
        setField(term3941, term3941.getClass(), "lv_str", "JiVRgTZvKc");
        setIntField(term3941, term3941.getClass(), "lv_efct_id", 1375330971);
        setIntField(term3941, term3941.getClass(), "lv_plt_id", -478195677);
        setField(term3941, term3941.getClass(), "mdl_eqp_ary", "XPKmummaqg");
        setField(term3941, term3941.getClass(), "c_itm_eqp_ary", "BKLfkLiZTH");
        setField(term3941, term3941.getClass(), "ms_itm_flg_ary", "SPpkrGcPRr");
        setIntField(term4042, term4042.getClass(), "year", 2021);
        setShortField(term4042, term4042.getClass(), "month", (short) 1);
        setShortField(term4042, term4042.getClass(), "day", (short) 18);
        setField(term4041, term4041.getClass(), "date", term4042);
        setByteField(term4046, term4046.getClass(), "hour", (byte) 13);
        setByteField(term4046, term4046.getClass(), "minute", (byte) 38);
        setByteField(term4046, term4046.getClass(), "second", (byte) 26);
        setIntField(term4046, term4046.getClass(), "nano", 544608644);
        setField(term4041, term4041.getClass(), "time", term4046);
        setField(term3941, term3941.getClass(), "mdl_eqp_tm", term4041);
        setField(term3941, term3941.getClass(), "mdl_have", "sEccwbJKYE");
        setField(term3941, term3941.getClass(), "cstmz_itm_have", "AWRooQKkdW");
        setBooleanField(term3941, term3941.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term3941, term3941.getClass(), "use_mdl_pri", true);
        setBooleanField(term3941, term3941.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term3941, term3941.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term3941, term3941.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term3941, term3941.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term3941, term3941.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term3941, term3941.getClass(), "vcld_pts", 972867650);
        setIntField(term3941, term3941.getClass(), "nxt_pv_id", 1655935355);
        setField(term3941, term3941.getClass(), "nxt_dffclty", enum7);
        setField(term3941, term3941.getClass(), "nxt_edtn", enum8);
        setField(term3941, term3941.getClass(), "cv_cid", "vjxIhXHxGR");
        setField(term3941, term3941.getClass(), "cv_sc", "QXzGXbEXMu");
        setField(term3941, term3941.getClass(), "cv_rr", "qxSDVejjiY");
        setField(term3941, term3941.getClass(), "cv_bv", "xBsXSDjXYK");
        setField(term3941, term3941.getClass(), "cv_bf", "sEnIVFtZuQ");
        setIntField(term3941, term3941.getClass(), "cnp_cid", -481533957);
        setIntField(term3941, term3941.getClass(), "cnp_val", 1240914516);
        setField(term3941, term3941.getClass(), "cnp_rr", enum9);
        setField(term3941, term3941.getClass(), "cnp_sp", "ZVecLZMLHF");
        setField(term3941, term3941.getClass(), "my_lst_0", "fztQhjqwdP");
        setField(term3941, term3941.getClass(), "my_lst_1", "eVpkWxjuki");
        setField(term3941, term3941.getClass(), "my_lst_2", "SJiQaLvSKv");
        setField(term3941, term3941.getClass(), "my_lst_3", "OEXDRUKcFl");
        setField(term3941, term3941.getClass(), "my_lst_4", "RYdKCNNMBR");
        setField(term3941, term3941.getClass(), "dsp_clr_brdr", "yGtHPyvYiQ");
        setBooleanField(term3941, term3941.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term3941, term3941.getClass(), "dsp_clr_sts", true);
        setField(term3941, term3941.getClass(), "clr_sts", "MvRIxilFMJ");
        setBooleanField(term3941, term3941.getClass(), "rgo_sts", true);
        setField(term3941, term3941.getClass(), "my_qst_id", "iNwOJRBEjp");
        setField(term3941, term3941.getClass(), "my_qst_sts", "XylxrMBraH");
        setField(term3941, term3941.getClass(), "my_qst_prgrs", "pORebkoRdD");
        setField(term3941, term3941.getClass(), "my_qst_et", "mXGCWJDOqA");
        setField(term3941, term3941.getClass(), "p_std_ie_have", "dpNsDgfPso");
        setField(term3941, term3941.getClass(), "p_std_se_have", "hCWPJQKpdc");
        setField(term3941, term3941.getClass(), "cmd", "WzMEhMXkKx");
        setField(term3941, term3941.getClass(), "req_id", "XOiDvlDhdc");
        setField(term3941, term3941.getClass(), "stat", "AdxvLJhNLe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term3941, args);
    }

};


