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

public class PreStartResponse_getPsresult_13269071422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247362;

    public PreStartResponse_getPsresult_13269071422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term247514 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term247513 = ((Class) term247514).getDeclaredField((String) "NEW_REGISTRATION");
        ((Field) term247513).setAccessible(true);
        Object enum581 = ((Field) term247513).get((Object) null);
        Integer term247384 = new Integer(1134449235);
        Integer term247386 = new Integer(-883034806);
        Integer term247388 = new Integer(1585847225);
        Integer term247390 = new Integer(597278769);
        Integer term247392 = new Integer(-1685132342);
        Class<? extends Object> term247849 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term247848 = ((Class) term247849).getDeclaredField((String) "NAME");
        ((Field) term247848).setAccessible(true);
        Object enum582 = ((Field) term247848).get((Object) null);
        Integer term247415 = new Integer(-1456670397);
        Integer term247417 = new Integer(1622346318);
        Integer term247431 = new Integer(1048535127);
        Integer term247433 = new Integer(-655067527);
        Integer term247457 = new Integer(-6029667);
        Integer term247459 = new Integer(-2068769794);
        Integer term247461 = new Integer(-117576464);
        Integer term247463 = new Integer(-1007160944);
        Integer term247465 = new Integer(1135664017);
        Integer term247467 = new Integer(590364439);
        Class<? extends Object> term248128 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term248127 = ((Class) term248128).getDeclaredField((String) "SET");
        ((Field) term248127).setAccessible(true);
        Object enum583 = ((Field) term248127).get((Object) null);
        term247362 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term247447 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term247448 = newInstance(Class.forName("java.time.LocalDate"));
        Object term247452 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term247362, term247362.getClass(), "ps_result", enum581);
        setField(term247362, term247362.getClass(), "accept_idx", term247384);
        setField(term247362, term247362.getClass(), "nblss_ltt_stts", term247386);
        setField(term247362, term247362.getClass(), "nblss_ltt_tckt", term247388);
        setField(term247362, term247362.getClass(), "nblss_ltt_is_opn", term247390);
        setField(term247362, term247362.getClass(), "pd_id", term247392);
        setField(term247362, term247362.getClass(), "player_name", "UqPFsSwrTW");
        setField(term247362, term247362.getClass(), "sort_kind", enum582);
        setField(term247362, term247362.getClass(), "lv_num", term247415);
        setField(term247362, term247362.getClass(), "lv_pnt", term247417);
        setField(term247362, term247362.getClass(), "lv_str", "zwAKIxjbAz");
        setField(term247362, term247362.getClass(), "lv_efct_id", term247431);
        setField(term247362, term247362.getClass(), "lv_plt_id", term247433);
        setField(term247362, term247362.getClass(), "mdl_eqp_ary", "RlMsoYxesz");
        setIntField(term247448, term247448.getClass(), "year", 2020);
        setShortField(term247448, term247448.getClass(), "month", (short) 5);
        setShortField(term247448, term247448.getClass(), "day", (short) 24);
        setField(term247447, term247447.getClass(), "date", term247448);
        setByteField(term247452, term247452.getClass(), "hour", (byte) 2);
        setByteField(term247452, term247452.getClass(), "minute", (byte) 9);
        setByteField(term247452, term247452.getClass(), "second", (byte) 52);
        setIntField(term247452, term247452.getClass(), "nano", 653329393);
        setField(term247447, term247447.getClass(), "time", term247452);
        setField(term247362, term247362.getClass(), "mdl_eqp_tm", term247447);
        setField(term247362, term247362.getClass(), "skn_eqp", term247457);
        setField(term247362, term247362.getClass(), "btn_se_eqp", term247459);
        setField(term247362, term247362.getClass(), "sld_se_eqp", term247461);
        setField(term247362, term247362.getClass(), "chn_sld_se_eqp", term247463);
        setField(term247362, term247362.getClass(), "sldr_tch_se_eqp", term247465);
        setField(term247362, term247362.getClass(), "vcld_pts", term247467);
        setField(term247362, term247362.getClass(), "passwd_stat", enum583);
        setField(term247362, term247362.getClass(), "cmd", "FkuWKCInZG");
        setField(term247362, term247362.getClass(), "req_id", "WoRWEXpkMK");
        setField(term247362, term247362.getClass(), "stat", "EkKMYiEKHU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPs_result", argTypes, term247362, args);
    }

};


