package ru.smartup.timetracker.pojo.notice;

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
import static ru.smartup.timetracker.pojo.notice.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ScheduledNotice_getTime_17519976941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17351;

    public ScheduledNotice_getTime_17519976941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17351 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.ScheduledNotice"));
        Object term17352 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term17353 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17354 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17358 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17363 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term17373 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term17390 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term17391 = (long[]) newLongArray(1);
        Object[] term17393 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term17394 = (long[]) newLongArray(39);
        Object[] term17434 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term17435 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term17436 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term17437 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term17354, term17354.getClass(), "year", 2021);
        setShortField(term17354, term17354.getClass(), "month", (short) 1);
        setShortField(term17354, term17354.getClass(), "day", (short) 18);
        setField(term17353, term17353.getClass(), "date", term17354);
        setByteField(term17358, term17358.getClass(), "hour", (byte) 13);
        setByteField(term17358, term17358.getClass(), "minute", (byte) 38);
        setByteField(term17358, term17358.getClass(), "second", (byte) 26);
        setIntField(term17358, term17358.getClass(), "nano", 544608644);
        setField(term17353, term17353.getClass(), "time", term17358);
        setField(term17352, term17352.getClass(), "dateTime", term17353);
        setIntField(term17363, term17363.getClass(), "totalSeconds", -10800);
        setField(term17363, term17363.getClass(), "id", "-03:00");
        setField(term17352, term17352.getClass(), "offset", term17363);
        setField(term17373, term17373.getClass(), "id", "America/Recife");
        setLongElement(term17391, 0, -1767217224L);
        setField(term17390, term17390.getClass(), "standardTransitions", term17391);
        setElement(term17393, 1, term17363);
        setField(term17390, term17390.getClass(), "standardOffsets", term17393);
        setLongElement(term17394, 0, -1767217224L);
        setLongElement(term17394, 1, -1206957600L);
        setLongElement(term17394, 2, -1191362400L);
        setLongElement(term17394, 3, -1175374800L);
        setLongElement(term17394, 4, -1159826400L);
        setLongElement(term17394, 5, -633819600L);
        setLongElement(term17394, 6, -622069200L);
        setLongElement(term17394, 7, -602283600L);
        setLongElement(term17394, 8, -591832800L);
        setLongElement(term17394, 9, -570747600L);
        setLongElement(term17394, 10, -560210400L);
        setLongElement(term17394, 11, -539125200L);
        setLongElement(term17394, 12, -531352800L);
        setLongElement(term17394, 13, -191365200L);
        setLongElement(term17394, 14, -184197600L);
        setLongElement(term17394, 15, -155163600L);
        setLongElement(term17394, 16, -150069600L);
        setLongElement(term17394, 17, -128898000L);
        setLongElement(term17394, 18, -121125600L);
        setLongElement(term17394, 19, -99954000L);
        setLongElement(term17394, 20, -89589600L);
        setLongElement(term17394, 21, -68418000L);
        setLongElement(term17394, 22, -57967200L);
        setLongElement(term17394, 23, 499748400L);
        setLongElement(term17394, 24, 511236000L);
        setLongElement(term17394, 25, 530593200L);
        setLongElement(term17394, 26, 540266400L);
        setLongElement(term17394, 27, 562129200L);
        setLongElement(term17394, 28, 571197600L);
        setLongElement(term17394, 29, 592974000L);
        setLongElement(term17394, 30, 602042400L);
        setLongElement(term17394, 31, 624423600L);
        setLongElement(term17394, 32, 634701600L);
        setLongElement(term17394, 33, 938919600L);
        setLongElement(term17394, 34, 951616800L);
        setLongElement(term17394, 35, 970974000L);
        setLongElement(term17394, 36, 971575200L);
        setLongElement(term17394, 37, 1003028400L);
        setLongElement(term17394, 38, 1013911200L);
        setField(term17390, term17390.getClass(), "savingsInstantTransitions", term17394);
        setField(term17390, term17390.getClass(), "savingsLocalTransitions", term17434);
        setElement(term17435, 1, term17363);
        setElement(term17435, 3, term17363);
        setElement(term17435, 5, term17363);
        setElement(term17435, 7, term17363);
        setElement(term17435, 9, term17363);
        setElement(term17435, 11, term17363);
        setElement(term17435, 13, term17363);
        setElement(term17435, 15, term17363);
        setElement(term17435, 17, term17363);
        setElement(term17435, 19, term17363);
        setElement(term17435, 21, term17363);
        setElement(term17435, 23, term17363);
        setElement(term17435, 25, term17363);
        setElement(term17435, 27, term17363);
        setElement(term17435, 29, term17363);
        setElement(term17435, 31, term17363);
        setElement(term17435, 33, term17363);
        setElement(term17435, 35, term17363);
        setElement(term17435, 37, term17363);
        setElement(term17435, 39, term17363);
        setField(term17390, term17390.getClass(), "wallOffsets", term17435);
        setField(term17390, term17390.getClass(), "lastRules", term17436);
        setField(term17437, term17437.getClass(), "table", null);
        setField(term17437, term17437.getClass(), "nextTable", null);
        setLongField(term17437, term17437.getClass(), "baseCount", 0L);
        setIntField(term17437, term17437.getClass(), "sizeCtl", 0);
        setIntField(term17437, term17437.getClass(), "transferIndex", 0);
        setIntField(term17437, term17437.getClass(), "cellsBusy", 0);
        setField(term17437, term17437.getClass(), "counterCells", null);
        setField(term17437, term17437.getClass(), "keySet", null);
        setField(term17437, term17437.getClass(), "values", null);
        setField(term17437, term17437.getClass(), "entrySet", null);
        setField(term17437, term17437.getClass(), "keySet", null);
        setField(term17437, term17437.getClass(), "values", null);
        setField(term17390, term17390.getClass(), "lastRulesCache", term17437);
        setField(term17373, term17373.getClass(), "rules", term17390);
        setField(term17352, term17352.getClass(), "zone", term17373);
        setField(term17351, term17351.getClass(), "time", term17352);
        setField(term17351, term17351.getClass(), "scheduledFuture", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.ScheduledNotice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTime", argTypes, term17351, args);
    }

};


