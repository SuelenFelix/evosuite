package ru.smartup.timetracker.service.freeze;

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
import static ru.smartup.timetracker.service.freeze.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FreezeSchedulePlanner_init_14680321489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6646;

    public FreezeSchedulePlanner_init_14680321489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6646 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term6647 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term6648 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term6663 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term6664 = (long[]) newLongArray(3);
        Object[] term6668 = (Object[]) newArray("java.time.ZoneOffset", 4);
        long[] term6669 = (long[]) newLongArray(7);
        Object[] term6677 = (Object[]) newArray("java.time.LocalDateTime", 14);
        Object[] term6678 = (Object[]) newArray("java.time.ZoneOffset", 8);
        Object[] term6679 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term6680 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term6685 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6648, term6648.getClass(), "id", "Asia/Kolkata");
        setLongElement(term6664, 0, -3645237208L);
        setLongElement(term6664, 1, -3155694800L);
        setLongElement(term6664, 2, -2019705670L);
        setField(term6663, term6663.getClass(), "standardTransitions", term6664);
        setField(term6663, term6663.getClass(), "standardOffsets", term6668);
        setLongElement(term6669, 0, -3645237208L);
        setLongElement(term6669, 1, -3155694800L);
        setLongElement(term6669, 2, -2019705670L);
        setLongElement(term6669, 3, -891581400L);
        setLongElement(term6669, 4, -872058600L);
        setLongElement(term6669, 5, -862637400L);
        setLongElement(term6669, 6, -764145000L);
        setField(term6663, term6663.getClass(), "savingsInstantTransitions", term6669);
        setField(term6663, term6663.getClass(), "savingsLocalTransitions", term6677);
        setField(term6663, term6663.getClass(), "wallOffsets", term6678);
        setField(term6663, term6663.getClass(), "lastRules", term6679);
        setField(term6680, term6680.getClass(), "table", null);
        setField(term6680, term6680.getClass(), "nextTable", null);
        setLongField(term6680, term6680.getClass(), "baseCount", 0L);
        setIntField(term6680, term6680.getClass(), "sizeCtl", 0);
        setIntField(term6680, term6680.getClass(), "transferIndex", 0);
        setIntField(term6680, term6680.getClass(), "cellsBusy", 0);
        setField(term6680, term6680.getClass(), "counterCells", null);
        setField(term6680, term6680.getClass(), "keySet", null);
        setField(term6680, term6680.getClass(), "values", null);
        setField(term6680, term6680.getClass(), "entrySet", null);
        setField(term6680, term6680.getClass(), "keySet", null);
        setField(term6680, term6680.getClass(), "values", null);
        setField(term6663, term6663.getClass(), "lastRulesCache", term6680);
        setField(term6648, term6648.getClass(), "rules", term6663);
        setField(term6647, term6647.getClass(), "timeZone", term6648);
        setByteField(term6685, term6685.getClass(), "hour", (byte) 3);
        setByteField(term6685, term6685.getClass(), "minute", (byte) 14);
        setByteField(term6685, term6685.getClass(), "second", (byte) 8);
        setIntField(term6685, term6685.getClass(), "nano", 530944947);
        setField(term6647, term6647.getClass(), "fixedTimeFreeze", term6685);
        setIntField(term6647, term6647.getClass(), "dayToUnfreeze", 1460722225);
        setField(term6646, term6646.getClass(), "freezeProperties", term6647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("ru.smartup.timetracker.service.freeze.CRUDFreezeService");
        argTypes[1] = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        argTypes[2] = Class.forName("ru.smartup.timetracker.service.freeze.FreezeScheduler");
        argTypes[3] = Class.forName("ru.smartup.timetracker.service.TrackUnitService");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term6646;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


