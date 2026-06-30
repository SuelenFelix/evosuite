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

public class StartResponse_getLvefctid_86000445214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31063;

    public StartResponse_getLvefctid_86000445214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31511 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term31510 = ((Class) term31511).getDeclaredField((String) "FAILED");
        ((Field) term31510).setAccessible(true);
        Object enum70 = ((Field) term31510).get((Object) null);
        Class<? extends Object> term31776 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term31775 = ((Class) term31776).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term31775).setAccessible(true);
        Object enum71 = ((Field) term31775).get((Object) null);
        Class<? extends Object> term32119 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term32118 = ((Class) term32119).getDeclaredField((String) "NORMAL");
        ((Field) term32118).setAccessible(true);
        Object enum72 = ((Field) term32118).get((Object) null);
        Class<? extends Object> term32394 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term32393 = ((Class) term32394).getDeclaredField((String) "ORIGINAL");
        ((Field) term32393).setAccessible(true);
        Object enum73 = ((Field) term32393).get((Object) null);
        Class<? extends Object> term32710 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term32709 = ((Class) term32710).getDeclaredField((String) "BRONZE");
        ((Field) term32709).setAccessible(true);
        Object enum74 = ((Field) term32709).get((Object) null);
        term31063 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term31163 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31164 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31168 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term31063, term31063.getClass(), "pd_id", 1935707624);
        setField(term31063, term31063.getClass(), "start_result", enum70);
        setIntField(term31063, term31063.getClass(), "accept_idx", 1507074215);
        setIntField(term31063, term31063.getClass(), "start_idx", -282881827);
        setField(term31063, term31063.getClass(), "player_name", "lRORwXipuk");
        setIntField(term31063, term31063.getClass(), "hp_vol", -1183353915);
        setBooleanField(term31063, term31063.getClass(), "btn_se_vol", false);
        setIntField(term31063, term31063.getClass(), "btn_se_vol2", -420030135);
        setIntField(term31063, term31063.getClass(), "sldr_se_vol2", 267763294);
        setField(term31063, term31063.getClass(), "sort_kind", enum71);
        setIntField(term31063, term31063.getClass(), "lv_num", -1497710478);
        setIntField(term31063, term31063.getClass(), "lv_pnt", 49950830);
        setField(term31063, term31063.getClass(), "lv_str", "fVdTcjgHdw");
        setIntField(term31063, term31063.getClass(), "lv_efct_id", -525257914);
        setIntField(term31063, term31063.getClass(), "lv_plt_id", 147209682);
        setField(term31063, term31063.getClass(), "mdl_eqp_ary", "wwAwLLcLPp");
        setField(term31063, term31063.getClass(), "c_itm_eqp_ary", "nHpMKOmlpQ");
        setField(term31063, term31063.getClass(), "ms_itm_flg_ary", "fKhrQsJToZ");
        setIntField(term31164, term31164.getClass(), "year", 2012);
        setShortField(term31164, term31164.getClass(), "month", (short) 2);
        setShortField(term31164, term31164.getClass(), "day", (short) 19);
        setField(term31163, term31163.getClass(), "date", term31164);
        setByteField(term31168, term31168.getClass(), "hour", (byte) 8);
        setByteField(term31168, term31168.getClass(), "minute", (byte) 4);
        setByteField(term31168, term31168.getClass(), "second", (byte) 43);
        setIntField(term31168, term31168.getClass(), "nano", 114930008);
        setField(term31163, term31163.getClass(), "time", term31168);
        setField(term31063, term31063.getClass(), "mdl_eqp_tm", term31163);
        setField(term31063, term31063.getClass(), "mdl_have", "wsysQLGFnl");
        setField(term31063, term31063.getClass(), "cstmz_itm_have", "ckQLZGFjMX");
        setBooleanField(term31063, term31063.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term31063, term31063.getClass(), "use_mdl_pri", false);
        setBooleanField(term31063, term31063.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term31063, term31063.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term31063, term31063.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term31063, term31063.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term31063, term31063.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term31063, term31063.getClass(), "vcld_pts", 34470066);
        setIntField(term31063, term31063.getClass(), "nxt_pv_id", 2058711405);
        setField(term31063, term31063.getClass(), "nxt_dffclty", enum72);
        setField(term31063, term31063.getClass(), "nxt_edtn", enum73);
        setField(term31063, term31063.getClass(), "cv_cid", "qphdrqUtNx");
        setField(term31063, term31063.getClass(), "cv_sc", "bwlLFAfNWx");
        setField(term31063, term31063.getClass(), "cv_rr", "JWodNQzjjV");
        setField(term31063, term31063.getClass(), "cv_bv", "CAgxWjhxNf");
        setField(term31063, term31063.getClass(), "cv_bf", "goAoCMhKBu");
        setIntField(term31063, term31063.getClass(), "cnp_cid", 1743683601);
        setIntField(term31063, term31063.getClass(), "cnp_val", -945116798);
        setField(term31063, term31063.getClass(), "cnp_rr", enum74);
        setField(term31063, term31063.getClass(), "cnp_sp", "BWxJSgKHRT");
        setField(term31063, term31063.getClass(), "my_lst_0", "AGXoIndFnm");
        setField(term31063, term31063.getClass(), "my_lst_1", "mwmFMNEzkK");
        setField(term31063, term31063.getClass(), "my_lst_2", "kVAmKknVln");
        setField(term31063, term31063.getClass(), "my_lst_3", "MRFLbEGYKG");
        setField(term31063, term31063.getClass(), "my_lst_4", "BYrGukTyof");
        setField(term31063, term31063.getClass(), "dsp_clr_brdr", "jiCGTTzKGB");
        setBooleanField(term31063, term31063.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term31063, term31063.getClass(), "dsp_clr_sts", false);
        setField(term31063, term31063.getClass(), "clr_sts", "MqICFYzDJj");
        setBooleanField(term31063, term31063.getClass(), "rgo_sts", true);
        setField(term31063, term31063.getClass(), "my_qst_id", "YgQvdcBQKw");
        setField(term31063, term31063.getClass(), "my_qst_sts", "FiYYLuailz");
        setField(term31063, term31063.getClass(), "my_qst_prgrs", "XebAeSnCKZ");
        setField(term31063, term31063.getClass(), "my_qst_et", "GeddnXjHGy");
        setField(term31063, term31063.getClass(), "p_std_ie_have", "vLTbaoAxBm");
        setField(term31063, term31063.getClass(), "p_std_se_have", "BXTjEyEZxD");
        setField(term31063, term31063.getClass(), "cmd", "oKhVzOKUFW");
        setField(term31063, term31063.getClass(), "req_id", "mNHyqmOAFy");
        setField(term31063, term31063.getClass(), "stat", "UxgSdhxPCH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_efct_id", argTypes, term31063, args);
    }

};


