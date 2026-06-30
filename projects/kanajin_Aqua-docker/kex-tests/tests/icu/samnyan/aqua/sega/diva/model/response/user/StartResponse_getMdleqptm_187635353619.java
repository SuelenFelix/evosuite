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

public class StartResponse_getMdleqptm_187635353619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41513;

    public StartResponse_getMdleqptm_187635353619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41949 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term41948 = ((Class) term41949).getDeclaredField((String) "FAILED");
        ((Field) term41948).setAccessible(true);
        Object enum95 = ((Field) term41948).get((Object) null);
        Class<? extends Object> term42214 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term42213 = ((Class) term42214).getDeclaredField((String) "NAME");
        ((Field) term42213).setAccessible(true);
        Object enum96 = ((Field) term42213).get((Object) null);
        Class<? extends Object> term42533 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term42532 = ((Class) term42533).getDeclaredField((String) "HARD");
        ((Field) term42532).setAccessible(true);
        Object enum97 = ((Field) term42532).get((Object) null);
        Class<? extends Object> term42802 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term42801 = ((Class) term42802).getDeclaredField((String) "ORIGINAL");
        ((Field) term42801).setAccessible(true);
        Object enum98 = ((Field) term42801).get((Object) null);
        Class<? extends Object> term43118 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term43117 = ((Class) term43118).getDeclaredField((String) "NONE");
        ((Field) term43117).setAccessible(true);
        Object enum99 = ((Field) term43117).get((Object) null);
        term41513 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term41605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41610 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term41513, term41513.getClass(), "pd_id", -648200466);
        setField(term41513, term41513.getClass(), "start_result", enum95);
        setIntField(term41513, term41513.getClass(), "accept_idx", 2007134147);
        setIntField(term41513, term41513.getClass(), "start_idx", 993388358);
        setField(term41513, term41513.getClass(), "player_name", "UBPHmOICBs");
        setIntField(term41513, term41513.getClass(), "hp_vol", -765191335);
        setBooleanField(term41513, term41513.getClass(), "btn_se_vol", true);
        setIntField(term41513, term41513.getClass(), "btn_se_vol2", -1697741155);
        setIntField(term41513, term41513.getClass(), "sldr_se_vol2", 1295839803);
        setField(term41513, term41513.getClass(), "sort_kind", enum96);
        setIntField(term41513, term41513.getClass(), "lv_num", -1891015523);
        setIntField(term41513, term41513.getClass(), "lv_pnt", -1560631747);
        setField(term41513, term41513.getClass(), "lv_str", "IDJUVPgUJf");
        setIntField(term41513, term41513.getClass(), "lv_efct_id", 1215150180);
        setIntField(term41513, term41513.getClass(), "lv_plt_id", -1422859977);
        setField(term41513, term41513.getClass(), "mdl_eqp_ary", "JmnWRJUxGr");
        setField(term41513, term41513.getClass(), "c_itm_eqp_ary", "wgRGBNrTGP");
        setField(term41513, term41513.getClass(), "ms_itm_flg_ary", "FIdNVptZpW");
        setIntField(term41606, term41606.getClass(), "year", 2020);
        setShortField(term41606, term41606.getClass(), "month", (short) 7);
        setShortField(term41606, term41606.getClass(), "day", (short) 24);
        setField(term41605, term41605.getClass(), "date", term41606);
        setByteField(term41610, term41610.getClass(), "hour", (byte) 0);
        setByteField(term41610, term41610.getClass(), "minute", (byte) 59);
        setByteField(term41610, term41610.getClass(), "second", (byte) 56);
        setIntField(term41610, term41610.getClass(), "nano", 320219201);
        setField(term41605, term41605.getClass(), "time", term41610);
        setField(term41513, term41513.getClass(), "mdl_eqp_tm", term41605);
        setField(term41513, term41513.getClass(), "mdl_have", "rQjxAhisjm");
        setField(term41513, term41513.getClass(), "cstmz_itm_have", "ZDhASPHjDG");
        setBooleanField(term41513, term41513.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term41513, term41513.getClass(), "use_mdl_pri", false);
        setBooleanField(term41513, term41513.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term41513, term41513.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term41513, term41513.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term41513, term41513.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term41513, term41513.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term41513, term41513.getClass(), "vcld_pts", -1972436591);
        setIntField(term41513, term41513.getClass(), "nxt_pv_id", 68922753);
        setField(term41513, term41513.getClass(), "nxt_dffclty", enum97);
        setField(term41513, term41513.getClass(), "nxt_edtn", enum98);
        setField(term41513, term41513.getClass(), "cv_cid", "HNVOAXYNEZ");
        setField(term41513, term41513.getClass(), "cv_sc", "gbbYBYyfvr");
        setField(term41513, term41513.getClass(), "cv_rr", "SrWMUlbtWV");
        setField(term41513, term41513.getClass(), "cv_bv", "VePIumgrrU");
        setField(term41513, term41513.getClass(), "cv_bf", "DPwIqlszZo");
        setIntField(term41513, term41513.getClass(), "cnp_cid", -220791533);
        setIntField(term41513, term41513.getClass(), "cnp_val", 1741500243);
        setField(term41513, term41513.getClass(), "cnp_rr", enum99);
        setField(term41513, term41513.getClass(), "cnp_sp", "mNgDshwZNc");
        setField(term41513, term41513.getClass(), "my_lst_0", "pDqgDbJoFw");
        setField(term41513, term41513.getClass(), "my_lst_1", "iVOvTzOxwt");
        setField(term41513, term41513.getClass(), "my_lst_2", "BjZQdecXvB");
        setField(term41513, term41513.getClass(), "my_lst_3", "iUkOOQhEkw");
        setField(term41513, term41513.getClass(), "my_lst_4", "wmVoFoUVmU");
        setField(term41513, term41513.getClass(), "dsp_clr_brdr", "lLiSiPCciB");
        setBooleanField(term41513, term41513.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term41513, term41513.getClass(), "dsp_clr_sts", false);
        setField(term41513, term41513.getClass(), "clr_sts", "PsMKIIEwdR");
        setBooleanField(term41513, term41513.getClass(), "rgo_sts", false);
        setField(term41513, term41513.getClass(), "my_qst_id", "RbQmXqfXAT");
        setField(term41513, term41513.getClass(), "my_qst_sts", "fcCAsvfBbe");
        setField(term41513, term41513.getClass(), "my_qst_prgrs", "mUNcKUxghj");
        setField(term41513, term41513.getClass(), "my_qst_et", "lnvLKbtveE");
        setField(term41513, term41513.getClass(), "p_std_ie_have", "FfrrEhTHzQ");
        setField(term41513, term41513.getClass(), "p_std_se_have", "LXnDNrMsqT");
        setField(term41513, term41513.getClass(), "cmd", "ZLQamJFBmu");
        setField(term41513, term41513.getClass(), "req_id", "ZWcOCwKNvd");
        setField(term41513, term41513.getClass(), "stat", "GTmoNrziyc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMdl_eqp_tm", argTypes, term41513, args);
    }

};


