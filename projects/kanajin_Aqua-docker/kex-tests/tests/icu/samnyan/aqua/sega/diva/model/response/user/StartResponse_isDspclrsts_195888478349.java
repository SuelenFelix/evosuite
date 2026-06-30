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

public class StartResponse_isDspclrsts_195888478349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103897;

    public StartResponse_isDspclrsts_195888478349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term104339 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term104338 = ((Class) term104339).getDeclaredField((String) "SUCCESS");
        ((Field) term104338).setAccessible(true);
        Object enum245 = ((Field) term104338).get((Object) null);
        Class<? extends Object> term104607 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term104606 = ((Class) term104607).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term104606).setAccessible(true);
        Object enum246 = ((Field) term104606).get((Object) null);
        Class<? extends Object> term104950 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term104949 = ((Class) term104950).getDeclaredField((String) "HARD");
        ((Field) term104949).setAccessible(true);
        Object enum247 = ((Field) term104949).get((Object) null);
        Class<? extends Object> term105219 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term105218 = ((Class) term105219).getDeclaredField((String) "EXTRA");
        ((Field) term105218).setAccessible(true);
        Object enum248 = ((Field) term105218).get((Object) null);
        Class<? extends Object> term105526 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term105525 = ((Class) term105526).getDeclaredField((String) "GOLD");
        ((Field) term105525).setAccessible(true);
        Object enum249 = ((Field) term105525).get((Object) null);
        term103897 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term103998 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103999 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104003 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term103897, term103897.getClass(), "pd_id", -365784998);
        setField(term103897, term103897.getClass(), "start_result", enum245);
        setIntField(term103897, term103897.getClass(), "accept_idx", -1893236300);
        setIntField(term103897, term103897.getClass(), "start_idx", -1858909368);
        setField(term103897, term103897.getClass(), "player_name", "uDayZDXPOP");
        setIntField(term103897, term103897.getClass(), "hp_vol", -280113263);
        setBooleanField(term103897, term103897.getClass(), "btn_se_vol", true);
        setIntField(term103897, term103897.getClass(), "btn_se_vol2", 529625347);
        setIntField(term103897, term103897.getClass(), "sldr_se_vol2", 1409095253);
        setField(term103897, term103897.getClass(), "sort_kind", enum246);
        setIntField(term103897, term103897.getClass(), "lv_num", 315179039);
        setIntField(term103897, term103897.getClass(), "lv_pnt", -1835923897);
        setField(term103897, term103897.getClass(), "lv_str", "kbjWxMAIhY");
        setIntField(term103897, term103897.getClass(), "lv_efct_id", -341287775);
        setIntField(term103897, term103897.getClass(), "lv_plt_id", -1651110911);
        setField(term103897, term103897.getClass(), "mdl_eqp_ary", "GmtlSgqKcI");
        setField(term103897, term103897.getClass(), "c_itm_eqp_ary", "ssSbvPoMjB");
        setField(term103897, term103897.getClass(), "ms_itm_flg_ary", "mhRVADhaKm");
        setIntField(term103999, term103999.getClass(), "year", 2011);
        setShortField(term103999, term103999.getClass(), "month", (short) 10);
        setShortField(term103999, term103999.getClass(), "day", (short) 25);
        setField(term103998, term103998.getClass(), "date", term103999);
        setByteField(term104003, term104003.getClass(), "hour", (byte) 10);
        setByteField(term104003, term104003.getClass(), "minute", (byte) 33);
        setByteField(term104003, term104003.getClass(), "second", (byte) 8);
        setIntField(term104003, term104003.getClass(), "nano", 268304014);
        setField(term103998, term103998.getClass(), "time", term104003);
        setField(term103897, term103897.getClass(), "mdl_eqp_tm", term103998);
        setField(term103897, term103897.getClass(), "mdl_have", "rLldJrTAay");
        setField(term103897, term103897.getClass(), "cstmz_itm_have", "HvSKssbEES");
        setBooleanField(term103897, term103897.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term103897, term103897.getClass(), "use_mdl_pri", false);
        setBooleanField(term103897, term103897.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term103897, term103897.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term103897, term103897.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term103897, term103897.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term103897, term103897.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term103897, term103897.getClass(), "vcld_pts", -1934033808);
        setIntField(term103897, term103897.getClass(), "nxt_pv_id", 950322609);
        setField(term103897, term103897.getClass(), "nxt_dffclty", enum247);
        setField(term103897, term103897.getClass(), "nxt_edtn", enum248);
        setField(term103897, term103897.getClass(), "cv_cid", "UjIAQAHhul");
        setField(term103897, term103897.getClass(), "cv_sc", "oWBXOvjPUT");
        setField(term103897, term103897.getClass(), "cv_rr", "DcKqrrTdId");
        setField(term103897, term103897.getClass(), "cv_bv", "fwtOJhjXbW");
        setField(term103897, term103897.getClass(), "cv_bf", "ltWBKZaXwJ");
        setIntField(term103897, term103897.getClass(), "cnp_cid", -2023791789);
        setIntField(term103897, term103897.getClass(), "cnp_val", 353974456);
        setField(term103897, term103897.getClass(), "cnp_rr", enum249);
        setField(term103897, term103897.getClass(), "cnp_sp", "FSQpgxQnsH");
        setField(term103897, term103897.getClass(), "my_lst_0", "LBPwnVMEpP");
        setField(term103897, term103897.getClass(), "my_lst_1", "cwALzyQVjH");
        setField(term103897, term103897.getClass(), "my_lst_2", "jlYNjpdkoz");
        setField(term103897, term103897.getClass(), "my_lst_3", "DZAGnhJkeU");
        setField(term103897, term103897.getClass(), "my_lst_4", "xQuVexkiVz");
        setField(term103897, term103897.getClass(), "dsp_clr_brdr", "LqNgPziYtv");
        setBooleanField(term103897, term103897.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term103897, term103897.getClass(), "dsp_clr_sts", true);
        setField(term103897, term103897.getClass(), "clr_sts", "wiDfuaXnrP");
        setBooleanField(term103897, term103897.getClass(), "rgo_sts", true);
        setField(term103897, term103897.getClass(), "my_qst_id", "btdGZUcaZl");
        setField(term103897, term103897.getClass(), "my_qst_sts", "WnEAVdCxna");
        setField(term103897, term103897.getClass(), "my_qst_prgrs", "lnPIxHHyEK");
        setField(term103897, term103897.getClass(), "my_qst_et", "unvQfYuBUz");
        setField(term103897, term103897.getClass(), "p_std_ie_have", "RqnYUpQBbG");
        setField(term103897, term103897.getClass(), "p_std_se_have", "sKnuhmcjCC");
        setField(term103897, term103897.getClass(), "cmd", "oCBbVNwMnb");
        setField(term103897, term103897.getClass(), "req_id", "miJxAzOVJy");
        setField(term103897, term103897.getClass(), "stat", "kjqlBVaviD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDsp_clr_sts", argTypes, term103897, args);
    }

};


