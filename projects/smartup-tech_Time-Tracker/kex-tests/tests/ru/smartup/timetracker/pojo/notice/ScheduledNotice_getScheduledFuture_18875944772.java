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

public class ScheduledNotice_getScheduledFuture_18875944772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17502;

    public ScheduledNotice_getScheduledFuture_18875944772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17502 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.ScheduledNotice"));
        Object term17503 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term17504 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17505 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17509 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17514 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term17524 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term17541 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term17542 = (long[]) newLongArray(1);
        Object[] term17544 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term17545 = (long[]) newLongArray(39);
        Object[] term17585 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term17586 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term17587 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term17588 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term17505, term17505.getClass(), "year", 2015);
        setShortField(term17505, term17505.getClass(), "month", (short) 9);
        setShortField(term17505, term17505.getClass(), "day", (short) 19);
        setField(term17504, term17504.getClass(), "date", term17505);
        setByteField(term17509, term17509.getClass(), "hour", (byte) 9);
        setByteField(term17509, term17509.getClass(), "minute", (byte) 4);
        setByteField(term17509, term17509.getClass(), "second", (byte) 10);
        setIntField(term17509, term17509.getClass(), "nano", 401765865);
        setField(term17504, term17504.getClass(), "time", term17509);
        setField(term17503, term17503.getClass(), "dateTime", term17504);
        setIntField(term17514, term17514.getClass(), "totalSeconds", -10800);
        setField(term17514, term17514.getClass(), "id", "-03:00");
        setField(term17503, term17503.getClass(), "offset", term17514);
        setField(term17524, term17524.getClass(), "id", "America/Recife");
        setLongElement(term17542, 0, -1767217224L);
        setField(term17541, term17541.getClass(), "standardTransitions", term17542);
        setElement(term17544, 1, term17514);
        setField(term17541, term17541.getClass(), "standardOffsets", term17544);
        setLongElement(term17545, 0, -1767217224L);
        setLongElement(term17545, 1, -1206957600L);
        setLongElement(term17545, 2, -1191362400L);
        setLongElement(term17545, 3, -1175374800L);
        setLongElement(term17545, 4, -1159826400L);
        setLongElement(term17545, 5, -633819600L);
        setLongElement(term17545, 6, -622069200L);
        setLongElement(term17545, 7, -602283600L);
        setLongElement(term17545, 8, -591832800L);
        setLongElement(term17545, 9, -570747600L);
        setLongElement(term17545, 10, -560210400L);
        setLongElement(term17545, 11, -539125200L);
        setLongElement(term17545, 12, -531352800L);
        setLongElement(term17545, 13, -191365200L);
        setLongElement(term17545, 14, -184197600L);
        setLongElement(term17545, 15, -155163600L);
        setLongElement(term17545, 16, -150069600L);
        setLongElement(term17545, 17, -128898000L);
        setLongElement(term17545, 18, -121125600L);
        setLongElement(term17545, 19, -99954000L);
        setLongElement(term17545, 20, -89589600L);
        setLongElement(term17545, 21, -68418000L);
        setLongElement(term17545, 22, -57967200L);
        setLongElement(term17545, 23, 499748400L);
        setLongElement(term17545, 24, 511236000L);
        setLongElement(term17545, 25, 530593200L);
        setLongElement(term17545, 26, 540266400L);
        setLongElement(term17545, 27, 562129200L);
        setLongElement(term17545, 28, 571197600L);
        setLongElement(term17545, 29, 592974000L);
        setLongElement(term17545, 30, 602042400L);
        setLongElement(term17545, 31, 624423600L);
        setLongElement(term17545, 32, 634701600L);
        setLongElement(term17545, 33, 938919600L);
        setLongElement(term17545, 34, 951616800L);
        setLongElement(term17545, 35, 970974000L);
        setLongElement(term17545, 36, 971575200L);
        setLongElement(term17545, 37, 1003028400L);
        setLongElement(term17545, 38, 1013911200L);
        setField(term17541, term17541.getClass(), "savingsInstantTransitions", term17545);
        setField(term17541, term17541.getClass(), "savingsLocalTransitions", term17585);
        setElement(term17586, 1, term17514);
        setElement(term17586, 3, term17514);
        setElement(term17586, 5, term17514);
        setElement(term17586, 7, term17514);
        setElement(term17586, 9, term17514);
        setElement(term17586, 11, term17514);
        setElement(term17586, 13, term17514);
        setElement(term17586, 15, term17514);
        setElement(term17586, 17, term17514);
        setElement(term17586, 19, term17514);
        setElement(term17586, 21, term17514);
        setElement(term17586, 23, term17514);
        setElement(term17586, 25, term17514);
        setElement(term17586, 27, term17514);
        setElement(term17586, 29, term17514);
        setElement(term17586, 31, term17514);
        setElement(term17586, 33, term17514);
        setElement(term17586, 35, term17514);
        setElement(term17586, 37, term17514);
        setElement(term17586, 39, term17514);
        setField(term17541, term17541.getClass(), "wallOffsets", term17586);
        setField(term17541, term17541.getClass(), "lastRules", term17587);
        setField(term17588, term17588.getClass(), "table", null);
        setField(term17588, term17588.getClass(), "nextTable", null);
        setLongField(term17588, term17588.getClass(), "baseCount", 0L);
        setIntField(term17588, term17588.getClass(), "sizeCtl", 0);
        setIntField(term17588, term17588.getClass(), "transferIndex", 0);
        setIntField(term17588, term17588.getClass(), "cellsBusy", 0);
        setField(term17588, term17588.getClass(), "counterCells", null);
        setField(term17588, term17588.getClass(), "keySet", null);
        setField(term17588, term17588.getClass(), "values", null);
        setField(term17588, term17588.getClass(), "entrySet", null);
        setField(term17588, term17588.getClass(), "keySet", null);
        setField(term17588, term17588.getClass(), "values", null);
        setField(term17541, term17541.getClass(), "lastRulesCache", term17588);
        setField(term17524, term17524.getClass(), "rules", term17541);
        setField(term17503, term17503.getClass(), "zone", term17524);
        setField(term17502, term17502.getClass(), "time", term17503);
        setField(term17502, term17502.getClass(), "scheduledFuture", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.ScheduledNotice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScheduledFuture", argTypes, term17502, args);
    }

};


