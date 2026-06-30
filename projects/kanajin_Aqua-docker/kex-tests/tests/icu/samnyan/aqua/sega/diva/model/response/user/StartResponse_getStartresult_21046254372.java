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

public class StartResponse_getStartresult_21046254372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6039;

    public StartResponse_getStartresult_21046254372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6487 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term6486 = ((Class) term6487).getDeclaredField((String) "FAILED");
        ((Field) term6486).setAccessible(true);
        Object enum10 = ((Field) term6486).get((Object) null);
        Class<? extends Object> term6752 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term6751 = ((Class) term6752).getDeclaredField((String) "MY_LIST_B");
        ((Field) term6751).setAccessible(true);
        Object enum11 = ((Field) term6751).get((Object) null);
        Class<? extends Object> term7086 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term7085 = ((Class) term7086).getDeclaredField((String) "UNDEFINED");
        ((Field) term7085).setAccessible(true);
        Object enum12 = ((Field) term7085).get((Object) null);
        Class<? extends Object> term7370 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term7369 = ((Class) term7370).getDeclaredField((String) "ORIGINAL");
        ((Field) term7369).setAccessible(true);
        Object enum13 = ((Field) term7369).get((Object) null);
        Class<? extends Object> term7686 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term7685 = ((Class) term7686).getDeclaredField((String) "BRONZE");
        ((Field) term7685).setAccessible(true);
        Object enum14 = ((Field) term7685).get((Object) null);
        term6039 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term6136 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6137 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6141 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6039, term6039.getClass(), "pd_id", -1465035361);
        setField(term6039, term6039.getClass(), "start_result", enum10);
        setIntField(term6039, term6039.getClass(), "accept_idx", 1090617576);
        setIntField(term6039, term6039.getClass(), "start_idx", -1547384488);
        setField(term6039, term6039.getClass(), "player_name", "lHfTrWKMPk");
        setIntField(term6039, term6039.getClass(), "hp_vol", 1442160736);
        setBooleanField(term6039, term6039.getClass(), "btn_se_vol", true);
        setIntField(term6039, term6039.getClass(), "btn_se_vol2", 1114000454);
        setIntField(term6039, term6039.getClass(), "sldr_se_vol2", -556405712);
        setField(term6039, term6039.getClass(), "sort_kind", enum11);
        setIntField(term6039, term6039.getClass(), "lv_num", -1772434990);
        setIntField(term6039, term6039.getClass(), "lv_pnt", -1845499264);
        setField(term6039, term6039.getClass(), "lv_str", "JDaAnsVTGV");
        setIntField(term6039, term6039.getClass(), "lv_efct_id", -505439934);
        setIntField(term6039, term6039.getClass(), "lv_plt_id", -344842608);
        setField(term6039, term6039.getClass(), "mdl_eqp_ary", "mLUZFTfjle");
        setField(term6039, term6039.getClass(), "c_itm_eqp_ary", "xIeFjkHkOe");
        setField(term6039, term6039.getClass(), "ms_itm_flg_ary", "SdCKLMIYnX");
        setIntField(term6137, term6137.getClass(), "year", 2015);
        setShortField(term6137, term6137.getClass(), "month", (short) 9);
        setShortField(term6137, term6137.getClass(), "day", (short) 19);
        setField(term6136, term6136.getClass(), "date", term6137);
        setByteField(term6141, term6141.getClass(), "hour", (byte) 9);
        setByteField(term6141, term6141.getClass(), "minute", (byte) 4);
        setByteField(term6141, term6141.getClass(), "second", (byte) 10);
        setIntField(term6141, term6141.getClass(), "nano", 401765865);
        setField(term6136, term6136.getClass(), "time", term6141);
        setField(term6039, term6039.getClass(), "mdl_eqp_tm", term6136);
        setField(term6039, term6039.getClass(), "mdl_have", "OJJtVNPyKZ");
        setField(term6039, term6039.getClass(), "cstmz_itm_have", "AKNapTAfmD");
        setBooleanField(term6039, term6039.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term6039, term6039.getClass(), "use_mdl_pri", true);
        setBooleanField(term6039, term6039.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term6039, term6039.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term6039, term6039.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term6039, term6039.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term6039, term6039.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term6039, term6039.getClass(), "vcld_pts", 941650513);
        setIntField(term6039, term6039.getClass(), "nxt_pv_id", 444029505);
        setField(term6039, term6039.getClass(), "nxt_dffclty", enum12);
        setField(term6039, term6039.getClass(), "nxt_edtn", enum13);
        setField(term6039, term6039.getClass(), "cv_cid", "xJgPlLxpgC");
        setField(term6039, term6039.getClass(), "cv_sc", "EYtfuJaxiM");
        setField(term6039, term6039.getClass(), "cv_rr", "gCWtLVKVVe");
        setField(term6039, term6039.getClass(), "cv_bv", "fWKJoSoCwE");
        setField(term6039, term6039.getClass(), "cv_bf", "wfaXBpWAUH");
        setIntField(term6039, term6039.getClass(), "cnp_cid", -1034506028);
        setIntField(term6039, term6039.getClass(), "cnp_val", -1263114719);
        setField(term6039, term6039.getClass(), "cnp_rr", enum14);
        setField(term6039, term6039.getClass(), "cnp_sp", "VMeAzAHwZj");
        setField(term6039, term6039.getClass(), "my_lst_0", "PznxWXsZME");
        setField(term6039, term6039.getClass(), "my_lst_1", "ZzIujlwVsw");
        setField(term6039, term6039.getClass(), "my_lst_2", "LWyEaeIyAo");
        setField(term6039, term6039.getClass(), "my_lst_3", "yVMkkQhvmN");
        setField(term6039, term6039.getClass(), "my_lst_4", "mvrkADEgpp");
        setField(term6039, term6039.getClass(), "dsp_clr_brdr", "pXOkjyeIRb");
        setBooleanField(term6039, term6039.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term6039, term6039.getClass(), "dsp_clr_sts", true);
        setField(term6039, term6039.getClass(), "clr_sts", "GgZWSjxjyE");
        setBooleanField(term6039, term6039.getClass(), "rgo_sts", true);
        setField(term6039, term6039.getClass(), "my_qst_id", "EeBVbzjcCI");
        setField(term6039, term6039.getClass(), "my_qst_sts", "UfQtPRyWRC");
        setField(term6039, term6039.getClass(), "my_qst_prgrs", "FPvxVzzSvD");
        setField(term6039, term6039.getClass(), "my_qst_et", "WHcwFgsGFC");
        setField(term6039, term6039.getClass(), "p_std_ie_have", "HzqpegHiRq");
        setField(term6039, term6039.getClass(), "p_std_se_have", "jwsfVjMoJT");
        setField(term6039, term6039.getClass(), "cmd", "ZfdXfCCFDf");
        setField(term6039, term6039.getClass(), "req_id", "MwwjNtdOFT");
        setField(term6039, term6039.getClass(), "stat", "VYkqXKVlAJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStart_result", argTypes, term6039, args);
    }

};


