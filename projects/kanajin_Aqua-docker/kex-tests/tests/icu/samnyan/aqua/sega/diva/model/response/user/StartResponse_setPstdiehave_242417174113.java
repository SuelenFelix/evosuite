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

public class StartResponse_setPstdiehave_242417174113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238502;

    public StartResponse_setPstdiehave_242417174113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term238958 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term238957 = ((Class) term238958).getDeclaredField((String) "FAILED");
        ((Field) term238957).setAccessible(true);
        Object enum567 = ((Field) term238957).get((Object) null);
        Class<? extends Object> term239223 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term239222 = ((Class) term239223).getDeclaredField((String) "COMPLEXITY");
        ((Field) term239222).setAccessible(true);
        Object enum568 = ((Field) term239222).get((Object) null);
        Class<? extends Object> term239560 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term239559 = ((Class) term239560).getDeclaredField((String) "NORMAL");
        ((Field) term239559).setAccessible(true);
        Object enum569 = ((Field) term239559).get((Object) null);
        Class<? extends Object> term239835 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term239834 = ((Class) term239835).getDeclaredField((String) "ORIGINAL");
        ((Field) term239834).setAccessible(true);
        Object enum570 = ((Field) term239834).get((Object) null);
        Class<? extends Object> term240151 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term240150 = ((Class) term240151).getDeclaredField((String) "NONE");
        ((Field) term240150).setAccessible(true);
        Object enum571 = ((Field) term240150).get((Object) null);
        term238502 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term238600 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term238601 = newInstance(Class.forName("java.time.LocalDate"));
        Object term238605 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term238502, term238502.getClass(), "pd_id", -1746962742);
        setField(term238502, term238502.getClass(), "start_result", enum567);
        setIntField(term238502, term238502.getClass(), "accept_idx", -575810668);
        setIntField(term238502, term238502.getClass(), "start_idx", 256028547);
        setField(term238502, term238502.getClass(), "player_name", "vPinPzceBb");
        setIntField(term238502, term238502.getClass(), "hp_vol", -750603024);
        setBooleanField(term238502, term238502.getClass(), "btn_se_vol", false);
        setIntField(term238502, term238502.getClass(), "btn_se_vol2", 1255234202);
        setIntField(term238502, term238502.getClass(), "sldr_se_vol2", -223786928);
        setField(term238502, term238502.getClass(), "sort_kind", enum568);
        setIntField(term238502, term238502.getClass(), "lv_num", 1703103733);
        setIntField(term238502, term238502.getClass(), "lv_pnt", 1057562436);
        setField(term238502, term238502.getClass(), "lv_str", "jPhUwTVUvX");
        setIntField(term238502, term238502.getClass(), "lv_efct_id", 646610000);
        setIntField(term238502, term238502.getClass(), "lv_plt_id", 2003399396);
        setField(term238502, term238502.getClass(), "mdl_eqp_ary", "GIBMEPcBjc");
        setField(term238502, term238502.getClass(), "c_itm_eqp_ary", "noofsnMNpz");
        setField(term238502, term238502.getClass(), "ms_itm_flg_ary", "zorMRlODHM");
        setIntField(term238601, term238601.getClass(), "year", 2026);
        setShortField(term238601, term238601.getClass(), "month", (short) 10);
        setShortField(term238601, term238601.getClass(), "day", (short) 19);
        setField(term238600, term238600.getClass(), "date", term238601);
        setByteField(term238605, term238605.getClass(), "hour", (byte) 7);
        setByteField(term238605, term238605.getClass(), "minute", (byte) 22);
        setByteField(term238605, term238605.getClass(), "second", (byte) 11);
        setIntField(term238605, term238605.getClass(), "nano", 17846677);
        setField(term238600, term238600.getClass(), "time", term238605);
        setField(term238502, term238502.getClass(), "mdl_eqp_tm", term238600);
        setField(term238502, term238502.getClass(), "mdl_have", "xLZEtHhKOn");
        setField(term238502, term238502.getClass(), "cstmz_itm_have", "wfqnUhLFCy");
        setBooleanField(term238502, term238502.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term238502, term238502.getClass(), "use_mdl_pri", false);
        setBooleanField(term238502, term238502.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term238502, term238502.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term238502, term238502.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term238502, term238502.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term238502, term238502.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term238502, term238502.getClass(), "vcld_pts", 1223703911);
        setIntField(term238502, term238502.getClass(), "nxt_pv_id", -1824905298);
        setField(term238502, term238502.getClass(), "nxt_dffclty", enum569);
        setField(term238502, term238502.getClass(), "nxt_edtn", enum570);
        setField(term238502, term238502.getClass(), "cv_cid", "UKRJIjNXmC");
        setField(term238502, term238502.getClass(), "cv_sc", "CJBElYMXZF");
        setField(term238502, term238502.getClass(), "cv_rr", "uZOAWgAORh");
        setField(term238502, term238502.getClass(), "cv_bv", "fmFvklptLM");
        setField(term238502, term238502.getClass(), "cv_bf", "CYfPHswxIT");
        setIntField(term238502, term238502.getClass(), "cnp_cid", -2062724184);
        setIntField(term238502, term238502.getClass(), "cnp_val", -716654499);
        setField(term238502, term238502.getClass(), "cnp_rr", enum571);
        setField(term238502, term238502.getClass(), "cnp_sp", "IDibKvfdDt");
        setField(term238502, term238502.getClass(), "my_lst_0", "sKLtBTAssF");
        setField(term238502, term238502.getClass(), "my_lst_1", "ROGqSdboUf");
        setField(term238502, term238502.getClass(), "my_lst_2", "NfGNgrTcyY");
        setField(term238502, term238502.getClass(), "my_lst_3", "uPuFIjvpsv");
        setField(term238502, term238502.getClass(), "my_lst_4", "zNKHFvTvNQ");
        setField(term238502, term238502.getClass(), "dsp_clr_brdr", "cyqgSKerVH");
        setBooleanField(term238502, term238502.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term238502, term238502.getClass(), "dsp_clr_sts", true);
        setField(term238502, term238502.getClass(), "clr_sts", "KMFbAPDgQN");
        setBooleanField(term238502, term238502.getClass(), "rgo_sts", true);
        setField(term238502, term238502.getClass(), "my_qst_id", "pOXTylvole");
        setField(term238502, term238502.getClass(), "my_qst_sts", "kfguTpQAqI");
        setField(term238502, term238502.getClass(), "my_qst_prgrs", "YcPukufpJs");
        setField(term238502, term238502.getClass(), "my_qst_et", "vvGshYKSpj");
        setField(term238502, term238502.getClass(), "p_std_ie_have", "haqqYHJKqP");
        setField(term238502, term238502.getClass(), "p_std_se_have", "pehbaguHxu");
        setField(term238502, term238502.getClass(), "cmd", "pcQcluzQgA");
        setField(term238502, term238502.getClass(), "req_id", "iWOGNdtCLH");
        setField(term238502, term238502.getClass(), "stat", "KoDRiNjUMj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LtnegjrHqS";
        callMethod(klass, "setP_std_ie_have", argTypes, term238502, args);
    }

};


