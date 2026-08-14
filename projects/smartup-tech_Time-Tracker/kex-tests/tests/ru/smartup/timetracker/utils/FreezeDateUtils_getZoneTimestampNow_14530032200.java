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
        Object term358 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term359 = (long[]) newLongArray(1);
        Object[] term361 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term362 = (long[]) newLongArray(3);
        Object[] term366 = (Object[]) newArray("java.time.LocalDateTime", 6);
        Object[] term367 = (Object[]) newArray("java.time.ZoneOffset", 4);
        Object[] term368 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term369 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term374 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term336, term336.getClass(), "id", "America/Puerto_Rico");
        setLongElement(term359, 0, -2233035335L);
        setField(term358, term358.getClass(), "standardTransitions", term359);
        setField(term358, term358.getClass(), "standardOffsets", term361);
        setLongElement(term362, 0, -2233035335L);
        setLongElement(term362, 1, -873057600L);
        setLongElement(term362, 2, -765399600L);
        setField(term358, term358.getClass(), "savingsInstantTransitions", term362);
        setField(term358, term358.getClass(), "savingsLocalTransitions", term366);
        setField(term358, term358.getClass(), "wallOffsets", term367);
        setField(term358, term358.getClass(), "lastRules", term368);
        setField(term369, term369.getClass(), "table", null);
        setField(term369, term369.getClass(), "nextTable", null);
        setLongField(term369, term369.getClass(), "baseCount", 0L);
        setIntField(term369, term369.getClass(), "sizeCtl", 0);
        setIntField(term369, term369.getClass(), "transferIndex", 0);
        setIntField(term369, term369.getClass(), "cellsBusy", 0);
        setField(term369, term369.getClass(), "counterCells", null);
        setField(term369, term369.getClass(), "keySet", null);
        setField(term369, term369.getClass(), "values", null);
        setField(term369, term369.getClass(), "entrySet", null);
        setField(term369, term369.getClass(), "keySet", null);
        setField(term369, term369.getClass(), "values", null);
        setField(term358, term358.getClass(), "lastRulesCache", term369);
        setField(term336, term336.getClass(), "rules", term358);
        setField(term335, term335.getClass(), "timeZone", term336);
        setByteField(term374, term374.getClass(), "hour", (byte) 12);
        setByteField(term374, term374.getClass(), "minute", (byte) 32);
        setByteField(term374, term374.getClass(), "second", (byte) 20);
        setIntField(term374, term374.getClass(), "nano", 132387463);
        setField(term335, term335.getClass(), "fixedTimeFreeze", term374);
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


