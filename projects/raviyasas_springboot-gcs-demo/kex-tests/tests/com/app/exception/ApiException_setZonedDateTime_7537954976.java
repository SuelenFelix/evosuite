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

public class ApiException_setZonedDateTime_7537954976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term900;
     Object term1005;

    public ApiException_setZonedDateTime_7537954976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term913 = new Integer(-1955890973);
        term900 = newInstance(Class.forName("com.app.exception.ApiException"));
        Object term915 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term916 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term917 = newInstance(Class.forName("java.time.LocalDate"));
        Object term921 = newInstance(Class.forName("java.time.LocalTime"));
        Object term926 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term936 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term953 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term954 = (long[]) newLongArray(1);
        Object[] term956 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term957 = (long[]) newLongArray(39);
        Object[] term997 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term998 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term999 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1000 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term900, term900.getClass(), "errorMessage", "SzjVpOQTyS");
        setField(term900, term900.getClass(), "statusCode", term913);
        setIntField(term917, term917.getClass(), "year", 2026);
        setShortField(term917, term917.getClass(), "month", (short) 12);
        setShortField(term917, term917.getClass(), "day", (short) 14);
        setField(term916, term916.getClass(), "date", term917);
        setByteField(term921, term921.getClass(), "hour", (byte) 16);
        setByteField(term921, term921.getClass(), "minute", (byte) 34);
        setByteField(term921, term921.getClass(), "second", (byte) 9);
        setIntField(term921, term921.getClass(), "nano", 518326996);
        setField(term916, term916.getClass(), "time", term921);
        setField(term915, term915.getClass(), "dateTime", term916);
        setIntField(term926, term926.getClass(), "totalSeconds", -10800);
        setField(term926, term926.getClass(), "id", "-03:00");
        setField(term915, term915.getClass(), "offset", term926);
        setField(term936, term936.getClass(), "id", "America/Recife");
        setLongElement(term954, 0, -1767217224L);
        setField(term953, term953.getClass(), "standardTransitions", term954);
        setElement(term956, 1, term926);
        setField(term953, term953.getClass(), "standardOffsets", term956);
        setLongElement(term957, 0, -1767217224L);
        setLongElement(term957, 1, -1206957600L);
        setLongElement(term957, 2, -1191362400L);
        setLongElement(term957, 3, -1175374800L);
        setLongElement(term957, 4, -1159826400L);
        setLongElement(term957, 5, -633819600L);
        setLongElement(term957, 6, -622069200L);
        setLongElement(term957, 7, -602283600L);
        setLongElement(term957, 8, -591832800L);
        setLongElement(term957, 9, -570747600L);
        setLongElement(term957, 10, -560210400L);
        setLongElement(term957, 11, -539125200L);
        setLongElement(term957, 12, -531352800L);
        setLongElement(term957, 13, -191365200L);
        setLongElement(term957, 14, -184197600L);
        setLongElement(term957, 15, -155163600L);
        setLongElement(term957, 16, -150069600L);
        setLongElement(term957, 17, -128898000L);
        setLongElement(term957, 18, -121125600L);
        setLongElement(term957, 19, -99954000L);
        setLongElement(term957, 20, -89589600L);
        setLongElement(term957, 21, -68418000L);
        setLongElement(term957, 22, -57967200L);
        setLongElement(term957, 23, 499748400L);
        setLongElement(term957, 24, 511236000L);
        setLongElement(term957, 25, 530593200L);
        setLongElement(term957, 26, 540266400L);
        setLongElement(term957, 27, 562129200L);
        setLongElement(term957, 28, 571197600L);
        setLongElement(term957, 29, 592974000L);
        setLongElement(term957, 30, 602042400L);
        setLongElement(term957, 31, 624423600L);
        setLongElement(term957, 32, 634701600L);
        setLongElement(term957, 33, 938919600L);
        setLongElement(term957, 34, 951616800L);
        setLongElement(term957, 35, 970974000L);
        setLongElement(term957, 36, 971575200L);
        setLongElement(term957, 37, 1003028400L);
        setLongElement(term957, 38, 1013911200L);
        setField(term953, term953.getClass(), "savingsInstantTransitions", term957);
        setField(term953, term953.getClass(), "savingsLocalTransitions", term997);
        setElement(term998, 1, term926);
        setElement(term998, 3, term926);
        setElement(term998, 5, term926);
        setElement(term998, 7, term926);
        setElement(term998, 9, term926);
        setElement(term998, 11, term926);
        setElement(term998, 13, term926);
        setElement(term998, 15, term926);
        setElement(term998, 17, term926);
        setElement(term998, 19, term926);
        setElement(term998, 21, term926);
        setElement(term998, 23, term926);
        setElement(term998, 25, term926);
        setElement(term998, 27, term926);
        setElement(term998, 29, term926);
        setElement(term998, 31, term926);
        setElement(term998, 33, term926);
        setElement(term998, 35, term926);
        setElement(term998, 37, term926);
        setElement(term998, 39, term926);
        setField(term953, term953.getClass(), "wallOffsets", term998);
        setField(term953, term953.getClass(), "lastRules", term999);
        setField(term1000, term1000.getClass(), "table", null);
        setField(term1000, term1000.getClass(), "nextTable", null);
        setLongField(term1000, term1000.getClass(), "baseCount", 0L);
        setIntField(term1000, term1000.getClass(), "sizeCtl", 0);
        setIntField(term1000, term1000.getClass(), "transferIndex", 0);
        setIntField(term1000, term1000.getClass(), "cellsBusy", 0);
        setField(term1000, term1000.getClass(), "counterCells", null);
        setField(term1000, term1000.getClass(), "keySet", null);
        setField(term1000, term1000.getClass(), "values", null);
        setField(term1000, term1000.getClass(), "entrySet", null);
        setField(term1000, term1000.getClass(), "keySet", null);
        setField(term1000, term1000.getClass(), "values", null);
        setField(term953, term953.getClass(), "lastRulesCache", term1000);
        setField(term936, term936.getClass(), "rules", term953);
        setField(term915, term915.getClass(), "zone", term936);
        setField(term900, term900.getClass(), "zonedDateTime", term915);
        term1005 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1006 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1007 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1011 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1007, term1007.getClass(), "year", 2025);
        setShortField(term1007, term1007.getClass(), "month", (short) 4);
        setShortField(term1007, term1007.getClass(), "day", (short) 24);
        setField(term1006, term1006.getClass(), "date", term1007);
        setByteField(term1011, term1011.getClass(), "hour", (byte) 18);
        setByteField(term1011, term1011.getClass(), "minute", (byte) 11);
        setByteField(term1011, term1011.getClass(), "second", (byte) 40);
        setIntField(term1011, term1011.getClass(), "nano", 137454929);
        setField(term1006, term1006.getClass(), "time", term1011);
        setField(term1005, term1005.getClass(), "dateTime", term1006);
        setField(term1005, term1005.getClass(), "offset", term926);
        setField(term1005, term1005.getClass(), "zone", term936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.ApiException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.ZonedDateTime");
        Object[] args = new Object[1];
        args[0] = term1005;
        callMethod(klass, "setZonedDateTime", argTypes, term900, args);
    }

};


