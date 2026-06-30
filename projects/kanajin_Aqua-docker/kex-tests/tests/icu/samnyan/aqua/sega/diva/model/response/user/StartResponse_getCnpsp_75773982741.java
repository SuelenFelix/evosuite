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

public class StartResponse_getCnpsp_75773982741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87289;

    public StartResponse_getCnpsp_75773982741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term87730 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term87729 = ((Class) term87730).getDeclaredField((String) "FAILED");
        ((Field) term87729).setAccessible(true);
        Object enum205 = ((Field) term87729).get((Object) null);
        Class<? extends Object> term87995 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term87994 = ((Class) term87995).getDeclaredField((String) "MY_LIST_C");
        ((Field) term87994).setAccessible(true);
        Object enum206 = ((Field) term87994).get((Object) null);
        Class<? extends Object> term88329 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term88328 = ((Class) term88329).getDeclaredField((String) "EASY");
        ((Field) term88328).setAccessible(true);
        Object enum207 = ((Field) term88328).get((Object) null);
        Class<? extends Object> term88598 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term88597 = ((Class) term88598).getDeclaredField((String) "ORIGINAL");
        ((Field) term88597).setAccessible(true);
        Object enum208 = ((Field) term88597).get((Object) null);
        Class<? extends Object> term88914 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term88913 = ((Class) term88914).getDeclaredField((String) "NONE");
        ((Field) term88913).setAccessible(true);
        Object enum209 = ((Field) term88913).get((Object) null);
        term87289 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term87386 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87387 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87391 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term87289, term87289.getClass(), "pd_id", -348612876);
        setField(term87289, term87289.getClass(), "start_result", enum205);
        setIntField(term87289, term87289.getClass(), "accept_idx", 1302807565);
        setIntField(term87289, term87289.getClass(), "start_idx", -838848221);
        setField(term87289, term87289.getClass(), "player_name", "pnmjTuTojv");
        setIntField(term87289, term87289.getClass(), "hp_vol", 1163761623);
        setBooleanField(term87289, term87289.getClass(), "btn_se_vol", false);
        setIntField(term87289, term87289.getClass(), "btn_se_vol2", 718742281);
        setIntField(term87289, term87289.getClass(), "sldr_se_vol2", 1532723756);
        setField(term87289, term87289.getClass(), "sort_kind", enum206);
        setIntField(term87289, term87289.getClass(), "lv_num", -124088550);
        setIntField(term87289, term87289.getClass(), "lv_pnt", 777492093);
        setField(term87289, term87289.getClass(), "lv_str", "eMtshhmGEm");
        setIntField(term87289, term87289.getClass(), "lv_efct_id", 1414025609);
        setIntField(term87289, term87289.getClass(), "lv_plt_id", 255145822);
        setField(term87289, term87289.getClass(), "mdl_eqp_ary", "VJUbzHGOvg");
        setField(term87289, term87289.getClass(), "c_itm_eqp_ary", "SiwcigIrfD");
        setField(term87289, term87289.getClass(), "ms_itm_flg_ary", "MFIdGVLoDo");
        setIntField(term87387, term87387.getClass(), "year", 2027);
        setShortField(term87387, term87387.getClass(), "month", (short) 11);
        setShortField(term87387, term87387.getClass(), "day", (short) 8);
        setField(term87386, term87386.getClass(), "date", term87387);
        setByteField(term87391, term87391.getClass(), "hour", (byte) 11);
        setByteField(term87391, term87391.getClass(), "minute", (byte) 59);
        setByteField(term87391, term87391.getClass(), "second", (byte) 14);
        setIntField(term87391, term87391.getClass(), "nano", 322375591);
        setField(term87386, term87386.getClass(), "time", term87391);
        setField(term87289, term87289.getClass(), "mdl_eqp_tm", term87386);
        setField(term87289, term87289.getClass(), "mdl_have", "kbxgTcnXyU");
        setField(term87289, term87289.getClass(), "cstmz_itm_have", "lnJvDbbuwo");
        setBooleanField(term87289, term87289.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term87289, term87289.getClass(), "use_mdl_pri", false);
        setBooleanField(term87289, term87289.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term87289, term87289.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term87289, term87289.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term87289, term87289.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term87289, term87289.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term87289, term87289.getClass(), "vcld_pts", -573608449);
        setIntField(term87289, term87289.getClass(), "nxt_pv_id", -1660057757);
        setField(term87289, term87289.getClass(), "nxt_dffclty", enum207);
        setField(term87289, term87289.getClass(), "nxt_edtn", enum208);
        setField(term87289, term87289.getClass(), "cv_cid", "KExnWkKGvF");
        setField(term87289, term87289.getClass(), "cv_sc", "luGUNfvmKk");
        setField(term87289, term87289.getClass(), "cv_rr", "oOUHomyJff");
        setField(term87289, term87289.getClass(), "cv_bv", "KnnoLMOuur");
        setField(term87289, term87289.getClass(), "cv_bf", "buRpVghIvt");
        setIntField(term87289, term87289.getClass(), "cnp_cid", 1816273440);
        setIntField(term87289, term87289.getClass(), "cnp_val", -96541009);
        setField(term87289, term87289.getClass(), "cnp_rr", enum209);
        setField(term87289, term87289.getClass(), "cnp_sp", "oTGxFdiaIW");
        setField(term87289, term87289.getClass(), "my_lst_0", "jlyFvaZlmv");
        setField(term87289, term87289.getClass(), "my_lst_1", "sofyLEfomV");
        setField(term87289, term87289.getClass(), "my_lst_2", "zHcDSJHKAb");
        setField(term87289, term87289.getClass(), "my_lst_3", "WRIQkTdeMl");
        setField(term87289, term87289.getClass(), "my_lst_4", "rLSEheWsHd");
        setField(term87289, term87289.getClass(), "dsp_clr_brdr", "DoUKDhlGCY");
        setBooleanField(term87289, term87289.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term87289, term87289.getClass(), "dsp_clr_sts", false);
        setField(term87289, term87289.getClass(), "clr_sts", "IeoToWsQWU");
        setBooleanField(term87289, term87289.getClass(), "rgo_sts", false);
        setField(term87289, term87289.getClass(), "my_qst_id", "QxiiHtQAzN");
        setField(term87289, term87289.getClass(), "my_qst_sts", "gQgTBlRIvX");
        setField(term87289, term87289.getClass(), "my_qst_prgrs", "ulKaKnANzj");
        setField(term87289, term87289.getClass(), "my_qst_et", "ABwhdjjeJi");
        setField(term87289, term87289.getClass(), "p_std_ie_have", "KKEcpYXNZV");
        setField(term87289, term87289.getClass(), "p_std_se_have", "shLHFznysy");
        setField(term87289, term87289.getClass(), "cmd", "YCKIloBHLj");
        setField(term87289, term87289.getClass(), "req_id", "qUWDhAeFJY");
        setField(term87289, term87289.getClass(), "stat", "wboNBMhRjP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCnp_sp", argTypes, term87289, args);
    }

};


