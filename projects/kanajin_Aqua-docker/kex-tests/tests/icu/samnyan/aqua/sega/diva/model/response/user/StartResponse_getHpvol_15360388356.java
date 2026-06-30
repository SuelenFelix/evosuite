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

public class StartResponse_getHpvol_15360388356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14371;

    public StartResponse_getHpvol_15360388356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14812 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term14811 = ((Class) term14812).getDeclaredField((String) "SUCCESS");
        ((Field) term14811).setAccessible(true);
        Object enum30 = ((Field) term14811).get((Object) null);
        Class<? extends Object> term15080 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term15079 = ((Class) term15080).getDeclaredField((String) "MY_LIST_C");
        ((Field) term15079).setAccessible(true);
        Object enum31 = ((Field) term15079).get((Object) null);
        Class<? extends Object> term15414 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term15413 = ((Class) term15414).getDeclaredField((String) "EASY");
        ((Field) term15413).setAccessible(true);
        Object enum32 = ((Field) term15413).get((Object) null);
        Class<? extends Object> term15683 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term15682 = ((Class) term15683).getDeclaredField((String) "EXTRA");
        ((Field) term15682).setAccessible(true);
        Object enum33 = ((Field) term15682).get((Object) null);
        Class<? extends Object> term15990 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term15989 = ((Class) term15990).getDeclaredField((String) "SILVER");
        ((Field) term15989).setAccessible(true);
        Object enum34 = ((Field) term15989).get((Object) null);
        term14371 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term14469 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14470 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14474 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term14371, term14371.getClass(), "pd_id", -1222006000);
        setField(term14371, term14371.getClass(), "start_result", enum30);
        setIntField(term14371, term14371.getClass(), "accept_idx", 2095798786);
        setIntField(term14371, term14371.getClass(), "start_idx", -1565502840);
        setField(term14371, term14371.getClass(), "player_name", "nghfqDXyCG");
        setIntField(term14371, term14371.getClass(), "hp_vol", 344323424);
        setBooleanField(term14371, term14371.getClass(), "btn_se_vol", true);
        setIntField(term14371, term14371.getClass(), "btn_se_vol2", 9726679);
        setIntField(term14371, term14371.getClass(), "sldr_se_vol2", -25637976);
        setField(term14371, term14371.getClass(), "sort_kind", enum31);
        setIntField(term14371, term14371.getClass(), "lv_num", 1555897383);
        setIntField(term14371, term14371.getClass(), "lv_pnt", 202001407);
        setField(term14371, term14371.getClass(), "lv_str", "WBAOTqErtm");
        setIntField(term14371, term14371.getClass(), "lv_efct_id", 158873461);
        setIntField(term14371, term14371.getClass(), "lv_plt_id", -430151637);
        setField(term14371, term14371.getClass(), "mdl_eqp_ary", "PqtVXXZMqK");
        setField(term14371, term14371.getClass(), "c_itm_eqp_ary", "rYbtIDVdnd");
        setField(term14371, term14371.getClass(), "ms_itm_flg_ary", "UKAReurpHG");
        setIntField(term14470, term14470.getClass(), "year", 2025);
        setShortField(term14470, term14470.getClass(), "month", (short) 4);
        setShortField(term14470, term14470.getClass(), "day", (short) 24);
        setField(term14469, term14469.getClass(), "date", term14470);
        setByteField(term14474, term14474.getClass(), "hour", (byte) 18);
        setByteField(term14474, term14474.getClass(), "minute", (byte) 11);
        setByteField(term14474, term14474.getClass(), "second", (byte) 40);
        setIntField(term14474, term14474.getClass(), "nano", 137454929);
        setField(term14469, term14469.getClass(), "time", term14474);
        setField(term14371, term14371.getClass(), "mdl_eqp_tm", term14469);
        setField(term14371, term14371.getClass(), "mdl_have", "WVRMUmrljA");
        setField(term14371, term14371.getClass(), "cstmz_itm_have", "NTlKJDDWlk");
        setBooleanField(term14371, term14371.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term14371, term14371.getClass(), "use_mdl_pri", true);
        setBooleanField(term14371, term14371.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term14371, term14371.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term14371, term14371.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term14371, term14371.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term14371, term14371.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term14371, term14371.getClass(), "vcld_pts", -1697741339);
        setIntField(term14371, term14371.getClass(), "nxt_pv_id", 98922530);
        setField(term14371, term14371.getClass(), "nxt_dffclty", enum32);
        setField(term14371, term14371.getClass(), "nxt_edtn", enum33);
        setField(term14371, term14371.getClass(), "cv_cid", "vOuMEpOQAg");
        setField(term14371, term14371.getClass(), "cv_sc", "SIODFGaQhr");
        setField(term14371, term14371.getClass(), "cv_rr", "qYzsiuXOgS");
        setField(term14371, term14371.getClass(), "cv_bv", "bxrCBbrrct");
        setField(term14371, term14371.getClass(), "cv_bf", "CKWpJaaaxX");
        setIntField(term14371, term14371.getClass(), "cnp_cid", -1388471422);
        setIntField(term14371, term14371.getClass(), "cnp_val", -1498296052);
        setField(term14371, term14371.getClass(), "cnp_rr", enum34);
        setField(term14371, term14371.getClass(), "cnp_sp", "UBRmXJmfrt");
        setField(term14371, term14371.getClass(), "my_lst_0", "WZzvmIHhzZ");
        setField(term14371, term14371.getClass(), "my_lst_1", "doQLHkjpNm");
        setField(term14371, term14371.getClass(), "my_lst_2", "lCyLIcSuom");
        setField(term14371, term14371.getClass(), "my_lst_3", "CGOpQSZZwI");
        setField(term14371, term14371.getClass(), "my_lst_4", "ypEdrstygY");
        setField(term14371, term14371.getClass(), "dsp_clr_brdr", "sNQFlATEeQ");
        setBooleanField(term14371, term14371.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term14371, term14371.getClass(), "dsp_clr_sts", false);
        setField(term14371, term14371.getClass(), "clr_sts", "ZKMLioamsY");
        setBooleanField(term14371, term14371.getClass(), "rgo_sts", true);
        setField(term14371, term14371.getClass(), "my_qst_id", "WVbxuoDBcn");
        setField(term14371, term14371.getClass(), "my_qst_sts", "pvDEABOxLt");
        setField(term14371, term14371.getClass(), "my_qst_prgrs", "beAMpkroCQ");
        setField(term14371, term14371.getClass(), "my_qst_et", "uSUvKAyuvd");
        setField(term14371, term14371.getClass(), "p_std_ie_have", "onQLVONGuf");
        setField(term14371, term14371.getClass(), "p_std_se_have", "SOrEHbcbmn");
        setField(term14371, term14371.getClass(), "cmd", "bnsyeQXFdu");
        setField(term14371, term14371.getClass(), "req_id", "BwtdjiefJn");
        setField(term14371, term14371.getClass(), "stat", "jDmhBrIoDa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHp_vol", argTypes, term14371, args);
    }

};


