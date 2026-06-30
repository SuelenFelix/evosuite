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

public class FreezeDateUtils_getZoneTimestampNow_14530032200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334;

    public FreezeDateUtils_getZoneTimestampNow_14530032200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term335 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term336 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term357 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term358 = (long[]) newLongArray(5);
        Object[] term364 = (Object[]) newArray("java.time.ZoneOffset", 6);
        long[] term365 = (long[]) newLongArray(5);
        Object[] term371 = (Object[]) newArray("java.time.LocalDateTime", 10);
        Object[] term372 = (Object[]) newArray("java.time.ZoneOffset", 6);
        Object[] term373 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term374 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term379 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term336, term336.getClass(), "id", "Africa/Addis_Ababa");
        setLongElement(term358, 0, -1946168836L);
        setLongElement(term358, 1, -1309746600L);
        setLongElement(term358, 2, -1261969200L);
        setLongElement(term358, 3, -1041388200L);
        setLongElement(term358, 4, -865305900L);
        setField(term357, term357.getClass(), "standardTransitions", term358);
        setField(term357, term357.getClass(), "standardOffsets", term364);
        setLongElement(term365, 0, -1946168836L);
        setLongElement(term365, 1, -1309746600L);
        setLongElement(term365, 2, -1261969200L);
        setLongElement(term365, 3, -1041388200L);
        setLongElement(term365, 4, -865305900L);
        setField(term357, term357.getClass(), "savingsInstantTransitions", term365);
        setField(term357, term357.getClass(), "savingsLocalTransitions", term371);
        setField(term357, term357.getClass(), "wallOffsets", term372);
        setField(term357, term357.getClass(), "lastRules", term373);
        setField(term374, term374.getClass(), "table", null);
        setField(term374, term374.getClass(), "nextTable", null);
        setLongField(term374, term374.getClass(), "baseCount", 0L);
        setIntField(term374, term374.getClass(), "sizeCtl", 0);
        setIntField(term374, term374.getClass(), "transferIndex", 0);
        setIntField(term374, term374.getClass(), "cellsBusy", 0);
        setField(term374, term374.getClass(), "counterCells", null);
        setField(term374, term374.getClass(), "keySet", null);
        setField(term374, term374.getClass(), "values", null);
        setField(term374, term374.getClass(), "entrySet", null);
        setField(term374, term374.getClass(), "keySet", null);
        setField(term374, term374.getClass(), "values", null);
        setField(term357, term357.getClass(), "lastRulesCache", term374);
        setField(term336, term336.getClass(), "rules", term357);
        setField(term335, term335.getClass(), "timeZone", term336);
        setByteField(term379, term379.getClass(), "hour", (byte) 12);
        setByteField(term379, term379.getClass(), "minute", (byte) 32);
        setByteField(term379, term379.getClass(), "second", (byte) 20);
        setIntField(term379, term379.getClass(), "nano", 132387463);
        setField(term335, term335.getClass(), "fixedTimeFreeze", term379);
        setIntField(term335, term335.getClass(), "dayToUnfreeze", 568599855);
        setField(term334, term334.getClass(), "freezeProperties", term335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoneTimestampNow", argTypes, term334, args);
    }

};


