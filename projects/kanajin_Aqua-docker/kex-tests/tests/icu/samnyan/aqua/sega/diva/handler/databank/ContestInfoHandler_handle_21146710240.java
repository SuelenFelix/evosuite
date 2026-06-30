package icu.samnyan.aqua.sega.diva.handler.databank;

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
import static icu.samnyan.aqua.sega.diva.handler.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ContestInfoHandler_handle_21146710240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2206;

    public ContestInfoHandler_handle_21146710240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2206 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term2291 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term2292 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2293 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2297 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2302 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2312 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2329 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term2330 = (long[]) newLongArray(1);
        Object[] term2332 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term2333 = (long[]) newLongArray(39);
        Object[] term2373 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term2374 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term2375 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term2376 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term2206, term2206.getClass(), "cmd", "uWHnvSvaPl");
        setField(term2206, term2206.getClass(), "req_id", "kBdSllIBVz");
        setField(term2206, term2206.getClass(), "game_id", "TJmVBGfTML");
        setField(term2206, term2206.getClass(), "r_ver", "tPlsykYBqO");
        setField(term2206, term2206.getClass(), "kc_serial", "bLPjGVBhlX");
        setField(term2206, term2206.getClass(), "b_serial", "whBvTVIIlC");
        setField(term2206, term2206.getClass(), "place_id", "IgRJUzaCwW");
        setIntField(term2293, term2293.getClass(), "year", 2026);
        setShortField(term2293, term2293.getClass(), "month", (short) 12);
        setShortField(term2293, term2293.getClass(), "day", (short) 14);
        setField(term2292, term2292.getClass(), "date", term2293);
        setByteField(term2297, term2297.getClass(), "hour", (byte) 16);
        setByteField(term2297, term2297.getClass(), "minute", (byte) 34);
        setByteField(term2297, term2297.getClass(), "second", (byte) 9);
        setIntField(term2297, term2297.getClass(), "nano", 518326996);
        setField(term2292, term2292.getClass(), "time", term2297);
        setField(term2291, term2291.getClass(), "dateTime", term2292);
        setIntField(term2302, term2302.getClass(), "totalSeconds", -10800);
        setField(term2302, term2302.getClass(), "id", "-03:00");
        setField(term2291, term2291.getClass(), "offset", term2302);
        setField(term2312, term2312.getClass(), "id", "America/Recife");
        setLongElement(term2330, 0, -1767217224L);
        setField(term2329, term2329.getClass(), "standardTransitions", term2330);
        setElement(term2332, 1, term2302);
        setField(term2329, term2329.getClass(), "standardOffsets", term2332);
        setLongElement(term2333, 0, -1767217224L);
        setLongElement(term2333, 1, -1206957600L);
        setLongElement(term2333, 2, -1191362400L);
        setLongElement(term2333, 3, -1175374800L);
        setLongElement(term2333, 4, -1159826400L);
        setLongElement(term2333, 5, -633819600L);
        setLongElement(term2333, 6, -622069200L);
        setLongElement(term2333, 7, -602283600L);
        setLongElement(term2333, 8, -591832800L);
        setLongElement(term2333, 9, -570747600L);
        setLongElement(term2333, 10, -560210400L);
        setLongElement(term2333, 11, -539125200L);
        setLongElement(term2333, 12, -531352800L);
        setLongElement(term2333, 13, -191365200L);
        setLongElement(term2333, 14, -184197600L);
        setLongElement(term2333, 15, -155163600L);
        setLongElement(term2333, 16, -150069600L);
        setLongElement(term2333, 17, -128898000L);
        setLongElement(term2333, 18, -121125600L);
        setLongElement(term2333, 19, -99954000L);
        setLongElement(term2333, 20, -89589600L);
        setLongElement(term2333, 21, -68418000L);
        setLongElement(term2333, 22, -57967200L);
        setLongElement(term2333, 23, 499748400L);
        setLongElement(term2333, 24, 511236000L);
        setLongElement(term2333, 25, 530593200L);
        setLongElement(term2333, 26, 540266400L);
        setLongElement(term2333, 27, 562129200L);
        setLongElement(term2333, 28, 571197600L);
        setLongElement(term2333, 29, 592974000L);
        setLongElement(term2333, 30, 602042400L);
        setLongElement(term2333, 31, 624423600L);
        setLongElement(term2333, 32, 634701600L);
        setLongElement(term2333, 33, 938919600L);
        setLongElement(term2333, 34, 951616800L);
        setLongElement(term2333, 35, 970974000L);
        setLongElement(term2333, 36, 971575200L);
        setLongElement(term2333, 37, 1003028400L);
        setLongElement(term2333, 38, 1013911200L);
        setField(term2329, term2329.getClass(), "savingsInstantTransitions", term2333);
        setField(term2329, term2329.getClass(), "savingsLocalTransitions", term2373);
        setElement(term2374, 1, term2302);
        setElement(term2374, 3, term2302);
        setElement(term2374, 5, term2302);
        setElement(term2374, 7, term2302);
        setElement(term2374, 9, term2302);
        setElement(term2374, 11, term2302);
        setElement(term2374, 13, term2302);
        setElement(term2374, 15, term2302);
        setElement(term2374, 17, term2302);
        setElement(term2374, 19, term2302);
        setElement(term2374, 21, term2302);
        setElement(term2374, 23, term2302);
        setElement(term2374, 25, term2302);
        setElement(term2374, 27, term2302);
        setElement(term2374, 29, term2302);
        setElement(term2374, 31, term2302);
        setElement(term2374, 33, term2302);
        setElement(term2374, 35, term2302);
        setElement(term2374, 37, term2302);
        setElement(term2374, 39, term2302);
        setField(term2329, term2329.getClass(), "wallOffsets", term2374);
        setField(term2329, term2329.getClass(), "lastRules", term2375);
        setField(term2376, term2376.getClass(), "table", null);
        setField(term2376, term2376.getClass(), "nextTable", null);
        setLongField(term2376, term2376.getClass(), "baseCount", 0L);
        setIntField(term2376, term2376.getClass(), "sizeCtl", 0);
        setIntField(term2376, term2376.getClass(), "transferIndex", 0);
        setIntField(term2376, term2376.getClass(), "cellsBusy", 0);
        setField(term2376, term2376.getClass(), "counterCells", null);
        setField(term2376, term2376.getClass(), "keySet", null);
        setField(term2376, term2376.getClass(), "values", null);
        setField(term2376, term2376.getClass(), "entrySet", null);
        setField(term2376, term2376.getClass(), "keySet", null);
        setField(term2376, term2376.getClass(), "values", null);
        setField(term2329, term2329.getClass(), "lastRulesCache", term2376);
        setField(term2312, term2312.getClass(), "rules", term2329);
        setField(term2291, term2291.getClass(), "zone", term2312);
        setField(term2206, term2206.getClass(), "time_stamp", term2291);
        setField(term2206, term2206.getClass(), "start_up_mode", "JUmudUmaaV");
        setField(term2206, term2206.getClass(), "cmm_dly_mod", "KoyGrUJeJW");
        setField(term2206, term2206.getClass(), "cmm_dly_sec", "HqBOwkVqjD");
        setField(term2206, term2206.getClass(), "cmm_err_mod", "MAcUBcBckh");
        setField(term2206, term2206.getClass(), "country_code", "oVgzLbrsFr");
        setField(term2206, term2206.getClass(), "region_code", "vQVyKLdtaz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.ContestInfoHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term2206;
        callMethod(klass, "handle", argTypes, null, args);
    }

};


