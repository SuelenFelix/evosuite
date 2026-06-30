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

public class StartResponse_isRgosts_66485949051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108065;

    public StartResponse_isRgosts_66485949051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term108512 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term108511 = ((Class) term108512).getDeclaredField((String) "FAILED");
        ((Field) term108511).setAccessible(true);
        Object enum255 = ((Field) term108511).get((Object) null);
        Class<? extends Object> term108777 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term108776 = ((Class) term108777).getDeclaredField((String) "COMPLEXITY");
        ((Field) term108776).setAccessible(true);
        Object enum256 = ((Field) term108776).get((Object) null);
        Class<? extends Object> term109114 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term109113 = ((Class) term109114).getDeclaredField((String) "UNDEFINED");
        ((Field) term109113).setAccessible(true);
        Object enum257 = ((Field) term109113).get((Object) null);
        Class<? extends Object> term109398 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term109397 = ((Class) term109398).getDeclaredField((String) "ORIGINAL");
        ((Field) term109397).setAccessible(true);
        Object enum258 = ((Field) term109397).get((Object) null);
        Class<? extends Object> term109714 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term109713 = ((Class) term109714).getDeclaredField((String) "NONE");
        ((Field) term109713).setAccessible(true);
        Object enum259 = ((Field) term109713).get((Object) null);
        term108065 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term108163 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108164 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108168 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term108065, term108065.getClass(), "pd_id", 335780735);
        setField(term108065, term108065.getClass(), "start_result", enum255);
        setIntField(term108065, term108065.getClass(), "accept_idx", -1541981599);
        setIntField(term108065, term108065.getClass(), "start_idx", 1605456363);
        setField(term108065, term108065.getClass(), "player_name", "qdIiMKwfzT");
        setIntField(term108065, term108065.getClass(), "hp_vol", 2059896693);
        setBooleanField(term108065, term108065.getClass(), "btn_se_vol", false);
        setIntField(term108065, term108065.getClass(), "btn_se_vol2", 2109912812);
        setIntField(term108065, term108065.getClass(), "sldr_se_vol2", 1841286431);
        setField(term108065, term108065.getClass(), "sort_kind", enum256);
        setIntField(term108065, term108065.getClass(), "lv_num", -1723168189);
        setIntField(term108065, term108065.getClass(), "lv_pnt", -675283917);
        setField(term108065, term108065.getClass(), "lv_str", "qrmUWIxufo");
        setIntField(term108065, term108065.getClass(), "lv_efct_id", -2093862988);
        setIntField(term108065, term108065.getClass(), "lv_plt_id", 1337828646);
        setField(term108065, term108065.getClass(), "mdl_eqp_ary", "SeWCUkXfZv");
        setField(term108065, term108065.getClass(), "c_itm_eqp_ary", "woQcQRYwNH");
        setField(term108065, term108065.getClass(), "ms_itm_flg_ary", "uQjzusifTg");
        setIntField(term108164, term108164.getClass(), "year", 2021);
        setShortField(term108164, term108164.getClass(), "month", (short) 4);
        setShortField(term108164, term108164.getClass(), "day", (short) 17);
        setField(term108163, term108163.getClass(), "date", term108164);
        setByteField(term108168, term108168.getClass(), "hour", (byte) 4);
        setByteField(term108168, term108168.getClass(), "minute", (byte) 11);
        setByteField(term108168, term108168.getClass(), "second", (byte) 16);
        setIntField(term108168, term108168.getClass(), "nano", 509895858);
        setField(term108163, term108163.getClass(), "time", term108168);
        setField(term108065, term108065.getClass(), "mdl_eqp_tm", term108163);
        setField(term108065, term108065.getClass(), "mdl_have", "mOulGkUjOk");
        setField(term108065, term108065.getClass(), "cstmz_itm_have", "hNWRuNEgOf");
        setBooleanField(term108065, term108065.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term108065, term108065.getClass(), "use_mdl_pri", false);
        setBooleanField(term108065, term108065.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term108065, term108065.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term108065, term108065.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term108065, term108065.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term108065, term108065.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term108065, term108065.getClass(), "vcld_pts", 532666604);
        setIntField(term108065, term108065.getClass(), "nxt_pv_id", -13725716);
        setField(term108065, term108065.getClass(), "nxt_dffclty", enum257);
        setField(term108065, term108065.getClass(), "nxt_edtn", enum258);
        setField(term108065, term108065.getClass(), "cv_cid", "CEtjGBplmv");
        setField(term108065, term108065.getClass(), "cv_sc", "XosDTAzIAT");
        setField(term108065, term108065.getClass(), "cv_rr", "lcCEhCpiZM");
        setField(term108065, term108065.getClass(), "cv_bv", "OPJlqMJxdq");
        setField(term108065, term108065.getClass(), "cv_bf", "COhzwXcfds");
        setIntField(term108065, term108065.getClass(), "cnp_cid", -1695750603);
        setIntField(term108065, term108065.getClass(), "cnp_val", 63677360);
        setField(term108065, term108065.getClass(), "cnp_rr", enum259);
        setField(term108065, term108065.getClass(), "cnp_sp", "anncJTnzrg");
        setField(term108065, term108065.getClass(), "my_lst_0", "GMylOocLnB");
        setField(term108065, term108065.getClass(), "my_lst_1", "spOehuHwSl");
        setField(term108065, term108065.getClass(), "my_lst_2", "cyobgydTWP");
        setField(term108065, term108065.getClass(), "my_lst_3", "moHYQFfLnp");
        setField(term108065, term108065.getClass(), "my_lst_4", "BrPqlvIbEQ");
        setField(term108065, term108065.getClass(), "dsp_clr_brdr", "JDTrhGRsDT");
        setBooleanField(term108065, term108065.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term108065, term108065.getClass(), "dsp_clr_sts", true);
        setField(term108065, term108065.getClass(), "clr_sts", "vHxsVQImjS");
        setBooleanField(term108065, term108065.getClass(), "rgo_sts", true);
        setField(term108065, term108065.getClass(), "my_qst_id", "jkVaRrZHQX");
        setField(term108065, term108065.getClass(), "my_qst_sts", "gSFFUuJipG");
        setField(term108065, term108065.getClass(), "my_qst_prgrs", "bQWfIFvxkQ");
        setField(term108065, term108065.getClass(), "my_qst_et", "aDoBLXfFQI");
        setField(term108065, term108065.getClass(), "p_std_ie_have", "HTimNhSNVi");
        setField(term108065, term108065.getClass(), "p_std_se_have", "IWJWbrHcqm");
        setField(term108065, term108065.getClass(), "cmd", "ucTcadpUdW");
        setField(term108065, term108065.getClass(), "req_id", "AscVKZhCwm");
        setField(term108065, term108065.getClass(), "stat", "HCvSsQWjLn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRgo_sts", argTypes, term108065, args);
    }

};


