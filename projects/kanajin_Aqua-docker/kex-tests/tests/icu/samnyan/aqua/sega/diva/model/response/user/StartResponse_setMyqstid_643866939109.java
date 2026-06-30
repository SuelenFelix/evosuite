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

public class StartResponse_setMyqstid_643866939109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230050;

    public StartResponse_setMyqstid_643866939109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term230504 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term230503 = ((Class) term230504).getDeclaredField((String) "SUCCESS");
        ((Field) term230503).setAccessible(true);
        Object enum547 = ((Field) term230503).get((Object) null);
        Class<? extends Object> term230772 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term230771 = ((Class) term230772).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term230771).setAccessible(true);
        Object enum548 = ((Field) term230771).get((Object) null);
        Class<? extends Object> term231115 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term231114 = ((Class) term231115).getDeclaredField((String) "HARD");
        ((Field) term231114).setAccessible(true);
        Object enum549 = ((Field) term231114).get((Object) null);
        Class<? extends Object> term231384 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term231383 = ((Class) term231384).getDeclaredField((String) "EXTRA");
        ((Field) term231383).setAccessible(true);
        Object enum550 = ((Field) term231383).get((Object) null);
        Class<? extends Object> term231691 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term231690 = ((Class) term231691).getDeclaredField((String) "GOLD");
        ((Field) term231690).setAccessible(true);
        Object enum551 = ((Field) term231690).get((Object) null);
        term230050 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term230151 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term230152 = newInstance(Class.forName("java.time.LocalDate"));
        Object term230156 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term230050, term230050.getClass(), "pd_id", 623717232);
        setField(term230050, term230050.getClass(), "start_result", enum547);
        setIntField(term230050, term230050.getClass(), "accept_idx", -1413291732);
        setIntField(term230050, term230050.getClass(), "start_idx", 203264365);
        setField(term230050, term230050.getClass(), "player_name", "YghxvBBBOW");
        setIntField(term230050, term230050.getClass(), "hp_vol", -1066281036);
        setBooleanField(term230050, term230050.getClass(), "btn_se_vol", true);
        setIntField(term230050, term230050.getClass(), "btn_se_vol2", 30837706);
        setIntField(term230050, term230050.getClass(), "sldr_se_vol2", 379523101);
        setField(term230050, term230050.getClass(), "sort_kind", enum548);
        setIntField(term230050, term230050.getClass(), "lv_num", 1017354215);
        setIntField(term230050, term230050.getClass(), "lv_pnt", 695330987);
        setField(term230050, term230050.getClass(), "lv_str", "LHuytJdqwq");
        setIntField(term230050, term230050.getClass(), "lv_efct_id", -267289967);
        setIntField(term230050, term230050.getClass(), "lv_plt_id", 773432822);
        setField(term230050, term230050.getClass(), "mdl_eqp_ary", "SqSvcPPMTC");
        setField(term230050, term230050.getClass(), "c_itm_eqp_ary", "SsLBbqIZdp");
        setField(term230050, term230050.getClass(), "ms_itm_flg_ary", "SCyDnkiMeE");
        setIntField(term230152, term230152.getClass(), "year", 2029);
        setShortField(term230152, term230152.getClass(), "month", (short) 7);
        setShortField(term230152, term230152.getClass(), "day", (short) 19);
        setField(term230151, term230151.getClass(), "date", term230152);
        setByteField(term230156, term230156.getClass(), "hour", (byte) 17);
        setByteField(term230156, term230156.getClass(), "minute", (byte) 37);
        setByteField(term230156, term230156.getClass(), "second", (byte) 21);
        setIntField(term230156, term230156.getClass(), "nano", 320093277);
        setField(term230151, term230151.getClass(), "time", term230156);
        setField(term230050, term230050.getClass(), "mdl_eqp_tm", term230151);
        setField(term230050, term230050.getClass(), "mdl_have", "WtfwBvpVGp");
        setField(term230050, term230050.getClass(), "cstmz_itm_have", "nqNHstnjtW");
        setBooleanField(term230050, term230050.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term230050, term230050.getClass(), "use_mdl_pri", true);
        setBooleanField(term230050, term230050.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term230050, term230050.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term230050, term230050.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term230050, term230050.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term230050, term230050.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term230050, term230050.getClass(), "vcld_pts", -488294922);
        setIntField(term230050, term230050.getClass(), "nxt_pv_id", -397161164);
        setField(term230050, term230050.getClass(), "nxt_dffclty", enum549);
        setField(term230050, term230050.getClass(), "nxt_edtn", enum550);
        setField(term230050, term230050.getClass(), "cv_cid", "xWqIkjeUFn");
        setField(term230050, term230050.getClass(), "cv_sc", "vBcZiZnuXD");
        setField(term230050, term230050.getClass(), "cv_rr", "NRKOkpSTQr");
        setField(term230050, term230050.getClass(), "cv_bv", "XwevHLOcph");
        setField(term230050, term230050.getClass(), "cv_bf", "BwsQOfTpXz");
        setIntField(term230050, term230050.getClass(), "cnp_cid", -703717191);
        setIntField(term230050, term230050.getClass(), "cnp_val", -1255535445);
        setField(term230050, term230050.getClass(), "cnp_rr", enum551);
        setField(term230050, term230050.getClass(), "cnp_sp", "ywBwAaqimp");
        setField(term230050, term230050.getClass(), "my_lst_0", "ksNDLlwYiK");
        setField(term230050, term230050.getClass(), "my_lst_1", "KNuSMewyWo");
        setField(term230050, term230050.getClass(), "my_lst_2", "OeZpauZbQm");
        setField(term230050, term230050.getClass(), "my_lst_3", "UjNsLLEXru");
        setField(term230050, term230050.getClass(), "my_lst_4", "VNJLpmwKSs");
        setField(term230050, term230050.getClass(), "dsp_clr_brdr", "kOHYxuEOpb");
        setBooleanField(term230050, term230050.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term230050, term230050.getClass(), "dsp_clr_sts", false);
        setField(term230050, term230050.getClass(), "clr_sts", "kyzuYwxwKl");
        setBooleanField(term230050, term230050.getClass(), "rgo_sts", false);
        setField(term230050, term230050.getClass(), "my_qst_id", "plqwsHlTLA");
        setField(term230050, term230050.getClass(), "my_qst_sts", "DDkbTPlKrm");
        setField(term230050, term230050.getClass(), "my_qst_prgrs", "EElRQZBfvW");
        setField(term230050, term230050.getClass(), "my_qst_et", "grlbPsQxaR");
        setField(term230050, term230050.getClass(), "p_std_ie_have", "PeFIZXlxPN");
        setField(term230050, term230050.getClass(), "p_std_se_have", "OIXYYXGdlX");
        setField(term230050, term230050.getClass(), "cmd", "VBfWgJrVqV");
        setField(term230050, term230050.getClass(), "req_id", "BgFpfnZiJG");
        setField(term230050, term230050.getClass(), "stat", "tMDFwEQAGW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "heAByNySVP";
        callMethod(klass, "setMy_qst_id", argTypes, term230050, args);
    }

};


