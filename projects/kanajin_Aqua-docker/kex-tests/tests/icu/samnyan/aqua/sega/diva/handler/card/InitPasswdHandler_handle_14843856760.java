package icu.samnyan.aqua.sega.diva.handler.card;

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
import static icu.samnyan.aqua.sega.diva.handler.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class InitPasswdHandler_handle_14843856760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2138;

    public InitPasswdHandler_handle_14843856760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2138 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term2223 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term2224 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2225 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2229 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2234 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2244 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2261 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term2262 = (long[]) newLongArray(1);
        Object[] term2264 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term2265 = (long[]) newLongArray(39);
        Object[] term2305 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term2306 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term2307 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term2308 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term2138, term2138.getClass(), "cmd", "bLPjGVBhlX");
        setField(term2138, term2138.getClass(), "req_id", "whBvTVIIlC");
        setField(term2138, term2138.getClass(), "game_id", "IgRJUzaCwW");
        setField(term2138, term2138.getClass(), "r_ver", "JUmudUmaaV");
        setField(term2138, term2138.getClass(), "kc_serial", "KoyGrUJeJW");
        setField(term2138, term2138.getClass(), "b_serial", "HqBOwkVqjD");
        setField(term2138, term2138.getClass(), "place_id", "MAcUBcBckh");
        setIntField(term2225, term2225.getClass(), "year", 2022);
        setShortField(term2225, term2225.getClass(), "month", (short) 2);
        setShortField(term2225, term2225.getClass(), "day", (short) 26);
        setField(term2224, term2224.getClass(), "date", term2225);
        setByteField(term2229, term2229.getClass(), "hour", (byte) 11);
        setByteField(term2229, term2229.getClass(), "minute", (byte) 42);
        setByteField(term2229, term2229.getClass(), "second", (byte) 15);
        setIntField(term2229, term2229.getClass(), "nano", 377731937);
        setField(term2224, term2224.getClass(), "time", term2229);
        setField(term2223, term2223.getClass(), "dateTime", term2224);
        setIntField(term2234, term2234.getClass(), "totalSeconds", -10800);
        setField(term2234, term2234.getClass(), "id", "-03:00");
        setField(term2223, term2223.getClass(), "offset", term2234);
        setField(term2244, term2244.getClass(), "id", "America/Recife");
        setLongElement(term2262, 0, -1767217224L);
        setField(term2261, term2261.getClass(), "standardTransitions", term2262);
        setElement(term2264, 1, term2234);
        setField(term2261, term2261.getClass(), "standardOffsets", term2264);
        setLongElement(term2265, 0, -1767217224L);
        setLongElement(term2265, 1, -1206957600L);
        setLongElement(term2265, 2, -1191362400L);
        setLongElement(term2265, 3, -1175374800L);
        setLongElement(term2265, 4, -1159826400L);
        setLongElement(term2265, 5, -633819600L);
        setLongElement(term2265, 6, -622069200L);
        setLongElement(term2265, 7, -602283600L);
        setLongElement(term2265, 8, -591832800L);
        setLongElement(term2265, 9, -570747600L);
        setLongElement(term2265, 10, -560210400L);
        setLongElement(term2265, 11, -539125200L);
        setLongElement(term2265, 12, -531352800L);
        setLongElement(term2265, 13, -191365200L);
        setLongElement(term2265, 14, -184197600L);
        setLongElement(term2265, 15, -155163600L);
        setLongElement(term2265, 16, -150069600L);
        setLongElement(term2265, 17, -128898000L);
        setLongElement(term2265, 18, -121125600L);
        setLongElement(term2265, 19, -99954000L);
        setLongElement(term2265, 20, -89589600L);
        setLongElement(term2265, 21, -68418000L);
        setLongElement(term2265, 22, -57967200L);
        setLongElement(term2265, 23, 499748400L);
        setLongElement(term2265, 24, 511236000L);
        setLongElement(term2265, 25, 530593200L);
        setLongElement(term2265, 26, 540266400L);
        setLongElement(term2265, 27, 562129200L);
        setLongElement(term2265, 28, 571197600L);
        setLongElement(term2265, 29, 592974000L);
        setLongElement(term2265, 30, 602042400L);
        setLongElement(term2265, 31, 624423600L);
        setLongElement(term2265, 32, 634701600L);
        setLongElement(term2265, 33, 938919600L);
        setLongElement(term2265, 34, 951616800L);
        setLongElement(term2265, 35, 970974000L);
        setLongElement(term2265, 36, 971575200L);
        setLongElement(term2265, 37, 1003028400L);
        setLongElement(term2265, 38, 1013911200L);
        setField(term2261, term2261.getClass(), "savingsInstantTransitions", term2265);
        setField(term2261, term2261.getClass(), "savingsLocalTransitions", term2305);
        setElement(term2306, 1, term2234);
        setElement(term2306, 3, term2234);
        setElement(term2306, 5, term2234);
        setElement(term2306, 7, term2234);
        setElement(term2306, 9, term2234);
        setElement(term2306, 11, term2234);
        setElement(term2306, 13, term2234);
        setElement(term2306, 15, term2234);
        setElement(term2306, 17, term2234);
        setElement(term2306, 19, term2234);
        setElement(term2306, 21, term2234);
        setElement(term2306, 23, term2234);
        setElement(term2306, 25, term2234);
        setElement(term2306, 27, term2234);
        setElement(term2306, 29, term2234);
        setElement(term2306, 31, term2234);
        setElement(term2306, 33, term2234);
        setElement(term2306, 35, term2234);
        setElement(term2306, 37, term2234);
        setElement(term2306, 39, term2234);
        setField(term2261, term2261.getClass(), "wallOffsets", term2306);
        setField(term2261, term2261.getClass(), "lastRules", term2307);
        setField(term2308, term2308.getClass(), "table", null);
        setField(term2308, term2308.getClass(), "nextTable", null);
        setLongField(term2308, term2308.getClass(), "baseCount", 0L);
        setIntField(term2308, term2308.getClass(), "sizeCtl", 0);
        setIntField(term2308, term2308.getClass(), "transferIndex", 0);
        setIntField(term2308, term2308.getClass(), "cellsBusy", 0);
        setField(term2308, term2308.getClass(), "counterCells", null);
        setField(term2308, term2308.getClass(), "keySet", null);
        setField(term2308, term2308.getClass(), "values", null);
        setField(term2308, term2308.getClass(), "entrySet", null);
        setField(term2308, term2308.getClass(), "keySet", null);
        setField(term2308, term2308.getClass(), "values", null);
        setField(term2261, term2261.getClass(), "lastRulesCache", term2308);
        setField(term2244, term2244.getClass(), "rules", term2261);
        setField(term2223, term2223.getClass(), "zone", term2244);
        setField(term2138, term2138.getClass(), "time_stamp", term2223);
        setField(term2138, term2138.getClass(), "start_up_mode", "oVgzLbrsFr");
        setField(term2138, term2138.getClass(), "cmm_dly_mod", "vQVyKLdtaz");
        setField(term2138, term2138.getClass(), "cmm_dly_sec", "OWKQODBLzb");
        setField(term2138, term2138.getClass(), "cmm_err_mod", "wGmYcqUkgE");
        setField(term2138, term2138.getClass(), "country_code", "idgaQsnJpQ");
        setField(term2138, term2138.getClass(), "region_code", "VgZnGoIFwQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.card.InitPasswdHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term2138;
        callMethod(klass, "handle", argTypes, null, args);
    }

};


