package icu.samnyan.aqua.sega.diva.model.request.boot;

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
import static icu.samnyan.aqua.sega.diva.model.request.boot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AttendRequest_setAtndlut_12670368904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2101;

    public AttendRequest_setAtndlut_12670368904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2101 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest"));
        Object term2234 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term2235 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2236 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2240 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2245 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2255 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2272 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term2273 = (long[]) newLongArray(1);
        Object[] term2275 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term2276 = (long[]) newLongArray(39);
        Object[] term2316 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term2317 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term2318 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term2319 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term2101, term2101.getClass(), "atnd_lut", "tPlsykYBqO");
        setField(term2101, term2101.getClass(), "atnd_prm1", "bLPjGVBhlX");
        setField(term2101, term2101.getClass(), "atnd_prm2", "whBvTVIIlC");
        setField(term2101, term2101.getClass(), "atnd_prm3", "IgRJUzaCwW");
        setField(term2101, term2101.getClass(), "cmd", "JUmudUmaaV");
        setField(term2101, term2101.getClass(), "req_id", "KoyGrUJeJW");
        setField(term2101, term2101.getClass(), "game_id", "HqBOwkVqjD");
        setField(term2101, term2101.getClass(), "r_ver", "MAcUBcBckh");
        setField(term2101, term2101.getClass(), "kc_serial", "oVgzLbrsFr");
        setField(term2101, term2101.getClass(), "b_serial", "vQVyKLdtaz");
        setField(term2101, term2101.getClass(), "place_id", "OWKQODBLzb");
        setIntField(term2236, term2236.getClass(), "year", 2022);
        setShortField(term2236, term2236.getClass(), "month", (short) 2);
        setShortField(term2236, term2236.getClass(), "day", (short) 26);
        setField(term2235, term2235.getClass(), "date", term2236);
        setByteField(term2240, term2240.getClass(), "hour", (byte) 11);
        setByteField(term2240, term2240.getClass(), "minute", (byte) 42);
        setByteField(term2240, term2240.getClass(), "second", (byte) 15);
        setIntField(term2240, term2240.getClass(), "nano", 377731937);
        setField(term2235, term2235.getClass(), "time", term2240);
        setField(term2234, term2234.getClass(), "dateTime", term2235);
        setIntField(term2245, term2245.getClass(), "totalSeconds", -10800);
        setField(term2245, term2245.getClass(), "id", "-03:00");
        setField(term2234, term2234.getClass(), "offset", term2245);
        setField(term2255, term2255.getClass(), "id", "America/Recife");
        setLongElement(term2273, 0, -1767217224L);
        setField(term2272, term2272.getClass(), "standardTransitions", term2273);
        setElement(term2275, 1, term2245);
        setField(term2272, term2272.getClass(), "standardOffsets", term2275);
        setLongElement(term2276, 0, -1767217224L);
        setLongElement(term2276, 1, -1206957600L);
        setLongElement(term2276, 2, -1191362400L);
        setLongElement(term2276, 3, -1175374800L);
        setLongElement(term2276, 4, -1159826400L);
        setLongElement(term2276, 5, -633819600L);
        setLongElement(term2276, 6, -622069200L);
        setLongElement(term2276, 7, -602283600L);
        setLongElement(term2276, 8, -591832800L);
        setLongElement(term2276, 9, -570747600L);
        setLongElement(term2276, 10, -560210400L);
        setLongElement(term2276, 11, -539125200L);
        setLongElement(term2276, 12, -531352800L);
        setLongElement(term2276, 13, -191365200L);
        setLongElement(term2276, 14, -184197600L);
        setLongElement(term2276, 15, -155163600L);
        setLongElement(term2276, 16, -150069600L);
        setLongElement(term2276, 17, -128898000L);
        setLongElement(term2276, 18, -121125600L);
        setLongElement(term2276, 19, -99954000L);
        setLongElement(term2276, 20, -89589600L);
        setLongElement(term2276, 21, -68418000L);
        setLongElement(term2276, 22, -57967200L);
        setLongElement(term2276, 23, 499748400L);
        setLongElement(term2276, 24, 511236000L);
        setLongElement(term2276, 25, 530593200L);
        setLongElement(term2276, 26, 540266400L);
        setLongElement(term2276, 27, 562129200L);
        setLongElement(term2276, 28, 571197600L);
        setLongElement(term2276, 29, 592974000L);
        setLongElement(term2276, 30, 602042400L);
        setLongElement(term2276, 31, 624423600L);
        setLongElement(term2276, 32, 634701600L);
        setLongElement(term2276, 33, 938919600L);
        setLongElement(term2276, 34, 951616800L);
        setLongElement(term2276, 35, 970974000L);
        setLongElement(term2276, 36, 971575200L);
        setLongElement(term2276, 37, 1003028400L);
        setLongElement(term2276, 38, 1013911200L);
        setField(term2272, term2272.getClass(), "savingsInstantTransitions", term2276);
        setField(term2272, term2272.getClass(), "savingsLocalTransitions", term2316);
        setElement(term2317, 1, term2245);
        setElement(term2317, 3, term2245);
        setElement(term2317, 5, term2245);
        setElement(term2317, 7, term2245);
        setElement(term2317, 9, term2245);
        setElement(term2317, 11, term2245);
        setElement(term2317, 13, term2245);
        setElement(term2317, 15, term2245);
        setElement(term2317, 17, term2245);
        setElement(term2317, 19, term2245);
        setElement(term2317, 21, term2245);
        setElement(term2317, 23, term2245);
        setElement(term2317, 25, term2245);
        setElement(term2317, 27, term2245);
        setElement(term2317, 29, term2245);
        setElement(term2317, 31, term2245);
        setElement(term2317, 33, term2245);
        setElement(term2317, 35, term2245);
        setElement(term2317, 37, term2245);
        setElement(term2317, 39, term2245);
        setField(term2272, term2272.getClass(), "wallOffsets", term2317);
        setField(term2272, term2272.getClass(), "lastRules", term2318);
        setField(term2319, term2319.getClass(), "table", null);
        setField(term2319, term2319.getClass(), "nextTable", null);
        setLongField(term2319, term2319.getClass(), "baseCount", 0L);
        setIntField(term2319, term2319.getClass(), "sizeCtl", 0);
        setIntField(term2319, term2319.getClass(), "transferIndex", 0);
        setIntField(term2319, term2319.getClass(), "cellsBusy", 0);
        setField(term2319, term2319.getClass(), "counterCells", null);
        setField(term2319, term2319.getClass(), "keySet", null);
        setField(term2319, term2319.getClass(), "values", null);
        setField(term2319, term2319.getClass(), "entrySet", null);
        setField(term2319, term2319.getClass(), "keySet", null);
        setField(term2319, term2319.getClass(), "values", null);
        setField(term2272, term2272.getClass(), "lastRulesCache", term2319);
        setField(term2255, term2255.getClass(), "rules", term2272);
        setField(term2234, term2234.getClass(), "zone", term2255);
        setField(term2101, term2101.getClass(), "time_stamp", term2234);
        setField(term2101, term2101.getClass(), "start_up_mode", "wGmYcqUkgE");
        setField(term2101, term2101.getClass(), "cmm_dly_mod", "idgaQsnJpQ");
        setField(term2101, term2101.getClass(), "cmm_dly_sec", "VgZnGoIFwQ");
        setField(term2101, term2101.getClass(), "cmm_err_mod", "jUbSRrkrYZ");
        setField(term2101, term2101.getClass(), "country_code", "bWWfajKbEX");
        setField(term2101, term2101.getClass(), "region_code", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LvJFtLBaxj";
        callMethod(klass, "setAtnd_lut", argTypes, term2101, args);
    }

};


