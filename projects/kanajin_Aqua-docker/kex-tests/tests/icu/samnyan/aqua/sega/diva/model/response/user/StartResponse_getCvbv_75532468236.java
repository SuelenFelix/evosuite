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

public class StartResponse_getCvbv_75532468236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76879;

    public StartResponse_getCvbv_75532468236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77320 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term77319 = ((Class) term77320).getDeclaredField((String) "SUCCESS");
        ((Field) term77319).setAccessible(true);
        Object enum180 = ((Field) term77319).get((Object) null);
        Class<? extends Object> term77588 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term77587 = ((Class) term77588).getDeclaredField((String) "MY_LIST_A");
        ((Field) term77587).setAccessible(true);
        Object enum181 = ((Field) term77587).get((Object) null);
        Class<? extends Object> term77922 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term77921 = ((Class) term77922).getDeclaredField((String) "EASY");
        ((Field) term77921).setAccessible(true);
        Object enum182 = ((Field) term77921).get((Object) null);
        Class<? extends Object> term78191 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term78190 = ((Class) term78191).getDeclaredField((String) "EXTRA");
        ((Field) term78190).setAccessible(true);
        Object enum183 = ((Field) term78190).get((Object) null);
        Class<? extends Object> term78498 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term78497 = ((Class) term78498).getDeclaredField((String) "SILVER");
        ((Field) term78497).setAccessible(true);
        Object enum184 = ((Field) term78497).get((Object) null);
        term76879 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term76977 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76978 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76982 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term76879, term76879.getClass(), "pd_id", -138239905);
        setField(term76879, term76879.getClass(), "start_result", enum180);
        setIntField(term76879, term76879.getClass(), "accept_idx", 1709474063);
        setIntField(term76879, term76879.getClass(), "start_idx", 1406617209);
        setField(term76879, term76879.getClass(), "player_name", "dfZepHfGwh");
        setIntField(term76879, term76879.getClass(), "hp_vol", 1706047059);
        setBooleanField(term76879, term76879.getClass(), "btn_se_vol", false);
        setIntField(term76879, term76879.getClass(), "btn_se_vol2", 590451710);
        setIntField(term76879, term76879.getClass(), "sldr_se_vol2", -1999787419);
        setField(term76879, term76879.getClass(), "sort_kind", enum181);
        setIntField(term76879, term76879.getClass(), "lv_num", -1224443634);
        setIntField(term76879, term76879.getClass(), "lv_pnt", 1048451946);
        setField(term76879, term76879.getClass(), "lv_str", "zjfMxUERFZ");
        setIntField(term76879, term76879.getClass(), "lv_efct_id", 5603560);
        setIntField(term76879, term76879.getClass(), "lv_plt_id", -1079020032);
        setField(term76879, term76879.getClass(), "mdl_eqp_ary", "ooVlhmiOff");
        setField(term76879, term76879.getClass(), "c_itm_eqp_ary", "dUNzDLXJcj");
        setField(term76879, term76879.getClass(), "ms_itm_flg_ary", "OrVSjRJVwa");
        setIntField(term76978, term76978.getClass(), "year", 2010);
        setShortField(term76978, term76978.getClass(), "month", (short) 1);
        setShortField(term76978, term76978.getClass(), "day", (short) 17);
        setField(term76977, term76977.getClass(), "date", term76978);
        setByteField(term76982, term76982.getClass(), "hour", (byte) 13);
        setByteField(term76982, term76982.getClass(), "minute", (byte) 5);
        setByteField(term76982, term76982.getClass(), "second", (byte) 51);
        setIntField(term76982, term76982.getClass(), "nano", 362260580);
        setField(term76977, term76977.getClass(), "time", term76982);
        setField(term76879, term76879.getClass(), "mdl_eqp_tm", term76977);
        setField(term76879, term76879.getClass(), "mdl_have", "cdZEcINJAM");
        setField(term76879, term76879.getClass(), "cstmz_itm_have", "qumYSwcWHz");
        setBooleanField(term76879, term76879.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term76879, term76879.getClass(), "use_mdl_pri", false);
        setBooleanField(term76879, term76879.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term76879, term76879.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term76879, term76879.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term76879, term76879.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term76879, term76879.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term76879, term76879.getClass(), "vcld_pts", -1973791064);
        setIntField(term76879, term76879.getClass(), "nxt_pv_id", -2072158633);
        setField(term76879, term76879.getClass(), "nxt_dffclty", enum182);
        setField(term76879, term76879.getClass(), "nxt_edtn", enum183);
        setField(term76879, term76879.getClass(), "cv_cid", "raNzcEorkV");
        setField(term76879, term76879.getClass(), "cv_sc", "nEgozCeoUr");
        setField(term76879, term76879.getClass(), "cv_rr", "EWGMzlcOnW");
        setField(term76879, term76879.getClass(), "cv_bv", "XeSDJYKMBf");
        setField(term76879, term76879.getClass(), "cv_bf", "tIsFcOGTUX");
        setIntField(term76879, term76879.getClass(), "cnp_cid", -355469363);
        setIntField(term76879, term76879.getClass(), "cnp_val", 1465188553);
        setField(term76879, term76879.getClass(), "cnp_rr", enum184);
        setField(term76879, term76879.getClass(), "cnp_sp", "XUVRcnELFP");
        setField(term76879, term76879.getClass(), "my_lst_0", "xIeSbezmkD");
        setField(term76879, term76879.getClass(), "my_lst_1", "txUWLZRkSv");
        setField(term76879, term76879.getClass(), "my_lst_2", "gHRMJRsBGm");
        setField(term76879, term76879.getClass(), "my_lst_3", "rZyrfnMvHa");
        setField(term76879, term76879.getClass(), "my_lst_4", "GMyMhTZeDC");
        setField(term76879, term76879.getClass(), "dsp_clr_brdr", "KqQOTshBOL");
        setBooleanField(term76879, term76879.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term76879, term76879.getClass(), "dsp_clr_sts", false);
        setField(term76879, term76879.getClass(), "clr_sts", "cuWgFcYkPC");
        setBooleanField(term76879, term76879.getClass(), "rgo_sts", false);
        setField(term76879, term76879.getClass(), "my_qst_id", "HfbcOKkXBm");
        setField(term76879, term76879.getClass(), "my_qst_sts", "pLbTzSMbsN");
        setField(term76879, term76879.getClass(), "my_qst_prgrs", "lFSbxerCPP");
        setField(term76879, term76879.getClass(), "my_qst_et", "vjaZIyixCm");
        setField(term76879, term76879.getClass(), "p_std_ie_have", "gAAPyftlIR");
        setField(term76879, term76879.getClass(), "p_std_se_have", "kevWstoxwq");
        setField(term76879, term76879.getClass(), "cmd", "aSYOhFwzSm");
        setField(term76879, term76879.getClass(), "req_id", "pVZlzrBeDB");
        setField(term76879, term76879.getClass(), "stat", "EfSUvjuZAA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCv_bv", argTypes, term76879, args);
    }

};


