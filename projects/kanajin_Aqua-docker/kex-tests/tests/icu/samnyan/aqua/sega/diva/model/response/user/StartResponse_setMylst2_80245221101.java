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

public class StartResponse_setMylst2_80245221101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213214;

    public StartResponse_setMylst2_80245221101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term213667 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term213666 = ((Class) term213667).getDeclaredField((String) "FAILED");
        ((Field) term213666).setAccessible(true);
        Object enum507 = ((Field) term213666).get((Object) null);
        Class<? extends Object> term213932 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term213931 = ((Class) term213932).getDeclaredField((String) "MY_LIST_C");
        ((Field) term213931).setAccessible(true);
        Object enum508 = ((Field) term213931).get((Object) null);
        Class<? extends Object> term214266 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term214265 = ((Class) term214266).getDeclaredField((String) "EASY");
        ((Field) term214265).setAccessible(true);
        Object enum509 = ((Field) term214265).get((Object) null);
        Class<? extends Object> term214535 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term214534 = ((Class) term214535).getDeclaredField((String) "ORIGINAL");
        ((Field) term214534).setAccessible(true);
        Object enum510 = ((Field) term214534).get((Object) null);
        Class<? extends Object> term214851 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term214850 = ((Class) term214851).getDeclaredField((String) "NONE");
        ((Field) term214850).setAccessible(true);
        Object enum511 = ((Field) term214850).get((Object) null);
        term213214 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term213311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term213312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term213316 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term213214, term213214.getClass(), "pd_id", 1782226794);
        setField(term213214, term213214.getClass(), "start_result", enum507);
        setIntField(term213214, term213214.getClass(), "accept_idx", 1115327577);
        setIntField(term213214, term213214.getClass(), "start_idx", 840704993);
        setField(term213214, term213214.getClass(), "player_name", "DfKLAuTNTf");
        setIntField(term213214, term213214.getClass(), "hp_vol", 1297035285);
        setBooleanField(term213214, term213214.getClass(), "btn_se_vol", false);
        setIntField(term213214, term213214.getClass(), "btn_se_vol2", -826239685);
        setIntField(term213214, term213214.getClass(), "sldr_se_vol2", -845551243);
        setField(term213214, term213214.getClass(), "sort_kind", enum508);
        setIntField(term213214, term213214.getClass(), "lv_num", 370671198);
        setIntField(term213214, term213214.getClass(), "lv_pnt", 1426800646);
        setField(term213214, term213214.getClass(), "lv_str", "lWuRJaTZQB");
        setIntField(term213214, term213214.getClass(), "lv_efct_id", 954234820);
        setIntField(term213214, term213214.getClass(), "lv_plt_id", 1047346538);
        setField(term213214, term213214.getClass(), "mdl_eqp_ary", "jiQYzmbdOz");
        setField(term213214, term213214.getClass(), "c_itm_eqp_ary", "HBnovMFfRR");
        setField(term213214, term213214.getClass(), "ms_itm_flg_ary", "kvBRGWtVMY");
        setIntField(term213312, term213312.getClass(), "year", 2013);
        setShortField(term213312, term213312.getClass(), "month", (short) 11);
        setShortField(term213312, term213312.getClass(), "day", (short) 19);
        setField(term213311, term213311.getClass(), "date", term213312);
        setByteField(term213316, term213316.getClass(), "hour", (byte) 6);
        setByteField(term213316, term213316.getClass(), "minute", (byte) 45);
        setByteField(term213316, term213316.getClass(), "second", (byte) 10);
        setIntField(term213316, term213316.getClass(), "nano", 288981190);
        setField(term213311, term213311.getClass(), "time", term213316);
        setField(term213214, term213214.getClass(), "mdl_eqp_tm", term213311);
        setField(term213214, term213214.getClass(), "mdl_have", "nnkddhphsi");
        setField(term213214, term213214.getClass(), "cstmz_itm_have", "VPJfuXpuzc");
        setBooleanField(term213214, term213214.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term213214, term213214.getClass(), "use_mdl_pri", false);
        setBooleanField(term213214, term213214.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term213214, term213214.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term213214, term213214.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term213214, term213214.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term213214, term213214.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term213214, term213214.getClass(), "vcld_pts", 728436340);
        setIntField(term213214, term213214.getClass(), "nxt_pv_id", 1841731593);
        setField(term213214, term213214.getClass(), "nxt_dffclty", enum509);
        setField(term213214, term213214.getClass(), "nxt_edtn", enum510);
        setField(term213214, term213214.getClass(), "cv_cid", "zdrDwRmBqL");
        setField(term213214, term213214.getClass(), "cv_sc", "DhSRNlYOFL");
        setField(term213214, term213214.getClass(), "cv_rr", "mrmNORhOYE");
        setField(term213214, term213214.getClass(), "cv_bv", "IAlXRzFnsw");
        setField(term213214, term213214.getClass(), "cv_bf", "QGWHwsqzqh");
        setIntField(term213214, term213214.getClass(), "cnp_cid", -1854929057);
        setIntField(term213214, term213214.getClass(), "cnp_val", 1703814701);
        setField(term213214, term213214.getClass(), "cnp_rr", enum511);
        setField(term213214, term213214.getClass(), "cnp_sp", "HToXzWGnjh");
        setField(term213214, term213214.getClass(), "my_lst_0", "ymGhnCkAFG");
        setField(term213214, term213214.getClass(), "my_lst_1", "JYQEoThPjD");
        setField(term213214, term213214.getClass(), "my_lst_2", "uUYeaeRaCx");
        setField(term213214, term213214.getClass(), "my_lst_3", "oCpxzVdxcV");
        setField(term213214, term213214.getClass(), "my_lst_4", "PzNtQwCbTD");
        setField(term213214, term213214.getClass(), "dsp_clr_brdr", "wQAefimNLh");
        setBooleanField(term213214, term213214.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term213214, term213214.getClass(), "dsp_clr_sts", false);
        setField(term213214, term213214.getClass(), "clr_sts", "NDFbtxRRgi");
        setBooleanField(term213214, term213214.getClass(), "rgo_sts", true);
        setField(term213214, term213214.getClass(), "my_qst_id", "vasBXGWtux");
        setField(term213214, term213214.getClass(), "my_qst_sts", "UfUIICYJWk");
        setField(term213214, term213214.getClass(), "my_qst_prgrs", "vuGxdvURpp");
        setField(term213214, term213214.getClass(), "my_qst_et", "zUgAERZZFZ");
        setField(term213214, term213214.getClass(), "p_std_ie_have", "QhkdVFKaoy");
        setField(term213214, term213214.getClass(), "p_std_se_have", "WCQDPwVjsS");
        setField(term213214, term213214.getClass(), "cmd", "XkZOYFvTGI");
        setField(term213214, term213214.getClass(), "req_id", "NifhlBZIDF");
        setField(term213214, term213214.getClass(), "stat", "vKEgtSbaYp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FnjEwOlAkC";
        callMethod(klass, "setMy_lst_2", argTypes, term213214, args);
    }

};


