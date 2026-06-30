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

public class StartResponse_getCnpcid_32371509538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81031;

    public StartResponse_getCnpcid_32371509538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81477 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term81476 = ((Class) term81477).getDeclaredField((String) "SUCCESS");
        ((Field) term81476).setAccessible(true);
        Object enum190 = ((Field) term81476).get((Object) null);
        Class<? extends Object> term81745 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term81744 = ((Class) term81745).getDeclaredField((String) "MY_LIST_A");
        ((Field) term81744).setAccessible(true);
        Object enum191 = ((Field) term81744).get((Object) null);
        Class<? extends Object> term82079 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term82078 = ((Class) term82079).getDeclaredField((String) "UNDEFINED");
        ((Field) term82078).setAccessible(true);
        Object enum192 = ((Field) term82078).get((Object) null);
        Class<? extends Object> term82363 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term82362 = ((Class) term82363).getDeclaredField((String) "EXTRA");
        ((Field) term82362).setAccessible(true);
        Object enum193 = ((Field) term82362).get((Object) null);
        Class<? extends Object> term82670 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term82669 = ((Class) term82670).getDeclaredField((String) "SILVER");
        ((Field) term82669).setAccessible(true);
        Object enum194 = ((Field) term82669).get((Object) null);
        term81031 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term81129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81134 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term81031, term81031.getClass(), "pd_id", -1674430871);
        setField(term81031, term81031.getClass(), "start_result", enum190);
        setIntField(term81031, term81031.getClass(), "accept_idx", 794352120);
        setIntField(term81031, term81031.getClass(), "start_idx", 340719678);
        setField(term81031, term81031.getClass(), "player_name", "gUQhOyGfzF");
        setIntField(term81031, term81031.getClass(), "hp_vol", 299791142);
        setBooleanField(term81031, term81031.getClass(), "btn_se_vol", true);
        setIntField(term81031, term81031.getClass(), "btn_se_vol2", 1862191391);
        setIntField(term81031, term81031.getClass(), "sldr_se_vol2", 1131398807);
        setField(term81031, term81031.getClass(), "sort_kind", enum191);
        setIntField(term81031, term81031.getClass(), "lv_num", -344907703);
        setIntField(term81031, term81031.getClass(), "lv_pnt", 824341437);
        setField(term81031, term81031.getClass(), "lv_str", "IqDObvPBZX");
        setIntField(term81031, term81031.getClass(), "lv_efct_id", -1794965320);
        setIntField(term81031, term81031.getClass(), "lv_plt_id", 520504102);
        setField(term81031, term81031.getClass(), "mdl_eqp_ary", "NITCrIISoC");
        setField(term81031, term81031.getClass(), "c_itm_eqp_ary", "nSzzeexTDI");
        setField(term81031, term81031.getClass(), "ms_itm_flg_ary", "WBrpvMhmsz");
        setIntField(term81130, term81130.getClass(), "year", 2023);
        setShortField(term81130, term81130.getClass(), "month", (short) 7);
        setShortField(term81130, term81130.getClass(), "day", (short) 16);
        setField(term81129, term81129.getClass(), "date", term81130);
        setByteField(term81134, term81134.getClass(), "hour", (byte) 3);
        setByteField(term81134, term81134.getClass(), "minute", (byte) 1);
        setByteField(term81134, term81134.getClass(), "second", (byte) 19);
        setIntField(term81134, term81134.getClass(), "nano", 488629554);
        setField(term81129, term81129.getClass(), "time", term81134);
        setField(term81031, term81031.getClass(), "mdl_eqp_tm", term81129);
        setField(term81031, term81031.getClass(), "mdl_have", "ZzqRHVEXcM");
        setField(term81031, term81031.getClass(), "cstmz_itm_have", "YYwIEARNxi");
        setBooleanField(term81031, term81031.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term81031, term81031.getClass(), "use_mdl_pri", false);
        setBooleanField(term81031, term81031.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term81031, term81031.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term81031, term81031.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term81031, term81031.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term81031, term81031.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term81031, term81031.getClass(), "vcld_pts", -457396133);
        setIntField(term81031, term81031.getClass(), "nxt_pv_id", -1793950607);
        setField(term81031, term81031.getClass(), "nxt_dffclty", enum192);
        setField(term81031, term81031.getClass(), "nxt_edtn", enum193);
        setField(term81031, term81031.getClass(), "cv_cid", "rblXBUdTFc");
        setField(term81031, term81031.getClass(), "cv_sc", "rbsXSOJFKW");
        setField(term81031, term81031.getClass(), "cv_rr", "sAgGDoUNlf");
        setField(term81031, term81031.getClass(), "cv_bv", "TSTZcXdFFi");
        setField(term81031, term81031.getClass(), "cv_bf", "RyaaOzWfYO");
        setIntField(term81031, term81031.getClass(), "cnp_cid", 1091954101);
        setIntField(term81031, term81031.getClass(), "cnp_val", 1895143076);
        setField(term81031, term81031.getClass(), "cnp_rr", enum194);
        setField(term81031, term81031.getClass(), "cnp_sp", "HAkxFBZZzz");
        setField(term81031, term81031.getClass(), "my_lst_0", "yejonZnVuy");
        setField(term81031, term81031.getClass(), "my_lst_1", "ouesGIsvuG");
        setField(term81031, term81031.getClass(), "my_lst_2", "pHBHlmLIZQ");
        setField(term81031, term81031.getClass(), "my_lst_3", "ZWRAbOuktl");
        setField(term81031, term81031.getClass(), "my_lst_4", "iqFRvFmVID");
        setField(term81031, term81031.getClass(), "dsp_clr_brdr", "pNAEtppZdv");
        setBooleanField(term81031, term81031.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term81031, term81031.getClass(), "dsp_clr_sts", false);
        setField(term81031, term81031.getClass(), "clr_sts", "VsFWNMdyRt");
        setBooleanField(term81031, term81031.getClass(), "rgo_sts", false);
        setField(term81031, term81031.getClass(), "my_qst_id", "QaoYFZhScg");
        setField(term81031, term81031.getClass(), "my_qst_sts", "UTvXIenLCR");
        setField(term81031, term81031.getClass(), "my_qst_prgrs", "PLeKpWaxhQ");
        setField(term81031, term81031.getClass(), "my_qst_et", "EBSKhqDdUW");
        setField(term81031, term81031.getClass(), "p_std_ie_have", "LvLbdICdfA");
        setField(term81031, term81031.getClass(), "p_std_se_have", "rtifrlITwl");
        setField(term81031, term81031.getClass(), "cmd", "yGWXZDjnPS");
        setField(term81031, term81031.getClass(), "req_id", "vZucxbGVyo");
        setField(term81031, term81031.getClass(), "stat", "ZZoLNbeORl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCnp_cid", argTypes, term81031, args);
    }

};


