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

public class ApiException_getErrorMessage_10143163281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ApiException_getErrorMessage_10143163281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14 = new Integer(568599855);
        term1 = newInstance(Class.forName("com.app.exception.ApiException"));
        Object term16 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term17 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term37 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term54 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term55 = (long[]) newLongArray(1);
        Object[] term57 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term58 = (long[]) newLongArray(39);
        Object[] term98 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term99 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term100 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term101 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1, term1.getClass(), "errorMessage", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "statusCode", term14);
        setIntField(term18, term18.getClass(), "year", 2012);
        setShortField(term18, term18.getClass(), "month", (short) 8);
        setShortField(term18, term18.getClass(), "day", (short) 25);
        setField(term17, term17.getClass(), "date", term18);
        setByteField(term22, term22.getClass(), "hour", (byte) 5);
        setByteField(term22, term22.getClass(), "minute", (byte) 20);
        setByteField(term22, term22.getClass(), "second", (byte) 50);
        setIntField(term22, term22.getClass(), "nano", 345595912);
        setField(term17, term17.getClass(), "time", term22);
        setField(term16, term16.getClass(), "dateTime", term17);
        setIntField(term27, term27.getClass(), "totalSeconds", -10800);
        setField(term27, term27.getClass(), "id", "-03:00");
        setField(term16, term16.getClass(), "offset", term27);
        setField(term37, term37.getClass(), "id", "America/Recife");
        setLongElement(term55, 0, -1767217224L);
        setField(term54, term54.getClass(), "standardTransitions", term55);
        setElement(term57, 1, term27);
        setField(term54, term54.getClass(), "standardOffsets", term57);
        setLongElement(term58, 0, -1767217224L);
        setLongElement(term58, 1, -1206957600L);
        setLongElement(term58, 2, -1191362400L);
        setLongElement(term58, 3, -1175374800L);
        setLongElement(term58, 4, -1159826400L);
        setLongElement(term58, 5, -633819600L);
        setLongElement(term58, 6, -622069200L);
        setLongElement(term58, 7, -602283600L);
        setLongElement(term58, 8, -591832800L);
        setLongElement(term58, 9, -570747600L);
        setLongElement(term58, 10, -560210400L);
        setLongElement(term58, 11, -539125200L);
        setLongElement(term58, 12, -531352800L);
        setLongElement(term58, 13, -191365200L);
        setLongElement(term58, 14, -184197600L);
        setLongElement(term58, 15, -155163600L);
        setLongElement(term58, 16, -150069600L);
        setLongElement(term58, 17, -128898000L);
        setLongElement(term58, 18, -121125600L);
        setLongElement(term58, 19, -99954000L);
        setLongElement(term58, 20, -89589600L);
        setLongElement(term58, 21, -68418000L);
        setLongElement(term58, 22, -57967200L);
        setLongElement(term58, 23, 499748400L);
        setLongElement(term58, 24, 511236000L);
        setLongElement(term58, 25, 530593200L);
        setLongElement(term58, 26, 540266400L);
        setLongElement(term58, 27, 562129200L);
        setLongElement(term58, 28, 571197600L);
        setLongElement(term58, 29, 592974000L);
        setLongElement(term58, 30, 602042400L);
        setLongElement(term58, 31, 624423600L);
        setLongElement(term58, 32, 634701600L);
        setLongElement(term58, 33, 938919600L);
        setLongElement(term58, 34, 951616800L);
        setLongElement(term58, 35, 970974000L);
        setLongElement(term58, 36, 971575200L);
        setLongElement(term58, 37, 1003028400L);
        setLongElement(term58, 38, 1013911200L);
        setField(term54, term54.getClass(), "savingsInstantTransitions", term58);
        setField(term54, term54.getClass(), "savingsLocalTransitions", term98);
        setElement(term99, 1, term27);
        setElement(term99, 3, term27);
        setElement(term99, 5, term27);
        setElement(term99, 7, term27);
        setElement(term99, 9, term27);
        setElement(term99, 11, term27);
        setElement(term99, 13, term27);
        setElement(term99, 15, term27);
        setElement(term99, 17, term27);
        setElement(term99, 19, term27);
        setElement(term99, 21, term27);
        setElement(term99, 23, term27);
        setElement(term99, 25, term27);
        setElement(term99, 27, term27);
        setElement(term99, 29, term27);
        setElement(term99, 31, term27);
        setElement(term99, 33, term27);
        setElement(term99, 35, term27);
        setElement(term99, 37, term27);
        setElement(term99, 39, term27);
        setField(term54, term54.getClass(), "wallOffsets", term99);
        setField(term54, term54.getClass(), "lastRules", term100);
        setField(term101, term101.getClass(), "table", null);
        setField(term101, term101.getClass(), "nextTable", null);
        setLongField(term101, term101.getClass(), "baseCount", 0L);
        setIntField(term101, term101.getClass(), "sizeCtl", 0);
        setIntField(term101, term101.getClass(), "transferIndex", 0);
        setIntField(term101, term101.getClass(), "cellsBusy", 0);
        setField(term101, term101.getClass(), "counterCells", null);
        setField(term101, term101.getClass(), "keySet", null);
        setField(term101, term101.getClass(), "values", null);
        setField(term101, term101.getClass(), "entrySet", null);
        setField(term101, term101.getClass(), "keySet", null);
        setField(term101, term101.getClass(), "values", null);
        setField(term54, term54.getClass(), "lastRulesCache", term101);
        setField(term37, term37.getClass(), "rules", term54);
        setField(term16, term16.getClass(), "zone", term37);
        setField(term1, term1.getClass(), "zonedDateTime", term16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.ApiException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getErrorMessage", argTypes, term1, args);
    }

};


