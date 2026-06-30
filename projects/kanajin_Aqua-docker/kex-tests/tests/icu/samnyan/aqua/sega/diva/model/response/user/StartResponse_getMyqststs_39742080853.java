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

public class StartResponse_getMyqststs_39742080853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112257;

    public StartResponse_getMyqststs_39742080853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term112700 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term112699 = ((Class) term112700).getDeclaredField((String) "FAILED");
        ((Field) term112699).setAccessible(true);
        Object enum265 = ((Field) term112699).get((Object) null);
        Class<? extends Object> term112965 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term112964 = ((Class) term112965).getDeclaredField((String) "MY_LIST_A");
        ((Field) term112964).setAccessible(true);
        Object enum266 = ((Field) term112964).get((Object) null);
        Class<? extends Object> term113299 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term113298 = ((Class) term113299).getDeclaredField((String) "HARD");
        ((Field) term113298).setAccessible(true);
        Object enum267 = ((Field) term113298).get((Object) null);
        Class<? extends Object> term113568 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term113567 = ((Class) term113568).getDeclaredField((String) "ORIGINAL");
        ((Field) term113567).setAccessible(true);
        Object enum268 = ((Field) term113567).get((Object) null);
        Class<? extends Object> term113884 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term113883 = ((Class) term113884).getDeclaredField((String) "BRONZE");
        ((Field) term113883).setAccessible(true);
        Object enum269 = ((Field) term113883).get((Object) null);
        term112257 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term112354 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112355 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112359 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term112257, term112257.getClass(), "pd_id", 1868344256);
        setField(term112257, term112257.getClass(), "start_result", enum265);
        setIntField(term112257, term112257.getClass(), "accept_idx", 1857693976);
        setIntField(term112257, term112257.getClass(), "start_idx", 1631305277);
        setField(term112257, term112257.getClass(), "player_name", "jyexiarswN");
        setIntField(term112257, term112257.getClass(), "hp_vol", 162113491);
        setBooleanField(term112257, term112257.getClass(), "btn_se_vol", true);
        setIntField(term112257, term112257.getClass(), "btn_se_vol2", -932147928);
        setIntField(term112257, term112257.getClass(), "sldr_se_vol2", 487369012);
        setField(term112257, term112257.getClass(), "sort_kind", enum266);
        setIntField(term112257, term112257.getClass(), "lv_num", -179238712);
        setIntField(term112257, term112257.getClass(), "lv_pnt", -2018735535);
        setField(term112257, term112257.getClass(), "lv_str", "ZBLFNFVEHD");
        setIntField(term112257, term112257.getClass(), "lv_efct_id", -658524954);
        setIntField(term112257, term112257.getClass(), "lv_plt_id", -2009613557);
        setField(term112257, term112257.getClass(), "mdl_eqp_ary", "miNxpUfOyL");
        setField(term112257, term112257.getClass(), "c_itm_eqp_ary", "BAPTojeHRU");
        setField(term112257, term112257.getClass(), "ms_itm_flg_ary", "uqDEIRoVVf");
        setIntField(term112355, term112355.getClass(), "year", 2012);
        setShortField(term112355, term112355.getClass(), "month", (short) 7);
        setShortField(term112355, term112355.getClass(), "day", (short) 21);
        setField(term112354, term112354.getClass(), "date", term112355);
        setByteField(term112359, term112359.getClass(), "hour", (byte) 13);
        setByteField(term112359, term112359.getClass(), "minute", (byte) 41);
        setByteField(term112359, term112359.getClass(), "second", (byte) 44);
        setIntField(term112359, term112359.getClass(), "nano", 394467282);
        setField(term112354, term112354.getClass(), "time", term112359);
        setField(term112257, term112257.getClass(), "mdl_eqp_tm", term112354);
        setField(term112257, term112257.getClass(), "mdl_have", "HnLeZhnLzz");
        setField(term112257, term112257.getClass(), "cstmz_itm_have", "ziYEsRkZmD");
        setBooleanField(term112257, term112257.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term112257, term112257.getClass(), "use_mdl_pri", true);
        setBooleanField(term112257, term112257.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term112257, term112257.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term112257, term112257.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term112257, term112257.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term112257, term112257.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term112257, term112257.getClass(), "vcld_pts", 654195547);
        setIntField(term112257, term112257.getClass(), "nxt_pv_id", 1622857008);
        setField(term112257, term112257.getClass(), "nxt_dffclty", enum267);
        setField(term112257, term112257.getClass(), "nxt_edtn", enum268);
        setField(term112257, term112257.getClass(), "cv_cid", "RFbJNwiLtv");
        setField(term112257, term112257.getClass(), "cv_sc", "eCxWMOpomA");
        setField(term112257, term112257.getClass(), "cv_rr", "pkQawlBtEF");
        setField(term112257, term112257.getClass(), "cv_bv", "rdKTcvHHnV");
        setField(term112257, term112257.getClass(), "cv_bf", "ELfUfLbXZf");
        setIntField(term112257, term112257.getClass(), "cnp_cid", 934338954);
        setIntField(term112257, term112257.getClass(), "cnp_val", 598635505);
        setField(term112257, term112257.getClass(), "cnp_rr", enum269);
        setField(term112257, term112257.getClass(), "cnp_sp", "SAglaHkagn");
        setField(term112257, term112257.getClass(), "my_lst_0", "eZGxUfdoFn");
        setField(term112257, term112257.getClass(), "my_lst_1", "yCWSlaOrSv");
        setField(term112257, term112257.getClass(), "my_lst_2", "PFpWKxDIRz");
        setField(term112257, term112257.getClass(), "my_lst_3", "qePuOCwoCf");
        setField(term112257, term112257.getClass(), "my_lst_4", "vJPujDInGq");
        setField(term112257, term112257.getClass(), "dsp_clr_brdr", "cHZGcMhatT");
        setBooleanField(term112257, term112257.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term112257, term112257.getClass(), "dsp_clr_sts", false);
        setField(term112257, term112257.getClass(), "clr_sts", "OZGyrUPedG");
        setBooleanField(term112257, term112257.getClass(), "rgo_sts", false);
        setField(term112257, term112257.getClass(), "my_qst_id", "GAxMzRqmXU");
        setField(term112257, term112257.getClass(), "my_qst_sts", "XMhUDGKSWO");
        setField(term112257, term112257.getClass(), "my_qst_prgrs", "jLgzxtuvVo");
        setField(term112257, term112257.getClass(), "my_qst_et", "wmmxjOkPnH");
        setField(term112257, term112257.getClass(), "p_std_ie_have", "jgRohUQWxJ");
        setField(term112257, term112257.getClass(), "p_std_se_have", "CJlAiZDIQO");
        setField(term112257, term112257.getClass(), "cmd", "osgWaTBVoE");
        setField(term112257, term112257.getClass(), "req_id", "mvkMYcgAod");
        setField(term112257, term112257.getClass(), "stat", "esbhDGQDgF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_qst_sts", argTypes, term112257, args);
    }

};


