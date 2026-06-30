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

public class StartResponse_isUsepvbtnseeqp_9341146825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53957;

    public StartResponse_isUsepvbtnseeqp_9341146825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term54401 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term54400 = ((Class) term54401).getDeclaredField((String) "FAILED");
        ((Field) term54400).setAccessible(true);
        Object enum125 = ((Field) term54400).get((Object) null);
        Class<? extends Object> term54666 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term54665 = ((Class) term54666).getDeclaredField((String) "COMPLEXITY");
        ((Field) term54665).setAccessible(true);
        Object enum126 = ((Field) term54665).get((Object) null);
        Class<? extends Object> term55003 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term55002 = ((Class) term55003).getDeclaredField((String) "HARD");
        ((Field) term55002).setAccessible(true);
        Object enum127 = ((Field) term55002).get((Object) null);
        Class<? extends Object> term55272 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term55271 = ((Class) term55272).getDeclaredField((String) "ORIGINAL");
        ((Field) term55271).setAccessible(true);
        Object enum128 = ((Field) term55271).get((Object) null);
        Class<? extends Object> term55588 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term55587 = ((Class) term55588).getDeclaredField((String) "BRONZE");
        ((Field) term55587).setAccessible(true);
        Object enum129 = ((Field) term55587).get((Object) null);
        term53957 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term54055 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54056 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54060 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53957, term53957.getClass(), "pd_id", 787278105);
        setField(term53957, term53957.getClass(), "start_result", enum125);
        setIntField(term53957, term53957.getClass(), "accept_idx", -2063843486);
        setIntField(term53957, term53957.getClass(), "start_idx", 833762980);
        setField(term53957, term53957.getClass(), "player_name", "cDOXXottZh");
        setIntField(term53957, term53957.getClass(), "hp_vol", 320711637);
        setBooleanField(term53957, term53957.getClass(), "btn_se_vol", false);
        setIntField(term53957, term53957.getClass(), "btn_se_vol2", 1241164745);
        setIntField(term53957, term53957.getClass(), "sldr_se_vol2", 1723148410);
        setField(term53957, term53957.getClass(), "sort_kind", enum126);
        setIntField(term53957, term53957.getClass(), "lv_num", -920797484);
        setIntField(term53957, term53957.getClass(), "lv_pnt", -1631697577);
        setField(term53957, term53957.getClass(), "lv_str", "rfqJDkDppz");
        setIntField(term53957, term53957.getClass(), "lv_efct_id", 765731371);
        setIntField(term53957, term53957.getClass(), "lv_plt_id", -1703035419);
        setField(term53957, term53957.getClass(), "mdl_eqp_ary", "MGorMVGauT");
        setField(term53957, term53957.getClass(), "c_itm_eqp_ary", "jXKxUGTuEF");
        setField(term53957, term53957.getClass(), "ms_itm_flg_ary", "nDCcyhiTnS");
        setIntField(term54056, term54056.getClass(), "year", 2023);
        setShortField(term54056, term54056.getClass(), "month", (short) 9);
        setShortField(term54056, term54056.getClass(), "day", (short) 23);
        setField(term54055, term54055.getClass(), "date", term54056);
        setByteField(term54060, term54060.getClass(), "hour", (byte) 12);
        setByteField(term54060, term54060.getClass(), "minute", (byte) 55);
        setByteField(term54060, term54060.getClass(), "second", (byte) 58);
        setIntField(term54060, term54060.getClass(), "nano", 159178396);
        setField(term54055, term54055.getClass(), "time", term54060);
        setField(term53957, term53957.getClass(), "mdl_eqp_tm", term54055);
        setField(term53957, term53957.getClass(), "mdl_have", "Bcivwcjece");
        setField(term53957, term53957.getClass(), "cstmz_itm_have", "QTefjRuiez");
        setBooleanField(term53957, term53957.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term53957, term53957.getClass(), "use_mdl_pri", false);
        setBooleanField(term53957, term53957.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term53957, term53957.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term53957, term53957.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term53957, term53957.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term53957, term53957.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term53957, term53957.getClass(), "vcld_pts", 765766290);
        setIntField(term53957, term53957.getClass(), "nxt_pv_id", -1284825282);
        setField(term53957, term53957.getClass(), "nxt_dffclty", enum127);
        setField(term53957, term53957.getClass(), "nxt_edtn", enum128);
        setField(term53957, term53957.getClass(), "cv_cid", "SQZVNkAVBB");
        setField(term53957, term53957.getClass(), "cv_sc", "mrSAYJlddZ");
        setField(term53957, term53957.getClass(), "cv_rr", "KbwxawvYsw");
        setField(term53957, term53957.getClass(), "cv_bv", "gvjdfHNzOa");
        setField(term53957, term53957.getClass(), "cv_bf", "HqitWglYWX");
        setIntField(term53957, term53957.getClass(), "cnp_cid", -1941343035);
        setIntField(term53957, term53957.getClass(), "cnp_val", 947897214);
        setField(term53957, term53957.getClass(), "cnp_rr", enum129);
        setField(term53957, term53957.getClass(), "cnp_sp", "pOuFRlHmbK");
        setField(term53957, term53957.getClass(), "my_lst_0", "WrzdBkinqV");
        setField(term53957, term53957.getClass(), "my_lst_1", "vydWXHfFTw");
        setField(term53957, term53957.getClass(), "my_lst_2", "DRhkpDneCC");
        setField(term53957, term53957.getClass(), "my_lst_3", "vuIJRrypuA");
        setField(term53957, term53957.getClass(), "my_lst_4", "AxfSZmaiyA");
        setField(term53957, term53957.getClass(), "dsp_clr_brdr", "lBpveIKbea");
        setBooleanField(term53957, term53957.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term53957, term53957.getClass(), "dsp_clr_sts", true);
        setField(term53957, term53957.getClass(), "clr_sts", "uyLBVQYcOV");
        setBooleanField(term53957, term53957.getClass(), "rgo_sts", true);
        setField(term53957, term53957.getClass(), "my_qst_id", "PoTZjDuBHa");
        setField(term53957, term53957.getClass(), "my_qst_sts", "MIwvgVrhzP");
        setField(term53957, term53957.getClass(), "my_qst_prgrs", "HcUUieXdep");
        setField(term53957, term53957.getClass(), "my_qst_et", "AbonCTtbef");
        setField(term53957, term53957.getClass(), "p_std_ie_have", "maXrGOGoKA");
        setField(term53957, term53957.getClass(), "p_std_se_have", "zAkgWQVCpM");
        setField(term53957, term53957.getClass(), "cmd", "yQUDyOroXU");
        setField(term53957, term53957.getClass(), "req_id", "xweqkPdyJH");
        setField(term53957, term53957.getClass(), "stat", "kwteHWzwcc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUse_pv_btn_se_eqp", argTypes, term53957, args);
    }

};


