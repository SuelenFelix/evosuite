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

public class PreStartResponse_getSkneqp_10378289517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263283;

    public PreStartResponse_getSkneqp_10378289517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term263441 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term263440 = ((Class) term263441).getDeclaredField((String) "ALREADY_PLAYING");
        ((Field) term263440).setAccessible(true);
        Object enum626 = ((Field) term263440).get((Object) null);
        Integer term263304 = new Integer(-1111249833);
        Integer term263306 = new Integer(-1692331299);
        Integer term263308 = new Integer(479531250);
        Integer term263310 = new Integer(1320570890);
        Integer term263312 = new Integer(-130649791);
        Class<? extends Object> term263773 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term263772 = ((Class) term263773).getDeclaredField((String) "MY_LIST_C");
        ((Field) term263772).setAccessible(true);
        Object enum627 = ((Field) term263772).get((Object) null);
        Integer term263340 = new Integer(534834644);
        Integer term263342 = new Integer(1959097203);
        Integer term263356 = new Integer(-209654048);
        Integer term263358 = new Integer(477625804);
        Integer term263382 = new Integer(252575029);
        Integer term263384 = new Integer(57189932);
        Integer term263386 = new Integer(1460722225);
        Integer term263388 = new Integer(1743224434);
        Integer term263390 = new Integer(842904495);
        Integer term263392 = new Integer(1008080511);
        Class<? extends Object> term264067 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term264066 = ((Class) term264067).getDeclaredField((String) "RESET");
        ((Field) term264066).setAccessible(true);
        Object enum628 = ((Field) term264066).get((Object) null);
        term263283 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term263372 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term263373 = newInstance(Class.forName("java.time.LocalDate"));
        Object term263377 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term263283, term263283.getClass(), "ps_result", enum626);
        setField(term263283, term263283.getClass(), "accept_idx", term263304);
        setField(term263283, term263283.getClass(), "nblss_ltt_stts", term263306);
        setField(term263283, term263283.getClass(), "nblss_ltt_tckt", term263308);
        setField(term263283, term263283.getClass(), "nblss_ltt_is_opn", term263310);
        setField(term263283, term263283.getClass(), "pd_id", term263312);
        setField(term263283, term263283.getClass(), "player_name", "JoFUYaQQtF");
        setField(term263283, term263283.getClass(), "sort_kind", enum627);
        setField(term263283, term263283.getClass(), "lv_num", term263340);
        setField(term263283, term263283.getClass(), "lv_pnt", term263342);
        setField(term263283, term263283.getClass(), "lv_str", "SAKoORlZVA");
        setField(term263283, term263283.getClass(), "lv_efct_id", term263356);
        setField(term263283, term263283.getClass(), "lv_plt_id", term263358);
        setField(term263283, term263283.getClass(), "mdl_eqp_ary", "HhYVbmMRiN");
        setIntField(term263373, term263373.getClass(), "year", 2012);
        setShortField(term263373, term263373.getClass(), "month", (short) 5);
        setShortField(term263373, term263373.getClass(), "day", (short) 25);
        setField(term263372, term263372.getClass(), "date", term263373);
        setByteField(term263377, term263377.getClass(), "hour", (byte) 5);
        setByteField(term263377, term263377.getClass(), "minute", (byte) 8);
        setByteField(term263377, term263377.getClass(), "second", (byte) 47);
        setIntField(term263377, term263377.getClass(), "nano", 455554221);
        setField(term263372, term263372.getClass(), "time", term263377);
        setField(term263283, term263283.getClass(), "mdl_eqp_tm", term263372);
        setField(term263283, term263283.getClass(), "skn_eqp", term263382);
        setField(term263283, term263283.getClass(), "btn_se_eqp", term263384);
        setField(term263283, term263283.getClass(), "sld_se_eqp", term263386);
        setField(term263283, term263283.getClass(), "chn_sld_se_eqp", term263388);
        setField(term263283, term263283.getClass(), "sldr_tch_se_eqp", term263390);
        setField(term263283, term263283.getClass(), "vcld_pts", term263392);
        setField(term263283, term263283.getClass(), "passwd_stat", enum628);
        setField(term263283, term263283.getClass(), "cmd", "UYEVBNEKyf");
        setField(term263283, term263283.getClass(), "req_id", "EXduYtKPaE");
        setField(term263283, term263283.getClass(), "stat", "UVMEqArKpY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkn_eqp", argTypes, term263283, args);
    }

};


