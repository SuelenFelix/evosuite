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

public class StartResponse_setSldrsevol2_22769007366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139329;
     Object term139773;

    public StartResponse_setSldrsevol2_22769007366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term139776 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term139775 = ((Class) term139776).getDeclaredField((String) "SUCCESS");
        ((Field) term139775).setAccessible(true);
        Object enum330 = ((Field) term139775).get((Object) null);
        Class<? extends Object> term140044 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term140043 = ((Class) term140044).getDeclaredField((String) "COMPLEXITY");
        ((Field) term140043).setAccessible(true);
        Object enum331 = ((Field) term140043).get((Object) null);
        Class<? extends Object> term140381 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term140380 = ((Class) term140381).getDeclaredField((String) "EXTREME");
        ((Field) term140380).setAccessible(true);
        Object enum332 = ((Field) term140380).get((Object) null);
        Class<? extends Object> term140659 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term140658 = ((Class) term140659).getDeclaredField((String) "EXTRA");
        ((Field) term140658).setAccessible(true);
        Object enum333 = ((Field) term140658).get((Object) null);
        Class<? extends Object> term140966 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term140965 = ((Class) term140966).getDeclaredField((String) "SILVER");
        ((Field) term140965).setAccessible(true);
        Object enum334 = ((Field) term140965).get((Object) null);
        term139329 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term139428 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term139429 = newInstance(Class.forName("java.time.LocalDate"));
        Object term139433 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term139329, term139329.getClass(), "pd_id", 66817373);
        setField(term139329, term139329.getClass(), "start_result", enum330);
        setIntField(term139329, term139329.getClass(), "accept_idx", 1459628013);
        setIntField(term139329, term139329.getClass(), "start_idx", -1641507499);
        setField(term139329, term139329.getClass(), "player_name", "RFmGKwvSgz");
        setIntField(term139329, term139329.getClass(), "hp_vol", -33436796);
        setBooleanField(term139329, term139329.getClass(), "btn_se_vol", false);
        setIntField(term139329, term139329.getClass(), "btn_se_vol2", -1527326823);
        setIntField(term139329, term139329.getClass(), "sldr_se_vol2", 469871899);
        setField(term139329, term139329.getClass(), "sort_kind", enum331);
        setIntField(term139329, term139329.getClass(), "lv_num", -1348703436);
        setIntField(term139329, term139329.getClass(), "lv_pnt", -2027012650);
        setField(term139329, term139329.getClass(), "lv_str", "EUEUhZglna");
        setIntField(term139329, term139329.getClass(), "lv_efct_id", 1343432022);
        setIntField(term139329, term139329.getClass(), "lv_plt_id", -1767079160);
        setField(term139329, term139329.getClass(), "mdl_eqp_ary", "znDPtjpZrG");
        setField(term139329, term139329.getClass(), "c_itm_eqp_ary", "uodLjxczjr");
        setField(term139329, term139329.getClass(), "ms_itm_flg_ary", "HJLVBQAtGs");
        setIntField(term139429, term139429.getClass(), "year", 2018);
        setShortField(term139429, term139429.getClass(), "month", (short) 2);
        setShortField(term139429, term139429.getClass(), "day", (short) 14);
        setField(term139428, term139428.getClass(), "date", term139429);
        setByteField(term139433, term139433.getClass(), "hour", (byte) 2);
        setByteField(term139433, term139433.getClass(), "minute", (byte) 40);
        setByteField(term139433, term139433.getClass(), "second", (byte) 48);
        setIntField(term139433, term139433.getClass(), "nano", 371006728);
        setField(term139428, term139428.getClass(), "time", term139433);
        setField(term139329, term139329.getClass(), "mdl_eqp_tm", term139428);
        setField(term139329, term139329.getClass(), "mdl_have", "dxAxECMYEm");
        setField(term139329, term139329.getClass(), "cstmz_itm_have", "ylGHeywyhx");
        setBooleanField(term139329, term139329.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term139329, term139329.getClass(), "use_mdl_pri", false);
        setBooleanField(term139329, term139329.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term139329, term139329.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term139329, term139329.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term139329, term139329.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term139329, term139329.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term139329, term139329.getClass(), "vcld_pts", -201010601);
        setIntField(term139329, term139329.getClass(), "nxt_pv_id", 2060027076);
        setField(term139329, term139329.getClass(), "nxt_dffclty", enum332);
        setField(term139329, term139329.getClass(), "nxt_edtn", enum333);
        setField(term139329, term139329.getClass(), "cv_cid", "SqMpUczXhg");
        setField(term139329, term139329.getClass(), "cv_sc", "voDQuoTpgt");
        setField(term139329, term139329.getClass(), "cv_rr", "wgwSIKAsrj");
        setField(term139329, term139329.getClass(), "cv_bv", "aGJCHRHyCe");
        setField(term139329, term139329.getClass(), "cv_bf", "WingwhSgfc");
        setIntField(term139329, term139329.getClass(), "cnp_cid", 2084868811);
        setIntField(term139329, term139329.getClass(), "cnp_val", 314478878);
        setField(term139329, term139329.getClass(), "cnp_rr", enum334);
        setField(term139329, term139329.getClass(), "cnp_sp", "YEcmxINfnL");
        setField(term139329, term139329.getClass(), "my_lst_0", "EGytMwlDVe");
        setField(term139329, term139329.getClass(), "my_lst_1", "GFQCmYZmcg");
        setField(term139329, term139329.getClass(), "my_lst_2", "qPgbFtsgtk");
        setField(term139329, term139329.getClass(), "my_lst_3", "nkmiePLZgp");
        setField(term139329, term139329.getClass(), "my_lst_4", "VoCvDpwwFr");
        setField(term139329, term139329.getClass(), "dsp_clr_brdr", "zYOmoQqDOd");
        setBooleanField(term139329, term139329.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term139329, term139329.getClass(), "dsp_clr_sts", true);
        setField(term139329, term139329.getClass(), "clr_sts", "kmgEVEqTGa");
        setBooleanField(term139329, term139329.getClass(), "rgo_sts", false);
        setField(term139329, term139329.getClass(), "my_qst_id", "qakIqInzyM");
        setField(term139329, term139329.getClass(), "my_qst_sts", "EOsBgwlmva");
        setField(term139329, term139329.getClass(), "my_qst_prgrs", "qcSJruZuJy");
        setField(term139329, term139329.getClass(), "my_qst_et", "NOSJtfgqAs");
        setField(term139329, term139329.getClass(), "p_std_ie_have", "SUDRrjpChc");
        setField(term139329, term139329.getClass(), "p_std_se_have", "pmpprxfFwy");
        setField(term139329, term139329.getClass(), "cmd", "AQbnQoJwOO");
        setField(term139329, term139329.getClass(), "req_id", "NnicBPzNzw");
        setField(term139329, term139329.getClass(), "stat", "WADNPbexnT");
        term139773 = new Integer(1425342686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term139773;
        callMethod(klass, "setSldr_se_vol2", argTypes, term139329, args);
    }

};


