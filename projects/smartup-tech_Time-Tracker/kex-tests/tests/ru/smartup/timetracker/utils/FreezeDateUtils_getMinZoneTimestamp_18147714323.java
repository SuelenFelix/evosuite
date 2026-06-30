package ru.smartup.timetracker.utils;

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
import static ru.smartup.timetracker.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FreezeDateUtils_getMinZoneTimestamp_18147714323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1576;

    public FreezeDateUtils_getMinZoneTimestamp_18147714323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1576 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term1577 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term1578 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1591 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1592 = (long[]) newLongArray(5);
        Object[] term1598 = (Object[]) newArray("java.time.ZoneOffset", 6);
        long[] term1599 = (long[]) newLongArray(7);
        Object[] term1607 = (Object[]) newArray("java.time.LocalDateTime", 14);
        Object[] term1608 = (Object[]) newArray("java.time.ZoneOffset", 8);
        Object[] term1609 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1610 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term1615 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1578, term1578.getClass(), "id", "Asia/Dhaka");
        setLongElement(term1592, 0, -2524543300L);
        setLongElement(term1592, 1, -891582800L);
        setLongElement(term1592, 2, -872058600L);
        setLongElement(term1592, 3, -862637400L);
        setLongElement(term1592, 4, -576138600L);
        setField(term1591, term1591.getClass(), "standardTransitions", term1592);
        setField(term1591, term1591.getClass(), "standardOffsets", term1598);
        setLongElement(term1599, 0, -2524543300L);
        setLongElement(term1599, 1, -891582800L);
        setLongElement(term1599, 2, -872058600L);
        setLongElement(term1599, 3, -862637400L);
        setLongElement(term1599, 4, -576138600L);
        setLongElement(term1599, 5, 1245430800L);
        setLongElement(term1599, 6, 1262278800L);
        setField(term1591, term1591.getClass(), "savingsInstantTransitions", term1599);
        setField(term1591, term1591.getClass(), "savingsLocalTransitions", term1607);
        setField(term1591, term1591.getClass(), "wallOffsets", term1608);
        setField(term1591, term1591.getClass(), "lastRules", term1609);
        setField(term1610, term1610.getClass(), "table", null);
        setField(term1610, term1610.getClass(), "nextTable", null);
        setLongField(term1610, term1610.getClass(), "baseCount", 0L);
        setIntField(term1610, term1610.getClass(), "sizeCtl", 0);
        setIntField(term1610, term1610.getClass(), "transferIndex", 0);
        setIntField(term1610, term1610.getClass(), "cellsBusy", 0);
        setField(term1610, term1610.getClass(), "counterCells", null);
        setField(term1610, term1610.getClass(), "keySet", null);
        setField(term1610, term1610.getClass(), "values", null);
        setField(term1610, term1610.getClass(), "entrySet", null);
        setField(term1610, term1610.getClass(), "keySet", null);
        setField(term1610, term1610.getClass(), "values", null);
        setField(term1591, term1591.getClass(), "lastRulesCache", term1610);
        setField(term1578, term1578.getClass(), "rules", term1591);
        setField(term1577, term1577.getClass(), "timeZone", term1578);
        setByteField(term1615, term1615.getClass(), "hour", (byte) 21);
        setByteField(term1615, term1615.getClass(), "minute", (byte) 41);
        setByteField(term1615, term1615.getClass(), "second", (byte) 8);
        setIntField(term1615, term1615.getClass(), "nano", 765502068);
        setField(term1577, term1577.getClass(), "fixedTimeFreeze", term1615);
        setIntField(term1577, term1577.getClass(), "dayToUnfreeze", 1227103734);
        setField(term1576, term1576.getClass(), "freezeProperties", term1577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinZoneTimestamp", argTypes, term1576, args);
    }

};


