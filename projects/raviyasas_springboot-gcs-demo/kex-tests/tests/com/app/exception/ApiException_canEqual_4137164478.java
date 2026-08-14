package com.app.exception;

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
import static com.app.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class ApiException_canEqual_4137164478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1262;
     Object term1367;

    public ApiException_canEqual_4137164478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1275 = new Integer(1227103734);
        term1262 = newInstance(Class.forName("com.app.exception.ApiException"));
        Object term1277 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1283 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1288 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1298 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1315 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1316 = (long[]) newLongArray(1);
        Object[] term1318 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1319 = (long[]) newLongArray(39);
        Object[] term1359 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1360 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1361 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1362 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1262, term1262.getClass(), "errorMessage", "hRNSzYYIrc");
        setField(term1262, term1262.getClass(), "statusCode", term1275);
        setIntField(term1279, term1279.getClass(), "year", 2029);
        setShortField(term1279, term1279.getClass(), "month", (short) 8);
        setShortField(term1279, term1279.getClass(), "day", (short) 29);
        setField(term1278, term1278.getClass(), "date", term1279);
        setByteField(term1283, term1283.getClass(), "hour", (byte) 15);
        setByteField(term1283, term1283.getClass(), "minute", (byte) 50);
        setByteField(term1283, term1283.getClass(), "second", (byte) 1);
        setIntField(term1283, term1283.getClass(), "nano", 277971904);
        setField(term1278, term1278.getClass(), "time", term1283);
        setField(term1277, term1277.getClass(), "dateTime", term1278);
        setIntField(term1288, term1288.getClass(), "totalSeconds", -10800);
        setField(term1288, term1288.getClass(), "id", "-03:00");
        setField(term1277, term1277.getClass(), "offset", term1288);
        setField(term1298, term1298.getClass(), "id", "America/Recife");
        setLongElement(term1316, 0, -1767217224L);
        setField(term1315, term1315.getClass(), "standardTransitions", term1316);
        setElement(term1318, 1, term1288);
        setField(term1315, term1315.getClass(), "standardOffsets", term1318);
        setLongElement(term1319, 0, -1767217224L);
        setLongElement(term1319, 1, -1206957600L);
        setLongElement(term1319, 2, -1191362400L);
        setLongElement(term1319, 3, -1175374800L);
        setLongElement(term1319, 4, -1159826400L);
        setLongElement(term1319, 5, -633819600L);
        setLongElement(term1319, 6, -622069200L);
        setLongElement(term1319, 7, -602283600L);
        setLongElement(term1319, 8, -591832800L);
        setLongElement(term1319, 9, -570747600L);
        setLongElement(term1319, 10, -560210400L);
        setLongElement(term1319, 11, -539125200L);
        setLongElement(term1319, 12, -531352800L);
        setLongElement(term1319, 13, -191365200L);
        setLongElement(term1319, 14, -184197600L);
        setLongElement(term1319, 15, -155163600L);
        setLongElement(term1319, 16, -150069600L);
        setLongElement(term1319, 17, -128898000L);
        setLongElement(term1319, 18, -121125600L);
        setLongElement(term1319, 19, -99954000L);
        setLongElement(term1319, 20, -89589600L);
        setLongElement(term1319, 21, -68418000L);
        setLongElement(term1319, 22, -57967200L);
        setLongElement(term1319, 23, 499748400L);
        setLongElement(term1319, 24, 511236000L);
        setLongElement(term1319, 25, 530593200L);
        setLongElement(term1319, 26, 540266400L);
        setLongElement(term1319, 27, 562129200L);
        setLongElement(term1319, 28, 571197600L);
        setLongElement(term1319, 29, 592974000L);
        setLongElement(term1319, 30, 602042400L);
        setLongElement(term1319, 31, 624423600L);
        setLongElement(term1319, 32, 634701600L);
        setLongElement(term1319, 33, 938919600L);
        setLongElement(term1319, 34, 951616800L);
        setLongElement(term1319, 35, 970974000L);
        setLongElement(term1319, 36, 971575200L);
        setLongElement(term1319, 37, 1003028400L);
        setLongElement(term1319, 38, 1013911200L);
        setField(term1315, term1315.getClass(), "savingsInstantTransitions", term1319);
        setField(term1315, term1315.getClass(), "savingsLocalTransitions", term1359);
        setElement(term1360, 1, term1288);
        setElement(term1360, 3, term1288);
        setElement(term1360, 5, term1288);
        setElement(term1360, 7, term1288);
        setElement(term1360, 9, term1288);
        setElement(term1360, 11, term1288);
        setElement(term1360, 13, term1288);
        setElement(term1360, 15, term1288);
        setElement(term1360, 17, term1288);
        setElement(term1360, 19, term1288);
        setElement(term1360, 21, term1288);
        setElement(term1360, 23, term1288);
        setElement(term1360, 25, term1288);
        setElement(term1360, 27, term1288);
        setElement(term1360, 29, term1288);
        setElement(term1360, 31, term1288);
        setElement(term1360, 33, term1288);
        setElement(term1360, 35, term1288);
        setElement(term1360, 37, term1288);
        setElement(term1360, 39, term1288);
        setField(term1315, term1315.getClass(), "wallOffsets", term1360);
        setField(term1315, term1315.getClass(), "lastRules", term1361);
        setField(term1362, term1362.getClass(), "table", null);
        setField(term1362, term1362.getClass(), "nextTable", null);
        setLongField(term1362, term1362.getClass(), "baseCount", 0L);
        setIntField(term1362, term1362.getClass(), "sizeCtl", 0);
        setIntField(term1362, term1362.getClass(), "transferIndex", 0);
        setIntField(term1362, term1362.getClass(), "cellsBusy", 0);
        setField(term1362, term1362.getClass(), "counterCells", null);
        setField(term1362, term1362.getClass(), "keySet", null);
        setField(term1362, term1362.getClass(), "values", null);
        setField(term1362, term1362.getClass(), "entrySet", null);
        setField(term1362, term1362.getClass(), "keySet", null);
        setField(term1362, term1362.getClass(), "values", null);
        setField(term1315, term1315.getClass(), "lastRulesCache", term1362);
        setField(term1298, term1298.getClass(), "rules", term1315);
        setField(term1277, term1277.getClass(), "zone", term1298);
        setField(term1262, term1262.getClass(), "zonedDateTime", term1277);
        term1367 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.ApiException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1367;
        callMethod(klass, "canEqual", argTypes, term1262, args);
    }

};


