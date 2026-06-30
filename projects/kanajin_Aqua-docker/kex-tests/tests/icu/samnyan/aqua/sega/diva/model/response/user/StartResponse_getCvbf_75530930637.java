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

public class StartResponse_getCvbf_75530930637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78957;

    public StartResponse_getCvbf_75530930637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79397 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term79396 = ((Class) term79397).getDeclaredField((String) "SUCCESS");
        ((Field) term79396).setAccessible(true);
        Object enum185 = ((Field) term79396).get((Object) null);
        Class<? extends Object> term79665 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term79664 = ((Class) term79665).getDeclaredField((String) "COMPLEXITY");
        ((Field) term79664).setAccessible(true);
        Object enum186 = ((Field) term79664).get((Object) null);
        Class<? extends Object> term80002 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term80001 = ((Class) term80002).getDeclaredField((String) "EASY");
        ((Field) term80001).setAccessible(true);
        Object enum187 = ((Field) term80001).get((Object) null);
        Class<? extends Object> term80271 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term80270 = ((Class) term80271).getDeclaredField((String) "EXTRA");
        ((Field) term80270).setAccessible(true);
        Object enum188 = ((Field) term80270).get((Object) null);
        Class<? extends Object> term80578 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term80577 = ((Class) term80578).getDeclaredField((String) "GOLD");
        ((Field) term80577).setAccessible(true);
        Object enum189 = ((Field) term80577).get((Object) null);
        term78957 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term79056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79061 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term78957, term78957.getClass(), "pd_id", 1633913667);
        setField(term78957, term78957.getClass(), "start_result", enum185);
        setIntField(term78957, term78957.getClass(), "accept_idx", 1292332296);
        setIntField(term78957, term78957.getClass(), "start_idx", -1415256843);
        setField(term78957, term78957.getClass(), "player_name", "PrHWfHydsG");
        setIntField(term78957, term78957.getClass(), "hp_vol", 612177768);
        setBooleanField(term78957, term78957.getClass(), "btn_se_vol", true);
        setIntField(term78957, term78957.getClass(), "btn_se_vol2", -1626451656);
        setIntField(term78957, term78957.getClass(), "sldr_se_vol2", 173952451);
        setField(term78957, term78957.getClass(), "sort_kind", enum186);
        setIntField(term78957, term78957.getClass(), "lv_num", -1972033388);
        setIntField(term78957, term78957.getClass(), "lv_pnt", -1005024758);
        setField(term78957, term78957.getClass(), "lv_str", "igruEzTbBE");
        setIntField(term78957, term78957.getClass(), "lv_efct_id", 2634669);
        setIntField(term78957, term78957.getClass(), "lv_plt_id", -1912429941);
        setField(term78957, term78957.getClass(), "mdl_eqp_ary", "LFjgROsRUV");
        setField(term78957, term78957.getClass(), "c_itm_eqp_ary", "kHxujKiCsr");
        setField(term78957, term78957.getClass(), "ms_itm_flg_ary", "cseZveWowm");
        setIntField(term79057, term79057.getClass(), "year", 2010);
        setShortField(term79057, term79057.getClass(), "month", (short) 9);
        setShortField(term79057, term79057.getClass(), "day", (short) 28);
        setField(term79056, term79056.getClass(), "date", term79057);
        setByteField(term79061, term79061.getClass(), "hour", (byte) 6);
        setByteField(term79061, term79061.getClass(), "minute", (byte) 4);
        setByteField(term79061, term79061.getClass(), "second", (byte) 54);
        setIntField(term79061, term79061.getClass(), "nano", 604713782);
        setField(term79056, term79056.getClass(), "time", term79061);
        setField(term78957, term78957.getClass(), "mdl_eqp_tm", term79056);
        setField(term78957, term78957.getClass(), "mdl_have", "idfslIPhgx");
        setField(term78957, term78957.getClass(), "cstmz_itm_have", "HyFLOXeoDX");
        setBooleanField(term78957, term78957.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term78957, term78957.getClass(), "use_mdl_pri", false);
        setBooleanField(term78957, term78957.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term78957, term78957.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term78957, term78957.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term78957, term78957.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term78957, term78957.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term78957, term78957.getClass(), "vcld_pts", 1801052257);
        setIntField(term78957, term78957.getClass(), "nxt_pv_id", -2110556060);
        setField(term78957, term78957.getClass(), "nxt_dffclty", enum187);
        setField(term78957, term78957.getClass(), "nxt_edtn", enum188);
        setField(term78957, term78957.getClass(), "cv_cid", "crkNabVaWs");
        setField(term78957, term78957.getClass(), "cv_sc", "qBcAJgrABE");
        setField(term78957, term78957.getClass(), "cv_rr", "JKdZuLFRwC");
        setField(term78957, term78957.getClass(), "cv_bv", "hfhLLoWnRU");
        setField(term78957, term78957.getClass(), "cv_bf", "RpofnOPYha");
        setIntField(term78957, term78957.getClass(), "cnp_cid", 313459791);
        setIntField(term78957, term78957.getClass(), "cnp_val", 752615112);
        setField(term78957, term78957.getClass(), "cnp_rr", enum189);
        setField(term78957, term78957.getClass(), "cnp_sp", "CQYmAsjvPU");
        setField(term78957, term78957.getClass(), "my_lst_0", "NNkIIFpxiB");
        setField(term78957, term78957.getClass(), "my_lst_1", "sBmtvFPDso");
        setField(term78957, term78957.getClass(), "my_lst_2", "qsUIxrLolr");
        setField(term78957, term78957.getClass(), "my_lst_3", "IlQxArYcgB");
        setField(term78957, term78957.getClass(), "my_lst_4", "lIgKCvCuoH");
        setField(term78957, term78957.getClass(), "dsp_clr_brdr", "dHuWgRwLOm");
        setBooleanField(term78957, term78957.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term78957, term78957.getClass(), "dsp_clr_sts", false);
        setField(term78957, term78957.getClass(), "clr_sts", "PsTQDxNIld");
        setBooleanField(term78957, term78957.getClass(), "rgo_sts", true);
        setField(term78957, term78957.getClass(), "my_qst_id", "uoBijJjvaj");
        setField(term78957, term78957.getClass(), "my_qst_sts", "BdsLFSRWda");
        setField(term78957, term78957.getClass(), "my_qst_prgrs", "tMhhBYonAI");
        setField(term78957, term78957.getClass(), "my_qst_et", "AaQRshwIQC");
        setField(term78957, term78957.getClass(), "p_std_ie_have", "rHgKCfgCsg");
        setField(term78957, term78957.getClass(), "p_std_se_have", "AWtIUOuutt");
        setField(term78957, term78957.getClass(), "cmd", "jBgJZpHifl");
        setField(term78957, term78957.getClass(), "req_id", "azMTTmEXnh");
        setField(term78957, term78957.getClass(), "stat", "BjJtxwsIpt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCv_bf", argTypes, term78957, args);
    }

};


