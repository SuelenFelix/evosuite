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

public class ApiException_setErrorMessage_20086571524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term526;

    public ApiException_setErrorMessage_20086571524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term539 = new Integer(391863371);
        term526 = newInstance(Class.forName("com.app.exception.ApiException"));
        Object term541 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term542 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term543 = newInstance(Class.forName("java.time.LocalDate"));
        Object term547 = newInstance(Class.forName("java.time.LocalTime"));
        Object term552 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term562 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term579 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term580 = (long[]) newLongArray(1);
        Object[] term582 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term583 = (long[]) newLongArray(39);
        Object[] term623 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term624 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term625 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term626 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term526, term526.getClass(), "errorMessage", "xxtlPwDYFs");
        setField(term526, term526.getClass(), "statusCode", term539);
        setIntField(term543, term543.getClass(), "year", 2015);
        setShortField(term543, term543.getClass(), "month", (short) 4);
        setShortField(term543, term543.getClass(), "day", (short) 14);
        setField(term542, term542.getClass(), "date", term543);
        setByteField(term547, term547.getClass(), "hour", (byte) 18);
        setByteField(term547, term547.getClass(), "minute", (byte) 24);
        setByteField(term547, term547.getClass(), "second", (byte) 32);
        setIntField(term547, term547.getClass(), "nano", 369233818);
        setField(term542, term542.getClass(), "time", term547);
        setField(term541, term541.getClass(), "dateTime", term542);
        setIntField(term552, term552.getClass(), "totalSeconds", -10800);
        setField(term552, term552.getClass(), "id", "-03:00");
        setField(term541, term541.getClass(), "offset", term552);
        setField(term562, term562.getClass(), "id", "America/Recife");
        setLongElement(term580, 0, -1767217224L);
        setField(term579, term579.getClass(), "standardTransitions", term580);
        setElement(term582, 1, term552);
        setField(term579, term579.getClass(), "standardOffsets", term582);
        setLongElement(term583, 0, -1767217224L);
        setLongElement(term583, 1, -1206957600L);
        setLongElement(term583, 2, -1191362400L);
        setLongElement(term583, 3, -1175374800L);
        setLongElement(term583, 4, -1159826400L);
        setLongElement(term583, 5, -633819600L);
        setLongElement(term583, 6, -622069200L);
        setLongElement(term583, 7, -602283600L);
        setLongElement(term583, 8, -591832800L);
        setLongElement(term583, 9, -570747600L);
        setLongElement(term583, 10, -560210400L);
        setLongElement(term583, 11, -539125200L);
        setLongElement(term583, 12, -531352800L);
        setLongElement(term583, 13, -191365200L);
        setLongElement(term583, 14, -184197600L);
        setLongElement(term583, 15, -155163600L);
        setLongElement(term583, 16, -150069600L);
        setLongElement(term583, 17, -128898000L);
        setLongElement(term583, 18, -121125600L);
        setLongElement(term583, 19, -99954000L);
        setLongElement(term583, 20, -89589600L);
        setLongElement(term583, 21, -68418000L);
        setLongElement(term583, 22, -57967200L);
        setLongElement(term583, 23, 499748400L);
        setLongElement(term583, 24, 511236000L);
        setLongElement(term583, 25, 530593200L);
        setLongElement(term583, 26, 540266400L);
        setLongElement(term583, 27, 562129200L);
        setLongElement(term583, 28, 571197600L);
        setLongElement(term583, 29, 592974000L);
        setLongElement(term583, 30, 602042400L);
        setLongElement(term583, 31, 624423600L);
        setLongElement(term583, 32, 634701600L);
        setLongElement(term583, 33, 938919600L);
        setLongElement(term583, 34, 951616800L);
        setLongElement(term583, 35, 970974000L);
        setLongElement(term583, 36, 971575200L);
        setLongElement(term583, 37, 1003028400L);
        setLongElement(term583, 38, 1013911200L);
        setField(term579, term579.getClass(), "savingsInstantTransitions", term583);
        setField(term579, term579.getClass(), "savingsLocalTransitions", term623);
        setElement(term624, 1, term552);
        setElement(term624, 3, term552);
        setElement(term624, 5, term552);
        setElement(term624, 7, term552);
        setElement(term624, 9, term552);
        setElement(term624, 11, term552);
        setElement(term624, 13, term552);
        setElement(term624, 15, term552);
        setElement(term624, 17, term552);
        setElement(term624, 19, term552);
        setElement(term624, 21, term552);
        setElement(term624, 23, term552);
        setElement(term624, 25, term552);
        setElement(term624, 27, term552);
        setElement(term624, 29, term552);
        setElement(term624, 31, term552);
        setElement(term624, 33, term552);
        setElement(term624, 35, term552);
        setElement(term624, 37, term552);
        setElement(term624, 39, term552);
        setField(term579, term579.getClass(), "wallOffsets", term624);
        setField(term579, term579.getClass(), "lastRules", term625);
        setField(term626, term626.getClass(), "table", null);
        setField(term626, term626.getClass(), "nextTable", null);
        setLongField(term626, term626.getClass(), "baseCount", 0L);
        setIntField(term626, term626.getClass(), "sizeCtl", 0);
        setIntField(term626, term626.getClass(), "transferIndex", 0);
        setIntField(term626, term626.getClass(), "cellsBusy", 0);
        setField(term626, term626.getClass(), "counterCells", null);
        setField(term626, term626.getClass(), "keySet", null);
        setField(term626, term626.getClass(), "values", null);
        setField(term626, term626.getClass(), "entrySet", null);
        setField(term626, term626.getClass(), "keySet", null);
        setField(term626, term626.getClass(), "values", null);
        setField(term579, term579.getClass(), "lastRulesCache", term626);
        setField(term562, term562.getClass(), "rules", term579);
        setField(term541, term541.getClass(), "zone", term562);
        setField(term526, term526.getClass(), "zonedDateTime", term541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.ApiException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "setErrorMessage", argTypes, term526, args);
    }

};


