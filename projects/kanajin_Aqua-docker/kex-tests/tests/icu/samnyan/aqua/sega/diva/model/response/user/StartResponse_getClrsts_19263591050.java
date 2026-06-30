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

public class StartResponse_getClrsts_19263591050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105979;

    public StartResponse_getClrsts_19263591050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term106422 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term106421 = ((Class) term106422).getDeclaredField((String) "FAILED");
        ((Field) term106421).setAccessible(true);
        Object enum250 = ((Field) term106421).get((Object) null);
        Class<? extends Object> term106687 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term106686 = ((Class) term106687).getDeclaredField((String) "MY_LIST_B");
        ((Field) term106686).setAccessible(true);
        Object enum251 = ((Field) term106686).get((Object) null);
        Class<? extends Object> term107021 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term107020 = ((Class) term107021).getDeclaredField((String) "EASY");
        ((Field) term107020).setAccessible(true);
        Object enum252 = ((Field) term107020).get((Object) null);
        Class<? extends Object> term107290 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term107289 = ((Class) term107290).getDeclaredField((String) "ORIGINAL");
        ((Field) term107289).setAccessible(true);
        Object enum253 = ((Field) term107289).get((Object) null);
        Class<? extends Object> term107606 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term107605 = ((Class) term107606).getDeclaredField((String) "BRONZE");
        ((Field) term107605).setAccessible(true);
        Object enum254 = ((Field) term107605).get((Object) null);
        term105979 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term106076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term106081 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term105979, term105979.getClass(), "pd_id", -485108462);
        setField(term105979, term105979.getClass(), "start_result", enum250);
        setIntField(term105979, term105979.getClass(), "accept_idx", 1418551216);
        setIntField(term105979, term105979.getClass(), "start_idx", -626779272);
        setField(term105979, term105979.getClass(), "player_name", "iVRXRDCrcM");
        setIntField(term105979, term105979.getClass(), "hp_vol", -1150062870);
        setBooleanField(term105979, term105979.getClass(), "btn_se_vol", true);
        setIntField(term105979, term105979.getClass(), "btn_se_vol2", -886200503);
        setIntField(term105979, term105979.getClass(), "sldr_se_vol2", 1136393691);
        setField(term105979, term105979.getClass(), "sort_kind", enum251);
        setIntField(term105979, term105979.getClass(), "lv_num", -1288536479);
        setIntField(term105979, term105979.getClass(), "lv_pnt", 1092038167);
        setField(term105979, term105979.getClass(), "lv_str", "WAZFhrxcSM");
        setIntField(term105979, term105979.getClass(), "lv_efct_id", 1879729823);
        setIntField(term105979, term105979.getClass(), "lv_plt_id", 1443855558);
        setField(term105979, term105979.getClass(), "mdl_eqp_ary", "gCRUlTuVMX");
        setField(term105979, term105979.getClass(), "c_itm_eqp_ary", "tYBgGQtkhi");
        setField(term105979, term105979.getClass(), "ms_itm_flg_ary", "PhGPFLIMKH");
        setIntField(term106077, term106077.getClass(), "year", 2024);
        setShortField(term106077, term106077.getClass(), "month", (short) 5);
        setShortField(term106077, term106077.getClass(), "day", (short) 6);
        setField(term106076, term106076.getClass(), "date", term106077);
        setByteField(term106081, term106081.getClass(), "hour", (byte) 20);
        setByteField(term106081, term106081.getClass(), "minute", (byte) 14);
        setByteField(term106081, term106081.getClass(), "second", (byte) 27);
        setIntField(term106081, term106081.getClass(), "nano", 900636101);
        setField(term106076, term106076.getClass(), "time", term106081);
        setField(term105979, term105979.getClass(), "mdl_eqp_tm", term106076);
        setField(term105979, term105979.getClass(), "mdl_have", "pWCYcLhoms");
        setField(term105979, term105979.getClass(), "cstmz_itm_have", "IWNJVfvTuw");
        setBooleanField(term105979, term105979.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term105979, term105979.getClass(), "use_mdl_pri", false);
        setBooleanField(term105979, term105979.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term105979, term105979.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term105979, term105979.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term105979, term105979.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term105979, term105979.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term105979, term105979.getClass(), "vcld_pts", -1933419449);
        setIntField(term105979, term105979.getClass(), "nxt_pv_id", -1804322375);
        setField(term105979, term105979.getClass(), "nxt_dffclty", enum252);
        setField(term105979, term105979.getClass(), "nxt_edtn", enum253);
        setField(term105979, term105979.getClass(), "cv_cid", "DLpKfwPpvr");
        setField(term105979, term105979.getClass(), "cv_sc", "DLFXidLbuT");
        setField(term105979, term105979.getClass(), "cv_rr", "FjkxfTXGIH");
        setField(term105979, term105979.getClass(), "cv_bv", "KJkWSFFnmR");
        setField(term105979, term105979.getClass(), "cv_bf", "FBYRIDZvmW");
        setIntField(term105979, term105979.getClass(), "cnp_cid", 1595814906);
        setIntField(term105979, term105979.getClass(), "cnp_val", -834193529);
        setField(term105979, term105979.getClass(), "cnp_rr", enum254);
        setField(term105979, term105979.getClass(), "cnp_sp", "IyjLfrDZrV");
        setField(term105979, term105979.getClass(), "my_lst_0", "BRMTHqqoRg");
        setField(term105979, term105979.getClass(), "my_lst_1", "nOElYZBeyU");
        setField(term105979, term105979.getClass(), "my_lst_2", "eUXPtGmoNg");
        setField(term105979, term105979.getClass(), "my_lst_3", "ZjqXyUmAJY");
        setField(term105979, term105979.getClass(), "my_lst_4", "pjEERkBbYo");
        setField(term105979, term105979.getClass(), "dsp_clr_brdr", "FQPqmjhWog");
        setBooleanField(term105979, term105979.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term105979, term105979.getClass(), "dsp_clr_sts", false);
        setField(term105979, term105979.getClass(), "clr_sts", "sYtJsiIiSX");
        setBooleanField(term105979, term105979.getClass(), "rgo_sts", true);
        setField(term105979, term105979.getClass(), "my_qst_id", "KgfsAwTFFn");
        setField(term105979, term105979.getClass(), "my_qst_sts", "hFnFlgThhp");
        setField(term105979, term105979.getClass(), "my_qst_prgrs", "aEZAnHuGSR");
        setField(term105979, term105979.getClass(), "my_qst_et", "uMzGGnJFYF");
        setField(term105979, term105979.getClass(), "p_std_ie_have", "iAIRLRjFkP");
        setField(term105979, term105979.getClass(), "p_std_se_have", "cdXvvxXVTz");
        setField(term105979, term105979.getClass(), "cmd", "tXsfWIqIPn");
        setField(term105979, term105979.getClass(), "req_id", "tDmfqEyHaN");
        setField(term105979, term105979.getClass(), "stat", "mTSMXFkWRr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClr_sts", argTypes, term105979, args);
    }

};


