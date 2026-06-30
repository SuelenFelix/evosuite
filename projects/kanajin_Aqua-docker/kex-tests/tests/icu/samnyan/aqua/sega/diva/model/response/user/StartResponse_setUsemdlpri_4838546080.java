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
import java.lang.Boolean;

public class StartResponse_setUsemdlpri_4838546080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168943;
     Object term169388;

    public StartResponse_setUsemdlpri_4838546080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term169391 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term169390 = ((Class) term169391).getDeclaredField((String) "FAILED");
        ((Field) term169390).setAccessible(true);
        Object enum401 = ((Field) term169390).get((Object) null);
        Class<? extends Object> term169656 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term169655 = ((Class) term169656).getDeclaredField((String) "MY_LIST_C");
        ((Field) term169655).setAccessible(true);
        Object enum402 = ((Field) term169655).get((Object) null);
        Class<? extends Object> term169990 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term169989 = ((Class) term169990).getDeclaredField((String) "UNDEFINED");
        ((Field) term169989).setAccessible(true);
        Object enum403 = ((Field) term169989).get((Object) null);
        Class<? extends Object> term170274 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term170273 = ((Class) term170274).getDeclaredField((String) "ORIGINAL");
        ((Field) term170273).setAccessible(true);
        Object enum404 = ((Field) term170273).get((Object) null);
        Class<? extends Object> term170590 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term170589 = ((Class) term170590).getDeclaredField((String) "NONE");
        ((Field) term170589).setAccessible(true);
        Object enum405 = ((Field) term170589).get((Object) null);
        term168943 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term169040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169045 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term168943, term168943.getClass(), "pd_id", -1341357647);
        setField(term168943, term168943.getClass(), "start_result", enum401);
        setIntField(term168943, term168943.getClass(), "accept_idx", 138447019);
        setIntField(term168943, term168943.getClass(), "start_idx", 114915275);
        setField(term168943, term168943.getClass(), "player_name", "TLlyjzxJUz");
        setIntField(term168943, term168943.getClass(), "hp_vol", 338519695);
        setBooleanField(term168943, term168943.getClass(), "btn_se_vol", true);
        setIntField(term168943, term168943.getClass(), "btn_se_vol2", 2025566580);
        setIntField(term168943, term168943.getClass(), "sldr_se_vol2", -1231122778);
        setField(term168943, term168943.getClass(), "sort_kind", enum402);
        setIntField(term168943, term168943.getClass(), "lv_num", 1923558221);
        setIntField(term168943, term168943.getClass(), "lv_pnt", 1762934060);
        setField(term168943, term168943.getClass(), "lv_str", "YclIWGPKZY");
        setIntField(term168943, term168943.getClass(), "lv_efct_id", -859828739);
        setIntField(term168943, term168943.getClass(), "lv_plt_id", 1986855642);
        setField(term168943, term168943.getClass(), "mdl_eqp_ary", "gChBjLUhbg");
        setField(term168943, term168943.getClass(), "c_itm_eqp_ary", "enWkULOykY");
        setField(term168943, term168943.getClass(), "ms_itm_flg_ary", "BPdcafiAQX");
        setIntField(term169041, term169041.getClass(), "year", 2014);
        setShortField(term169041, term169041.getClass(), "month", (short) 8);
        setShortField(term169041, term169041.getClass(), "day", (short) 17);
        setField(term169040, term169040.getClass(), "date", term169041);
        setByteField(term169045, term169045.getClass(), "hour", (byte) 19);
        setByteField(term169045, term169045.getClass(), "minute", (byte) 32);
        setByteField(term169045, term169045.getClass(), "second", (byte) 5);
        setIntField(term169045, term169045.getClass(), "nano", 604713831);
        setField(term169040, term169040.getClass(), "time", term169045);
        setField(term168943, term168943.getClass(), "mdl_eqp_tm", term169040);
        setField(term168943, term168943.getClass(), "mdl_have", "GvmOxwMrOk");
        setField(term168943, term168943.getClass(), "cstmz_itm_have", "WXUKmhwFsK");
        setBooleanField(term168943, term168943.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term168943, term168943.getClass(), "use_mdl_pri", false);
        setBooleanField(term168943, term168943.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term168943, term168943.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term168943, term168943.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term168943, term168943.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term168943, term168943.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term168943, term168943.getClass(), "vcld_pts", 1280322790);
        setIntField(term168943, term168943.getClass(), "nxt_pv_id", -1702209203);
        setField(term168943, term168943.getClass(), "nxt_dffclty", enum403);
        setField(term168943, term168943.getClass(), "nxt_edtn", enum404);
        setField(term168943, term168943.getClass(), "cv_cid", "OcfokBTzZZ");
        setField(term168943, term168943.getClass(), "cv_sc", "zeBhlhyhkL");
        setField(term168943, term168943.getClass(), "cv_rr", "PxinRhWgwT");
        setField(term168943, term168943.getClass(), "cv_bv", "pZcEKUNIXL");
        setField(term168943, term168943.getClass(), "cv_bf", "QbRtvZIDtW");
        setIntField(term168943, term168943.getClass(), "cnp_cid", -1592307668);
        setIntField(term168943, term168943.getClass(), "cnp_val", -203832871);
        setField(term168943, term168943.getClass(), "cnp_rr", enum405);
        setField(term168943, term168943.getClass(), "cnp_sp", "fbsmDvjMqr");
        setField(term168943, term168943.getClass(), "my_lst_0", "tycssGWZvU");
        setField(term168943, term168943.getClass(), "my_lst_1", "jcvrILwbgt");
        setField(term168943, term168943.getClass(), "my_lst_2", "AphrAHzPMC");
        setField(term168943, term168943.getClass(), "my_lst_3", "iwismCnYjB");
        setField(term168943, term168943.getClass(), "my_lst_4", "GerBZdiruT");
        setField(term168943, term168943.getClass(), "dsp_clr_brdr", "VzkPDPPGQl");
        setBooleanField(term168943, term168943.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term168943, term168943.getClass(), "dsp_clr_sts", true);
        setField(term168943, term168943.getClass(), "clr_sts", "iojOXjfZFr");
        setBooleanField(term168943, term168943.getClass(), "rgo_sts", true);
        setField(term168943, term168943.getClass(), "my_qst_id", "yyrkuIYJKj");
        setField(term168943, term168943.getClass(), "my_qst_sts", "reGIMbnrGF");
        setField(term168943, term168943.getClass(), "my_qst_prgrs", "yquSngBHqd");
        setField(term168943, term168943.getClass(), "my_qst_et", "ZSdaJkZZPm");
        setField(term168943, term168943.getClass(), "p_std_ie_have", "ICnzwgujDT");
        setField(term168943, term168943.getClass(), "p_std_se_have", "RfDgUkIYjW");
        setField(term168943, term168943.getClass(), "cmd", "QnZKCwkmMh");
        setField(term168943, term168943.getClass(), "req_id", "RVQbteztJx");
        setField(term168943, term168943.getClass(), "stat", "yjmUdvwSdd");
        term169388 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term169388;
        callMethod(klass, "setUse_mdl_pri", argTypes, term168943, args);
    }

};


