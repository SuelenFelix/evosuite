package icu.samnyan.aqua.sega.diva.model.request.user;

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
import static icu.samnyan.aqua.sega.diva.model.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class PdUnlockRequest_setPdid_17110551712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6733;
     Object term6982;

    public PdUnlockRequest_setPdid_17110551712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6733 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest"));
        Object term6820 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term6821 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6822 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6826 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6831 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term6841 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term6858 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term6859 = (long[]) newLongArray(1);
        Object[] term6861 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term6862 = (long[]) newLongArray(39);
        Object[] term6902 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term6903 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term6904 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term6905 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term6733, term6733.getClass(), "pd_id", -1195339592);
        setIntField(term6733, term6733.getClass(), "accept_idx", -376422566);
        setField(term6733, term6733.getClass(), "cmd", "kVEZMHmRtR");
        setField(term6733, term6733.getClass(), "req_id", "ekxGuOYIwi");
        setField(term6733, term6733.getClass(), "game_id", "RbVQXSpxXy");
        setField(term6733, term6733.getClass(), "r_ver", "YpJbIgJWWv");
        setField(term6733, term6733.getClass(), "kc_serial", "JppkknKVOw");
        setField(term6733, term6733.getClass(), "b_serial", "iljANwuEjk");
        setField(term6733, term6733.getClass(), "place_id", "kNqaJKIATy");
        setIntField(term6822, term6822.getClass(), "year", 2012);
        setShortField(term6822, term6822.getClass(), "month", (short) 2);
        setShortField(term6822, term6822.getClass(), "day", (short) 19);
        setField(term6821, term6821.getClass(), "date", term6822);
        setByteField(term6826, term6826.getClass(), "hour", (byte) 8);
        setByteField(term6826, term6826.getClass(), "minute", (byte) 4);
        setByteField(term6826, term6826.getClass(), "second", (byte) 43);
        setIntField(term6826, term6826.getClass(), "nano", 114930008);
        setField(term6821, term6821.getClass(), "time", term6826);
        setField(term6820, term6820.getClass(), "dateTime", term6821);
        setIntField(term6831, term6831.getClass(), "totalSeconds", -10800);
        setField(term6831, term6831.getClass(), "id", "-03:00");
        setField(term6820, term6820.getClass(), "offset", term6831);
        setField(term6841, term6841.getClass(), "id", "America/Recife");
        setLongElement(term6859, 0, -1767217224L);
        setField(term6858, term6858.getClass(), "standardTransitions", term6859);
        setElement(term6861, 1, term6831);
        setField(term6858, term6858.getClass(), "standardOffsets", term6861);
        setLongElement(term6862, 0, -1767217224L);
        setLongElement(term6862, 1, -1206957600L);
        setLongElement(term6862, 2, -1191362400L);
        setLongElement(term6862, 3, -1175374800L);
        setLongElement(term6862, 4, -1159826400L);
        setLongElement(term6862, 5, -633819600L);
        setLongElement(term6862, 6, -622069200L);
        setLongElement(term6862, 7, -602283600L);
        setLongElement(term6862, 8, -591832800L);
        setLongElement(term6862, 9, -570747600L);
        setLongElement(term6862, 10, -560210400L);
        setLongElement(term6862, 11, -539125200L);
        setLongElement(term6862, 12, -531352800L);
        setLongElement(term6862, 13, -191365200L);
        setLongElement(term6862, 14, -184197600L);
        setLongElement(term6862, 15, -155163600L);
        setLongElement(term6862, 16, -150069600L);
        setLongElement(term6862, 17, -128898000L);
        setLongElement(term6862, 18, -121125600L);
        setLongElement(term6862, 19, -99954000L);
        setLongElement(term6862, 20, -89589600L);
        setLongElement(term6862, 21, -68418000L);
        setLongElement(term6862, 22, -57967200L);
        setLongElement(term6862, 23, 499748400L);
        setLongElement(term6862, 24, 511236000L);
        setLongElement(term6862, 25, 530593200L);
        setLongElement(term6862, 26, 540266400L);
        setLongElement(term6862, 27, 562129200L);
        setLongElement(term6862, 28, 571197600L);
        setLongElement(term6862, 29, 592974000L);
        setLongElement(term6862, 30, 602042400L);
        setLongElement(term6862, 31, 624423600L);
        setLongElement(term6862, 32, 634701600L);
        setLongElement(term6862, 33, 938919600L);
        setLongElement(term6862, 34, 951616800L);
        setLongElement(term6862, 35, 970974000L);
        setLongElement(term6862, 36, 971575200L);
        setLongElement(term6862, 37, 1003028400L);
        setLongElement(term6862, 38, 1013911200L);
        setField(term6858, term6858.getClass(), "savingsInstantTransitions", term6862);
        setField(term6858, term6858.getClass(), "savingsLocalTransitions", term6902);
        setElement(term6903, 1, term6831);
        setElement(term6903, 3, term6831);
        setElement(term6903, 5, term6831);
        setElement(term6903, 7, term6831);
        setElement(term6903, 9, term6831);
        setElement(term6903, 11, term6831);
        setElement(term6903, 13, term6831);
        setElement(term6903, 15, term6831);
        setElement(term6903, 17, term6831);
        setElement(term6903, 19, term6831);
        setElement(term6903, 21, term6831);
        setElement(term6903, 23, term6831);
        setElement(term6903, 25, term6831);
        setElement(term6903, 27, term6831);
        setElement(term6903, 29, term6831);
        setElement(term6903, 31, term6831);
        setElement(term6903, 33, term6831);
        setElement(term6903, 35, term6831);
        setElement(term6903, 37, term6831);
        setElement(term6903, 39, term6831);
        setField(term6858, term6858.getClass(), "wallOffsets", term6903);
        setField(term6858, term6858.getClass(), "lastRules", term6904);
        setField(term6905, term6905.getClass(), "table", null);
        setField(term6905, term6905.getClass(), "nextTable", null);
        setLongField(term6905, term6905.getClass(), "baseCount", 0L);
        setIntField(term6905, term6905.getClass(), "sizeCtl", 0);
        setIntField(term6905, term6905.getClass(), "transferIndex", 0);
        setIntField(term6905, term6905.getClass(), "cellsBusy", 0);
        setField(term6905, term6905.getClass(), "counterCells", null);
        setField(term6905, term6905.getClass(), "keySet", null);
        setField(term6905, term6905.getClass(), "values", null);
        setField(term6905, term6905.getClass(), "entrySet", null);
        setField(term6905, term6905.getClass(), "keySet", null);
        setField(term6905, term6905.getClass(), "values", null);
        setField(term6858, term6858.getClass(), "lastRulesCache", term6905);
        setField(term6841, term6841.getClass(), "rules", term6858);
        setField(term6820, term6820.getClass(), "zone", term6841);
        setField(term6733, term6733.getClass(), "time_stamp", term6820);
        setField(term6733, term6733.getClass(), "start_up_mode", "vKQukfbJUd");
        setField(term6733, term6733.getClass(), "cmm_dly_mod", "lFRJFUMVbx");
        setField(term6733, term6733.getClass(), "cmm_dly_sec", "sZdUNdggUW");
        setField(term6733, term6733.getClass(), "cmm_err_mod", "OqbwYQfvAe");
        setField(term6733, term6733.getClass(), "country_code", "tRxZafjqIx");
        setField(term6733, term6733.getClass(), "region_code", "DhjNLmRMCu");
        term6982 = new Integer(306847454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6982;
        callMethod(klass, "setPd_id", argTypes, term6733, args);
    }

};


