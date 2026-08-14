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

public class ApiException_hashCode_16665657519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1438;

    public ApiException_hashCode_16665657519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1451 = new Integer(-1339778481);
        term1438 = newInstance(Class.forName("com.app.exception.ApiException"));
        Object term1453 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1459 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1464 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1474 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1491 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1492 = (long[]) newLongArray(1);
        Object[] term1494 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1495 = (long[]) newLongArray(39);
        Object[] term1535 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1536 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1537 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1538 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1438, term1438.getClass(), "errorMessage", "RMFIsYGgne");
        setField(term1438, term1438.getClass(), "statusCode", term1451);
        setIntField(term1455, term1455.getClass(), "year", 2022);
        setShortField(term1455, term1455.getClass(), "month", (short) 11);
        setShortField(term1455, term1455.getClass(), "day", (short) 16);
        setField(term1454, term1454.getClass(), "date", term1455);
        setByteField(term1459, term1459.getClass(), "hour", (byte) 15);
        setByteField(term1459, term1459.getClass(), "minute", (byte) 54);
        setByteField(term1459, term1459.getClass(), "second", (byte) 2);
        setIntField(term1459, term1459.getClass(), "nano", 733274103);
        setField(term1454, term1454.getClass(), "time", term1459);
        setField(term1453, term1453.getClass(), "dateTime", term1454);
        setIntField(term1464, term1464.getClass(), "totalSeconds", -10800);
        setField(term1464, term1464.getClass(), "id", "-03:00");
        setField(term1453, term1453.getClass(), "offset", term1464);
        setField(term1474, term1474.getClass(), "id", "America/Recife");
        setLongElement(term1492, 0, -1767217224L);
        setField(term1491, term1491.getClass(), "standardTransitions", term1492);
        setElement(term1494, 1, term1464);
        setField(term1491, term1491.getClass(), "standardOffsets", term1494);
        setLongElement(term1495, 0, -1767217224L);
        setLongElement(term1495, 1, -1206957600L);
        setLongElement(term1495, 2, -1191362400L);
        setLongElement(term1495, 3, -1175374800L);
        setLongElement(term1495, 4, -1159826400L);
        setLongElement(term1495, 5, -633819600L);
        setLongElement(term1495, 6, -622069200L);
        setLongElement(term1495, 7, -602283600L);
        setLongElement(term1495, 8, -591832800L);
        setLongElement(term1495, 9, -570747600L);
        setLongElement(term1495, 10, -560210400L);
        setLongElement(term1495, 11, -539125200L);
        setLongElement(term1495, 12, -531352800L);
        setLongElement(term1495, 13, -191365200L);
        setLongElement(term1495, 14, -184197600L);
        setLongElement(term1495, 15, -155163600L);
        setLongElement(term1495, 16, -150069600L);
        setLongElement(term1495, 17, -128898000L);
        setLongElement(term1495, 18, -121125600L);
        setLongElement(term1495, 19, -99954000L);
        setLongElement(term1495, 20, -89589600L);
        setLongElement(term1495, 21, -68418000L);
        setLongElement(term1495, 22, -57967200L);
        setLongElement(term1495, 23, 499748400L);
        setLongElement(term1495, 24, 511236000L);
        setLongElement(term1495, 25, 530593200L);
        setLongElement(term1495, 26, 540266400L);
        setLongElement(term1495, 27, 562129200L);
        setLongElement(term1495, 28, 571197600L);
        setLongElement(term1495, 29, 592974000L);
        setLongElement(term1495, 30, 602042400L);
        setLongElement(term1495, 31, 624423600L);
        setLongElement(term1495, 32, 634701600L);
        setLongElement(term1495, 33, 938919600L);
        setLongElement(term1495, 34, 951616800L);
        setLongElement(term1495, 35, 970974000L);
        setLongElement(term1495, 36, 971575200L);
        setLongElement(term1495, 37, 1003028400L);
        setLongElement(term1495, 38, 1013911200L);
        setField(term1491, term1491.getClass(), "savingsInstantTransitions", term1495);
        setField(term1491, term1491.getClass(), "savingsLocalTransitions", term1535);
        setElement(term1536, 1, term1464);
        setElement(term1536, 3, term1464);
        setElement(term1536, 5, term1464);
        setElement(term1536, 7, term1464);
        setElement(term1536, 9, term1464);
        setElement(term1536, 11, term1464);
        setElement(term1536, 13, term1464);
        setElement(term1536, 15, term1464);
        setElement(term1536, 17, term1464);
        setElement(term1536, 19, term1464);
        setElement(term1536, 21, term1464);
        setElement(term1536, 23, term1464);
        setElement(term1536, 25, term1464);
        setElement(term1536, 27, term1464);
        setElement(term1536, 29, term1464);
        setElement(term1536, 31, term1464);
        setElement(term1536, 33, term1464);
        setElement(term1536, 35, term1464);
        setElement(term1536, 37, term1464);
        setElement(term1536, 39, term1464);
        setField(term1491, term1491.getClass(), "wallOffsets", term1536);
        setField(term1491, term1491.getClass(), "lastRules", term1537);
        setField(term1538, term1538.getClass(), "table", null);
        setField(term1538, term1538.getClass(), "nextTable", null);
        setLongField(term1538, term1538.getClass(), "baseCount", 0L);
        setIntField(term1538, term1538.getClass(), "sizeCtl", 0);
        setIntField(term1538, term1538.getClass(), "transferIndex", 0);
        setIntField(term1538, term1538.getClass(), "cellsBusy", 0);
        setField(term1538, term1538.getClass(), "counterCells", null);
        setField(term1538, term1538.getClass(), "keySet", null);
        setField(term1538, term1538.getClass(), "values", null);
        setField(term1538, term1538.getClass(), "entrySet", null);
        setField(term1538, term1538.getClass(), "keySet", null);
        setField(term1538, term1538.getClass(), "values", null);
        setField(term1491, term1491.getClass(), "lastRulesCache", term1538);
        setField(term1474, term1474.getClass(), "rules", term1491);
        setField(term1453, term1453.getClass(), "zone", term1474);
        setField(term1438, term1438.getClass(), "zonedDateTime", term1453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.ApiException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1438, args);
    }

};


