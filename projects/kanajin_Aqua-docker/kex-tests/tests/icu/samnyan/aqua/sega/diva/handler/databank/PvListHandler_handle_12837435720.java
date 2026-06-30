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

public class PvListHandler_handle_12837435720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6155;

    public PvListHandler_handle_12837435720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6155 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term6240 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term6241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6246 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6251 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term6261 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term6278 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term6279 = (long[]) newLongArray(1);
        Object[] term6281 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term6282 = (long[]) newLongArray(39);
        Object[] term6322 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term6323 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term6324 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term6325 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term6155, term6155.getClass(), "cmd", "kVEZMHmRtR");
        setField(term6155, term6155.getClass(), "req_id", "ekxGuOYIwi");
        setField(term6155, term6155.getClass(), "game_id", "RbVQXSpxXy");
        setField(term6155, term6155.getClass(), "r_ver", "YpJbIgJWWv");
        setField(term6155, term6155.getClass(), "kc_serial", "JppkknKVOw");
        setField(term6155, term6155.getClass(), "b_serial", "iljANwuEjk");
        setField(term6155, term6155.getClass(), "place_id", "kNqaJKIATy");
        setIntField(term6242, term6242.getClass(), "year", 2012);
        setShortField(term6242, term6242.getClass(), "month", (short) 2);
        setShortField(term6242, term6242.getClass(), "day", (short) 19);
        setField(term6241, term6241.getClass(), "date", term6242);
        setByteField(term6246, term6246.getClass(), "hour", (byte) 8);
        setByteField(term6246, term6246.getClass(), "minute", (byte) 4);
        setByteField(term6246, term6246.getClass(), "second", (byte) 43);
        setIntField(term6246, term6246.getClass(), "nano", 114930008);
        setField(term6241, term6241.getClass(), "time", term6246);
        setField(term6240, term6240.getClass(), "dateTime", term6241);
        setIntField(term6251, term6251.getClass(), "totalSeconds", -10800);
        setField(term6251, term6251.getClass(), "id", "-03:00");
        setField(term6240, term6240.getClass(), "offset", term6251);
        setField(term6261, term6261.getClass(), "id", "America/Recife");
        setLongElement(term6279, 0, -1767217224L);
        setField(term6278, term6278.getClass(), "standardTransitions", term6279);
        setElement(term6281, 1, term6251);
        setField(term6278, term6278.getClass(), "standardOffsets", term6281);
        setLongElement(term6282, 0, -1767217224L);
        setLongElement(term6282, 1, -1206957600L);
        setLongElement(term6282, 2, -1191362400L);
        setLongElement(term6282, 3, -1175374800L);
        setLongElement(term6282, 4, -1159826400L);
        setLongElement(term6282, 5, -633819600L);
        setLongElement(term6282, 6, -622069200L);
        setLongElement(term6282, 7, -602283600L);
        setLongElement(term6282, 8, -591832800L);
        setLongElement(term6282, 9, -570747600L);
        setLongElement(term6282, 10, -560210400L);
        setLongElement(term6282, 11, -539125200L);
        setLongElement(term6282, 12, -531352800L);
        setLongElement(term6282, 13, -191365200L);
        setLongElement(term6282, 14, -184197600L);
        setLongElement(term6282, 15, -155163600L);
        setLongElement(term6282, 16, -150069600L);
        setLongElement(term6282, 17, -128898000L);
        setLongElement(term6282, 18, -121125600L);
        setLongElement(term6282, 19, -99954000L);
        setLongElement(term6282, 20, -89589600L);
        setLongElement(term6282, 21, -68418000L);
        setLongElement(term6282, 22, -57967200L);
        setLongElement(term6282, 23, 499748400L);
        setLongElement(term6282, 24, 511236000L);
        setLongElement(term6282, 25, 530593200L);
        setLongElement(term6282, 26, 540266400L);
        setLongElement(term6282, 27, 562129200L);
        setLongElement(term6282, 28, 571197600L);
        setLongElement(term6282, 29, 592974000L);
        setLongElement(term6282, 30, 602042400L);
        setLongElement(term6282, 31, 624423600L);
        setLongElement(term6282, 32, 634701600L);
        setLongElement(term6282, 33, 938919600L);
        setLongElement(term6282, 34, 951616800L);
        setLongElement(term6282, 35, 970974000L);
        setLongElement(term6282, 36, 971575200L);
        setLongElement(term6282, 37, 1003028400L);
        setLongElement(term6282, 38, 1013911200L);
        setField(term6278, term6278.getClass(), "savingsInstantTransitions", term6282);
        setField(term6278, term6278.getClass(), "savingsLocalTransitions", term6322);
        setElement(term6323, 1, term6251);
        setElement(term6323, 3, term6251);
        setElement(term6323, 5, term6251);
        setElement(term6323, 7, term6251);
        setElement(term6323, 9, term6251);
        setElement(term6323, 11, term6251);
        setElement(term6323, 13, term6251);
        setElement(term6323, 15, term6251);
        setElement(term6323, 17, term6251);
        setElement(term6323, 19, term6251);
        setElement(term6323, 21, term6251);
        setElement(term6323, 23, term6251);
        setElement(term6323, 25, term6251);
        setElement(term6323, 27, term6251);
        setElement(term6323, 29, term6251);
        setElement(term6323, 31, term6251);
        setElement(term6323, 33, term6251);
        setElement(term6323, 35, term6251);
        setElement(term6323, 37, term6251);
        setElement(term6323, 39, term6251);
        setField(term6278, term6278.getClass(), "wallOffsets", term6323);
        setField(term6278, term6278.getClass(), "lastRules", term6324);
        setField(term6325, term6325.getClass(), "table", null);
        setField(term6325, term6325.getClass(), "nextTable", null);
        setLongField(term6325, term6325.getClass(), "baseCount", 0L);
        setIntField(term6325, term6325.getClass(), "sizeCtl", 0);
        setIntField(term6325, term6325.getClass(), "transferIndex", 0);
        setIntField(term6325, term6325.getClass(), "cellsBusy", 0);
        setField(term6325, term6325.getClass(), "counterCells", null);
        setField(term6325, term6325.getClass(), "keySet", null);
        setField(term6325, term6325.getClass(), "values", null);
        setField(term6325, term6325.getClass(), "entrySet", null);
        setField(term6325, term6325.getClass(), "keySet", null);
        setField(term6325, term6325.getClass(), "values", null);
        setField(term6278, term6278.getClass(), "lastRulesCache", term6325);
        setField(term6261, term6261.getClass(), "rules", term6278);
        setField(term6240, term6240.getClass(), "zone", term6261);
        setField(term6155, term6155.getClass(), "time_stamp", term6240);
        setField(term6155, term6155.getClass(), "start_up_mode", "vKQukfbJUd");
        setField(term6155, term6155.getClass(), "cmm_dly_mod", "lFRJFUMVbx");
        setField(term6155, term6155.getClass(), "cmm_dly_sec", "sZdUNdggUW");
        setField(term6155, term6155.getClass(), "cmm_err_mod", "OqbwYQfvAe");
        setField(term6155, term6155.getClass(), "country_code", "tRxZafjqIx");
        setField(term6155, term6155.getClass(), "region_code", "DhjNLmRMCu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PvListHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term6155;
        callMethod(klass, "handle", argTypes, null, args);
    }

};


