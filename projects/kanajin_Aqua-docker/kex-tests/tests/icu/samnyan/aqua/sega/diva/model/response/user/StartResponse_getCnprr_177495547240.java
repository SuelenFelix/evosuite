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

public class StartResponse_getCnprr_177495547240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85211;

    public StartResponse_getCnprr_177495547240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85652 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term85651 = ((Class) term85652).getDeclaredField((String) "FAILED");
        ((Field) term85651).setAccessible(true);
        Object enum200 = ((Field) term85651).get((Object) null);
        Class<? extends Object> term85917 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term85916 = ((Class) term85917).getDeclaredField((String) "NAME");
        ((Field) term85916).setAccessible(true);
        Object enum201 = ((Field) term85916).get((Object) null);
        Class<? extends Object> term86236 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term86235 = ((Class) term86236).getDeclaredField((String) "EXTREME");
        ((Field) term86235).setAccessible(true);
        Object enum202 = ((Field) term86235).get((Object) null);
        Class<? extends Object> term86514 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term86513 = ((Class) term86514).getDeclaredField((String) "ORIGINAL");
        ((Field) term86513).setAccessible(true);
        Object enum203 = ((Field) term86513).get((Object) null);
        Class<? extends Object> term86830 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term86829 = ((Class) term86830).getDeclaredField((String) "BRONZE");
        ((Field) term86829).setAccessible(true);
        Object enum204 = ((Field) term86829).get((Object) null);
        term85211 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term85303 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85304 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85308 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term85211, term85211.getClass(), "pd_id", -1381970335);
        setField(term85211, term85211.getClass(), "start_result", enum200);
        setIntField(term85211, term85211.getClass(), "accept_idx", 1213549815);
        setIntField(term85211, term85211.getClass(), "start_idx", -1518419301);
        setField(term85211, term85211.getClass(), "player_name", "omWrkCSFzy");
        setIntField(term85211, term85211.getClass(), "hp_vol", 674879025);
        setBooleanField(term85211, term85211.getClass(), "btn_se_vol", true);
        setIntField(term85211, term85211.getClass(), "btn_se_vol2", -1538936030);
        setIntField(term85211, term85211.getClass(), "sldr_se_vol2", -752870423);
        setField(term85211, term85211.getClass(), "sort_kind", enum201);
        setIntField(term85211, term85211.getClass(), "lv_num", -1698809299);
        setIntField(term85211, term85211.getClass(), "lv_pnt", 401512128);
        setField(term85211, term85211.getClass(), "lv_str", "VFYvUTgYFB");
        setIntField(term85211, term85211.getClass(), "lv_efct_id", -2069930777);
        setIntField(term85211, term85211.getClass(), "lv_plt_id", 1543696412);
        setField(term85211, term85211.getClass(), "mdl_eqp_ary", "BrWqhEIUUj");
        setField(term85211, term85211.getClass(), "c_itm_eqp_ary", "WfUmxdiHcU");
        setField(term85211, term85211.getClass(), "ms_itm_flg_ary", "BRrftvRvmF");
        setIntField(term85304, term85304.getClass(), "year", 2015);
        setShortField(term85304, term85304.getClass(), "month", (short) 12);
        setShortField(term85304, term85304.getClass(), "day", (short) 23);
        setField(term85303, term85303.getClass(), "date", term85304);
        setByteField(term85308, term85308.getClass(), "hour", (byte) 14);
        setByteField(term85308, term85308.getClass(), "minute", (byte) 17);
        setByteField(term85308, term85308.getClass(), "second", (byte) 50);
        setIntField(term85308, term85308.getClass(), "nano", 325544804);
        setField(term85303, term85303.getClass(), "time", term85308);
        setField(term85211, term85211.getClass(), "mdl_eqp_tm", term85303);
        setField(term85211, term85211.getClass(), "mdl_have", "fvoyRbZTsm");
        setField(term85211, term85211.getClass(), "cstmz_itm_have", "iOCnOQXWTl");
        setBooleanField(term85211, term85211.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term85211, term85211.getClass(), "use_mdl_pri", false);
        setBooleanField(term85211, term85211.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term85211, term85211.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term85211, term85211.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term85211, term85211.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term85211, term85211.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term85211, term85211.getClass(), "vcld_pts", -1385748168);
        setIntField(term85211, term85211.getClass(), "nxt_pv_id", -270592367);
        setField(term85211, term85211.getClass(), "nxt_dffclty", enum202);
        setField(term85211, term85211.getClass(), "nxt_edtn", enum203);
        setField(term85211, term85211.getClass(), "cv_cid", "ARnOWpgtAg");
        setField(term85211, term85211.getClass(), "cv_sc", "MRrYxZoJBW");
        setField(term85211, term85211.getClass(), "cv_rr", "fheZXFNQZh");
        setField(term85211, term85211.getClass(), "cv_bv", "YxHVWlebna");
        setField(term85211, term85211.getClass(), "cv_bf", "IEmAQCkrPE");
        setIntField(term85211, term85211.getClass(), "cnp_cid", 178847646);
        setIntField(term85211, term85211.getClass(), "cnp_val", 273590437);
        setField(term85211, term85211.getClass(), "cnp_rr", enum204);
        setField(term85211, term85211.getClass(), "cnp_sp", "lqFGhtlNRM");
        setField(term85211, term85211.getClass(), "my_lst_0", "GLxLHUsuLw");
        setField(term85211, term85211.getClass(), "my_lst_1", "HuKdqrrxIm");
        setField(term85211, term85211.getClass(), "my_lst_2", "yJKKddLqMb");
        setField(term85211, term85211.getClass(), "my_lst_3", "LWEYaXeKBe");
        setField(term85211, term85211.getClass(), "my_lst_4", "cNoFvpHBHw");
        setField(term85211, term85211.getClass(), "dsp_clr_brdr", "DoSWbCtsBg");
        setBooleanField(term85211, term85211.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term85211, term85211.getClass(), "dsp_clr_sts", false);
        setField(term85211, term85211.getClass(), "clr_sts", "NrXtkbXwDc");
        setBooleanField(term85211, term85211.getClass(), "rgo_sts", false);
        setField(term85211, term85211.getClass(), "my_qst_id", "EUapSrAmOe");
        setField(term85211, term85211.getClass(), "my_qst_sts", "dUHylIprea");
        setField(term85211, term85211.getClass(), "my_qst_prgrs", "FKDqHRpMcc");
        setField(term85211, term85211.getClass(), "my_qst_et", "mIRMQIxHUD");
        setField(term85211, term85211.getClass(), "p_std_ie_have", "FbBMtntDbw");
        setField(term85211, term85211.getClass(), "p_std_se_have", "zRnpRGaHlI");
        setField(term85211, term85211.getClass(), "cmd", "dVHfxjbMRK");
        setField(term85211, term85211.getClass(), "req_id", "LzwyLxKJpw");
        setField(term85211, term85211.getClass(), "stat", "ZhWJlplAVK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCnp_rr", argTypes, term85211, args);
    }

};


