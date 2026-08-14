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

public class ApiException_setStatusCode_6531237075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723;
     Object term828;

    public ApiException_setStatusCode_6531237075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term736 = new Integer(-1922583790);
        term723 = newInstance(Class.forName("com.app.exception.ApiException"));
        Object term738 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term744 = newInstance(Class.forName("java.time.LocalTime"));
        Object term749 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term759 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term776 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term777 = (long[]) newLongArray(1);
        Object[] term779 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term780 = (long[]) newLongArray(39);
        Object[] term820 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term821 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term822 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term823 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term723, term723.getClass(), "errorMessage", "EGtDIRbSSb");
        setField(term723, term723.getClass(), "statusCode", term736);
        setIntField(term740, term740.getClass(), "year", 2022);
        setShortField(term740, term740.getClass(), "month", (short) 2);
        setShortField(term740, term740.getClass(), "day", (short) 26);
        setField(term739, term739.getClass(), "date", term740);
        setByteField(term744, term744.getClass(), "hour", (byte) 11);
        setByteField(term744, term744.getClass(), "minute", (byte) 42);
        setByteField(term744, term744.getClass(), "second", (byte) 15);
        setIntField(term744, term744.getClass(), "nano", 377731937);
        setField(term739, term739.getClass(), "time", term744);
        setField(term738, term738.getClass(), "dateTime", term739);
        setIntField(term749, term749.getClass(), "totalSeconds", -10800);
        setField(term749, term749.getClass(), "id", "-03:00");
        setField(term738, term738.getClass(), "offset", term749);
        setField(term759, term759.getClass(), "id", "America/Recife");
        setLongElement(term777, 0, -1767217224L);
        setField(term776, term776.getClass(), "standardTransitions", term777);
        setElement(term779, 1, term749);
        setField(term776, term776.getClass(), "standardOffsets", term779);
        setLongElement(term780, 0, -1767217224L);
        setLongElement(term780, 1, -1206957600L);
        setLongElement(term780, 2, -1191362400L);
        setLongElement(term780, 3, -1175374800L);
        setLongElement(term780, 4, -1159826400L);
        setLongElement(term780, 5, -633819600L);
        setLongElement(term780, 6, -622069200L);
        setLongElement(term780, 7, -602283600L);
        setLongElement(term780, 8, -591832800L);
        setLongElement(term780, 9, -570747600L);
        setLongElement(term780, 10, -560210400L);
        setLongElement(term780, 11, -539125200L);
        setLongElement(term780, 12, -531352800L);
        setLongElement(term780, 13, -191365200L);
        setLongElement(term780, 14, -184197600L);
        setLongElement(term780, 15, -155163600L);
        setLongElement(term780, 16, -150069600L);
        setLongElement(term780, 17, -128898000L);
        setLongElement(term780, 18, -121125600L);
        setLongElement(term780, 19, -99954000L);
        setLongElement(term780, 20, -89589600L);
        setLongElement(term780, 21, -68418000L);
        setLongElement(term780, 22, -57967200L);
        setLongElement(term780, 23, 499748400L);
        setLongElement(term780, 24, 511236000L);
        setLongElement(term780, 25, 530593200L);
        setLongElement(term780, 26, 540266400L);
        setLongElement(term780, 27, 562129200L);
        setLongElement(term780, 28, 571197600L);
        setLongElement(term780, 29, 592974000L);
        setLongElement(term780, 30, 602042400L);
        setLongElement(term780, 31, 624423600L);
        setLongElement(term780, 32, 634701600L);
        setLongElement(term780, 33, 938919600L);
        setLongElement(term780, 34, 951616800L);
        setLongElement(term780, 35, 970974000L);
        setLongElement(term780, 36, 971575200L);
        setLongElement(term780, 37, 1003028400L);
        setLongElement(term780, 38, 1013911200L);
        setField(term776, term776.getClass(), "savingsInstantTransitions", term780);
        setField(term776, term776.getClass(), "savingsLocalTransitions", term820);
        setElement(term821, 1, term749);
        setElement(term821, 3, term749);
        setElement(term821, 5, term749);
        setElement(term821, 7, term749);
        setElement(term821, 9, term749);
        setElement(term821, 11, term749);
        setElement(term821, 13, term749);
        setElement(term821, 15, term749);
        setElement(term821, 17, term749);
        setElement(term821, 19, term749);
        setElement(term821, 21, term749);
        setElement(term821, 23, term749);
        setElement(term821, 25, term749);
        setElement(term821, 27, term749);
        setElement(term821, 29, term749);
        setElement(term821, 31, term749);
        setElement(term821, 33, term749);
        setElement(term821, 35, term749);
        setElement(term821, 37, term749);
        setElement(term821, 39, term749);
        setField(term776, term776.getClass(), "wallOffsets", term821);
        setField(term776, term776.getClass(), "lastRules", term822);
        setField(term823, term823.getClass(), "table", null);
        setField(term823, term823.getClass(), "nextTable", null);
        setLongField(term823, term823.getClass(), "baseCount", 0L);
        setIntField(term823, term823.getClass(), "sizeCtl", 0);
        setIntField(term823, term823.getClass(), "transferIndex", 0);
        setIntField(term823, term823.getClass(), "cellsBusy", 0);
        setField(term823, term823.getClass(), "counterCells", null);
        setField(term823, term823.getClass(), "keySet", null);
        setField(term823, term823.getClass(), "values", null);
        setField(term823, term823.getClass(), "entrySet", null);
        setField(term823, term823.getClass(), "keySet", null);
        setField(term823, term823.getClass(), "values", null);
        setField(term776, term776.getClass(), "lastRulesCache", term823);
        setField(term759, term759.getClass(), "rules", term776);
        setField(term738, term738.getClass(), "zone", term759);
        setField(term723, term723.getClass(), "zonedDateTime", term738);
        term828 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.ApiException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term828;
        callMethod(klass, "setStatusCode", argTypes, term723, args);
    }

};


