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

public class PreStartResponse_getAcceptidx_20114286663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248413;

    public PreStartResponse_getAcceptidx_20114286663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term248566 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term248565 = ((Class) term248566).getDeclaredField((String) "CARD_BANNED");
        ((Field) term248565).setAccessible(true);
        Object enum584 = ((Field) term248565).get((Object) null);
        Integer term248430 = new Integer(865208305);
        Integer term248432 = new Integer(-1275173084);
        Integer term248434 = new Integer(-244121226);
        Integer term248436 = new Integer(-203030934);
        Integer term248438 = new Integer(-1179120542);
        Class<? extends Object> term248886 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term248885 = ((Class) term248886).getDeclaredField((String) "COMPLEXITY");
        ((Field) term248885).setAccessible(true);
        Object enum585 = ((Field) term248885).get((Object) null);
        Integer term248467 = new Integer(-73683645);
        Integer term248469 = new Integer(-226514366);
        Integer term248483 = new Integer(1193880199);
        Integer term248485 = new Integer(-1087774327);
        Integer term248509 = new Integer(-1530420153);
        Integer term248511 = new Integer(-469968304);
        Integer term248513 = new Integer(-1145578966);
        Integer term248515 = new Integer(679763016);
        Integer term248517 = new Integer(1962444399);
        Integer term248519 = new Integer(767834723);
        Class<? extends Object> term249183 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term249182 = ((Class) term249183).getDeclaredField((String) "SET");
        ((Field) term249182).setAccessible(true);
        Object enum586 = ((Field) term249182).get((Object) null);
        term248413 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term248499 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term248500 = newInstance(Class.forName("java.time.LocalDate"));
        Object term248504 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term248413, term248413.getClass(), "ps_result", enum584);
        setField(term248413, term248413.getClass(), "accept_idx", term248430);
        setField(term248413, term248413.getClass(), "nblss_ltt_stts", term248432);
        setField(term248413, term248413.getClass(), "nblss_ltt_tckt", term248434);
        setField(term248413, term248413.getClass(), "nblss_ltt_is_opn", term248436);
        setField(term248413, term248413.getClass(), "pd_id", term248438);
        setField(term248413, term248413.getClass(), "player_name", "gvLQDVFTIF");
        setField(term248413, term248413.getClass(), "sort_kind", enum585);
        setField(term248413, term248413.getClass(), "lv_num", term248467);
        setField(term248413, term248413.getClass(), "lv_pnt", term248469);
        setField(term248413, term248413.getClass(), "lv_str", "ROkWEBVPGe");
        setField(term248413, term248413.getClass(), "lv_efct_id", term248483);
        setField(term248413, term248413.getClass(), "lv_plt_id", term248485);
        setField(term248413, term248413.getClass(), "mdl_eqp_ary", "BHWsGhxwwy");
        setIntField(term248500, term248500.getClass(), "year", 2024);
        setShortField(term248500, term248500.getClass(), "month", (short) 9);
        setShortField(term248500, term248500.getClass(), "day", (short) 22);
        setField(term248499, term248499.getClass(), "date", term248500);
        setByteField(term248504, term248504.getClass(), "hour", (byte) 0);
        setByteField(term248504, term248504.getClass(), "minute", (byte) 11);
        setByteField(term248504, term248504.getClass(), "second", (byte) 7);
        setIntField(term248504, term248504.getClass(), "nano", 56643259);
        setField(term248499, term248499.getClass(), "time", term248504);
        setField(term248413, term248413.getClass(), "mdl_eqp_tm", term248499);
        setField(term248413, term248413.getClass(), "skn_eqp", term248509);
        setField(term248413, term248413.getClass(), "btn_se_eqp", term248511);
        setField(term248413, term248413.getClass(), "sld_se_eqp", term248513);
        setField(term248413, term248413.getClass(), "chn_sld_se_eqp", term248515);
        setField(term248413, term248413.getClass(), "sldr_tch_se_eqp", term248517);
        setField(term248413, term248413.getClass(), "vcld_pts", term248519);
        setField(term248413, term248413.getClass(), "passwd_stat", enum586);
        setField(term248413, term248413.getClass(), "cmd", "AOwXDxldzy");
        setField(term248413, term248413.getClass(), "req_id", "oPjvcZQHAL");
        setField(term248413, term248413.getClass(), "stat", "uCNCXXRNau");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccept_idx", argTypes, term248413, args);
    }

};


