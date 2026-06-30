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

public class FreezeDateUtils_getZoneUnfreezingTimestamp_6768745752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1505;

    public FreezeDateUtils_getZoneUnfreezingTimestamp_6768745752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1505 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term1506 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term1507 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1522 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1523 = (long[]) newLongArray(2);
        Object[] term1526 = (Object[]) newArray("java.time.ZoneOffset", 3);
        long[] term1527 = (long[]) newLongArray(10);
        Object[] term1538 = (Object[]) newArray("java.time.LocalDateTime", 20);
        Object[] term1539 = (Object[]) newArray("java.time.ZoneOffset", 11);
        Object[] term1540 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1541 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term1546 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1507, term1507.getClass(), "id", "Asia/Karachi");
        setLongElement(term1523, 0, -1988166492L);
        setLongElement(term1523, 1, -576135000L);
        setField(term1522, term1522.getClass(), "standardTransitions", term1523);
        setField(term1522, term1522.getClass(), "standardOffsets", term1526);
        setLongElement(term1527, 0, -1988166492L);
        setLongElement(term1527, 1, -862637400L);
        setLongElement(term1527, 2, -764145000L);
        setLongElement(term1527, 3, -576135000L);
        setLongElement(term1527, 4, 1018119600L);
        setLongElement(term1527, 5, 1033840800L);
        setLongElement(term1527, 6, 1212260400L);
        setLongElement(term1527, 7, 1225476000L);
        setLongElement(term1527, 8, 1239735600L);
        setLongElement(term1527, 9, 1257012000L);
        setField(term1522, term1522.getClass(), "savingsInstantTransitions", term1527);
        setField(term1522, term1522.getClass(), "savingsLocalTransitions", term1538);
        setField(term1522, term1522.getClass(), "wallOffsets", term1539);
        setField(term1522, term1522.getClass(), "lastRules", term1540);
        setField(term1541, term1541.getClass(), "table", null);
        setField(term1541, term1541.getClass(), "nextTable", null);
        setLongField(term1541, term1541.getClass(), "baseCount", 0L);
        setIntField(term1541, term1541.getClass(), "sizeCtl", 0);
        setIntField(term1541, term1541.getClass(), "transferIndex", 0);
        setIntField(term1541, term1541.getClass(), "cellsBusy", 0);
        setField(term1541, term1541.getClass(), "counterCells", null);
        setField(term1541, term1541.getClass(), "keySet", null);
        setField(term1541, term1541.getClass(), "values", null);
        setField(term1541, term1541.getClass(), "entrySet", null);
        setField(term1541, term1541.getClass(), "keySet", null);
        setField(term1541, term1541.getClass(), "values", null);
        setField(term1522, term1522.getClass(), "lastRulesCache", term1541);
        setField(term1507, term1507.getClass(), "rules", term1522);
        setField(term1506, term1506.getClass(), "timeZone", term1507);
        setByteField(term1546, term1546.getClass(), "hour", (byte) 11);
        setByteField(term1546, term1546.getClass(), "minute", (byte) 50);
        setByteField(term1546, term1546.getClass(), "second", (byte) 22);
        setIntField(term1546, term1546.getClass(), "nano", 607649559);
        setField(term1506, term1506.getClass(), "fixedTimeFreeze", term1546);
        setIntField(term1506, term1506.getClass(), "dayToUnfreeze", -2038273078);
        setField(term1505, term1505.getClass(), "freezeProperties", term1506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoneUnfreezingTimestamp", argTypes, term1505, args);
    }

};


