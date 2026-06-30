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

public class PreStartResponse_getSldseeqp_41482549319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265413;

    public PreStartResponse_getSldseeqp_41482549319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term265561 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term265560 = ((Class) term265561).getDeclaredField((String) "FAILED");
        ((Field) term265560).setAccessible(true);
        Object enum632 = ((Field) term265560).get((Object) null);
        Integer term265425 = new Integer(515182546);
        Integer term265427 = new Integer(-936895502);
        Integer term265429 = new Integer(-129547140);
        Integer term265431 = new Integer(199287428);
        Integer term265433 = new Integer(-1195339592);
        Class<? extends Object> term265866 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term265865 = ((Class) term265866).getDeclaredField((String) "COMPLEXITY");
        ((Field) term265865).setAccessible(true);
        Object enum633 = ((Field) term265865).get((Object) null);
        Integer term265462 = new Integer(-376422566);
        Integer term265464 = new Integer(306847454);
        Integer term265478 = new Integer(1745276158);
        Integer term265480 = new Integer(2009020256);
        Integer term265504 = new Integer(2049577015);
        Integer term265506 = new Integer(1236004505);
        Integer term265508 = new Integer(1050765721);
        Integer term265510 = new Integer(474518942);
        Integer term265512 = new Integer(-1656687479);
        Integer term265514 = new Integer(-249614216);
        Class<? extends Object> term266163 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term266162 = ((Class) term266163).getDeclaredField((String) "SET");
        ((Field) term266162).setAccessible(true);
        Object enum634 = ((Field) term266162).get((Object) null);
        term265413 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term265494 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term265495 = newInstance(Class.forName("java.time.LocalDate"));
        Object term265499 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term265413, term265413.getClass(), "ps_result", enum632);
        setField(term265413, term265413.getClass(), "accept_idx", term265425);
        setField(term265413, term265413.getClass(), "nblss_ltt_stts", term265427);
        setField(term265413, term265413.getClass(), "nblss_ltt_tckt", term265429);
        setField(term265413, term265413.getClass(), "nblss_ltt_is_opn", term265431);
        setField(term265413, term265413.getClass(), "pd_id", term265433);
        setField(term265413, term265413.getClass(), "player_name", "McPsgamHga");
        setField(term265413, term265413.getClass(), "sort_kind", enum633);
        setField(term265413, term265413.getClass(), "lv_num", term265462);
        setField(term265413, term265413.getClass(), "lv_pnt", term265464);
        setField(term265413, term265413.getClass(), "lv_str", "wiqxbqDkJU");
        setField(term265413, term265413.getClass(), "lv_efct_id", term265478);
        setField(term265413, term265413.getClass(), "lv_plt_id", term265480);
        setField(term265413, term265413.getClass(), "mdl_eqp_ary", "psNunGzDVf");
        setIntField(term265495, term265495.getClass(), "year", 2020);
        setShortField(term265495, term265495.getClass(), "month", (short) 10);
        setShortField(term265495, term265495.getClass(), "day", (short) 8);
        setField(term265494, term265494.getClass(), "date", term265495);
        setByteField(term265499, term265499.getClass(), "hour", (byte) 15);
        setByteField(term265499, term265499.getClass(), "minute", (byte) 57);
        setByteField(term265499, term265499.getClass(), "second", (byte) 17);
        setIntField(term265499, term265499.getClass(), "nano", 288139529);
        setField(term265494, term265494.getClass(), "time", term265499);
        setField(term265413, term265413.getClass(), "mdl_eqp_tm", term265494);
        setField(term265413, term265413.getClass(), "skn_eqp", term265504);
        setField(term265413, term265413.getClass(), "btn_se_eqp", term265506);
        setField(term265413, term265413.getClass(), "sld_se_eqp", term265508);
        setField(term265413, term265413.getClass(), "chn_sld_se_eqp", term265510);
        setField(term265413, term265413.getClass(), "sldr_tch_se_eqp", term265512);
        setField(term265413, term265413.getClass(), "vcld_pts", term265514);
        setField(term265413, term265413.getClass(), "passwd_stat", enum634);
        setField(term265413, term265413.getClass(), "cmd", "YFOetAfnRt");
        setField(term265413, term265413.getClass(), "req_id", "VgCCefhtcT");
        setField(term265413, term265413.getClass(), "stat", "DEvoiMeeMr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSld_se_eqp", argTypes, term265413, args);
    }

};


