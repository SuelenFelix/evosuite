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

public class PreStartResponse_getBtnseeqp_177010845418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264358;

    public PreStartResponse_getBtnseeqp_177010845418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term264511 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term264510 = ((Class) term264511).getDeclaredField((String) "ALREADY_PLAYING");
        ((Field) term264510).setAccessible(true);
        Object enum629 = ((Field) term264510).get((Object) null);
        Integer term264379 = new Integer(1935707624);
        Integer term264381 = new Integer(1507074215);
        Integer term264383 = new Integer(-282881827);
        Integer term264385 = new Integer(-1183353915);
        Integer term264387 = new Integer(-420030135);
        Class<? extends Object> term264843 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term264842 = ((Class) term264843).getDeclaredField((String) "NAME");
        ((Field) term264842).setAccessible(true);
        Object enum630 = ((Field) term264842).get((Object) null);
        Integer term264410 = new Integer(267763294);
        Integer term264412 = new Integer(-1497710478);
        Integer term264426 = new Integer(49950830);
        Integer term264428 = new Integer(-525257914);
        Integer term264452 = new Integer(147209682);
        Integer term264454 = new Integer(34470066);
        Integer term264456 = new Integer(2058711405);
        Integer term264458 = new Integer(1743683601);
        Integer term264460 = new Integer(-945116798);
        Integer term264462 = new Integer(1593461795);
        Class<? extends Object> term265122 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term265121 = ((Class) term265122).getDeclaredField((String) "RESET");
        ((Field) term265121).setAccessible(true);
        Object enum631 = ((Field) term265121).get((Object) null);
        term264358 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term264442 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term264443 = newInstance(Class.forName("java.time.LocalDate"));
        Object term264447 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term264358, term264358.getClass(), "ps_result", enum629);
        setField(term264358, term264358.getClass(), "accept_idx", term264379);
        setField(term264358, term264358.getClass(), "nblss_ltt_stts", term264381);
        setField(term264358, term264358.getClass(), "nblss_ltt_tckt", term264383);
        setField(term264358, term264358.getClass(), "nblss_ltt_is_opn", term264385);
        setField(term264358, term264358.getClass(), "pd_id", term264387);
        setField(term264358, term264358.getClass(), "player_name", "fLbDziHEHK");
        setField(term264358, term264358.getClass(), "sort_kind", enum630);
        setField(term264358, term264358.getClass(), "lv_num", term264410);
        setField(term264358, term264358.getClass(), "lv_pnt", term264412);
        setField(term264358, term264358.getClass(), "lv_str", "lzRecPiQNU");
        setField(term264358, term264358.getClass(), "lv_efct_id", term264426);
        setField(term264358, term264358.getClass(), "lv_plt_id", term264428);
        setField(term264358, term264358.getClass(), "mdl_eqp_ary", "CVfKmjoLKq");
        setIntField(term264443, term264443.getClass(), "year", 2029);
        setShortField(term264443, term264443.getClass(), "month", (short) 11);
        setShortField(term264443, term264443.getClass(), "day", (short) 18);
        setField(term264442, term264442.getClass(), "date", term264443);
        setByteField(term264447, term264447.getClass(), "hour", (byte) 5);
        setByteField(term264447, term264447.getClass(), "minute", (byte) 36);
        setByteField(term264447, term264447.getClass(), "second", (byte) 57);
        setIntField(term264447, term264447.getClass(), "nano", 394167804);
        setField(term264442, term264442.getClass(), "time", term264447);
        setField(term264358, term264358.getClass(), "mdl_eqp_tm", term264442);
        setField(term264358, term264358.getClass(), "skn_eqp", term264452);
        setField(term264358, term264358.getClass(), "btn_se_eqp", term264454);
        setField(term264358, term264358.getClass(), "sld_se_eqp", term264456);
        setField(term264358, term264358.getClass(), "chn_sld_se_eqp", term264458);
        setField(term264358, term264358.getClass(), "sldr_tch_se_eqp", term264460);
        setField(term264358, term264358.getClass(), "vcld_pts", term264462);
        setField(term264358, term264358.getClass(), "passwd_stat", enum631);
        setField(term264358, term264358.getClass(), "cmd", "zvqciKTUAl");
        setField(term264358, term264358.getClass(), "req_id", "hvNiDuvOYJ");
        setField(term264358, term264358.getClass(), "stat", "unTIyPhfcW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBtn_se_eqp", argTypes, term264358, args);
    }

};


