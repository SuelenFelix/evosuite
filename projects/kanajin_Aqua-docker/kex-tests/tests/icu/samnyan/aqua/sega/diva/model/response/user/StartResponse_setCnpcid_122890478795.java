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

public class StartResponse_setCnpcid_122890478795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200351;
     Object term200792;

    public StartResponse_setCnpcid_122890478795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term200795 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term200794 = ((Class) term200795).getDeclaredField((String) "SUCCESS");
        ((Field) term200794).setAccessible(true);
        Object enum476 = ((Field) term200794).get((Object) null);
        Class<? extends Object> term201063 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term201062 = ((Class) term201063).getDeclaredField((String) "MY_LIST_B");
        ((Field) term201062).setAccessible(true);
        Object enum477 = ((Field) term201062).get((Object) null);
        Class<? extends Object> term201397 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term201396 = ((Class) term201397).getDeclaredField((String) "EXTREME");
        ((Field) term201396).setAccessible(true);
        Object enum478 = ((Field) term201396).get((Object) null);
        Class<? extends Object> term201675 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term201674 = ((Class) term201675).getDeclaredField((String) "EXTRA");
        ((Field) term201674).setAccessible(true);
        Object enum479 = ((Field) term201674).get((Object) null);
        Class<? extends Object> term201982 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term201981 = ((Class) term201982).getDeclaredField((String) "NONE");
        ((Field) term201981).setAccessible(true);
        Object enum480 = ((Field) term201981).get((Object) null);
        term200351 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term200449 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term200450 = newInstance(Class.forName("java.time.LocalDate"));
        Object term200454 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term200351, term200351.getClass(), "pd_id", 548468113);
        setField(term200351, term200351.getClass(), "start_result", enum476);
        setIntField(term200351, term200351.getClass(), "accept_idx", 1701819905);
        setIntField(term200351, term200351.getClass(), "start_idx", 1721418943);
        setField(term200351, term200351.getClass(), "player_name", "bmLiVLNmZC");
        setIntField(term200351, term200351.getClass(), "hp_vol", -111082612);
        setBooleanField(term200351, term200351.getClass(), "btn_se_vol", false);
        setIntField(term200351, term200351.getClass(), "btn_se_vol2", 1253334988);
        setIntField(term200351, term200351.getClass(), "sldr_se_vol2", 1086709736);
        setField(term200351, term200351.getClass(), "sort_kind", enum477);
        setIntField(term200351, term200351.getClass(), "lv_num", -1606698075);
        setIntField(term200351, term200351.getClass(), "lv_pnt", 90996421);
        setField(term200351, term200351.getClass(), "lv_str", "ORExcUfatr");
        setIntField(term200351, term200351.getClass(), "lv_efct_id", -1805802783);
        setIntField(term200351, term200351.getClass(), "lv_plt_id", -529831900);
        setField(term200351, term200351.getClass(), "mdl_eqp_ary", "cUonKmQWCB");
        setField(term200351, term200351.getClass(), "c_itm_eqp_ary", "CvbqWuRute");
        setField(term200351, term200351.getClass(), "ms_itm_flg_ary", "yuvBFZQJBJ");
        setIntField(term200450, term200450.getClass(), "year", 2016);
        setShortField(term200450, term200450.getClass(), "month", (short) 6);
        setShortField(term200450, term200450.getClass(), "day", (short) 23);
        setField(term200449, term200449.getClass(), "date", term200450);
        setByteField(term200454, term200454.getClass(), "hour", (byte) 20);
        setByteField(term200454, term200454.getClass(), "minute", (byte) 51);
        setByteField(term200454, term200454.getClass(), "second", (byte) 43);
        setIntField(term200454, term200454.getClass(), "nano", 284389409);
        setField(term200449, term200449.getClass(), "time", term200454);
        setField(term200351, term200351.getClass(), "mdl_eqp_tm", term200449);
        setField(term200351, term200351.getClass(), "mdl_have", "prymoiXBsv");
        setField(term200351, term200351.getClass(), "cstmz_itm_have", "XVkgypnsVx");
        setBooleanField(term200351, term200351.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term200351, term200351.getClass(), "use_mdl_pri", true);
        setBooleanField(term200351, term200351.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term200351, term200351.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term200351, term200351.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term200351, term200351.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term200351, term200351.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term200351, term200351.getClass(), "vcld_pts", 1574493440);
        setIntField(term200351, term200351.getClass(), "nxt_pv_id", 1854694585);
        setField(term200351, term200351.getClass(), "nxt_dffclty", enum478);
        setField(term200351, term200351.getClass(), "nxt_edtn", enum479);
        setField(term200351, term200351.getClass(), "cv_cid", "TwXzbEYFtG");
        setField(term200351, term200351.getClass(), "cv_sc", "mRdoimcRwz");
        setField(term200351, term200351.getClass(), "cv_rr", "dxJDKuPPPM");
        setField(term200351, term200351.getClass(), "cv_bv", "rXBuuDWXsm");
        setField(term200351, term200351.getClass(), "cv_bf", "VSvKttZYSC");
        setIntField(term200351, term200351.getClass(), "cnp_cid", -1260562836);
        setIntField(term200351, term200351.getClass(), "cnp_val", 694100722);
        setField(term200351, term200351.getClass(), "cnp_rr", enum480);
        setField(term200351, term200351.getClass(), "cnp_sp", "bbwxScASWL");
        setField(term200351, term200351.getClass(), "my_lst_0", "BXJdQmJvFh");
        setField(term200351, term200351.getClass(), "my_lst_1", "bsPTRsievL");
        setField(term200351, term200351.getClass(), "my_lst_2", "LPLRACmzWM");
        setField(term200351, term200351.getClass(), "my_lst_3", "DfdUvykRzo");
        setField(term200351, term200351.getClass(), "my_lst_4", "TWPJmzPTXg");
        setField(term200351, term200351.getClass(), "dsp_clr_brdr", "frPgAZBkug");
        setBooleanField(term200351, term200351.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term200351, term200351.getClass(), "dsp_clr_sts", true);
        setField(term200351, term200351.getClass(), "clr_sts", "AAzuYrqTRq");
        setBooleanField(term200351, term200351.getClass(), "rgo_sts", true);
        setField(term200351, term200351.getClass(), "my_qst_id", "cUQuwEPzJb");
        setField(term200351, term200351.getClass(), "my_qst_sts", "sqPZeXSusM");
        setField(term200351, term200351.getClass(), "my_qst_prgrs", "mUCxMstoOT");
        setField(term200351, term200351.getClass(), "my_qst_et", "LroMhmrHbv");
        setField(term200351, term200351.getClass(), "p_std_ie_have", "nUWkEhozFC");
        setField(term200351, term200351.getClass(), "p_std_se_have", "cZOLUZUhxQ");
        setField(term200351, term200351.getClass(), "cmd", "fXCybRqtsq");
        setField(term200351, term200351.getClass(), "req_id", "gPhmseJiob");
        setField(term200351, term200351.getClass(), "stat", "dgpHJUBySN");
        term200792 = new Integer(-680529431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term200792;
        callMethod(klass, "setCnp_cid", argTypes, term200351, args);
    }

};


