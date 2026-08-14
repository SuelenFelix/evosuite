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

public class ApiException_getZonedDateTime_20416916073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351;

    public ApiException_getZonedDateTime_20416916073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term364 = new Integer(1484323161);
        term351 = newInstance(Class.forName("com.app.exception.ApiException"));
        Object term366 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term367 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term368 = newInstance(Class.forName("java.time.LocalDate"));
        Object term372 = newInstance(Class.forName("java.time.LocalTime"));
        Object term377 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term387 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term404 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term405 = (long[]) newLongArray(1);
        Object[] term407 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term408 = (long[]) newLongArray(39);
        Object[] term448 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term449 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term450 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term451 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term351, term351.getClass(), "errorMessage", "MuLcgQHgqz");
        setField(term351, term351.getClass(), "statusCode", term364);
        setIntField(term368, term368.getClass(), "year", 2015);
        setShortField(term368, term368.getClass(), "month", (short) 9);
        setShortField(term368, term368.getClass(), "day", (short) 19);
        setField(term367, term367.getClass(), "date", term368);
        setByteField(term372, term372.getClass(), "hour", (byte) 9);
        setByteField(term372, term372.getClass(), "minute", (byte) 4);
        setByteField(term372, term372.getClass(), "second", (byte) 10);
        setIntField(term372, term372.getClass(), "nano", 401765865);
        setField(term367, term367.getClass(), "time", term372);
        setField(term366, term366.getClass(), "dateTime", term367);
        setIntField(term377, term377.getClass(), "totalSeconds", -10800);
        setField(term377, term377.getClass(), "id", "-03:00");
        setField(term366, term366.getClass(), "offset", term377);
        setField(term387, term387.getClass(), "id", "America/Recife");
        setLongElement(term405, 0, -1767217224L);
        setField(term404, term404.getClass(), "standardTransitions", term405);
        setElement(term407, 1, term377);
        setField(term404, term404.getClass(), "standardOffsets", term407);
        setLongElement(term408, 0, -1767217224L);
        setLongElement(term408, 1, -1206957600L);
        setLongElement(term408, 2, -1191362400L);
        setLongElement(term408, 3, -1175374800L);
        setLongElement(term408, 4, -1159826400L);
        setLongElement(term408, 5, -633819600L);
        setLongElement(term408, 6, -622069200L);
        setLongElement(term408, 7, -602283600L);
        setLongElement(term408, 8, -591832800L);
        setLongElement(term408, 9, -570747600L);
        setLongElement(term408, 10, -560210400L);
        setLongElement(term408, 11, -539125200L);
        setLongElement(term408, 12, -531352800L);
        setLongElement(term408, 13, -191365200L);
        setLongElement(term408, 14, -184197600L);
        setLongElement(term408, 15, -155163600L);
        setLongElement(term408, 16, -150069600L);
        setLongElement(term408, 17, -128898000L);
        setLongElement(term408, 18, -121125600L);
        setLongElement(term408, 19, -99954000L);
        setLongElement(term408, 20, -89589600L);
        setLongElement(term408, 21, -68418000L);
        setLongElement(term408, 22, -57967200L);
        setLongElement(term408, 23, 499748400L);
        setLongElement(term408, 24, 511236000L);
        setLongElement(term408, 25, 530593200L);
        setLongElement(term408, 26, 540266400L);
        setLongElement(term408, 27, 562129200L);
        setLongElement(term408, 28, 571197600L);
        setLongElement(term408, 29, 592974000L);
        setLongElement(term408, 30, 602042400L);
        setLongElement(term408, 31, 624423600L);
        setLongElement(term408, 32, 634701600L);
        setLongElement(term408, 33, 938919600L);
        setLongElement(term408, 34, 951616800L);
        setLongElement(term408, 35, 970974000L);
        setLongElement(term408, 36, 971575200L);
        setLongElement(term408, 37, 1003028400L);
        setLongElement(term408, 38, 1013911200L);
        setField(term404, term404.getClass(), "savingsInstantTransitions", term408);
        setField(term404, term404.getClass(), "savingsLocalTransitions", term448);
        setElement(term449, 1, term377);
        setElement(term449, 3, term377);
        setElement(term449, 5, term377);
        setElement(term449, 7, term377);
        setElement(term449, 9, term377);
        setElement(term449, 11, term377);
        setElement(term449, 13, term377);
        setElement(term449, 15, term377);
        setElement(term449, 17, term377);
        setElement(term449, 19, term377);
        setElement(term449, 21, term377);
        setElement(term449, 23, term377);
        setElement(term449, 25, term377);
        setElement(term449, 27, term377);
        setElement(term449, 29, term377);
        setElement(term449, 31, term377);
        setElement(term449, 33, term377);
        setElement(term449, 35, term377);
        setElement(term449, 37, term377);
        setElement(term449, 39, term377);
        setField(term404, term404.getClass(), "wallOffsets", term449);
        setField(term404, term404.getClass(), "lastRules", term450);
        setField(term451, term451.getClass(), "table", null);
        setField(term451, term451.getClass(), "nextTable", null);
        setLongField(term451, term451.getClass(), "baseCount", 0L);
        setIntField(term451, term451.getClass(), "sizeCtl", 0);
        setIntField(term451, term451.getClass(), "transferIndex", 0);
        setIntField(term451, term451.getClass(), "cellsBusy", 0);
        setField(term451, term451.getClass(), "counterCells", null);
        setField(term451, term451.getClass(), "keySet", null);
        setField(term451, term451.getClass(), "values", null);
        setField(term451, term451.getClass(), "entrySet", null);
        setField(term451, term451.getClass(), "keySet", null);
        setField(term451, term451.getClass(), "values", null);
        setField(term404, term404.getClass(), "lastRulesCache", term451);
        setField(term387, term387.getClass(), "rules", term404);
        setField(term366, term366.getClass(), "zone", term387);
        setField(term351, term351.getClass(), "zonedDateTime", term366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.ApiException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZonedDateTime", argTypes, term351, args);
    }

};


