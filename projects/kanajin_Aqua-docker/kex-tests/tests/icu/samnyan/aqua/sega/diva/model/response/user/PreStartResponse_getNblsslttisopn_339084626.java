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

public class PreStartResponse_getNblsslttisopn_339084626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251558;

    public PreStartResponse_getNblsslttisopn_339084626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term251714 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term251713 = ((Class) term251714).getDeclaredField((String) "CARD_BANNED");
        ((Field) term251713).setAccessible(true);
        Object enum593 = ((Field) term251713).get((Object) null);
        Integer term251575 = new Integer(1540719661);
        Integer term251577 = new Integer(1265463001);
        Integer term251579 = new Integer(335112684);
        Integer term251581 = new Integer(1551099402);
        Integer term251583 = new Integer(-2027534003);
        Class<? extends Object> term252034 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term252033 = ((Class) term252034).getDeclaredField((String) "MY_LIST_C");
        ((Field) term252033).setAccessible(true);
        Object enum594 = ((Field) term252033).get((Object) null);
        Integer term251611 = new Integer(1063420942);
        Integer term251613 = new Integer(1375330971);
        Integer term251627 = new Integer(-478195677);
        Integer term251629 = new Integer(972867650);
        Integer term251653 = new Integer(1655935355);
        Integer term251655 = new Integer(-481533957);
        Integer term251657 = new Integer(1240914516);
        Integer term251659 = new Integer(-1465035361);
        Integer term251661 = new Integer(1090617576);
        Integer term251663 = new Integer(-1547384488);
        Class<? extends Object> term252328 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term252327 = ((Class) term252328).getDeclaredField((String) "REISSUE");
        ((Field) term252327).setAccessible(true);
        Object enum595 = ((Field) term252327).get((Object) null);
        term251558 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term251643 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term251644 = newInstance(Class.forName("java.time.LocalDate"));
        Object term251648 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term251558, term251558.getClass(), "ps_result", enum593);
        setField(term251558, term251558.getClass(), "accept_idx", term251575);
        setField(term251558, term251558.getClass(), "nblss_ltt_stts", term251577);
        setField(term251558, term251558.getClass(), "nblss_ltt_tckt", term251579);
        setField(term251558, term251558.getClass(), "nblss_ltt_is_opn", term251581);
        setField(term251558, term251558.getClass(), "pd_id", term251583);
        setField(term251558, term251558.getClass(), "player_name", "aUqkaiSINd");
        setField(term251558, term251558.getClass(), "sort_kind", enum594);
        setField(term251558, term251558.getClass(), "lv_num", term251611);
        setField(term251558, term251558.getClass(), "lv_pnt", term251613);
        setField(term251558, term251558.getClass(), "lv_str", "IVtVcsDYoX");
        setField(term251558, term251558.getClass(), "lv_efct_id", term251627);
        setField(term251558, term251558.getClass(), "lv_plt_id", term251629);
        setField(term251558, term251558.getClass(), "mdl_eqp_ary", "GgQFLRdyzF");
        setIntField(term251644, term251644.getClass(), "year", 2013);
        setShortField(term251644, term251644.getClass(), "month", (short) 12);
        setShortField(term251644, term251644.getClass(), "day", (short) 23);
        setField(term251643, term251643.getClass(), "date", term251644);
        setByteField(term251648, term251648.getClass(), "hour", (byte) 1);
        setByteField(term251648, term251648.getClass(), "minute", (byte) 0);
        setByteField(term251648, term251648.getClass(), "second", (byte) 32);
        setIntField(term251648, term251648.getClass(), "nano", 168525686);
        setField(term251643, term251643.getClass(), "time", term251648);
        setField(term251558, term251558.getClass(), "mdl_eqp_tm", term251643);
        setField(term251558, term251558.getClass(), "skn_eqp", term251653);
        setField(term251558, term251558.getClass(), "btn_se_eqp", term251655);
        setField(term251558, term251558.getClass(), "sld_se_eqp", term251657);
        setField(term251558, term251558.getClass(), "chn_sld_se_eqp", term251659);
        setField(term251558, term251558.getClass(), "sldr_tch_se_eqp", term251661);
        setField(term251558, term251558.getClass(), "vcld_pts", term251663);
        setField(term251558, term251558.getClass(), "passwd_stat", enum595);
        setField(term251558, term251558.getClass(), "cmd", "irKkxyVwDT");
        setField(term251558, term251558.getClass(), "req_id", "vCUIiQSkZO");
        setField(term251558, term251558.getClass(), "stat", "oAVrawlRsA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNblss_ltt_is_opn", argTypes, term251558, args);
    }

};


