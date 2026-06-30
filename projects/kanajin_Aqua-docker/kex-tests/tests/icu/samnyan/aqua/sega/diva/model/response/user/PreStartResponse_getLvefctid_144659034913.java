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

public class PreStartResponse_getLvefctid_144659034913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259027;

    public PreStartResponse_getLvefctid_144659034913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term259183 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term259182 = ((Class) term259183).getDeclaredField((String) "ALREADY_PLAYING");
        ((Field) term259182).setAccessible(true);
        Object enum614 = ((Field) term259182).get((Object) null);
        Integer term259048 = new Integer(-1731761810);
        Integer term259050 = new Integer(197109649);
        Integer term259052 = new Integer(-1239406390);
        Integer term259054 = new Integer(1557431527);
        Integer term259056 = new Integer(-1504890659);
        Class<? extends Object> term259515 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term259514 = ((Class) term259515).getDeclaredField((String) "MY_LIST_A");
        ((Field) term259514).setAccessible(true);
        Object enum615 = ((Field) term259514).get((Object) null);
        Integer term259084 = new Integer(1358829571);
        Integer term259086 = new Integer(991356662);
        Integer term259100 = new Integer(-506958186);
        Integer term259102 = new Integer(-507387516);
        Integer term259126 = new Integer(-1970452551);
        Integer term259128 = new Integer(-1896376975);
        Integer term259130 = new Integer(729658803);
        Integer term259132 = new Integer(114754804);
        Integer term259134 = new Integer(1687361082);
        Integer term259136 = new Integer(584893196);
        Class<? extends Object> term259809 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term259808 = ((Class) term259809).getDeclaredField((String) "SET");
        ((Field) term259808).setAccessible(true);
        Object enum616 = ((Field) term259808).get((Object) null);
        term259027 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term259116 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term259117 = newInstance(Class.forName("java.time.LocalDate"));
        Object term259121 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term259027, term259027.getClass(), "ps_result", enum614);
        setField(term259027, term259027.getClass(), "accept_idx", term259048);
        setField(term259027, term259027.getClass(), "nblss_ltt_stts", term259050);
        setField(term259027, term259027.getClass(), "nblss_ltt_tckt", term259052);
        setField(term259027, term259027.getClass(), "nblss_ltt_is_opn", term259054);
        setField(term259027, term259027.getClass(), "pd_id", term259056);
        setField(term259027, term259027.getClass(), "player_name", "BhaPbaZeBl");
        setField(term259027, term259027.getClass(), "sort_kind", enum615);
        setField(term259027, term259027.getClass(), "lv_num", term259084);
        setField(term259027, term259027.getClass(), "lv_pnt", term259086);
        setField(term259027, term259027.getClass(), "lv_str", "GYqwdcmcTy");
        setField(term259027, term259027.getClass(), "lv_efct_id", term259100);
        setField(term259027, term259027.getClass(), "lv_plt_id", term259102);
        setField(term259027, term259027.getClass(), "mdl_eqp_ary", "gUVQwUdnBZ");
        setIntField(term259117, term259117.getClass(), "year", 2014);
        setShortField(term259117, term259117.getClass(), "month", (short) 5);
        setShortField(term259117, term259117.getClass(), "day", (short) 31);
        setField(term259116, term259116.getClass(), "date", term259117);
        setByteField(term259121, term259121.getClass(), "hour", (byte) 16);
        setByteField(term259121, term259121.getClass(), "minute", (byte) 3);
        setByteField(term259121, term259121.getClass(), "second", (byte) 14);
        setIntField(term259121, term259121.getClass(), "nano", 281059649);
        setField(term259116, term259116.getClass(), "time", term259121);
        setField(term259027, term259027.getClass(), "mdl_eqp_tm", term259116);
        setField(term259027, term259027.getClass(), "skn_eqp", term259126);
        setField(term259027, term259027.getClass(), "btn_se_eqp", term259128);
        setField(term259027, term259027.getClass(), "sld_se_eqp", term259130);
        setField(term259027, term259027.getClass(), "chn_sld_se_eqp", term259132);
        setField(term259027, term259027.getClass(), "sldr_tch_se_eqp", term259134);
        setField(term259027, term259027.getClass(), "vcld_pts", term259136);
        setField(term259027, term259027.getClass(), "passwd_stat", enum616);
        setField(term259027, term259027.getClass(), "cmd", "DbGJbEhLhl");
        setField(term259027, term259027.getClass(), "req_id", "BGxrtAjHqX");
        setField(term259027, term259027.getClass(), "stat", "ABkOTQedzY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_efct_id", argTypes, term259027, args);
    }

};


