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

public class StartResponse_setRgosts_300265060108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227962;
     Object term228404;

    public StartResponse_setRgosts_300265060108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term228407 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term228406 = ((Class) term228407).getDeclaredField((String) "SUCCESS");
        ((Field) term228406).setAccessible(true);
        Object enum542 = ((Field) term228406).get((Object) null);
        Class<? extends Object> term228675 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term228674 = ((Class) term228675).getDeclaredField((String) "MY_LIST_C");
        ((Field) term228674).setAccessible(true);
        Object enum543 = ((Field) term228674).get((Object) null);
        Class<? extends Object> term229009 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term229008 = ((Class) term229009).getDeclaredField((String) "NORMAL");
        ((Field) term229008).setAccessible(true);
        Object enum544 = ((Field) term229008).get((Object) null);
        Class<? extends Object> term229284 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term229283 = ((Class) term229284).getDeclaredField((String) "EXTRA");
        ((Field) term229283).setAccessible(true);
        Object enum545 = ((Field) term229283).get((Object) null);
        Class<? extends Object> term229591 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term229590 = ((Class) term229591).getDeclaredField((String) "SILVER");
        ((Field) term229590).setAccessible(true);
        Object enum546 = ((Field) term229590).get((Object) null);
        term227962 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term228060 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term228061 = newInstance(Class.forName("java.time.LocalDate"));
        Object term228065 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term227962, term227962.getClass(), "pd_id", 1825448944);
        setField(term227962, term227962.getClass(), "start_result", enum542);
        setIntField(term227962, term227962.getClass(), "accept_idx", 1769496642);
        setIntField(term227962, term227962.getClass(), "start_idx", -947460705);
        setField(term227962, term227962.getClass(), "player_name", "EsQWMjShML");
        setIntField(term227962, term227962.getClass(), "hp_vol", -1435758764);
        setBooleanField(term227962, term227962.getClass(), "btn_se_vol", true);
        setIntField(term227962, term227962.getClass(), "btn_se_vol2", 752858379);
        setIntField(term227962, term227962.getClass(), "sldr_se_vol2", -370819357);
        setField(term227962, term227962.getClass(), "sort_kind", enum543);
        setIntField(term227962, term227962.getClass(), "lv_num", -71819242);
        setIntField(term227962, term227962.getClass(), "lv_pnt", 1268893136);
        setField(term227962, term227962.getClass(), "lv_str", "JPgLQWnVaG");
        setIntField(term227962, term227962.getClass(), "lv_efct_id", -1472700822);
        setIntField(term227962, term227962.getClass(), "lv_plt_id", 1626670889);
        setField(term227962, term227962.getClass(), "mdl_eqp_ary", "IOLqavRFIA");
        setField(term227962, term227962.getClass(), "c_itm_eqp_ary", "FpmxstceWP");
        setField(term227962, term227962.getClass(), "ms_itm_flg_ary", "JhehNkztDU");
        setIntField(term228061, term228061.getClass(), "year", 2012);
        setShortField(term228061, term228061.getClass(), "month", (short) 2);
        setShortField(term228061, term228061.getClass(), "day", (short) 29);
        setField(term228060, term228060.getClass(), "date", term228061);
        setByteField(term228065, term228065.getClass(), "hour", (byte) 14);
        setByteField(term228065, term228065.getClass(), "minute", (byte) 26);
        setByteField(term228065, term228065.getClass(), "second", (byte) 20);
        setIntField(term228065, term228065.getClass(), "nano", 780823452);
        setField(term228060, term228060.getClass(), "time", term228065);
        setField(term227962, term227962.getClass(), "mdl_eqp_tm", term228060);
        setField(term227962, term227962.getClass(), "mdl_have", "axzwQpwfps");
        setField(term227962, term227962.getClass(), "cstmz_itm_have", "SRphuuiFTJ");
        setBooleanField(term227962, term227962.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term227962, term227962.getClass(), "use_mdl_pri", false);
        setBooleanField(term227962, term227962.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term227962, term227962.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term227962, term227962.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term227962, term227962.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term227962, term227962.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term227962, term227962.getClass(), "vcld_pts", -2117361140);
        setIntField(term227962, term227962.getClass(), "nxt_pv_id", 407708341);
        setField(term227962, term227962.getClass(), "nxt_dffclty", enum544);
        setField(term227962, term227962.getClass(), "nxt_edtn", enum545);
        setField(term227962, term227962.getClass(), "cv_cid", "SLJslBhpEj");
        setField(term227962, term227962.getClass(), "cv_sc", "BkSzKYsyMt");
        setField(term227962, term227962.getClass(), "cv_rr", "BehEjNaXVK");
        setField(term227962, term227962.getClass(), "cv_bv", "TrunCyrewP");
        setField(term227962, term227962.getClass(), "cv_bf", "NGQmiHNyCj");
        setIntField(term227962, term227962.getClass(), "cnp_cid", -287519200);
        setIntField(term227962, term227962.getClass(), "cnp_val", -1490696181);
        setField(term227962, term227962.getClass(), "cnp_rr", enum546);
        setField(term227962, term227962.getClass(), "cnp_sp", "fJerFGYlGC");
        setField(term227962, term227962.getClass(), "my_lst_0", "CvltyVwJfx");
        setField(term227962, term227962.getClass(), "my_lst_1", "aKQcZIBmMO");
        setField(term227962, term227962.getClass(), "my_lst_2", "izEIjACTdh");
        setField(term227962, term227962.getClass(), "my_lst_3", "FBpdKznMSt");
        setField(term227962, term227962.getClass(), "my_lst_4", "LCjhPHXcwj");
        setField(term227962, term227962.getClass(), "dsp_clr_brdr", "inoNzxBFDa");
        setBooleanField(term227962, term227962.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term227962, term227962.getClass(), "dsp_clr_sts", true);
        setField(term227962, term227962.getClass(), "clr_sts", "dFDHlXwhMk");
        setBooleanField(term227962, term227962.getClass(), "rgo_sts", false);
        setField(term227962, term227962.getClass(), "my_qst_id", "AUMXeSohOi");
        setField(term227962, term227962.getClass(), "my_qst_sts", "HjZSMjBIEl");
        setField(term227962, term227962.getClass(), "my_qst_prgrs", "SQQNAxPlwz");
        setField(term227962, term227962.getClass(), "my_qst_et", "AoOgJDNbaF");
        setField(term227962, term227962.getClass(), "p_std_ie_have", "PoxurfXwit");
        setField(term227962, term227962.getClass(), "p_std_se_have", "fhKxidKBbV");
        setField(term227962, term227962.getClass(), "cmd", "SIJmlwIkel");
        setField(term227962, term227962.getClass(), "req_id", "lqucbHOiHE");
        setField(term227962, term227962.getClass(), "stat", "AtnEadrVWF");
        term228404 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term228404;
        callMethod(klass, "setRgo_sts", argTypes, term227962, args);
    }

};


