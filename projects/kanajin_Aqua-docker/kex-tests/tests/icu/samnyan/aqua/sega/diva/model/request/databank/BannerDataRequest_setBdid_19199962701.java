package icu.samnyan.aqua.sega.diva.model.request.databank;

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
import static icu.samnyan.aqua.sega.diva.model.request.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class BannerDataRequest_setBdid_19199962701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2259;
     Object term2507;

    public BannerDataRequest_setBdid_19199962701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2259 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.BannerDataRequest"));
        Object term2345 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term2346 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2347 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2351 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2356 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2366 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2383 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term2384 = (long[]) newLongArray(1);
        Object[] term2386 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term2387 = (long[]) newLongArray(39);
        Object[] term2427 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term2428 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term2429 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term2430 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term2259, term2259.getClass(), "bd_id", -203030934);
        setField(term2259, term2259.getClass(), "cmd", "uWHnvSvaPl");
        setField(term2259, term2259.getClass(), "req_id", "kBdSllIBVz");
        setField(term2259, term2259.getClass(), "game_id", "TJmVBGfTML");
        setField(term2259, term2259.getClass(), "r_ver", "tPlsykYBqO");
        setField(term2259, term2259.getClass(), "kc_serial", "bLPjGVBhlX");
        setField(term2259, term2259.getClass(), "b_serial", "whBvTVIIlC");
        setField(term2259, term2259.getClass(), "place_id", "IgRJUzaCwW");
        setIntField(term2347, term2347.getClass(), "year", 2026);
        setShortField(term2347, term2347.getClass(), "month", (short) 12);
        setShortField(term2347, term2347.getClass(), "day", (short) 14);
        setField(term2346, term2346.getClass(), "date", term2347);
        setByteField(term2351, term2351.getClass(), "hour", (byte) 16);
        setByteField(term2351, term2351.getClass(), "minute", (byte) 34);
        setByteField(term2351, term2351.getClass(), "second", (byte) 9);
        setIntField(term2351, term2351.getClass(), "nano", 518326996);
        setField(term2346, term2346.getClass(), "time", term2351);
        setField(term2345, term2345.getClass(), "dateTime", term2346);
        setIntField(term2356, term2356.getClass(), "totalSeconds", -10800);
        setField(term2356, term2356.getClass(), "id", "-03:00");
        setField(term2345, term2345.getClass(), "offset", term2356);
        setField(term2366, term2366.getClass(), "id", "America/Recife");
        setLongElement(term2384, 0, -1767217224L);
        setField(term2383, term2383.getClass(), "standardTransitions", term2384);
        setElement(term2386, 1, term2356);
        setField(term2383, term2383.getClass(), "standardOffsets", term2386);
        setLongElement(term2387, 0, -1767217224L);
        setLongElement(term2387, 1, -1206957600L);
        setLongElement(term2387, 2, -1191362400L);
        setLongElement(term2387, 3, -1175374800L);
        setLongElement(term2387, 4, -1159826400L);
        setLongElement(term2387, 5, -633819600L);
        setLongElement(term2387, 6, -622069200L);
        setLongElement(term2387, 7, -602283600L);
        setLongElement(term2387, 8, -591832800L);
        setLongElement(term2387, 9, -570747600L);
        setLongElement(term2387, 10, -560210400L);
        setLongElement(term2387, 11, -539125200L);
        setLongElement(term2387, 12, -531352800L);
        setLongElement(term2387, 13, -191365200L);
        setLongElement(term2387, 14, -184197600L);
        setLongElement(term2387, 15, -155163600L);
        setLongElement(term2387, 16, -150069600L);
        setLongElement(term2387, 17, -128898000L);
        setLongElement(term2387, 18, -121125600L);
        setLongElement(term2387, 19, -99954000L);
        setLongElement(term2387, 20, -89589600L);
        setLongElement(term2387, 21, -68418000L);
        setLongElement(term2387, 22, -57967200L);
        setLongElement(term2387, 23, 499748400L);
        setLongElement(term2387, 24, 511236000L);
        setLongElement(term2387, 25, 530593200L);
        setLongElement(term2387, 26, 540266400L);
        setLongElement(term2387, 27, 562129200L);
        setLongElement(term2387, 28, 571197600L);
        setLongElement(term2387, 29, 592974000L);
        setLongElement(term2387, 30, 602042400L);
        setLongElement(term2387, 31, 624423600L);
        setLongElement(term2387, 32, 634701600L);
        setLongElement(term2387, 33, 938919600L);
        setLongElement(term2387, 34, 951616800L);
        setLongElement(term2387, 35, 970974000L);
        setLongElement(term2387, 36, 971575200L);
        setLongElement(term2387, 37, 1003028400L);
        setLongElement(term2387, 38, 1013911200L);
        setField(term2383, term2383.getClass(), "savingsInstantTransitions", term2387);
        setField(term2383, term2383.getClass(), "savingsLocalTransitions", term2427);
        setElement(term2428, 1, term2356);
        setElement(term2428, 3, term2356);
        setElement(term2428, 5, term2356);
        setElement(term2428, 7, term2356);
        setElement(term2428, 9, term2356);
        setElement(term2428, 11, term2356);
        setElement(term2428, 13, term2356);
        setElement(term2428, 15, term2356);
        setElement(term2428, 17, term2356);
        setElement(term2428, 19, term2356);
        setElement(term2428, 21, term2356);
        setElement(term2428, 23, term2356);
        setElement(term2428, 25, term2356);
        setElement(term2428, 27, term2356);
        setElement(term2428, 29, term2356);
        setElement(term2428, 31, term2356);
        setElement(term2428, 33, term2356);
        setElement(term2428, 35, term2356);
        setElement(term2428, 37, term2356);
        setElement(term2428, 39, term2356);
        setField(term2383, term2383.getClass(), "wallOffsets", term2428);
        setField(term2383, term2383.getClass(), "lastRules", term2429);
        setField(term2430, term2430.getClass(), "table", null);
        setField(term2430, term2430.getClass(), "nextTable", null);
        setLongField(term2430, term2430.getClass(), "baseCount", 0L);
        setIntField(term2430, term2430.getClass(), "sizeCtl", 0);
        setIntField(term2430, term2430.getClass(), "transferIndex", 0);
        setIntField(term2430, term2430.getClass(), "cellsBusy", 0);
        setField(term2430, term2430.getClass(), "counterCells", null);
        setField(term2430, term2430.getClass(), "keySet", null);
        setField(term2430, term2430.getClass(), "values", null);
        setField(term2430, term2430.getClass(), "entrySet", null);
        setField(term2430, term2430.getClass(), "keySet", null);
        setField(term2430, term2430.getClass(), "values", null);
        setField(term2383, term2383.getClass(), "lastRulesCache", term2430);
        setField(term2366, term2366.getClass(), "rules", term2383);
        setField(term2345, term2345.getClass(), "zone", term2366);
        setField(term2259, term2259.getClass(), "time_stamp", term2345);
        setField(term2259, term2259.getClass(), "start_up_mode", "JUmudUmaaV");
        setField(term2259, term2259.getClass(), "cmm_dly_mod", "KoyGrUJeJW");
        setField(term2259, term2259.getClass(), "cmm_dly_sec", "HqBOwkVqjD");
        setField(term2259, term2259.getClass(), "cmm_err_mod", "MAcUBcBckh");
        setField(term2259, term2259.getClass(), "country_code", "oVgzLbrsFr");
        setField(term2259, term2259.getClass(), "region_code", "vQVyKLdtaz");
        term2507 = new Integer(-1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.BannerDataRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2507;
        callMethod(klass, "setBd_id", argTypes, term2259, args);
    }

};


