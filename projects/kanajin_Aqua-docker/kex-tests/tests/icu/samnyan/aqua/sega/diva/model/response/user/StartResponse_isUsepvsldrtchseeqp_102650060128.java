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

public class StartResponse_isUsepvsldrtchseeqp_102650060128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60227;

    public StartResponse_isUsepvsldrtchseeqp_102650060128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60668 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term60667 = ((Class) term60668).getDeclaredField((String) "SUCCESS");
        ((Field) term60667).setAccessible(true);
        Object enum140 = ((Field) term60667).get((Object) null);
        Class<? extends Object> term60936 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term60935 = ((Class) term60936).getDeclaredField((String) "MY_LIST_B");
        ((Field) term60935).setAccessible(true);
        Object enum141 = ((Field) term60935).get((Object) null);
        Class<? extends Object> term61270 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term61269 = ((Class) term61270).getDeclaredField((String) "EASY");
        ((Field) term61269).setAccessible(true);
        Object enum142 = ((Field) term61269).get((Object) null);
        Class<? extends Object> term61539 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term61538 = ((Class) term61539).getDeclaredField((String) "EXTRA");
        ((Field) term61538).setAccessible(true);
        Object enum143 = ((Field) term61538).get((Object) null);
        Class<? extends Object> term61846 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term61845 = ((Class) term61846).getDeclaredField((String) "SILVER");
        ((Field) term61845).setAccessible(true);
        Object enum144 = ((Field) term61845).get((Object) null);
        term60227 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term60325 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60326 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60330 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term60227, term60227.getClass(), "pd_id", -370828664);
        setField(term60227, term60227.getClass(), "start_result", enum140);
        setIntField(term60227, term60227.getClass(), "accept_idx", 1168633950);
        setIntField(term60227, term60227.getClass(), "start_idx", 1607082164);
        setField(term60227, term60227.getClass(), "player_name", "hGTqHomrbc");
        setIntField(term60227, term60227.getClass(), "hp_vol", 1890399366);
        setBooleanField(term60227, term60227.getClass(), "btn_se_vol", true);
        setIntField(term60227, term60227.getClass(), "btn_se_vol2", -1867239125);
        setIntField(term60227, term60227.getClass(), "sldr_se_vol2", 952869601);
        setField(term60227, term60227.getClass(), "sort_kind", enum141);
        setIntField(term60227, term60227.getClass(), "lv_num", 91958879);
        setIntField(term60227, term60227.getClass(), "lv_pnt", -645429025);
        setField(term60227, term60227.getClass(), "lv_str", "NNMBrIWEBw");
        setIntField(term60227, term60227.getClass(), "lv_efct_id", -688213483);
        setIntField(term60227, term60227.getClass(), "lv_plt_id", 644154104);
        setField(term60227, term60227.getClass(), "mdl_eqp_ary", "GrTaccOQzl");
        setField(term60227, term60227.getClass(), "c_itm_eqp_ary", "uuSYOUCVHU");
        setField(term60227, term60227.getClass(), "ms_itm_flg_ary", "DfWwbodtVw");
        setIntField(term60326, term60326.getClass(), "year", 2021);
        setShortField(term60326, term60326.getClass(), "month", (short) 8);
        setShortField(term60326, term60326.getClass(), "day", (short) 12);
        setField(term60325, term60325.getClass(), "date", term60326);
        setByteField(term60330, term60330.getClass(), "hour", (byte) 2);
        setByteField(term60330, term60330.getClass(), "minute", (byte) 17);
        setByteField(term60330, term60330.getClass(), "second", (byte) 51);
        setIntField(term60330, term60330.getClass(), "nano", 207375141);
        setField(term60325, term60325.getClass(), "time", term60330);
        setField(term60227, term60227.getClass(), "mdl_eqp_tm", term60325);
        setField(term60227, term60227.getClass(), "mdl_have", "kTbFMpVWqx");
        setField(term60227, term60227.getClass(), "cstmz_itm_have", "HegRNsidFg");
        setBooleanField(term60227, term60227.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term60227, term60227.getClass(), "use_mdl_pri", true);
        setBooleanField(term60227, term60227.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term60227, term60227.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term60227, term60227.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term60227, term60227.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term60227, term60227.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term60227, term60227.getClass(), "vcld_pts", 76650923);
        setIntField(term60227, term60227.getClass(), "nxt_pv_id", 1003743923);
        setField(term60227, term60227.getClass(), "nxt_dffclty", enum142);
        setField(term60227, term60227.getClass(), "nxt_edtn", enum143);
        setField(term60227, term60227.getClass(), "cv_cid", "udRdJkgXmH");
        setField(term60227, term60227.getClass(), "cv_sc", "FBCXbjHVXO");
        setField(term60227, term60227.getClass(), "cv_rr", "dIWAnvmLiC");
        setField(term60227, term60227.getClass(), "cv_bv", "CuWebzZQjZ");
        setField(term60227, term60227.getClass(), "cv_bf", "wRVaaJxKYI");
        setIntField(term60227, term60227.getClass(), "cnp_cid", 1887772522);
        setIntField(term60227, term60227.getClass(), "cnp_val", 354196060);
        setField(term60227, term60227.getClass(), "cnp_rr", enum144);
        setField(term60227, term60227.getClass(), "cnp_sp", "yOQuJXRvOo");
        setField(term60227, term60227.getClass(), "my_lst_0", "XmLHcnVsch");
        setField(term60227, term60227.getClass(), "my_lst_1", "Yrvtdcltri");
        setField(term60227, term60227.getClass(), "my_lst_2", "RxrsjXRVcT");
        setField(term60227, term60227.getClass(), "my_lst_3", "cfRimmJxqA");
        setField(term60227, term60227.getClass(), "my_lst_4", "oOnRVGqFmy");
        setField(term60227, term60227.getClass(), "dsp_clr_brdr", "LaXzFIlWMk");
        setBooleanField(term60227, term60227.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term60227, term60227.getClass(), "dsp_clr_sts", false);
        setField(term60227, term60227.getClass(), "clr_sts", "GuVQjhBxma");
        setBooleanField(term60227, term60227.getClass(), "rgo_sts", false);
        setField(term60227, term60227.getClass(), "my_qst_id", "WAVMPPbIfL");
        setField(term60227, term60227.getClass(), "my_qst_sts", "GISHLsgALf");
        setField(term60227, term60227.getClass(), "my_qst_prgrs", "PVykkUSgBq");
        setField(term60227, term60227.getClass(), "my_qst_et", "tnKbZaCsuj");
        setField(term60227, term60227.getClass(), "p_std_ie_have", "ZFpcYBgLNC");
        setField(term60227, term60227.getClass(), "p_std_se_have", "VAGkRppBem");
        setField(term60227, term60227.getClass(), "cmd", "eKcEJRxNSu");
        setField(term60227, term60227.getClass(), "req_id", "NTXQPWFYSA");
        setField(term60227, term60227.getClass(), "stat", "fOuOhBpldm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUse_pv_sldr_tch_se_eqp", argTypes, term60227, args);
    }

};


