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

public class StartResponse_getSortkind_64859403810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22719;

    public StartResponse_getSortkind_64859403810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23165 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term23164 = ((Class) term23165).getDeclaredField((String) "FAILED");
        ((Field) term23164).setAccessible(true);
        Object enum50 = ((Field) term23164).get((Object) null);
        Class<? extends Object> term23430 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term23429 = ((Class) term23430).getDeclaredField((String) "MY_LIST_B");
        ((Field) term23429).setAccessible(true);
        Object enum51 = ((Field) term23429).get((Object) null);
        Class<? extends Object> term23764 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term23763 = ((Class) term23764).getDeclaredField((String) "EXTREME");
        ((Field) term23763).setAccessible(true);
        Object enum52 = ((Field) term23763).get((Object) null);
        Class<? extends Object> term24042 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term24041 = ((Class) term24042).getDeclaredField((String) "ORIGINAL");
        ((Field) term24041).setAccessible(true);
        Object enum53 = ((Field) term24041).get((Object) null);
        Class<? extends Object> term24358 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term24357 = ((Class) term24358).getDeclaredField((String) "BRONZE");
        ((Field) term24357).setAccessible(true);
        Object enum54 = ((Field) term24357).get((Object) null);
        term22719 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term22816 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22817 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22821 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term22719, term22719.getClass(), "pd_id", 389427431);
        setField(term22719, term22719.getClass(), "start_result", enum50);
        setIntField(term22719, term22719.getClass(), "accept_idx", -1945706126);
        setIntField(term22719, term22719.getClass(), "start_idx", 1152356969);
        setField(term22719, term22719.getClass(), "player_name", "hulYxtowxw");
        setIntField(term22719, term22719.getClass(), "hp_vol", -1667990367);
        setBooleanField(term22719, term22719.getClass(), "btn_se_vol", true);
        setIntField(term22719, term22719.getClass(), "btn_se_vol2", -1214628358);
        setIntField(term22719, term22719.getClass(), "sldr_se_vol2", 1102721075);
        setField(term22719, term22719.getClass(), "sort_kind", enum51);
        setIntField(term22719, term22719.getClass(), "lv_num", -426764678);
        setIntField(term22719, term22719.getClass(), "lv_pnt", -1222614956);
        setField(term22719, term22719.getClass(), "lv_str", "GNEmuHPNcU");
        setIntField(term22719, term22719.getClass(), "lv_efct_id", -1870495012);
        setIntField(term22719, term22719.getClass(), "lv_plt_id", -1310015129);
        setField(term22719, term22719.getClass(), "mdl_eqp_ary", "IoSfuKDFRe");
        setField(term22719, term22719.getClass(), "c_itm_eqp_ary", "AWYyZiNfsm");
        setField(term22719, term22719.getClass(), "ms_itm_flg_ary", "ITRRYiuDwH");
        setIntField(term22817, term22817.getClass(), "year", 2019);
        setShortField(term22817, term22817.getClass(), "month", (short) 2);
        setShortField(term22817, term22817.getClass(), "day", (short) 21);
        setField(term22816, term22816.getClass(), "date", term22817);
        setByteField(term22821, term22821.getClass(), "hour", (byte) 5);
        setByteField(term22821, term22821.getClass(), "minute", (byte) 41);
        setByteField(term22821, term22821.getClass(), "second", (byte) 11);
        setIntField(term22821, term22821.getClass(), "nano", 859829782);
        setField(term22816, term22816.getClass(), "time", term22821);
        setField(term22719, term22719.getClass(), "mdl_eqp_tm", term22816);
        setField(term22719, term22719.getClass(), "mdl_have", "llRfwANcVF");
        setField(term22719, term22719.getClass(), "cstmz_itm_have", "sUEeHQTWkA");
        setBooleanField(term22719, term22719.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term22719, term22719.getClass(), "use_mdl_pri", true);
        setBooleanField(term22719, term22719.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term22719, term22719.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term22719, term22719.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term22719, term22719.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term22719, term22719.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term22719, term22719.getClass(), "vcld_pts", -2104981311);
        setIntField(term22719, term22719.getClass(), "nxt_pv_id", -571169753);
        setField(term22719, term22719.getClass(), "nxt_dffclty", enum52);
        setField(term22719, term22719.getClass(), "nxt_edtn", enum53);
        setField(term22719, term22719.getClass(), "cv_cid", "BDIRCxAWLA");
        setField(term22719, term22719.getClass(), "cv_sc", "eOJfbiZLnb");
        setField(term22719, term22719.getClass(), "cv_rr", "nKZKnxWYCK");
        setField(term22719, term22719.getClass(), "cv_bv", "JOqQxuzRuZ");
        setField(term22719, term22719.getClass(), "cv_bf", "RSaoipUlsg");
        setIntField(term22719, term22719.getClass(), "cnp_cid", 318591690);
        setIntField(term22719, term22719.getClass(), "cnp_val", -165587447);
        setField(term22719, term22719.getClass(), "cnp_rr", enum54);
        setField(term22719, term22719.getClass(), "cnp_sp", "cSHGbqKqlN");
        setField(term22719, term22719.getClass(), "my_lst_0", "pFAfANnxup");
        setField(term22719, term22719.getClass(), "my_lst_1", "FbSIUZyBXZ");
        setField(term22719, term22719.getClass(), "my_lst_2", "mhQDwIyrRi");
        setField(term22719, term22719.getClass(), "my_lst_3", "HpZXWDPhlg");
        setField(term22719, term22719.getClass(), "my_lst_4", "lBOokzEPfe");
        setField(term22719, term22719.getClass(), "dsp_clr_brdr", "dtGZCsKXbW");
        setBooleanField(term22719, term22719.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term22719, term22719.getClass(), "dsp_clr_sts", false);
        setField(term22719, term22719.getClass(), "clr_sts", "bdyhHbDAmJ");
        setBooleanField(term22719, term22719.getClass(), "rgo_sts", false);
        setField(term22719, term22719.getClass(), "my_qst_id", "BBXiTNHqGE");
        setField(term22719, term22719.getClass(), "my_qst_sts", "IEYhJmgCVd");
        setField(term22719, term22719.getClass(), "my_qst_prgrs", "KSJeYkkvpk");
        setField(term22719, term22719.getClass(), "my_qst_et", "qUtkFGMNUV");
        setField(term22719, term22719.getClass(), "p_std_ie_have", "mGRiYhnMcR");
        setField(term22719, term22719.getClass(), "p_std_se_have", "NFlvfJCVPO");
        setField(term22719, term22719.getClass(), "cmd", "KarbTXFmUU");
        setField(term22719, term22719.getClass(), "req_id", "jiUSjqwSIQ");
        setField(term22719, term22719.getClass(), "stat", "MgLCedQfoj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSort_kind", argTypes, term22719, args);
    }

};


