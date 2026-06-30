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

public class StartResponse_getMylst0_150609529742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89367;

    public StartResponse_getMylst0_150609529742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term89809 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term89808 = ((Class) term89809).getDeclaredField((String) "SUCCESS");
        ((Field) term89808).setAccessible(true);
        Object enum210 = ((Field) term89808).get((Object) null);
        Class<? extends Object> term90077 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term90076 = ((Class) term90077).getDeclaredField((String) "MY_LIST_B");
        ((Field) term90076).setAccessible(true);
        Object enum211 = ((Field) term90076).get((Object) null);
        Class<? extends Object> term90411 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term90410 = ((Class) term90411).getDeclaredField((String) "EXTREME");
        ((Field) term90410).setAccessible(true);
        Object enum212 = ((Field) term90410).get((Object) null);
        Class<? extends Object> term90689 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term90688 = ((Class) term90689).getDeclaredField((String) "EXTRA");
        ((Field) term90688).setAccessible(true);
        Object enum213 = ((Field) term90688).get((Object) null);
        Class<? extends Object> term90996 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term90995 = ((Class) term90996).getDeclaredField((String) "GOLD");
        ((Field) term90995).setAccessible(true);
        Object enum214 = ((Field) term90995).get((Object) null);
        term89367 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term89465 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89466 = newInstance(Class.forName("java.time.LocalDate"));
        Object term89470 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term89367, term89367.getClass(), "pd_id", -43719302);
        setField(term89367, term89367.getClass(), "start_result", enum210);
        setIntField(term89367, term89367.getClass(), "accept_idx", 1024134939);
        setIntField(term89367, term89367.getClass(), "start_idx", 109078154);
        setField(term89367, term89367.getClass(), "player_name", "HZODpafOGe");
        setIntField(term89367, term89367.getClass(), "hp_vol", -314165467);
        setBooleanField(term89367, term89367.getClass(), "btn_se_vol", true);
        setIntField(term89367, term89367.getClass(), "btn_se_vol2", 963694071);
        setIntField(term89367, term89367.getClass(), "sldr_se_vol2", -995785731);
        setField(term89367, term89367.getClass(), "sort_kind", enum211);
        setIntField(term89367, term89367.getClass(), "lv_num", 1349815364);
        setIntField(term89367, term89367.getClass(), "lv_pnt", 2128383340);
        setField(term89367, term89367.getClass(), "lv_str", "dUTYEKtTfQ");
        setIntField(term89367, term89367.getClass(), "lv_efct_id", 1238598518);
        setIntField(term89367, term89367.getClass(), "lv_plt_id", -558146961);
        setField(term89367, term89367.getClass(), "mdl_eqp_ary", "HUtbHklGel");
        setField(term89367, term89367.getClass(), "c_itm_eqp_ary", "QbfKDAwhSB");
        setField(term89367, term89367.getClass(), "ms_itm_flg_ary", "ckTRHEIcCK");
        setIntField(term89466, term89466.getClass(), "year", 2020);
        setShortField(term89466, term89466.getClass(), "month", (short) 8);
        setShortField(term89466, term89466.getClass(), "day", (short) 15);
        setField(term89465, term89465.getClass(), "date", term89466);
        setByteField(term89470, term89470.getClass(), "hour", (byte) 2);
        setByteField(term89470, term89470.getClass(), "minute", (byte) 0);
        setByteField(term89470, term89470.getClass(), "second", (byte) 38);
        setIntField(term89470, term89470.getClass(), "nano", 146431486);
        setField(term89465, term89465.getClass(), "time", term89470);
        setField(term89367, term89367.getClass(), "mdl_eqp_tm", term89465);
        setField(term89367, term89367.getClass(), "mdl_have", "NYSBqIpNlD");
        setField(term89367, term89367.getClass(), "cstmz_itm_have", "OWglDUWQYb");
        setBooleanField(term89367, term89367.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term89367, term89367.getClass(), "use_mdl_pri", true);
        setBooleanField(term89367, term89367.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term89367, term89367.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term89367, term89367.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term89367, term89367.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term89367, term89367.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term89367, term89367.getClass(), "vcld_pts", 1505480070);
        setIntField(term89367, term89367.getClass(), "nxt_pv_id", -829088844);
        setField(term89367, term89367.getClass(), "nxt_dffclty", enum212);
        setField(term89367, term89367.getClass(), "nxt_edtn", enum213);
        setField(term89367, term89367.getClass(), "cv_cid", "FiqETbKjpv");
        setField(term89367, term89367.getClass(), "cv_sc", "FxXtdhhXyS");
        setField(term89367, term89367.getClass(), "cv_rr", "HxCEzaCcgj");
        setField(term89367, term89367.getClass(), "cv_bv", "PDYPOQncAB");
        setField(term89367, term89367.getClass(), "cv_bf", "cHqLMqZSmc");
        setIntField(term89367, term89367.getClass(), "cnp_cid", -31751777);
        setIntField(term89367, term89367.getClass(), "cnp_val", -246967963);
        setField(term89367, term89367.getClass(), "cnp_rr", enum214);
        setField(term89367, term89367.getClass(), "cnp_sp", "hkWmAkXSOW");
        setField(term89367, term89367.getClass(), "my_lst_0", "DwQmZEKeOp");
        setField(term89367, term89367.getClass(), "my_lst_1", "DbxrFiyttv");
        setField(term89367, term89367.getClass(), "my_lst_2", "iVIrSxTsaM");
        setField(term89367, term89367.getClass(), "my_lst_3", "FmJNEfmYgq");
        setField(term89367, term89367.getClass(), "my_lst_4", "NqQofgWsJd");
        setField(term89367, term89367.getClass(), "dsp_clr_brdr", "ZlVRdHsBMO");
        setBooleanField(term89367, term89367.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term89367, term89367.getClass(), "dsp_clr_sts", false);
        setField(term89367, term89367.getClass(), "clr_sts", "UMMXkhuqzw");
        setBooleanField(term89367, term89367.getClass(), "rgo_sts", true);
        setField(term89367, term89367.getClass(), "my_qst_id", "KyGXZcXJwq");
        setField(term89367, term89367.getClass(), "my_qst_sts", "TqiCjeuoWE");
        setField(term89367, term89367.getClass(), "my_qst_prgrs", "GWWfkXOYLP");
        setField(term89367, term89367.getClass(), "my_qst_et", "qvykDllgpT");
        setField(term89367, term89367.getClass(), "p_std_ie_have", "hzdUbcLZhZ");
        setField(term89367, term89367.getClass(), "p_std_se_have", "GlxnEJvYeC");
        setField(term89367, term89367.getClass(), "cmd", "SLdOGaqmNv");
        setField(term89367, term89367.getClass(), "req_id", "QZfhwDBzyR");
        setField(term89367, term89367.getClass(), "stat", "HvnMmAOZev");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_lst_0", argTypes, term89367, args);
    }

};


