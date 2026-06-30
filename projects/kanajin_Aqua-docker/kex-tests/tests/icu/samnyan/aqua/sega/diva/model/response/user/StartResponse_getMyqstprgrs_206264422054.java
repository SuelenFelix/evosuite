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

public class StartResponse_getMyqstprgrs_206264422054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114343;

    public StartResponse_getMyqstprgrs_206264422054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term114788 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term114787 = ((Class) term114788).getDeclaredField((String) "SUCCESS");
        ((Field) term114787).setAccessible(true);
        Object enum270 = ((Field) term114787).get((Object) null);
        Class<? extends Object> term115056 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term115055 = ((Class) term115056).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term115055).setAccessible(true);
        Object enum271 = ((Field) term115055).get((Object) null);
        Class<? extends Object> term115399 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term115398 = ((Class) term115399).getDeclaredField((String) "EXTREME");
        ((Field) term115398).setAccessible(true);
        Object enum272 = ((Field) term115398).get((Object) null);
        Class<? extends Object> term115677 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term115676 = ((Class) term115677).getDeclaredField((String) "EXTRA");
        ((Field) term115676).setAccessible(true);
        Object enum273 = ((Field) term115676).get((Object) null);
        Class<? extends Object> term115984 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term115983 = ((Class) term115984).getDeclaredField((String) "GOLD");
        ((Field) term115983).setAccessible(true);
        Object enum274 = ((Field) term115983).get((Object) null);
        term114343 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term114444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114449 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term114343, term114343.getClass(), "pd_id", -944986533);
        setField(term114343, term114343.getClass(), "start_result", enum270);
        setIntField(term114343, term114343.getClass(), "accept_idx", 1894454926);
        setIntField(term114343, term114343.getClass(), "start_idx", 1415142780);
        setField(term114343, term114343.getClass(), "player_name", "tKlyiBloWu");
        setIntField(term114343, term114343.getClass(), "hp_vol", -574105759);
        setBooleanField(term114343, term114343.getClass(), "btn_se_vol", true);
        setIntField(term114343, term114343.getClass(), "btn_se_vol2", -1165271567);
        setIntField(term114343, term114343.getClass(), "sldr_se_vol2", 376834234);
        setField(term114343, term114343.getClass(), "sort_kind", enum271);
        setIntField(term114343, term114343.getClass(), "lv_num", -1911972560);
        setIntField(term114343, term114343.getClass(), "lv_pnt", -642716895);
        setField(term114343, term114343.getClass(), "lv_str", "uIgRFcwqLd");
        setIntField(term114343, term114343.getClass(), "lv_efct_id", 1743398246);
        setIntField(term114343, term114343.getClass(), "lv_plt_id", -934658823);
        setField(term114343, term114343.getClass(), "mdl_eqp_ary", "AvdsiEyCve");
        setField(term114343, term114343.getClass(), "c_itm_eqp_ary", "XMArCaVAEc");
        setField(term114343, term114343.getClass(), "ms_itm_flg_ary", "URWnZtbrQH");
        setIntField(term114445, term114445.getClass(), "year", 2025);
        setShortField(term114445, term114445.getClass(), "month", (short) 9);
        setShortField(term114445, term114445.getClass(), "day", (short) 25);
        setField(term114444, term114444.getClass(), "date", term114445);
        setByteField(term114449, term114449.getClass(), "hour", (byte) 20);
        setByteField(term114449, term114449.getClass(), "minute", (byte) 0);
        setByteField(term114449, term114449.getClass(), "second", (byte) 25);
        setIntField(term114449, term114449.getClass(), "nano", 65871584);
        setField(term114444, term114444.getClass(), "time", term114449);
        setField(term114343, term114343.getClass(), "mdl_eqp_tm", term114444);
        setField(term114343, term114343.getClass(), "mdl_have", "hpTAdtnQku");
        setField(term114343, term114343.getClass(), "cstmz_itm_have", "GdMAXFBAtl");
        setBooleanField(term114343, term114343.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term114343, term114343.getClass(), "use_mdl_pri", true);
        setBooleanField(term114343, term114343.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term114343, term114343.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term114343, term114343.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term114343, term114343.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term114343, term114343.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term114343, term114343.getClass(), "vcld_pts", 1632177303);
        setIntField(term114343, term114343.getClass(), "nxt_pv_id", -802592348);
        setField(term114343, term114343.getClass(), "nxt_dffclty", enum272);
        setField(term114343, term114343.getClass(), "nxt_edtn", enum273);
        setField(term114343, term114343.getClass(), "cv_cid", "KWVRAlcIqd");
        setField(term114343, term114343.getClass(), "cv_sc", "GeVOqtDiGv");
        setField(term114343, term114343.getClass(), "cv_rr", "vbRAJCwftU");
        setField(term114343, term114343.getClass(), "cv_bv", "baJbjUImxp");
        setField(term114343, term114343.getClass(), "cv_bf", "lPERFqPpGz");
        setIntField(term114343, term114343.getClass(), "cnp_cid", -1576584269);
        setIntField(term114343, term114343.getClass(), "cnp_val", 1474899591);
        setField(term114343, term114343.getClass(), "cnp_rr", enum274);
        setField(term114343, term114343.getClass(), "cnp_sp", "jleFBTYSNb");
        setField(term114343, term114343.getClass(), "my_lst_0", "WmSSWHEELj");
        setField(term114343, term114343.getClass(), "my_lst_1", "ggFhMyQvdw");
        setField(term114343, term114343.getClass(), "my_lst_2", "vZpMxQNHKu");
        setField(term114343, term114343.getClass(), "my_lst_3", "QLMSDWYwBC");
        setField(term114343, term114343.getClass(), "my_lst_4", "feyxNWUenU");
        setField(term114343, term114343.getClass(), "dsp_clr_brdr", "qvqwmSUIiP");
        setBooleanField(term114343, term114343.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term114343, term114343.getClass(), "dsp_clr_sts", false);
        setField(term114343, term114343.getClass(), "clr_sts", "eNOEXYoAtV");
        setBooleanField(term114343, term114343.getClass(), "rgo_sts", false);
        setField(term114343, term114343.getClass(), "my_qst_id", "SNqwfZGLFh");
        setField(term114343, term114343.getClass(), "my_qst_sts", "sMqpXbgEga");
        setField(term114343, term114343.getClass(), "my_qst_prgrs", "nYJlDpoMcL");
        setField(term114343, term114343.getClass(), "my_qst_et", "SQnbnBmbcf");
        setField(term114343, term114343.getClass(), "p_std_ie_have", "jaNVteZrZi");
        setField(term114343, term114343.getClass(), "p_std_se_have", "bMRkDiPUGu");
        setField(term114343, term114343.getClass(), "cmd", "xjKxECGyLT");
        setField(term114343, term114343.getClass(), "req_id", "ffKeJGEXBT");
        setField(term114343, term114343.getClass(), "stat", "rsnXTpfhqf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_qst_prgrs", argTypes, term114343, args);
    }

};


