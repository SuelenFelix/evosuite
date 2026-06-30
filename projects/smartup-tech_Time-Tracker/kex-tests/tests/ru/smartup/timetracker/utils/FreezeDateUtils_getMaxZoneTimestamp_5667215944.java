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

public class FreezeDateUtils_getMaxZoneTimestamp_5667215944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1643;

    public FreezeDateUtils_getMaxZoneTimestamp_5667215944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1643 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term1644 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term1645 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1658 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1659 = (long[]) newLongArray(5);
        Object[] term1665 = (Object[]) newArray("java.time.ZoneOffset", 6);
        long[] term1666 = (long[]) newLongArray(7);
        Object[] term1674 = (Object[]) newArray("java.time.LocalDateTime", 14);
        Object[] term1675 = (Object[]) newArray("java.time.ZoneOffset", 8);
        Object[] term1676 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1677 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term1682 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1645, term1645.getClass(), "id", "Asia/Dhaka");
        setLongElement(term1659, 0, -2524543300L);
        setLongElement(term1659, 1, -891582800L);
        setLongElement(term1659, 2, -872058600L);
        setLongElement(term1659, 3, -862637400L);
        setLongElement(term1659, 4, -576138600L);
        setField(term1658, term1658.getClass(), "standardTransitions", term1659);
        setField(term1658, term1658.getClass(), "standardOffsets", term1665);
        setLongElement(term1666, 0, -2524543300L);
        setLongElement(term1666, 1, -891582800L);
        setLongElement(term1666, 2, -872058600L);
        setLongElement(term1666, 3, -862637400L);
        setLongElement(term1666, 4, -576138600L);
        setLongElement(term1666, 5, 1245430800L);
        setLongElement(term1666, 6, 1262278800L);
        setField(term1658, term1658.getClass(), "savingsInstantTransitions", term1666);
        setField(term1658, term1658.getClass(), "savingsLocalTransitions", term1674);
        setField(term1658, term1658.getClass(), "wallOffsets", term1675);
        setField(term1658, term1658.getClass(), "lastRules", term1676);
        setField(term1677, term1677.getClass(), "table", null);
        setField(term1677, term1677.getClass(), "nextTable", null);
        setLongField(term1677, term1677.getClass(), "baseCount", 0L);
        setIntField(term1677, term1677.getClass(), "sizeCtl", 0);
        setIntField(term1677, term1677.getClass(), "transferIndex", 0);
        setIntField(term1677, term1677.getClass(), "cellsBusy", 0);
        setField(term1677, term1677.getClass(), "counterCells", null);
        setField(term1677, term1677.getClass(), "keySet", null);
        setField(term1677, term1677.getClass(), "values", null);
        setField(term1677, term1677.getClass(), "entrySet", null);
        setField(term1677, term1677.getClass(), "keySet", null);
        setField(term1677, term1677.getClass(), "values", null);
        setField(term1658, term1658.getClass(), "lastRulesCache", term1677);
        setField(term1645, term1645.getClass(), "rules", term1658);
        setField(term1644, term1644.getClass(), "timeZone", term1645);
        setByteField(term1682, term1682.getClass(), "hour", (byte) 16);
        setByteField(term1682, term1682.getClass(), "minute", (byte) 37);
        setByteField(term1682, term1682.getClass(), "second", (byte) 16);
        setIntField(term1682, term1682.getClass(), "nano", 982844201);
        setField(term1644, term1644.getClass(), "fixedTimeFreeze", term1682);
        setIntField(term1644, term1644.getClass(), "dayToUnfreeze", -1339778481);
        setField(term1643, term1643.getClass(), "freezeProperties", term1644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxZoneTimestamp", argTypes, term1643, args);
    }

};


