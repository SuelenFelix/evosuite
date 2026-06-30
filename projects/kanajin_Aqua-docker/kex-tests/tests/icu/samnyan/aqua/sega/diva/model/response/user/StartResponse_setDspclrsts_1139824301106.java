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

public class StartResponse_setDspclrsts_1139824301106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223746;
     Object term224191;

    public StartResponse_setDspclrsts_1139824301106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term224194 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term224193 = ((Class) term224194).getDeclaredField((String) "FAILED");
        ((Field) term224193).setAccessible(true);
        Object enum532 = ((Field) term224193).get((Object) null);
        Class<? extends Object> term224459 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term224458 = ((Class) term224459).getDeclaredField((String) "MY_LIST_A");
        ((Field) term224458).setAccessible(true);
        Object enum533 = ((Field) term224458).get((Object) null);
        Class<? extends Object> term224793 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term224792 = ((Class) term224793).getDeclaredField((String) "UNDEFINED");
        ((Field) term224792).setAccessible(true);
        Object enum534 = ((Field) term224792).get((Object) null);
        Class<? extends Object> term225077 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term225076 = ((Class) term225077).getDeclaredField((String) "ORIGINAL");
        ((Field) term225076).setAccessible(true);
        Object enum535 = ((Field) term225076).get((Object) null);
        Class<? extends Object> term225393 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term225392 = ((Class) term225393).getDeclaredField((String) "NONE");
        ((Field) term225392).setAccessible(true);
        Object enum536 = ((Field) term225392).get((Object) null);
        term223746 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term223843 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term223844 = newInstance(Class.forName("java.time.LocalDate"));
        Object term223848 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term223746, term223746.getClass(), "pd_id", -1476037190);
        setField(term223746, term223746.getClass(), "start_result", enum532);
        setIntField(term223746, term223746.getClass(), "accept_idx", -718204437);
        setIntField(term223746, term223746.getClass(), "start_idx", 468974358);
        setField(term223746, term223746.getClass(), "player_name", "apdJoJDItV");
        setIntField(term223746, term223746.getClass(), "hp_vol", 346282818);
        setBooleanField(term223746, term223746.getClass(), "btn_se_vol", false);
        setIntField(term223746, term223746.getClass(), "btn_se_vol2", -857876056);
        setIntField(term223746, term223746.getClass(), "sldr_se_vol2", 1392910876);
        setField(term223746, term223746.getClass(), "sort_kind", enum533);
        setIntField(term223746, term223746.getClass(), "lv_num", 1086383182);
        setIntField(term223746, term223746.getClass(), "lv_pnt", 1425319286);
        setField(term223746, term223746.getClass(), "lv_str", "UidjRWfqYK");
        setIntField(term223746, term223746.getClass(), "lv_efct_id", 1729919228);
        setIntField(term223746, term223746.getClass(), "lv_plt_id", 872351195);
        setField(term223746, term223746.getClass(), "mdl_eqp_ary", "SrmUNtssfz");
        setField(term223746, term223746.getClass(), "c_itm_eqp_ary", "ARMUeNVaDF");
        setField(term223746, term223746.getClass(), "ms_itm_flg_ary", "EUduJelZVE");
        setIntField(term223844, term223844.getClass(), "year", 2012);
        setShortField(term223844, term223844.getClass(), "month", (short) 5);
        setShortField(term223844, term223844.getClass(), "day", (short) 17);
        setField(term223843, term223843.getClass(), "date", term223844);
        setByteField(term223848, term223848.getClass(), "hour", (byte) 19);
        setByteField(term223848, term223848.getClass(), "minute", (byte) 36);
        setByteField(term223848, term223848.getClass(), "second", (byte) 33);
        setIntField(term223848, term223848.getClass(), "nano", 46625011);
        setField(term223843, term223843.getClass(), "time", term223848);
        setField(term223746, term223746.getClass(), "mdl_eqp_tm", term223843);
        setField(term223746, term223746.getClass(), "mdl_have", "uwfvHKGrlb");
        setField(term223746, term223746.getClass(), "cstmz_itm_have", "pSLljKyfgK");
        setBooleanField(term223746, term223746.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term223746, term223746.getClass(), "use_mdl_pri", false);
        setBooleanField(term223746, term223746.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term223746, term223746.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term223746, term223746.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term223746, term223746.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term223746, term223746.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term223746, term223746.getClass(), "vcld_pts", -1664328399);
        setIntField(term223746, term223746.getClass(), "nxt_pv_id", 1422430512);
        setField(term223746, term223746.getClass(), "nxt_dffclty", enum534);
        setField(term223746, term223746.getClass(), "nxt_edtn", enum535);
        setField(term223746, term223746.getClass(), "cv_cid", "JTQXicvesT");
        setField(term223746, term223746.getClass(), "cv_sc", "lfirJwUftT");
        setField(term223746, term223746.getClass(), "cv_rr", "oiIvvyhWbf");
        setField(term223746, term223746.getClass(), "cv_bv", "EhCoIxBpMd");
        setField(term223746, term223746.getClass(), "cv_bf", "bUOSwRmGmB");
        setIntField(term223746, term223746.getClass(), "cnp_cid", 1796581482);
        setIntField(term223746, term223746.getClass(), "cnp_val", 1286440081);
        setField(term223746, term223746.getClass(), "cnp_rr", enum536);
        setField(term223746, term223746.getClass(), "cnp_sp", "jJzyVCBtLl");
        setField(term223746, term223746.getClass(), "my_lst_0", "MZPPOYZzth");
        setField(term223746, term223746.getClass(), "my_lst_1", "pxFICtkwAB");
        setField(term223746, term223746.getClass(), "my_lst_2", "MrgAxXXbMg");
        setField(term223746, term223746.getClass(), "my_lst_3", "ZmwRRoQNPl");
        setField(term223746, term223746.getClass(), "my_lst_4", "prNciwKNKW");
        setField(term223746, term223746.getClass(), "dsp_clr_brdr", "VtfNPRNIuG");
        setBooleanField(term223746, term223746.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term223746, term223746.getClass(), "dsp_clr_sts", true);
        setField(term223746, term223746.getClass(), "clr_sts", "ttqikiUUcN");
        setBooleanField(term223746, term223746.getClass(), "rgo_sts", false);
        setField(term223746, term223746.getClass(), "my_qst_id", "NiLxAEvTVO");
        setField(term223746, term223746.getClass(), "my_qst_sts", "SffiObxUZK");
        setField(term223746, term223746.getClass(), "my_qst_prgrs", "uzPbXEJVpP");
        setField(term223746, term223746.getClass(), "my_qst_et", "vDorZRqjUi");
        setField(term223746, term223746.getClass(), "p_std_ie_have", "pTjttMNuyX");
        setField(term223746, term223746.getClass(), "p_std_se_have", "fFPyzrPhJi");
        setField(term223746, term223746.getClass(), "cmd", "tiYwzLkwHD");
        setField(term223746, term223746.getClass(), "req_id", "vHPMbWTklV");
        setField(term223746, term223746.getClass(), "stat", "phgJprcnjd");
        term224191 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term224191;
        callMethod(klass, "setDsp_clr_sts", argTypes, term223746, args);
    }

};


