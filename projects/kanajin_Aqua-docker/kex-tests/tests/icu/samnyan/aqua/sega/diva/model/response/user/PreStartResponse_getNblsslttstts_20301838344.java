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

public class PreStartResponse_getNblsslttstts_20301838344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249468;

    public PreStartResponse_getNblsslttstts_20301838344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term249620 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term249619 = ((Class) term249620).getDeclaredField((String) "ALREADY_PLAYING");
        ((Field) term249619).setAccessible(true);
        Object enum587 = ((Field) term249619).get((Object) null);
        Integer term249489 = new Integer(-602026508);
        Integer term249491 = new Integer(-157887805);
        Integer term249493 = new Integer(1876565163);
        Integer term249495 = new Integer(-817164822);
        Integer term249497 = new Integer(-1016503459);
        Class<? extends Object> term249952 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term249951 = ((Class) term249952).getDeclaredField((String) "NAME");
        ((Field) term249951).setAccessible(true);
        Object enum588 = ((Field) term249951).get((Object) null);
        Integer term249520 = new Integer(-1968847291);
        Integer term249522 = new Integer(579005622);
        Integer term249536 = new Integer(-14890619);
        Integer term249538 = new Integer(1632125673);
        Integer term249562 = new Integer(454281060);
        Integer term249564 = new Integer(-1786399638);
        Integer term249566 = new Integer(2055867847);
        Integer term249568 = new Integer(-1048298087);
        Integer term249570 = new Integer(292681826);
        Integer term249572 = new Integer(458147407);
        Class<? extends Object> term250231 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term250230 = ((Class) term250231).getDeclaredField((String) "MISS");
        ((Field) term250230).setAccessible(true);
        Object enum589 = ((Field) term250230).get((Object) null);
        term249468 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term249552 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term249553 = newInstance(Class.forName("java.time.LocalDate"));
        Object term249557 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term249468, term249468.getClass(), "ps_result", enum587);
        setField(term249468, term249468.getClass(), "accept_idx", term249489);
        setField(term249468, term249468.getClass(), "nblss_ltt_stts", term249491);
        setField(term249468, term249468.getClass(), "nblss_ltt_tckt", term249493);
        setField(term249468, term249468.getClass(), "nblss_ltt_is_opn", term249495);
        setField(term249468, term249468.getClass(), "pd_id", term249497);
        setField(term249468, term249468.getClass(), "player_name", "eRcAzhxOsA");
        setField(term249468, term249468.getClass(), "sort_kind", enum588);
        setField(term249468, term249468.getClass(), "lv_num", term249520);
        setField(term249468, term249468.getClass(), "lv_pnt", term249522);
        setField(term249468, term249468.getClass(), "lv_str", "uyydsCcltT");
        setField(term249468, term249468.getClass(), "lv_efct_id", term249536);
        setField(term249468, term249468.getClass(), "lv_plt_id", term249538);
        setField(term249468, term249468.getClass(), "mdl_eqp_ary", "gRGZBrxxxv");
        setIntField(term249553, term249553.getClass(), "year", 2021);
        setShortField(term249553, term249553.getClass(), "month", (short) 12);
        setShortField(term249553, term249553.getClass(), "day", (short) 21);
        setField(term249552, term249552.getClass(), "date", term249553);
        setByteField(term249557, term249557.getClass(), "hour", (byte) 12);
        setByteField(term249557, term249557.getClass(), "minute", (byte) 59);
        setByteField(term249557, term249557.getClass(), "second", (byte) 52);
        setIntField(term249557, term249557.getClass(), "nano", 47081639);
        setField(term249552, term249552.getClass(), "time", term249557);
        setField(term249468, term249468.getClass(), "mdl_eqp_tm", term249552);
        setField(term249468, term249468.getClass(), "skn_eqp", term249562);
        setField(term249468, term249468.getClass(), "btn_se_eqp", term249564);
        setField(term249468, term249468.getClass(), "sld_se_eqp", term249566);
        setField(term249468, term249468.getClass(), "chn_sld_se_eqp", term249568);
        setField(term249468, term249468.getClass(), "sldr_tch_se_eqp", term249570);
        setField(term249468, term249468.getClass(), "vcld_pts", term249572);
        setField(term249468, term249468.getClass(), "passwd_stat", enum589);
        setField(term249468, term249468.getClass(), "cmd", "YvYPXzCrcU");
        setField(term249468, term249468.getClass(), "req_id", "KESrHnsKCa");
        setField(term249468, term249468.getClass(), "stat", "PRagOHCKmN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNblss_ltt_stts", argTypes, term249468, args);
    }

};


