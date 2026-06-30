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
import java.lang.Integer;

public class StartResponse_setHpvol_162099140963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133081;
     Object term133520;

    public StartResponse_setHpvol_162099140963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term133523 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term133522 = ((Class) term133523).getDeclaredField((String) "FAILED");
        ((Field) term133522).setAccessible(true);
        Object enum315 = ((Field) term133522).get((Object) null);
        Class<? extends Object> term133788 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term133787 = ((Class) term133788).getDeclaredField((String) "MY_LIST_A");
        ((Field) term133787).setAccessible(true);
        Object enum316 = ((Field) term133787).get((Object) null);
        Class<? extends Object> term134122 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term134121 = ((Class) term134122).getDeclaredField((String) "HARD");
        ((Field) term134121).setAccessible(true);
        Object enum317 = ((Field) term134121).get((Object) null);
        Class<? extends Object> term134391 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term134390 = ((Class) term134391).getDeclaredField((String) "EXTRA");
        ((Field) term134390).setAccessible(true);
        Object enum318 = ((Field) term134390).get((Object) null);
        Class<? extends Object> term134698 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term134697 = ((Class) term134698).getDeclaredField((String) "SILVER");
        ((Field) term134697).setAccessible(true);
        Object enum319 = ((Field) term134697).get((Object) null);
        term133081 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term133178 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133179 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133183 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term133081, term133081.getClass(), "pd_id", -1542979444);
        setField(term133081, term133081.getClass(), "start_result", enum315);
        setIntField(term133081, term133081.getClass(), "accept_idx", -1130401612);
        setIntField(term133081, term133081.getClass(), "start_idx", -316771104);
        setField(term133081, term133081.getClass(), "player_name", "PmSvMYNoIS");
        setIntField(term133081, term133081.getClass(), "hp_vol", -1374527319);
        setBooleanField(term133081, term133081.getClass(), "btn_se_vol", true);
        setIntField(term133081, term133081.getClass(), "btn_se_vol2", -1735276919);
        setIntField(term133081, term133081.getClass(), "sldr_se_vol2", -712023865);
        setField(term133081, term133081.getClass(), "sort_kind", enum316);
        setIntField(term133081, term133081.getClass(), "lv_num", 613256157);
        setIntField(term133081, term133081.getClass(), "lv_pnt", 454242689);
        setField(term133081, term133081.getClass(), "lv_str", "zejWtMxJdV");
        setIntField(term133081, term133081.getClass(), "lv_efct_id", 1798354517);
        setIntField(term133081, term133081.getClass(), "lv_plt_id", -1495693617);
        setField(term133081, term133081.getClass(), "mdl_eqp_ary", "YUIUZeZiMK");
        setField(term133081, term133081.getClass(), "c_itm_eqp_ary", "rrPETbKRef");
        setField(term133081, term133081.getClass(), "ms_itm_flg_ary", "viZRlrisPY");
        setIntField(term133179, term133179.getClass(), "year", 2019);
        setShortField(term133179, term133179.getClass(), "month", (short) 1);
        setShortField(term133179, term133179.getClass(), "day", (short) 6);
        setField(term133178, term133178.getClass(), "date", term133179);
        setByteField(term133183, term133183.getClass(), "hour", (byte) 18);
        setByteField(term133183, term133183.getClass(), "minute", (byte) 8);
        setByteField(term133183, term133183.getClass(), "second", (byte) 46);
        setIntField(term133183, term133183.getClass(), "nano", 934136445);
        setField(term133178, term133178.getClass(), "time", term133183);
        setField(term133081, term133081.getClass(), "mdl_eqp_tm", term133178);
        setField(term133081, term133081.getClass(), "mdl_have", "VSfRsPLslq");
        setField(term133081, term133081.getClass(), "cstmz_itm_have", "dwygneuBjP");
        setBooleanField(term133081, term133081.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term133081, term133081.getClass(), "use_mdl_pri", false);
        setBooleanField(term133081, term133081.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term133081, term133081.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term133081, term133081.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term133081, term133081.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term133081, term133081.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term133081, term133081.getClass(), "vcld_pts", -890538258);
        setIntField(term133081, term133081.getClass(), "nxt_pv_id", -1085899912);
        setField(term133081, term133081.getClass(), "nxt_dffclty", enum317);
        setField(term133081, term133081.getClass(), "nxt_edtn", enum318);
        setField(term133081, term133081.getClass(), "cv_cid", "LfKgkzPZpX");
        setField(term133081, term133081.getClass(), "cv_sc", "belyXxMqFm");
        setField(term133081, term133081.getClass(), "cv_rr", "LPotuCwkwB");
        setField(term133081, term133081.getClass(), "cv_bv", "zpCKXLOzse");
        setField(term133081, term133081.getClass(), "cv_bf", "qhlWSiHAHt");
        setIntField(term133081, term133081.getClass(), "cnp_cid", -1458980236);
        setIntField(term133081, term133081.getClass(), "cnp_val", 890505372);
        setField(term133081, term133081.getClass(), "cnp_rr", enum319);
        setField(term133081, term133081.getClass(), "cnp_sp", "XrKIhxpIJD");
        setField(term133081, term133081.getClass(), "my_lst_0", "RSuRSjiLvm");
        setField(term133081, term133081.getClass(), "my_lst_1", "aoeNWgMpNx");
        setField(term133081, term133081.getClass(), "my_lst_2", "RQvXfSweVs");
        setField(term133081, term133081.getClass(), "my_lst_3", "jGxArBjtep");
        setField(term133081, term133081.getClass(), "my_lst_4", "dUXsPNSUez");
        setField(term133081, term133081.getClass(), "dsp_clr_brdr", "PxGDfPOAFS");
        setBooleanField(term133081, term133081.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term133081, term133081.getClass(), "dsp_clr_sts", false);
        setField(term133081, term133081.getClass(), "clr_sts", "dZVxzYEeZe");
        setBooleanField(term133081, term133081.getClass(), "rgo_sts", false);
        setField(term133081, term133081.getClass(), "my_qst_id", "TnCQRmzwPf");
        setField(term133081, term133081.getClass(), "my_qst_sts", "ZGnUKGTWCn");
        setField(term133081, term133081.getClass(), "my_qst_prgrs", "cHRLXsgRzr");
        setField(term133081, term133081.getClass(), "my_qst_et", "QpqQKmCtoC");
        setField(term133081, term133081.getClass(), "p_std_ie_have", "AYRvbRJxWI");
        setField(term133081, term133081.getClass(), "p_std_se_have", "MGNiaVqEDc");
        setField(term133081, term133081.getClass(), "cmd", "qeVNCFrTbT");
        setField(term133081, term133081.getClass(), "req_id", "sreEtRBWQl");
        setField(term133081, term133081.getClass(), "stat", "UKQejaeJWY");
        term133520 = new Integer(2044137055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term133520;
        callMethod(klass, "setHp_vol", argTypes, term133081, args);
    }

};


