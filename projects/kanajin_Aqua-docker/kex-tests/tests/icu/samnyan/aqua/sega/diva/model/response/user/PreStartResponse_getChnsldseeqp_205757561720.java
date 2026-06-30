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

public class PreStartResponse_getChnsldseeqp_205757561720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266448;

    public PreStartResponse_getChnsldseeqp_205757561720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term266606 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term266605 = ((Class) term266606).getDeclaredField((String) "NEW_REGISTRATION");
        ((Field) term266605).setAccessible(true);
        Object enum635 = ((Field) term266605).get((Object) null);
        Integer term266470 = new Integer(1870727665);
        Integer term266472 = new Integer(-519881101);
        Integer term266474 = new Integer(-680920524);
        Integer term266476 = new Integer(-916335264);
        Integer term266478 = new Integer(-919416536);
        Class<? extends Object> term266941 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term266940 = ((Class) term266941).getDeclaredField((String) "MY_LIST_C");
        ((Field) term266940).setAccessible(true);
        Object enum636 = ((Field) term266940).get((Object) null);
        Integer term266506 = new Integer(-43417861);
        Integer term266508 = new Integer(-1533843432);
        Integer term266522 = new Integer(-123338791);
        Integer term266524 = new Integer(-1467089634);
        Integer term266548 = new Integer(413548937);
        Integer term266550 = new Integer(1901317214);
        Integer term266552 = new Integer(1166710220);
        Integer term266554 = new Integer(-1070592289);
        Integer term266556 = new Integer(-1464172784);
        Integer term266558 = new Integer(32185364);
        Class<? extends Object> term267235 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term267234 = ((Class) term267235).getDeclaredField((String) "MISS");
        ((Field) term267234).setAccessible(true);
        Object enum637 = ((Field) term267234).get((Object) null);
        term266448 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term266538 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term266539 = newInstance(Class.forName("java.time.LocalDate"));
        Object term266543 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term266448, term266448.getClass(), "ps_result", enum635);
        setField(term266448, term266448.getClass(), "accept_idx", term266470);
        setField(term266448, term266448.getClass(), "nblss_ltt_stts", term266472);
        setField(term266448, term266448.getClass(), "nblss_ltt_tckt", term266474);
        setField(term266448, term266448.getClass(), "nblss_ltt_is_opn", term266476);
        setField(term266448, term266448.getClass(), "pd_id", term266478);
        setField(term266448, term266448.getClass(), "player_name", "CeaAfrYZQU");
        setField(term266448, term266448.getClass(), "sort_kind", enum636);
        setField(term266448, term266448.getClass(), "lv_num", term266506);
        setField(term266448, term266448.getClass(), "lv_pnt", term266508);
        setField(term266448, term266448.getClass(), "lv_str", "hLWnnngzRq");
        setField(term266448, term266448.getClass(), "lv_efct_id", term266522);
        setField(term266448, term266448.getClass(), "lv_plt_id", term266524);
        setField(term266448, term266448.getClass(), "mdl_eqp_ary", "iLNHwyhEDE");
        setIntField(term266539, term266539.getClass(), "year", 2022);
        setShortField(term266539, term266539.getClass(), "month", (short) 6);
        setShortField(term266539, term266539.getClass(), "day", (short) 12);
        setField(term266538, term266538.getClass(), "date", term266539);
        setByteField(term266543, term266543.getClass(), "hour", (byte) 14);
        setByteField(term266543, term266543.getClass(), "minute", (byte) 3);
        setByteField(term266543, term266543.getClass(), "second", (byte) 7);
        setIntField(term266543, term266543.getClass(), "nano", 637592645);
        setField(term266538, term266538.getClass(), "time", term266543);
        setField(term266448, term266448.getClass(), "mdl_eqp_tm", term266538);
        setField(term266448, term266448.getClass(), "skn_eqp", term266548);
        setField(term266448, term266448.getClass(), "btn_se_eqp", term266550);
        setField(term266448, term266448.getClass(), "sld_se_eqp", term266552);
        setField(term266448, term266448.getClass(), "chn_sld_se_eqp", term266554);
        setField(term266448, term266448.getClass(), "sldr_tch_se_eqp", term266556);
        setField(term266448, term266448.getClass(), "vcld_pts", term266558);
        setField(term266448, term266448.getClass(), "passwd_stat", enum637);
        setField(term266448, term266448.getClass(), "cmd", "duILkPooNH");
        setField(term266448, term266448.getClass(), "req_id", "bUJrQeiZOb");
        setField(term266448, term266448.getClass(), "stat", "mQqpexSybQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChn_sld_se_eqp", argTypes, term266448, args);
    }

};


