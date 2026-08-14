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

public class ApiException_getStatusCode_7811749252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176;

    public ApiException_getStatusCode_7811749252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term189 = new Integer(1162663216);
        term176 = newInstance(Class.forName("com.app.exception.ApiException"));
        Object term191 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term192 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term193 = newInstance(Class.forName("java.time.LocalDate"));
        Object term197 = newInstance(Class.forName("java.time.LocalTime"));
        Object term202 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term212 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term229 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term230 = (long[]) newLongArray(1);
        Object[] term232 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term233 = (long[]) newLongArray(39);
        Object[] term273 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term274 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term275 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term276 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term176, term176.getClass(), "errorMessage", "sjlJAEtRrb");
        setField(term176, term176.getClass(), "statusCode", term189);
        setIntField(term193, term193.getClass(), "year", 2021);
        setShortField(term193, term193.getClass(), "month", (short) 1);
        setShortField(term193, term193.getClass(), "day", (short) 18);
        setField(term192, term192.getClass(), "date", term193);
        setByteField(term197, term197.getClass(), "hour", (byte) 13);
        setByteField(term197, term197.getClass(), "minute", (byte) 38);
        setByteField(term197, term197.getClass(), "second", (byte) 26);
        setIntField(term197, term197.getClass(), "nano", 544608644);
        setField(term192, term192.getClass(), "time", term197);
        setField(term191, term191.getClass(), "dateTime", term192);
        setIntField(term202, term202.getClass(), "totalSeconds", -10800);
        setField(term202, term202.getClass(), "id", "-03:00");
        setField(term191, term191.getClass(), "offset", term202);
        setField(term212, term212.getClass(), "id", "America/Recife");
        setLongElement(term230, 0, -1767217224L);
        setField(term229, term229.getClass(), "standardTransitions", term230);
        setElement(term232, 1, term202);
        setField(term229, term229.getClass(), "standardOffsets", term232);
        setLongElement(term233, 0, -1767217224L);
        setLongElement(term233, 1, -1206957600L);
        setLongElement(term233, 2, -1191362400L);
        setLongElement(term233, 3, -1175374800L);
        setLongElement(term233, 4, -1159826400L);
        setLongElement(term233, 5, -633819600L);
        setLongElement(term233, 6, -622069200L);
        setLongElement(term233, 7, -602283600L);
        setLongElement(term233, 8, -591832800L);
        setLongElement(term233, 9, -570747600L);
        setLongElement(term233, 10, -560210400L);
        setLongElement(term233, 11, -539125200L);
        setLongElement(term233, 12, -531352800L);
        setLongElement(term233, 13, -191365200L);
        setLongElement(term233, 14, -184197600L);
        setLongElement(term233, 15, -155163600L);
        setLongElement(term233, 16, -150069600L);
        setLongElement(term233, 17, -128898000L);
        setLongElement(term233, 18, -121125600L);
        setLongElement(term233, 19, -99954000L);
        setLongElement(term233, 20, -89589600L);
        setLongElement(term233, 21, -68418000L);
        setLongElement(term233, 22, -57967200L);
        setLongElement(term233, 23, 499748400L);
        setLongElement(term233, 24, 511236000L);
        setLongElement(term233, 25, 530593200L);
        setLongElement(term233, 26, 540266400L);
        setLongElement(term233, 27, 562129200L);
        setLongElement(term233, 28, 571197600L);
        setLongElement(term233, 29, 592974000L);
        setLongElement(term233, 30, 602042400L);
        setLongElement(term233, 31, 624423600L);
        setLongElement(term233, 32, 634701600L);
        setLongElement(term233, 33, 938919600L);
        setLongElement(term233, 34, 951616800L);
        setLongElement(term233, 35, 970974000L);
        setLongElement(term233, 36, 971575200L);
        setLongElement(term233, 37, 1003028400L);
        setLongElement(term233, 38, 1013911200L);
        setField(term229, term229.getClass(), "savingsInstantTransitions", term233);
        setField(term229, term229.getClass(), "savingsLocalTransitions", term273);
        setElement(term274, 1, term202);
        setElement(term274, 3, term202);
        setElement(term274, 5, term202);
        setElement(term274, 7, term202);
        setElement(term274, 9, term202);
        setElement(term274, 11, term202);
        setElement(term274, 13, term202);
        setElement(term274, 15, term202);
        setElement(term274, 17, term202);
        setElement(term274, 19, term202);
        setElement(term274, 21, term202);
        setElement(term274, 23, term202);
        setElement(term274, 25, term202);
        setElement(term274, 27, term202);
        setElement(term274, 29, term202);
        setElement(term274, 31, term202);
        setElement(term274, 33, term202);
        setElement(term274, 35, term202);
        setElement(term274, 37, term202);
        setElement(term274, 39, term202);
        setField(term229, term229.getClass(), "wallOffsets", term274);
        setField(term229, term229.getClass(), "lastRules", term275);
        setField(term276, term276.getClass(), "table", null);
        setField(term276, term276.getClass(), "nextTable", null);
        setLongField(term276, term276.getClass(), "baseCount", 0L);
        setIntField(term276, term276.getClass(), "sizeCtl", 0);
        setIntField(term276, term276.getClass(), "transferIndex", 0);
        setIntField(term276, term276.getClass(), "cellsBusy", 0);
        setField(term276, term276.getClass(), "counterCells", null);
        setField(term276, term276.getClass(), "keySet", null);
        setField(term276, term276.getClass(), "values", null);
        setField(term276, term276.getClass(), "entrySet", null);
        setField(term276, term276.getClass(), "keySet", null);
        setField(term276, term276.getClass(), "values", null);
        setField(term229, term229.getClass(), "lastRulesCache", term276);
        setField(term212, term212.getClass(), "rules", term229);
        setField(term191, term191.getClass(), "zone", term212);
        setField(term176, term176.getClass(), "zonedDateTime", term191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.ApiException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatusCode", argTypes, term176, args);
    }

};


