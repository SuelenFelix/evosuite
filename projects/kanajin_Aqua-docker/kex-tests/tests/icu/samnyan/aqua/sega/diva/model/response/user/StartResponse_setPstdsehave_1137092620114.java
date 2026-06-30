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

public class StartResponse_setPstdsehave_1137092620114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240614;

    public StartResponse_setPstdsehave_1137092620114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term241070 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term241069 = ((Class) term241070).getDeclaredField((String) "FAILED");
        ((Field) term241069).setAccessible(true);
        Object enum572 = ((Field) term241069).get((Object) null);
        Class<? extends Object> term241335 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term241334 = ((Class) term241335).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term241334).setAccessible(true);
        Object enum573 = ((Field) term241334).get((Object) null);
        Class<? extends Object> term241678 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term241677 = ((Class) term241678).getDeclaredField((String) "EASY");
        ((Field) term241677).setAccessible(true);
        Object enum574 = ((Field) term241677).get((Object) null);
        Class<? extends Object> term241947 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term241946 = ((Class) term241947).getDeclaredField((String) "ORIGINAL");
        ((Field) term241946).setAccessible(true);
        Object enum575 = ((Field) term241946).get((Object) null);
        Class<? extends Object> term242263 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term242262 = ((Class) term242263).getDeclaredField((String) "NONE");
        ((Field) term242262).setAccessible(true);
        Object enum576 = ((Field) term242262).get((Object) null);
        term240614 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term240714 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term240715 = newInstance(Class.forName("java.time.LocalDate"));
        Object term240719 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term240614, term240614.getClass(), "pd_id", 1641117123);
        setField(term240614, term240614.getClass(), "start_result", enum572);
        setIntField(term240614, term240614.getClass(), "accept_idx", -1084408453);
        setIntField(term240614, term240614.getClass(), "start_idx", -1466822773);
        setField(term240614, term240614.getClass(), "player_name", "iSrYZvDgVF");
        setIntField(term240614, term240614.getClass(), "hp_vol", -230022261);
        setBooleanField(term240614, term240614.getClass(), "btn_se_vol", true);
        setIntField(term240614, term240614.getClass(), "btn_se_vol2", 831967494);
        setIntField(term240614, term240614.getClass(), "sldr_se_vol2", -1858635791);
        setField(term240614, term240614.getClass(), "sort_kind", enum573);
        setIntField(term240614, term240614.getClass(), "lv_num", 1919079331);
        setIntField(term240614, term240614.getClass(), "lv_pnt", 144872711);
        setField(term240614, term240614.getClass(), "lv_str", "uVYuAEBgZy");
        setIntField(term240614, term240614.getClass(), "lv_efct_id", -720037395);
        setIntField(term240614, term240614.getClass(), "lv_plt_id", 1232105469);
        setField(term240614, term240614.getClass(), "mdl_eqp_ary", "pOAxvXmQfD");
        setField(term240614, term240614.getClass(), "c_itm_eqp_ary", "mvWHHiGYmD");
        setField(term240614, term240614.getClass(), "ms_itm_flg_ary", "eZUuWCoERR");
        setIntField(term240715, term240715.getClass(), "year", 2018);
        setShortField(term240715, term240715.getClass(), "month", (short) 10);
        setShortField(term240715, term240715.getClass(), "day", (short) 17);
        setField(term240714, term240714.getClass(), "date", term240715);
        setByteField(term240719, term240719.getClass(), "hour", (byte) 5);
        setByteField(term240719, term240719.getClass(), "minute", (byte) 10);
        setByteField(term240719, term240719.getClass(), "second", (byte) 23);
        setIntField(term240719, term240719.getClass(), "nano", 571520422);
        setField(term240714, term240714.getClass(), "time", term240719);
        setField(term240614, term240614.getClass(), "mdl_eqp_tm", term240714);
        setField(term240614, term240614.getClass(), "mdl_have", "AMeLarREbk");
        setField(term240614, term240614.getClass(), "cstmz_itm_have", "LQHAihGqFG");
        setBooleanField(term240614, term240614.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term240614, term240614.getClass(), "use_mdl_pri", false);
        setBooleanField(term240614, term240614.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term240614, term240614.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term240614, term240614.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term240614, term240614.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term240614, term240614.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term240614, term240614.getClass(), "vcld_pts", -1547322575);
        setIntField(term240614, term240614.getClass(), "nxt_pv_id", -61444233);
        setField(term240614, term240614.getClass(), "nxt_dffclty", enum574);
        setField(term240614, term240614.getClass(), "nxt_edtn", enum575);
        setField(term240614, term240614.getClass(), "cv_cid", "XNHngduAPd");
        setField(term240614, term240614.getClass(), "cv_sc", "ewowfKAPBz");
        setField(term240614, term240614.getClass(), "cv_rr", "yOYHYOdvNm");
        setField(term240614, term240614.getClass(), "cv_bv", "RsOIgNcrMD");
        setField(term240614, term240614.getClass(), "cv_bf", "JDwFepEsNs");
        setIntField(term240614, term240614.getClass(), "cnp_cid", -400720912);
        setIntField(term240614, term240614.getClass(), "cnp_val", 1266192397);
        setField(term240614, term240614.getClass(), "cnp_rr", enum576);
        setField(term240614, term240614.getClass(), "cnp_sp", "YFjmdvvUEp");
        setField(term240614, term240614.getClass(), "my_lst_0", "jCSXDmxVEW");
        setField(term240614, term240614.getClass(), "my_lst_1", "ucSaPNSgwx");
        setField(term240614, term240614.getClass(), "my_lst_2", "rsRvTIjmLJ");
        setField(term240614, term240614.getClass(), "my_lst_3", "VOBEeWmzSF");
        setField(term240614, term240614.getClass(), "my_lst_4", "cVeaNxcyvs");
        setField(term240614, term240614.getClass(), "dsp_clr_brdr", "fIMpTnCtOM");
        setBooleanField(term240614, term240614.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term240614, term240614.getClass(), "dsp_clr_sts", false);
        setField(term240614, term240614.getClass(), "clr_sts", "zsVQmqfyvx");
        setBooleanField(term240614, term240614.getClass(), "rgo_sts", true);
        setField(term240614, term240614.getClass(), "my_qst_id", "DKFEMZUVhd");
        setField(term240614, term240614.getClass(), "my_qst_sts", "xhjqWwsjmc");
        setField(term240614, term240614.getClass(), "my_qst_prgrs", "GmFORCKDuz");
        setField(term240614, term240614.getClass(), "my_qst_et", "uiZFXEVOdS");
        setField(term240614, term240614.getClass(), "p_std_ie_have", "kLUzmGfJsV");
        setField(term240614, term240614.getClass(), "p_std_se_have", "NtSnrngAmM");
        setField(term240614, term240614.getClass(), "cmd", "OYnrHBNcZV");
        setField(term240614, term240614.getClass(), "req_id", "pwkepWBxgL");
        setField(term240614, term240614.getClass(), "stat", "RDXQLsyKOu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZnIRhQxVXw";
        callMethod(klass, "setP_std_se_have", argTypes, term240614, args);
    }

};


