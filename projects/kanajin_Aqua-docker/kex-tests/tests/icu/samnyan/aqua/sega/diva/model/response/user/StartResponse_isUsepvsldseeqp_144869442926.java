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

public class StartResponse_isUsepvsldseeqp_144869442926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56047;

    public StartResponse_isUsepvsldseeqp_144869442926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term56491 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term56490 = ((Class) term56491).getDeclaredField((String) "FAILED");
        ((Field) term56490).setAccessible(true);
        Object enum130 = ((Field) term56490).get((Object) null);
        Class<? extends Object> term56756 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term56755 = ((Class) term56756).getDeclaredField((String) "MY_LIST_A");
        ((Field) term56755).setAccessible(true);
        Object enum131 = ((Field) term56755).get((Object) null);
        Class<? extends Object> term57090 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term57089 = ((Class) term57090).getDeclaredField((String) "EXTREME");
        ((Field) term57089).setAccessible(true);
        Object enum132 = ((Field) term57089).get((Object) null);
        Class<? extends Object> term57368 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term57367 = ((Class) term57368).getDeclaredField((String) "ORIGINAL");
        ((Field) term57367).setAccessible(true);
        Object enum133 = ((Field) term57367).get((Object) null);
        Class<? extends Object> term57684 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term57683 = ((Class) term57684).getDeclaredField((String) "NONE");
        ((Field) term57683).setAccessible(true);
        Object enum134 = ((Field) term57683).get((Object) null);
        term56047 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term56144 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56145 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56149 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term56047, term56047.getClass(), "pd_id", 1496340209);
        setField(term56047, term56047.getClass(), "start_result", enum130);
        setIntField(term56047, term56047.getClass(), "accept_idx", -1748391876);
        setIntField(term56047, term56047.getClass(), "start_idx", 43258317);
        setField(term56047, term56047.getClass(), "player_name", "uMsWXqNhln");
        setIntField(term56047, term56047.getClass(), "hp_vol", 1707220033);
        setBooleanField(term56047, term56047.getClass(), "btn_se_vol", true);
        setIntField(term56047, term56047.getClass(), "btn_se_vol2", -1792504217);
        setIntField(term56047, term56047.getClass(), "sldr_se_vol2", 1824538861);
        setField(term56047, term56047.getClass(), "sort_kind", enum131);
        setIntField(term56047, term56047.getClass(), "lv_num", 499519708);
        setIntField(term56047, term56047.getClass(), "lv_pnt", 1501165033);
        setField(term56047, term56047.getClass(), "lv_str", "MAnhIPOtHL");
        setIntField(term56047, term56047.getClass(), "lv_efct_id", 510162332);
        setIntField(term56047, term56047.getClass(), "lv_plt_id", 888506903);
        setField(term56047, term56047.getClass(), "mdl_eqp_ary", "dikKjYjmRO");
        setField(term56047, term56047.getClass(), "c_itm_eqp_ary", "GJnnMDVnEP");
        setField(term56047, term56047.getClass(), "ms_itm_flg_ary", "zSMVllDpfk");
        setIntField(term56145, term56145.getClass(), "year", 2028);
        setShortField(term56145, term56145.getClass(), "month", (short) 10);
        setShortField(term56145, term56145.getClass(), "day", (short) 1);
        setField(term56144, term56144.getClass(), "date", term56145);
        setByteField(term56149, term56149.getClass(), "hour", (byte) 17);
        setByteField(term56149, term56149.getClass(), "minute", (byte) 29);
        setByteField(term56149, term56149.getClass(), "second", (byte) 30);
        setIntField(term56149, term56149.getClass(), "nano", 845472306);
        setField(term56144, term56144.getClass(), "time", term56149);
        setField(term56047, term56047.getClass(), "mdl_eqp_tm", term56144);
        setField(term56047, term56047.getClass(), "mdl_have", "iptRXVDoYE");
        setField(term56047, term56047.getClass(), "cstmz_itm_have", "kucsxnvbES");
        setBooleanField(term56047, term56047.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term56047, term56047.getClass(), "use_mdl_pri", true);
        setBooleanField(term56047, term56047.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term56047, term56047.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term56047, term56047.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term56047, term56047.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term56047, term56047.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term56047, term56047.getClass(), "vcld_pts", 200252898);
        setIntField(term56047, term56047.getClass(), "nxt_pv_id", -1831826725);
        setField(term56047, term56047.getClass(), "nxt_dffclty", enum132);
        setField(term56047, term56047.getClass(), "nxt_edtn", enum133);
        setField(term56047, term56047.getClass(), "cv_cid", "IdGzDFfcZf");
        setField(term56047, term56047.getClass(), "cv_sc", "KDdRNhZmnU");
        setField(term56047, term56047.getClass(), "cv_rr", "iMsqJaKlDC");
        setField(term56047, term56047.getClass(), "cv_bv", "aPkGHbZyjj");
        setField(term56047, term56047.getClass(), "cv_bf", "nSWdsVyJRI");
        setIntField(term56047, term56047.getClass(), "cnp_cid", 752152965);
        setIntField(term56047, term56047.getClass(), "cnp_val", -1577069773);
        setField(term56047, term56047.getClass(), "cnp_rr", enum134);
        setField(term56047, term56047.getClass(), "cnp_sp", "JBOPGgGKnc");
        setField(term56047, term56047.getClass(), "my_lst_0", "GlPTiCMCGP");
        setField(term56047, term56047.getClass(), "my_lst_1", "jlcBpLoWfd");
        setField(term56047, term56047.getClass(), "my_lst_2", "oYymmLqbfJ");
        setField(term56047, term56047.getClass(), "my_lst_3", "YaDWphDOSz");
        setField(term56047, term56047.getClass(), "my_lst_4", "nnnmCgFBLw");
        setField(term56047, term56047.getClass(), "dsp_clr_brdr", "hSSCyNEhyH");
        setBooleanField(term56047, term56047.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term56047, term56047.getClass(), "dsp_clr_sts", true);
        setField(term56047, term56047.getClass(), "clr_sts", "jDFNSuvZqm");
        setBooleanField(term56047, term56047.getClass(), "rgo_sts", false);
        setField(term56047, term56047.getClass(), "my_qst_id", "pLvkKHqNYX");
        setField(term56047, term56047.getClass(), "my_qst_sts", "PwqnuJJwjR");
        setField(term56047, term56047.getClass(), "my_qst_prgrs", "NFkbBiPeiw");
        setField(term56047, term56047.getClass(), "my_qst_et", "tlRvilQyjJ");
        setField(term56047, term56047.getClass(), "p_std_ie_have", "gwTUlYNpjM");
        setField(term56047, term56047.getClass(), "p_std_se_have", "uXYojRmxrM");
        setField(term56047, term56047.getClass(), "cmd", "cxRwRcodud");
        setField(term56047, term56047.getClass(), "req_id", "GDGBPlYeLn");
        setField(term56047, term56047.getClass(), "stat", "jdQANIXSTq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUse_pv_sld_se_eqp", argTypes, term56047, args);
    }

};


