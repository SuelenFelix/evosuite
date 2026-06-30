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

public class StartResponse_getPlayername_1070640195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12321;

    public StartResponse_getPlayername_1070640195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12755 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term12754 = ((Class) term12755).getDeclaredField((String) "SUCCESS");
        ((Field) term12754).setAccessible(true);
        Object enum25 = ((Field) term12754).get((Object) null);
        Class<? extends Object> term13023 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term13022 = ((Class) term13023).getDeclaredField((String) "NAME");
        ((Field) term13022).setAccessible(true);
        Object enum26 = ((Field) term13022).get((Object) null);
        Class<? extends Object> term13342 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term13341 = ((Class) term13342).getDeclaredField((String) "EASY");
        ((Field) term13341).setAccessible(true);
        Object enum27 = ((Field) term13341).get((Object) null);
        Class<? extends Object> term13611 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term13610 = ((Class) term13611).getDeclaredField((String) "EXTRA");
        ((Field) term13610).setAccessible(true);
        Object enum28 = ((Field) term13610).get((Object) null);
        Class<? extends Object> term13918 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term13917 = ((Class) term13918).getDeclaredField((String) "GOLD");
        ((Field) term13917).setAccessible(true);
        Object enum29 = ((Field) term13917).get((Object) null);
        term12321 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term12414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12419 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12321, term12321.getClass(), "pd_id", -375014958);
        setField(term12321, term12321.getClass(), "start_result", enum25);
        setIntField(term12321, term12321.getClass(), "accept_idx", 1107176718);
        setIntField(term12321, term12321.getClass(), "start_idx", 480137250);
        setField(term12321, term12321.getClass(), "player_name", "izPpKDErnQ");
        setIntField(term12321, term12321.getClass(), "hp_vol", -341152642);
        setBooleanField(term12321, term12321.getClass(), "btn_se_vol", false);
        setIntField(term12321, term12321.getClass(), "btn_se_vol2", -2015854073);
        setIntField(term12321, term12321.getClass(), "sldr_se_vol2", 538259104);
        setField(term12321, term12321.getClass(), "sort_kind", enum26);
        setIntField(term12321, term12321.getClass(), "lv_num", 96566506);
        setIntField(term12321, term12321.getClass(), "lv_pnt", -343325701);
        setField(term12321, term12321.getClass(), "lv_str", "NnpwZBUTvx");
        setIntField(term12321, term12321.getClass(), "lv_efct_id", 107945604);
        setIntField(term12321, term12321.getClass(), "lv_plt_id", -1963464809);
        setField(term12321, term12321.getClass(), "mdl_eqp_ary", "tlQSNgTkQX");
        setField(term12321, term12321.getClass(), "c_itm_eqp_ary", "PCipZnmBOF");
        setField(term12321, term12321.getClass(), "ms_itm_flg_ary", "zcorEihhLK");
        setIntField(term12415, term12415.getClass(), "year", 2026);
        setShortField(term12415, term12415.getClass(), "month", (short) 12);
        setShortField(term12415, term12415.getClass(), "day", (short) 14);
        setField(term12414, term12414.getClass(), "date", term12415);
        setByteField(term12419, term12419.getClass(), "hour", (byte) 16);
        setByteField(term12419, term12419.getClass(), "minute", (byte) 34);
        setByteField(term12419, term12419.getClass(), "second", (byte) 9);
        setIntField(term12419, term12419.getClass(), "nano", 518326996);
        setField(term12414, term12414.getClass(), "time", term12419);
        setField(term12321, term12321.getClass(), "mdl_eqp_tm", term12414);
        setField(term12321, term12321.getClass(), "mdl_have", "GrqozDKFOk");
        setField(term12321, term12321.getClass(), "cstmz_itm_have", "CFyoseFGLF");
        setBooleanField(term12321, term12321.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term12321, term12321.getClass(), "use_mdl_pri", true);
        setBooleanField(term12321, term12321.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term12321, term12321.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term12321, term12321.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term12321, term12321.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term12321, term12321.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term12321, term12321.getClass(), "vcld_pts", 71190297);
        setIntField(term12321, term12321.getClass(), "nxt_pv_id", 1202361360);
        setField(term12321, term12321.getClass(), "nxt_dffclty", enum27);
        setField(term12321, term12321.getClass(), "nxt_edtn", enum28);
        setField(term12321, term12321.getClass(), "cv_cid", "SFqCrhEWLm");
        setField(term12321, term12321.getClass(), "cv_sc", "GZdcJyZntS");
        setField(term12321, term12321.getClass(), "cv_rr", "OIHoJeysUi");
        setField(term12321, term12321.getClass(), "cv_bv", "WXMWFDGcLB");
        setField(term12321, term12321.getClass(), "cv_bf", "wKWbJssZuG");
        setIntField(term12321, term12321.getClass(), "cnp_cid", -2015048153);
        setIntField(term12321, term12321.getClass(), "cnp_val", -2063457669);
        setField(term12321, term12321.getClass(), "cnp_rr", enum29);
        setField(term12321, term12321.getClass(), "cnp_sp", "NzBMMhkhpT");
        setField(term12321, term12321.getClass(), "my_lst_0", "qCpEbQDHdF");
        setField(term12321, term12321.getClass(), "my_lst_1", "AHbZyFOmlo");
        setField(term12321, term12321.getClass(), "my_lst_2", "TwfWVQGiIj");
        setField(term12321, term12321.getClass(), "my_lst_3", "gUvcueTURF");
        setField(term12321, term12321.getClass(), "my_lst_4", "EwQBhZjCIT");
        setField(term12321, term12321.getClass(), "dsp_clr_brdr", "aSkmSwTnEw");
        setBooleanField(term12321, term12321.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term12321, term12321.getClass(), "dsp_clr_sts", false);
        setField(term12321, term12321.getClass(), "clr_sts", "xvkbvaEGYd");
        setBooleanField(term12321, term12321.getClass(), "rgo_sts", false);
        setField(term12321, term12321.getClass(), "my_qst_id", "HBGNxdNURv");
        setField(term12321, term12321.getClass(), "my_qst_sts", "mfCpTPPQQm");
        setField(term12321, term12321.getClass(), "my_qst_prgrs", "OcJCIDNIXA");
        setField(term12321, term12321.getClass(), "my_qst_et", "XfRABIFVEp");
        setField(term12321, term12321.getClass(), "p_std_ie_have", "MHGKyEnwKc");
        setField(term12321, term12321.getClass(), "p_std_se_have", "ShIELyuULw");
        setField(term12321, term12321.getClass(), "cmd", "IpQuOGMgmj");
        setField(term12321, term12321.getClass(), "req_id", "pJbnHTYrxn");
        setField(term12321, term12321.getClass(), "stat", "iIRsCSYqXH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer_name", argTypes, term12321, args);
    }

};


