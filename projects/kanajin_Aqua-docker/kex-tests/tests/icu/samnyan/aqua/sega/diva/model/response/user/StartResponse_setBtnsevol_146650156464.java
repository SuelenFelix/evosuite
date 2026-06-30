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
import java.lang.Boolean;

public class StartResponse_setBtnsevol_146650156464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135157;
     Object term135594;

    public StartResponse_setBtnsevol_146650156464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term135597 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term135596 = ((Class) term135597).getDeclaredField((String) "FAILED");
        ((Field) term135596).setAccessible(true);
        Object enum320 = ((Field) term135596).get((Object) null);
        Class<? extends Object> term135862 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term135861 = ((Class) term135862).getDeclaredField((String) "NAME");
        ((Field) term135861).setAccessible(true);
        Object enum321 = ((Field) term135861).get((Object) null);
        Class<? extends Object> term136181 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term136180 = ((Class) term136181).getDeclaredField((String) "EASY");
        ((Field) term136180).setAccessible(true);
        Object enum322 = ((Field) term136180).get((Object) null);
        Class<? extends Object> term136450 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term136449 = ((Class) term136450).getDeclaredField((String) "ORIGINAL");
        ((Field) term136449).setAccessible(true);
        Object enum323 = ((Field) term136449).get((Object) null);
        Class<? extends Object> term136766 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term136765 = ((Class) term136766).getDeclaredField((String) "BRONZE");
        ((Field) term136765).setAccessible(true);
        Object enum324 = ((Field) term136765).get((Object) null);
        term135157 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term135249 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135250 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135254 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term135157, term135157.getClass(), "pd_id", -1452324619);
        setField(term135157, term135157.getClass(), "start_result", enum320);
        setIntField(term135157, term135157.getClass(), "accept_idx", -1121709274);
        setIntField(term135157, term135157.getClass(), "start_idx", -532304223);
        setField(term135157, term135157.getClass(), "player_name", "lNbVasLAKL");
        setIntField(term135157, term135157.getClass(), "hp_vol", 666218293);
        setBooleanField(term135157, term135157.getClass(), "btn_se_vol", true);
        setIntField(term135157, term135157.getClass(), "btn_se_vol2", 1737876343);
        setIntField(term135157, term135157.getClass(), "sldr_se_vol2", -897937940);
        setField(term135157, term135157.getClass(), "sort_kind", enum321);
        setIntField(term135157, term135157.getClass(), "lv_num", 1523261232);
        setIntField(term135157, term135157.getClass(), "lv_pnt", -428988337);
        setField(term135157, term135157.getClass(), "lv_str", "wKeyHBCSLZ");
        setIntField(term135157, term135157.getClass(), "lv_efct_id", 48047085);
        setIntField(term135157, term135157.getClass(), "lv_plt_id", 1902784843);
        setField(term135157, term135157.getClass(), "mdl_eqp_ary", "iQCLduwSPi");
        setField(term135157, term135157.getClass(), "c_itm_eqp_ary", "ZcODLNhxqg");
        setField(term135157, term135157.getClass(), "ms_itm_flg_ary", "iNtHOROBMq");
        setIntField(term135250, term135250.getClass(), "year", 2028);
        setShortField(term135250, term135250.getClass(), "month", (short) 1);
        setShortField(term135250, term135250.getClass(), "day", (short) 18);
        setField(term135249, term135249.getClass(), "date", term135250);
        setByteField(term135254, term135254.getClass(), "hour", (byte) 12);
        setByteField(term135254, term135254.getClass(), "minute", (byte) 4);
        setByteField(term135254, term135254.getClass(), "second", (byte) 39);
        setIntField(term135254, term135254.getClass(), "nano", 651287093);
        setField(term135249, term135249.getClass(), "time", term135254);
        setField(term135157, term135157.getClass(), "mdl_eqp_tm", term135249);
        setField(term135157, term135157.getClass(), "mdl_have", "GbvfbbsrOl");
        setField(term135157, term135157.getClass(), "cstmz_itm_have", "IIZlqzOmtY");
        setBooleanField(term135157, term135157.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term135157, term135157.getClass(), "use_mdl_pri", false);
        setBooleanField(term135157, term135157.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term135157, term135157.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term135157, term135157.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term135157, term135157.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term135157, term135157.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term135157, term135157.getClass(), "vcld_pts", 2021136615);
        setIntField(term135157, term135157.getClass(), "nxt_pv_id", 1778570695);
        setField(term135157, term135157.getClass(), "nxt_dffclty", enum322);
        setField(term135157, term135157.getClass(), "nxt_edtn", enum323);
        setField(term135157, term135157.getClass(), "cv_cid", "iRFRSxtnkr");
        setField(term135157, term135157.getClass(), "cv_sc", "iGWkLjLGBY");
        setField(term135157, term135157.getClass(), "cv_rr", "jUkXaNkoAg");
        setField(term135157, term135157.getClass(), "cv_bv", "mZsPsRzyhQ");
        setField(term135157, term135157.getClass(), "cv_bf", "IExlbTemvJ");
        setIntField(term135157, term135157.getClass(), "cnp_cid", -1142164411);
        setIntField(term135157, term135157.getClass(), "cnp_val", -1619435313);
        setField(term135157, term135157.getClass(), "cnp_rr", enum324);
        setField(term135157, term135157.getClass(), "cnp_sp", "zaljyXXCoy");
        setField(term135157, term135157.getClass(), "my_lst_0", "dKoYnXLGEI");
        setField(term135157, term135157.getClass(), "my_lst_1", "MQvSpklpkB");
        setField(term135157, term135157.getClass(), "my_lst_2", "SbTxRdDQQc");
        setField(term135157, term135157.getClass(), "my_lst_3", "MrVdoUYAdO");
        setField(term135157, term135157.getClass(), "my_lst_4", "schPUnVfDW");
        setField(term135157, term135157.getClass(), "dsp_clr_brdr", "CpdMEgjUka");
        setBooleanField(term135157, term135157.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term135157, term135157.getClass(), "dsp_clr_sts", true);
        setField(term135157, term135157.getClass(), "clr_sts", "WRisHdgnmm");
        setBooleanField(term135157, term135157.getClass(), "rgo_sts", false);
        setField(term135157, term135157.getClass(), "my_qst_id", "XxZiwWPLOx");
        setField(term135157, term135157.getClass(), "my_qst_sts", "nyqsjMHTba");
        setField(term135157, term135157.getClass(), "my_qst_prgrs", "ylUHzURWyg");
        setField(term135157, term135157.getClass(), "my_qst_et", "VuAuFBlHxQ");
        setField(term135157, term135157.getClass(), "p_std_ie_have", "nOLtCslMMH");
        setField(term135157, term135157.getClass(), "p_std_se_have", "dIQWOeKQVj");
        setField(term135157, term135157.getClass(), "cmd", "tHiDGaNXAL");
        setField(term135157, term135157.getClass(), "req_id", "VsizBWhPWL");
        setField(term135157, term135157.getClass(), "stat", "jAFSxnVMcD");
        term135594 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term135594;
        callMethod(klass, "setBtn_se_vol", argTypes, term135157, args);
    }

};


