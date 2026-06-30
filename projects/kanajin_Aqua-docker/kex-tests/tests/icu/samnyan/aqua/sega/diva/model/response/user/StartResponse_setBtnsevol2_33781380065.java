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

public class StartResponse_setBtnsevol2_33781380065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137225;
     Object term137671;

    public StartResponse_setBtnsevol2_33781380065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term137674 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term137673 = ((Class) term137674).getDeclaredField((String) "SUCCESS");
        ((Field) term137673).setAccessible(true);
        Object enum325 = ((Field) term137673).get((Object) null);
        Class<? extends Object> term137942 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term137941 = ((Class) term137942).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term137941).setAccessible(true);
        Object enum326 = ((Field) term137941).get((Object) null);
        Class<? extends Object> term138285 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term138284 = ((Class) term138285).getDeclaredField((String) "HARD");
        ((Field) term138284).setAccessible(true);
        Object enum327 = ((Field) term138284).get((Object) null);
        Class<? extends Object> term138554 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term138553 = ((Class) term138554).getDeclaredField((String) "ORIGINAL");
        ((Field) term138553).setAccessible(true);
        Object enum328 = ((Field) term138553).get((Object) null);
        Class<? extends Object> term138870 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term138869 = ((Class) term138870).getDeclaredField((String) "BRONZE");
        ((Field) term138869).setAccessible(true);
        Object enum329 = ((Field) term138869).get((Object) null);
        term137225 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term137326 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term137327 = newInstance(Class.forName("java.time.LocalDate"));
        Object term137331 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term137225, term137225.getClass(), "pd_id", 1013801066);
        setField(term137225, term137225.getClass(), "start_result", enum325);
        setIntField(term137225, term137225.getClass(), "accept_idx", 1512541853);
        setIntField(term137225, term137225.getClass(), "start_idx", -965421502);
        setField(term137225, term137225.getClass(), "player_name", "BuNQAVaNCe");
        setIntField(term137225, term137225.getClass(), "hp_vol", 1319026002);
        setBooleanField(term137225, term137225.getClass(), "btn_se_vol", true);
        setIntField(term137225, term137225.getClass(), "btn_se_vol2", -1368173231);
        setIntField(term137225, term137225.getClass(), "sldr_se_vol2", 1956006038);
        setField(term137225, term137225.getClass(), "sort_kind", enum326);
        setIntField(term137225, term137225.getClass(), "lv_num", -1062304878);
        setIntField(term137225, term137225.getClass(), "lv_pnt", -1377876610);
        setField(term137225, term137225.getClass(), "lv_str", "iaYiUQnOLD");
        setIntField(term137225, term137225.getClass(), "lv_efct_id", -1456184732);
        setIntField(term137225, term137225.getClass(), "lv_plt_id", 1689228897);
        setField(term137225, term137225.getClass(), "mdl_eqp_ary", "upnleTLVdf");
        setField(term137225, term137225.getClass(), "c_itm_eqp_ary", "pvjlKAnxzJ");
        setField(term137225, term137225.getClass(), "ms_itm_flg_ary", "ejxUBDQQKB");
        setIntField(term137327, term137327.getClass(), "year", 2027);
        setShortField(term137327, term137327.getClass(), "month", (short) 7);
        setShortField(term137327, term137327.getClass(), "day", (short) 23);
        setField(term137326, term137326.getClass(), "date", term137327);
        setByteField(term137331, term137331.getClass(), "hour", (byte) 12);
        setByteField(term137331, term137331.getClass(), "minute", (byte) 6);
        setByteField(term137331, term137331.getClass(), "second", (byte) 19);
        setIntField(term137331, term137331.getClass(), "nano", 8025683);
        setField(term137326, term137326.getClass(), "time", term137331);
        setField(term137225, term137225.getClass(), "mdl_eqp_tm", term137326);
        setField(term137225, term137225.getClass(), "mdl_have", "IbOvZLmtSE");
        setField(term137225, term137225.getClass(), "cstmz_itm_have", "AOsIglRFcp");
        setBooleanField(term137225, term137225.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term137225, term137225.getClass(), "use_mdl_pri", false);
        setBooleanField(term137225, term137225.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term137225, term137225.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term137225, term137225.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term137225, term137225.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term137225, term137225.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term137225, term137225.getClass(), "vcld_pts", 892205855);
        setIntField(term137225, term137225.getClass(), "nxt_pv_id", 1955560079);
        setField(term137225, term137225.getClass(), "nxt_dffclty", enum327);
        setField(term137225, term137225.getClass(), "nxt_edtn", enum328);
        setField(term137225, term137225.getClass(), "cv_cid", "bdONLhBZoA");
        setField(term137225, term137225.getClass(), "cv_sc", "qPVeRcolUe");
        setField(term137225, term137225.getClass(), "cv_rr", "AscZyfQFkU");
        setField(term137225, term137225.getClass(), "cv_bv", "nPfruizWey");
        setField(term137225, term137225.getClass(), "cv_bf", "RvgkUqMUFX");
        setIntField(term137225, term137225.getClass(), "cnp_cid", -1330529019);
        setIntField(term137225, term137225.getClass(), "cnp_val", 237134844);
        setField(term137225, term137225.getClass(), "cnp_rr", enum329);
        setField(term137225, term137225.getClass(), "cnp_sp", "nOqmldTbXj");
        setField(term137225, term137225.getClass(), "my_lst_0", "xNDnWDGUNx");
        setField(term137225, term137225.getClass(), "my_lst_1", "faGVqjLquQ");
        setField(term137225, term137225.getClass(), "my_lst_2", "MbsTNUmNqV");
        setField(term137225, term137225.getClass(), "my_lst_3", "VdDIonpedU");
        setField(term137225, term137225.getClass(), "my_lst_4", "VjtXZcUFNx");
        setField(term137225, term137225.getClass(), "dsp_clr_brdr", "bOZSTccXbt");
        setBooleanField(term137225, term137225.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term137225, term137225.getClass(), "dsp_clr_sts", true);
        setField(term137225, term137225.getClass(), "clr_sts", "MBSsxxeNUU");
        setBooleanField(term137225, term137225.getClass(), "rgo_sts", false);
        setField(term137225, term137225.getClass(), "my_qst_id", "NmUhmPLSgG");
        setField(term137225, term137225.getClass(), "my_qst_sts", "WJosrfBMfA");
        setField(term137225, term137225.getClass(), "my_qst_prgrs", "ttlGywalKc");
        setField(term137225, term137225.getClass(), "my_qst_et", "rQFBspqBzf");
        setField(term137225, term137225.getClass(), "p_std_ie_have", "FmWhAOGAMI");
        setField(term137225, term137225.getClass(), "p_std_se_have", "GdjCkRsIrS");
        setField(term137225, term137225.getClass(), "cmd", "MJNyYzLhkh");
        setField(term137225, term137225.getClass(), "req_id", "DEugGJIaYt");
        setField(term137225, term137225.getClass(), "stat", "lzZIObOJmC");
        term137671 = new Integer(2076413861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term137671;
        callMethod(klass, "setBtn_se_vol2", argTypes, term137225, args);
    }

};


