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

public class StartResponse_setCvbf_33164089094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198243;

    public StartResponse_setCvbf_33164089094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term198698 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term198697 = ((Class) term198698).getDeclaredField((String) "FAILED");
        ((Field) term198697).setAccessible(true);
        Object enum471 = ((Field) term198697).get((Object) null);
        Class<? extends Object> term198963 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term198962 = ((Class) term198963).getDeclaredField((String) "MY_LIST_B");
        ((Field) term198962).setAccessible(true);
        Object enum472 = ((Field) term198962).get((Object) null);
        Class<? extends Object> term199297 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term199296 = ((Class) term199297).getDeclaredField((String) "NORMAL");
        ((Field) term199296).setAccessible(true);
        Object enum473 = ((Field) term199296).get((Object) null);
        Class<? extends Object> term199572 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term199571 = ((Class) term199572).getDeclaredField((String) "ORIGINAL");
        ((Field) term199571).setAccessible(true);
        Object enum474 = ((Field) term199571).get((Object) null);
        Class<? extends Object> term199888 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term199887 = ((Class) term199888).getDeclaredField((String) "NONE");
        ((Field) term199887).setAccessible(true);
        Object enum475 = ((Field) term199887).get((Object) null);
        term198243 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term198340 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term198341 = newInstance(Class.forName("java.time.LocalDate"));
        Object term198345 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term198243, term198243.getClass(), "pd_id", 793974213);
        setField(term198243, term198243.getClass(), "start_result", enum471);
        setIntField(term198243, term198243.getClass(), "accept_idx", 722546287);
        setIntField(term198243, term198243.getClass(), "start_idx", -2060284160);
        setField(term198243, term198243.getClass(), "player_name", "AbIDnsFOzO");
        setIntField(term198243, term198243.getClass(), "hp_vol", -568450686);
        setBooleanField(term198243, term198243.getClass(), "btn_se_vol", true);
        setIntField(term198243, term198243.getClass(), "btn_se_vol2", 1314660281);
        setIntField(term198243, term198243.getClass(), "sldr_se_vol2", -126399768);
        setField(term198243, term198243.getClass(), "sort_kind", enum472);
        setIntField(term198243, term198243.getClass(), "lv_num", 318982923);
        setIntField(term198243, term198243.getClass(), "lv_pnt", -154210001);
        setField(term198243, term198243.getClass(), "lv_str", "ekTUXbqVGx");
        setIntField(term198243, term198243.getClass(), "lv_efct_id", 621910137);
        setIntField(term198243, term198243.getClass(), "lv_plt_id", 241533020);
        setField(term198243, term198243.getClass(), "mdl_eqp_ary", "ECPFDcnHIT");
        setField(term198243, term198243.getClass(), "c_itm_eqp_ary", "cgHejOgcDW");
        setField(term198243, term198243.getClass(), "ms_itm_flg_ary", "QYNTEJcWIQ");
        setIntField(term198341, term198341.getClass(), "year", 2028);
        setShortField(term198341, term198341.getClass(), "month", (short) 5);
        setShortField(term198341, term198341.getClass(), "day", (short) 15);
        setField(term198340, term198340.getClass(), "date", term198341);
        setByteField(term198345, term198345.getClass(), "hour", (byte) 20);
        setByteField(term198345, term198345.getClass(), "minute", (byte) 31);
        setByteField(term198345, term198345.getClass(), "second", (byte) 49);
        setIntField(term198345, term198345.getClass(), "nano", 945744862);
        setField(term198340, term198340.getClass(), "time", term198345);
        setField(term198243, term198243.getClass(), "mdl_eqp_tm", term198340);
        setField(term198243, term198243.getClass(), "mdl_have", "SbdSVclvuX");
        setField(term198243, term198243.getClass(), "cstmz_itm_have", "QpoSxHFuJh");
        setBooleanField(term198243, term198243.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term198243, term198243.getClass(), "use_mdl_pri", false);
        setBooleanField(term198243, term198243.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term198243, term198243.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term198243, term198243.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term198243, term198243.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term198243, term198243.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term198243, term198243.getClass(), "vcld_pts", 2081679151);
        setIntField(term198243, term198243.getClass(), "nxt_pv_id", -1030167086);
        setField(term198243, term198243.getClass(), "nxt_dffclty", enum473);
        setField(term198243, term198243.getClass(), "nxt_edtn", enum474);
        setField(term198243, term198243.getClass(), "cv_cid", "GLAJgnHQMo");
        setField(term198243, term198243.getClass(), "cv_sc", "nDzlNeexNi");
        setField(term198243, term198243.getClass(), "cv_rr", "XhILAYdtGS");
        setField(term198243, term198243.getClass(), "cv_bv", "ZRWORAfStn");
        setField(term198243, term198243.getClass(), "cv_bf", "loCxNBoGfW");
        setIntField(term198243, term198243.getClass(), "cnp_cid", -434230943);
        setIntField(term198243, term198243.getClass(), "cnp_val", 698633875);
        setField(term198243, term198243.getClass(), "cnp_rr", enum475);
        setField(term198243, term198243.getClass(), "cnp_sp", "PGVYUjJrZh");
        setField(term198243, term198243.getClass(), "my_lst_0", "OHliEqVque");
        setField(term198243, term198243.getClass(), "my_lst_1", "kQWmmbQQqu");
        setField(term198243, term198243.getClass(), "my_lst_2", "bLKLlXYEeh");
        setField(term198243, term198243.getClass(), "my_lst_3", "amltyOnIBK");
        setField(term198243, term198243.getClass(), "my_lst_4", "hjGlJibBAS");
        setField(term198243, term198243.getClass(), "dsp_clr_brdr", "vinKDMUJMl");
        setBooleanField(term198243, term198243.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term198243, term198243.getClass(), "dsp_clr_sts", true);
        setField(term198243, term198243.getClass(), "clr_sts", "MgjVPQNbcu");
        setBooleanField(term198243, term198243.getClass(), "rgo_sts", false);
        setField(term198243, term198243.getClass(), "my_qst_id", "QNYLGZGxNy");
        setField(term198243, term198243.getClass(), "my_qst_sts", "BrECRdedgj");
        setField(term198243, term198243.getClass(), "my_qst_prgrs", "lktYSRAAkX");
        setField(term198243, term198243.getClass(), "my_qst_et", "KmbCndAIRO");
        setField(term198243, term198243.getClass(), "p_std_ie_have", "LfLWkWgTGE");
        setField(term198243, term198243.getClass(), "p_std_se_have", "uleoYrEbgk");
        setField(term198243, term198243.getClass(), "cmd", "JINAWGBEol");
        setField(term198243, term198243.getClass(), "req_id", "HZRzxVDGhV");
        setField(term198243, term198243.getClass(), "stat", "wOWOSBOjln");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iVXUeGctUB";
        callMethod(klass, "setCv_bf", argTypes, term198243, args);
    }

};


