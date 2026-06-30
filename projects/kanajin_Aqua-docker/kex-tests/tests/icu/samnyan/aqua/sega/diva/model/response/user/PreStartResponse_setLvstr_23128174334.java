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

public class PreStartResponse_setLvstr_23128174334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282032;

    public PreStartResponse_setLvstr_23128174334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term282208 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term282207 = ((Class) term282208).getDeclaredField((String) "NEW_REGISTRATION");
        ((Field) term282207).setAccessible(true);
        Object enum679 = ((Field) term282207).get((Object) null);
        Integer term282054 = new Integer(21031843);
        Integer term282056 = new Integer(-380787857);
        Integer term282058 = new Integer(319853052);
        Integer term282060 = new Integer(-1097563716);
        Integer term282062 = new Integer(1572907769);
        Class<? extends Object> term282543 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term282542 = ((Class) term282543).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term282542).setAccessible(true);
        Object enum680 = ((Field) term282542).get((Object) null);
        Integer term282093 = new Integer(1608016787);
        Integer term282095 = new Integer(-516303035);
        Integer term282109 = new Integer(-2143043890);
        Integer term282111 = new Integer(-2138825831);
        Integer term282135 = new Integer(1454781562);
        Integer term282137 = new Integer(-27944011);
        Integer term282139 = new Integer(-20614472);
        Integer term282141 = new Integer(1126618861);
        Integer term282143 = new Integer(947449400);
        Integer term282145 = new Integer(-763799087);
        Class<? extends Object> term282846 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term282845 = ((Class) term282846).getDeclaredField((String) "REISSUE");
        ((Field) term282845).setAccessible(true);
        Object enum681 = ((Field) term282845).get((Object) null);
        term282032 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term282125 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term282126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282130 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term282032, term282032.getClass(), "ps_result", enum679);
        setField(term282032, term282032.getClass(), "accept_idx", term282054);
        setField(term282032, term282032.getClass(), "nblss_ltt_stts", term282056);
        setField(term282032, term282032.getClass(), "nblss_ltt_tckt", term282058);
        setField(term282032, term282032.getClass(), "nblss_ltt_is_opn", term282060);
        setField(term282032, term282032.getClass(), "pd_id", term282062);
        setField(term282032, term282032.getClass(), "player_name", "DLYPXnIorY");
        setField(term282032, term282032.getClass(), "sort_kind", enum680);
        setField(term282032, term282032.getClass(), "lv_num", term282093);
        setField(term282032, term282032.getClass(), "lv_pnt", term282095);
        setField(term282032, term282032.getClass(), "lv_str", "MaEbckWDBJ");
        setField(term282032, term282032.getClass(), "lv_efct_id", term282109);
        setField(term282032, term282032.getClass(), "lv_plt_id", term282111);
        setField(term282032, term282032.getClass(), "mdl_eqp_ary", "kxuScrxaGm");
        setIntField(term282126, term282126.getClass(), "year", 2021);
        setShortField(term282126, term282126.getClass(), "month", (short) 8);
        setShortField(term282126, term282126.getClass(), "day", (short) 23);
        setField(term282125, term282125.getClass(), "date", term282126);
        setByteField(term282130, term282130.getClass(), "hour", (byte) 15);
        setByteField(term282130, term282130.getClass(), "minute", (byte) 43);
        setByteField(term282130, term282130.getClass(), "second", (byte) 10);
        setIntField(term282130, term282130.getClass(), "nano", 893504165);
        setField(term282125, term282125.getClass(), "time", term282130);
        setField(term282032, term282032.getClass(), "mdl_eqp_tm", term282125);
        setField(term282032, term282032.getClass(), "skn_eqp", term282135);
        setField(term282032, term282032.getClass(), "btn_se_eqp", term282137);
        setField(term282032, term282032.getClass(), "sld_se_eqp", term282139);
        setField(term282032, term282032.getClass(), "chn_sld_se_eqp", term282141);
        setField(term282032, term282032.getClass(), "sldr_tch_se_eqp", term282143);
        setField(term282032, term282032.getClass(), "vcld_pts", term282145);
        setField(term282032, term282032.getClass(), "passwd_stat", enum681);
        setField(term282032, term282032.getClass(), "cmd", "ItamIWoOLr");
        setField(term282032, term282032.getClass(), "req_id", "YeemjiDgab");
        setField(term282032, term282032.getClass(), "stat", "tihFwBkjdt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "llYGfgCigY";
        callMethod(klass, "setLv_str", argTypes, term282032, args);
    }

};


