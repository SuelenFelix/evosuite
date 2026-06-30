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

public class StartResponse_setMyqstet_643970727112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236374;

    public StartResponse_setMyqstet_643970727112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term236834 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term236833 = ((Class) term236834).getDeclaredField((String) "FAILED");
        ((Field) term236833).setAccessible(true);
        Object enum562 = ((Field) term236833).get((Object) null);
        Class<? extends Object> term237099 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term237098 = ((Class) term237099).getDeclaredField((String) "MY_LIST_A");
        ((Field) term237098).setAccessible(true);
        Object enum563 = ((Field) term237098).get((Object) null);
        Class<? extends Object> term237433 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term237432 = ((Class) term237433).getDeclaredField((String) "UNDEFINED");
        ((Field) term237432).setAccessible(true);
        Object enum564 = ((Field) term237432).get((Object) null);
        Class<? extends Object> term237717 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term237716 = ((Class) term237717).getDeclaredField((String) "ORIGINAL");
        ((Field) term237716).setAccessible(true);
        Object enum565 = ((Field) term237716).get((Object) null);
        Class<? extends Object> term238033 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term238032 = ((Class) term238033).getDeclaredField((String) "BRONZE");
        ((Field) term238032).setAccessible(true);
        Object enum566 = ((Field) term238032).get((Object) null);
        term236374 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term236471 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term236472 = newInstance(Class.forName("java.time.LocalDate"));
        Object term236476 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term236374, term236374.getClass(), "pd_id", 1179937517);
        setField(term236374, term236374.getClass(), "start_result", enum562);
        setIntField(term236374, term236374.getClass(), "accept_idx", 200150950);
        setIntField(term236374, term236374.getClass(), "start_idx", -366198044);
        setField(term236374, term236374.getClass(), "player_name", "abnCcSSxwb");
        setIntField(term236374, term236374.getClass(), "hp_vol", -1350380769);
        setBooleanField(term236374, term236374.getClass(), "btn_se_vol", true);
        setIntField(term236374, term236374.getClass(), "btn_se_vol2", -1432215030);
        setIntField(term236374, term236374.getClass(), "sldr_se_vol2", 1233186320);
        setField(term236374, term236374.getClass(), "sort_kind", enum563);
        setIntField(term236374, term236374.getClass(), "lv_num", -1303269101);
        setIntField(term236374, term236374.getClass(), "lv_pnt", 1435572720);
        setField(term236374, term236374.getClass(), "lv_str", "PMbUpRmZHC");
        setIntField(term236374, term236374.getClass(), "lv_efct_id", 1437618365);
        setIntField(term236374, term236374.getClass(), "lv_plt_id", 1122535239);
        setField(term236374, term236374.getClass(), "mdl_eqp_ary", "VGeGoUWPCQ");
        setField(term236374, term236374.getClass(), "c_itm_eqp_ary", "ZjkLeKLILi");
        setField(term236374, term236374.getClass(), "ms_itm_flg_ary", "CZAqWlBJTT");
        setIntField(term236472, term236472.getClass(), "year", 2021);
        setShortField(term236472, term236472.getClass(), "month", (short) 4);
        setShortField(term236472, term236472.getClass(), "day", (short) 22);
        setField(term236471, term236471.getClass(), "date", term236472);
        setByteField(term236476, term236476.getClass(), "hour", (byte) 17);
        setByteField(term236476, term236476.getClass(), "minute", (byte) 6);
        setByteField(term236476, term236476.getClass(), "second", (byte) 33);
        setIntField(term236476, term236476.getClass(), "nano", 21410850);
        setField(term236471, term236471.getClass(), "time", term236476);
        setField(term236374, term236374.getClass(), "mdl_eqp_tm", term236471);
        setField(term236374, term236374.getClass(), "mdl_have", "WPMnhxMKAm");
        setField(term236374, term236374.getClass(), "cstmz_itm_have", "tTGimFVzYt");
        setBooleanField(term236374, term236374.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term236374, term236374.getClass(), "use_mdl_pri", false);
        setBooleanField(term236374, term236374.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term236374, term236374.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term236374, term236374.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term236374, term236374.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term236374, term236374.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term236374, term236374.getClass(), "vcld_pts", 1158923260);
        setIntField(term236374, term236374.getClass(), "nxt_pv_id", 1633508772);
        setField(term236374, term236374.getClass(), "nxt_dffclty", enum564);
        setField(term236374, term236374.getClass(), "nxt_edtn", enum565);
        setField(term236374, term236374.getClass(), "cv_cid", "bkFWSyioMj");
        setField(term236374, term236374.getClass(), "cv_sc", "XBzdZXeLDL");
        setField(term236374, term236374.getClass(), "cv_rr", "eTycxkowtY");
        setField(term236374, term236374.getClass(), "cv_bv", "ozlrFdNXle");
        setField(term236374, term236374.getClass(), "cv_bf", "vjUObaeMjo");
        setIntField(term236374, term236374.getClass(), "cnp_cid", -545275970);
        setIntField(term236374, term236374.getClass(), "cnp_val", 1355471365);
        setField(term236374, term236374.getClass(), "cnp_rr", enum566);
        setField(term236374, term236374.getClass(), "cnp_sp", "JsIgccyWag");
        setField(term236374, term236374.getClass(), "my_lst_0", "qSfmbHSpyF");
        setField(term236374, term236374.getClass(), "my_lst_1", "nfLAMGBNLz");
        setField(term236374, term236374.getClass(), "my_lst_2", "uMLxdkYOdc");
        setField(term236374, term236374.getClass(), "my_lst_3", "oRXjZDPrtE");
        setField(term236374, term236374.getClass(), "my_lst_4", "UYdKOLuJyq");
        setField(term236374, term236374.getClass(), "dsp_clr_brdr", "WzRmLCtUaL");
        setBooleanField(term236374, term236374.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term236374, term236374.getClass(), "dsp_clr_sts", false);
        setField(term236374, term236374.getClass(), "clr_sts", "dqznIFBmKx");
        setBooleanField(term236374, term236374.getClass(), "rgo_sts", true);
        setField(term236374, term236374.getClass(), "my_qst_id", "MhTJfnBVaz");
        setField(term236374, term236374.getClass(), "my_qst_sts", "tWJuxHLcBL");
        setField(term236374, term236374.getClass(), "my_qst_prgrs", "ZOcslmWgQG");
        setField(term236374, term236374.getClass(), "my_qst_et", "YzxEEHlDUj");
        setField(term236374, term236374.getClass(), "p_std_ie_have", "UcCUEwaHWp");
        setField(term236374, term236374.getClass(), "p_std_se_have", "IZewAlURAW");
        setField(term236374, term236374.getClass(), "cmd", "RYptfEmCie");
        setField(term236374, term236374.getClass(), "req_id", "roQkSUEGom");
        setField(term236374, term236374.getClass(), "stat", "sKmuUYuuTa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KxdfNdyjGO";
        callMethod(klass, "setMy_qst_et", argTypes, term236374, args);
    }

};


