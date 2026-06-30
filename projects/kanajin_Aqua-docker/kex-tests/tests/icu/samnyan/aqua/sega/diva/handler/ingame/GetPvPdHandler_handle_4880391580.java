package icu.samnyan.aqua.sega.diva.handler.ingame;

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
import static icu.samnyan.aqua.sega.diva.handler.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GetPvPdHandler_handle_4880391580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7147;

    public GetPvPdHandler_handle_4880391580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7147 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest"));
        int[] term7150 = (int[]) newIntArray(3);
        Object term7238 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term7239 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7240 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7244 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7249 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term7259 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term7276 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term7277 = (long[]) newLongArray(1);
        Object[] term7279 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term7280 = (long[]) newLongArray(39);
        Object[] term7320 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term7321 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term7322 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term7323 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term7147, term7147.getClass(), "pd_id", 868908117);
        setIntField(term7147, term7147.getClass(), "difficulty", 1789351397);
        setIntElement(term7150, 0, 2145528170);
        setIntElement(term7150, 1, -585773976);
        setIntElement(term7150, 2, 852806940);
        setField(term7147, term7147.getClass(), "pd_pv_id_lst", term7150);
        setField(term7147, term7147.getClass(), "cmd", "xOcJIiQQDu");
        setField(term7147, term7147.getClass(), "req_id", "GVizqqzXpy");
        setField(term7147, term7147.getClass(), "game_id", "JqXGgAhZPl");
        setField(term7147, term7147.getClass(), "r_ver", "jiKYgYHqIS");
        setField(term7147, term7147.getClass(), "kc_serial", "DfISiziTgG");
        setField(term7147, term7147.getClass(), "b_serial", "XqgfKFvPSD");
        setField(term7147, term7147.getClass(), "place_id", "JiVRgTZvKc");
        setIntField(term7240, term7240.getClass(), "year", 2025);
        setShortField(term7240, term7240.getClass(), "month", (short) 4);
        setShortField(term7240, term7240.getClass(), "day", (short) 24);
        setField(term7239, term7239.getClass(), "date", term7240);
        setByteField(term7244, term7244.getClass(), "hour", (byte) 18);
        setByteField(term7244, term7244.getClass(), "minute", (byte) 11);
        setByteField(term7244, term7244.getClass(), "second", (byte) 40);
        setIntField(term7244, term7244.getClass(), "nano", 137454929);
        setField(term7239, term7239.getClass(), "time", term7244);
        setField(term7238, term7238.getClass(), "dateTime", term7239);
        setIntField(term7249, term7249.getClass(), "totalSeconds", -10800);
        setField(term7249, term7249.getClass(), "id", "-03:00");
        setField(term7238, term7238.getClass(), "offset", term7249);
        setField(term7259, term7259.getClass(), "id", "America/Recife");
        setLongElement(term7277, 0, -1767217224L);
        setField(term7276, term7276.getClass(), "standardTransitions", term7277);
        setElement(term7279, 1, term7249);
        setField(term7276, term7276.getClass(), "standardOffsets", term7279);
        setLongElement(term7280, 0, -1767217224L);
        setLongElement(term7280, 1, -1206957600L);
        setLongElement(term7280, 2, -1191362400L);
        setLongElement(term7280, 3, -1175374800L);
        setLongElement(term7280, 4, -1159826400L);
        setLongElement(term7280, 5, -633819600L);
        setLongElement(term7280, 6, -622069200L);
        setLongElement(term7280, 7, -602283600L);
        setLongElement(term7280, 8, -591832800L);
        setLongElement(term7280, 9, -570747600L);
        setLongElement(term7280, 10, -560210400L);
        setLongElement(term7280, 11, -539125200L);
        setLongElement(term7280, 12, -531352800L);
        setLongElement(term7280, 13, -191365200L);
        setLongElement(term7280, 14, -184197600L);
        setLongElement(term7280, 15, -155163600L);
        setLongElement(term7280, 16, -150069600L);
        setLongElement(term7280, 17, -128898000L);
        setLongElement(term7280, 18, -121125600L);
        setLongElement(term7280, 19, -99954000L);
        setLongElement(term7280, 20, -89589600L);
        setLongElement(term7280, 21, -68418000L);
        setLongElement(term7280, 22, -57967200L);
        setLongElement(term7280, 23, 499748400L);
        setLongElement(term7280, 24, 511236000L);
        setLongElement(term7280, 25, 530593200L);
        setLongElement(term7280, 26, 540266400L);
        setLongElement(term7280, 27, 562129200L);
        setLongElement(term7280, 28, 571197600L);
        setLongElement(term7280, 29, 592974000L);
        setLongElement(term7280, 30, 602042400L);
        setLongElement(term7280, 31, 624423600L);
        setLongElement(term7280, 32, 634701600L);
        setLongElement(term7280, 33, 938919600L);
        setLongElement(term7280, 34, 951616800L);
        setLongElement(term7280, 35, 970974000L);
        setLongElement(term7280, 36, 971575200L);
        setLongElement(term7280, 37, 1003028400L);
        setLongElement(term7280, 38, 1013911200L);
        setField(term7276, term7276.getClass(), "savingsInstantTransitions", term7280);
        setField(term7276, term7276.getClass(), "savingsLocalTransitions", term7320);
        setElement(term7321, 1, term7249);
        setElement(term7321, 3, term7249);
        setElement(term7321, 5, term7249);
        setElement(term7321, 7, term7249);
        setElement(term7321, 9, term7249);
        setElement(term7321, 11, term7249);
        setElement(term7321, 13, term7249);
        setElement(term7321, 15, term7249);
        setElement(term7321, 17, term7249);
        setElement(term7321, 19, term7249);
        setElement(term7321, 21, term7249);
        setElement(term7321, 23, term7249);
        setElement(term7321, 25, term7249);
        setElement(term7321, 27, term7249);
        setElement(term7321, 29, term7249);
        setElement(term7321, 31, term7249);
        setElement(term7321, 33, term7249);
        setElement(term7321, 35, term7249);
        setElement(term7321, 37, term7249);
        setElement(term7321, 39, term7249);
        setField(term7276, term7276.getClass(), "wallOffsets", term7321);
        setField(term7276, term7276.getClass(), "lastRules", term7322);
        setField(term7323, term7323.getClass(), "table", null);
        setField(term7323, term7323.getClass(), "nextTable", null);
        setLongField(term7323, term7323.getClass(), "baseCount", 0L);
        setIntField(term7323, term7323.getClass(), "sizeCtl", 0);
        setIntField(term7323, term7323.getClass(), "transferIndex", 0);
        setIntField(term7323, term7323.getClass(), "cellsBusy", 0);
        setField(term7323, term7323.getClass(), "counterCells", null);
        setField(term7323, term7323.getClass(), "keySet", null);
        setField(term7323, term7323.getClass(), "values", null);
        setField(term7323, term7323.getClass(), "entrySet", null);
        setField(term7323, term7323.getClass(), "keySet", null);
        setField(term7323, term7323.getClass(), "values", null);
        setField(term7276, term7276.getClass(), "lastRulesCache", term7323);
        setField(term7259, term7259.getClass(), "rules", term7276);
        setField(term7238, term7238.getClass(), "zone", term7259);
        setField(term7147, term7147.getClass(), "time_stamp", term7238);
        setField(term7147, term7147.getClass(), "start_up_mode", "XPKmummaqg");
        setField(term7147, term7147.getClass(), "cmm_dly_mod", "BKLfkLiZTH");
        setField(term7147, term7147.getClass(), "cmm_dly_sec", "SPpkrGcPRr");
        setField(term7147, term7147.getClass(), "cmm_err_mod", "sEccwbJKYE");
        setField(term7147, term7147.getClass(), "country_code", "AWRooQKkdW");
        setField(term7147, term7147.getClass(), "region_code", "vjxIhXHxGR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.ingame.GetPvPdHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest");
        Object[] args = new Object[1];
        args[0] = term7147;
        callMethod(klass, "handle", argTypes, null, args);
    }

};


