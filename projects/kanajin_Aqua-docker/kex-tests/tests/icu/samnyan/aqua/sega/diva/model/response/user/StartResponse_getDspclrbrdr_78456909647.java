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

public class StartResponse_getDspclrbrdr_78456909647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99733;

    public StartResponse_getDspclrbrdr_78456909647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term100176 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term100175 = ((Class) term100176).getDeclaredField((String) "SUCCESS");
        ((Field) term100175).setAccessible(true);
        Object enum235 = ((Field) term100175).get((Object) null);
        Class<? extends Object> term100444 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term100443 = ((Class) term100444).getDeclaredField((String) "MY_LIST_B");
        ((Field) term100443).setAccessible(true);
        Object enum236 = ((Field) term100443).get((Object) null);
        Class<? extends Object> term100778 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term100777 = ((Class) term100778).getDeclaredField((String) "NORMAL");
        ((Field) term100777).setAccessible(true);
        Object enum237 = ((Field) term100777).get((Object) null);
        Class<? extends Object> term101053 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term101052 = ((Class) term101053).getDeclaredField((String) "EXTRA");
        ((Field) term101052).setAccessible(true);
        Object enum238 = ((Field) term101052).get((Object) null);
        Class<? extends Object> term101360 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term101359 = ((Class) term101360).getDeclaredField((String) "SILVER");
        ((Field) term101359).setAccessible(true);
        Object enum239 = ((Field) term101359).get((Object) null);
        term99733 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term99831 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99832 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99836 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term99733, term99733.getClass(), "pd_id", 1059930704);
        setField(term99733, term99733.getClass(), "start_result", enum235);
        setIntField(term99733, term99733.getClass(), "accept_idx", -1967153290);
        setIntField(term99733, term99733.getClass(), "start_idx", -1397251956);
        setField(term99733, term99733.getClass(), "player_name", "zzsdNZhejE");
        setIntField(term99733, term99733.getClass(), "hp_vol", -796934571);
        setBooleanField(term99733, term99733.getClass(), "btn_se_vol", false);
        setIntField(term99733, term99733.getClass(), "btn_se_vol2", 405295896);
        setIntField(term99733, term99733.getClass(), "sldr_se_vol2", -814977075);
        setField(term99733, term99733.getClass(), "sort_kind", enum236);
        setIntField(term99733, term99733.getClass(), "lv_num", 808614267);
        setIntField(term99733, term99733.getClass(), "lv_pnt", 1611734632);
        setField(term99733, term99733.getClass(), "lv_str", "ILoodMZrgR");
        setIntField(term99733, term99733.getClass(), "lv_efct_id", 868908117);
        setIntField(term99733, term99733.getClass(), "lv_plt_id", 1789351397);
        setField(term99733, term99733.getClass(), "mdl_eqp_ary", "XQiKmsCacK");
        setField(term99733, term99733.getClass(), "c_itm_eqp_ary", "cTCixEbHYT");
        setField(term99733, term99733.getClass(), "ms_itm_flg_ary", "bqKksqtAdT");
        setIntField(term99832, term99832.getClass(), "year", 2013);
        setShortField(term99832, term99832.getClass(), "month", (short) 5);
        setShortField(term99832, term99832.getClass(), "day", (short) 26);
        setField(term99831, term99831.getClass(), "date", term99832);
        setByteField(term99836, term99836.getClass(), "hour", (byte) 4);
        setByteField(term99836, term99836.getClass(), "minute", (byte) 39);
        setByteField(term99836, term99836.getClass(), "second", (byte) 5);
        setIntField(term99836, term99836.getClass(), "nano", 392869354);
        setField(term99831, term99831.getClass(), "time", term99836);
        setField(term99733, term99733.getClass(), "mdl_eqp_tm", term99831);
        setField(term99733, term99733.getClass(), "mdl_have", "jAIAdEmULK");
        setField(term99733, term99733.getClass(), "cstmz_itm_have", "EuAshkmbna");
        setBooleanField(term99733, term99733.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term99733, term99733.getClass(), "use_mdl_pri", true);
        setBooleanField(term99733, term99733.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term99733, term99733.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term99733, term99733.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term99733, term99733.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term99733, term99733.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term99733, term99733.getClass(), "vcld_pts", 2145528170);
        setIntField(term99733, term99733.getClass(), "nxt_pv_id", -585773976);
        setField(term99733, term99733.getClass(), "nxt_dffclty", enum237);
        setField(term99733, term99733.getClass(), "nxt_edtn", enum238);
        setField(term99733, term99733.getClass(), "cv_cid", "JwQlbBbGJR");
        setField(term99733, term99733.getClass(), "cv_sc", "HdWLwfVsAM");
        setField(term99733, term99733.getClass(), "cv_rr", "SxeKEdHXSl");
        setField(term99733, term99733.getClass(), "cv_bv", "BCAlJpNjIX");
        setField(term99733, term99733.getClass(), "cv_bf", "PKClfBAwUr");
        setIntField(term99733, term99733.getClass(), "cnp_cid", 852806940);
        setIntField(term99733, term99733.getClass(), "cnp_val", 698551724);
        setField(term99733, term99733.getClass(), "cnp_rr", enum239);
        setField(term99733, term99733.getClass(), "cnp_sp", "JqbKrmVEMy");
        setField(term99733, term99733.getClass(), "my_lst_0", "VygCEWaefB");
        setField(term99733, term99733.getClass(), "my_lst_1", "PqhYfEyDDA");
        setField(term99733, term99733.getClass(), "my_lst_2", "fSLHLeuNoa");
        setField(term99733, term99733.getClass(), "my_lst_3", "IwgPFurObw");
        setField(term99733, term99733.getClass(), "my_lst_4", "WLaHlrYQyz");
        setField(term99733, term99733.getClass(), "dsp_clr_brdr", "CaeIUTuUFo");
        setBooleanField(term99733, term99733.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term99733, term99733.getClass(), "dsp_clr_sts", false);
        setField(term99733, term99733.getClass(), "clr_sts", "rzoDGjHkzG");
        setBooleanField(term99733, term99733.getClass(), "rgo_sts", true);
        setField(term99733, term99733.getClass(), "my_qst_id", "NsphHxYiuC");
        setField(term99733, term99733.getClass(), "my_qst_sts", "XYJztkznbY");
        setField(term99733, term99733.getClass(), "my_qst_prgrs", "NeTiWVoyjZ");
        setField(term99733, term99733.getClass(), "my_qst_et", "CGeclMyIOP");
        setField(term99733, term99733.getClass(), "p_std_ie_have", "yyWOYvIBsp");
        setField(term99733, term99733.getClass(), "p_std_se_have", "mmpgARMYFV");
        setField(term99733, term99733.getClass(), "cmd", "NUqhsZprdZ");
        setField(term99733, term99733.getClass(), "req_id", "jkzgCqWJrA");
        setField(term99733, term99733.getClass(), "stat", "rawiXxuyRn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDsp_clr_brdr", argTypes, term99733, args);
    }

};


