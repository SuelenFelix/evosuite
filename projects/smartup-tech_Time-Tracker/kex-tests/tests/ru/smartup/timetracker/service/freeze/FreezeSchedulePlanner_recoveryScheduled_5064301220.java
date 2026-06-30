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

public class FreezeSchedulePlanner_recoveryScheduled_5064301220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term887;

    public FreezeSchedulePlanner_recoveryScheduled_5064301220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term887 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term888 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term889 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term890 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term892 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term893 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term887, term887.getClass(), "crudFreezeService", null);
        setField(term890, term890.getClass(), "id", "");
        setField(term892, term892.getClass(), "standardTransitions", null);
        setField(term892, term892.getClass(), "standardOffsets", null);
        setField(term892, term892.getClass(), "savingsInstantTransitions", null);
        setField(term892, term892.getClass(), "savingsLocalTransitions", null);
        setField(term892, term892.getClass(), "wallOffsets", null);
        setField(term892, term892.getClass(), "lastRules", null);
        setField(term892, term892.getClass(), "lastRulesCache", null);
        setField(term890, term890.getClass(), "rules", term892);
        setField(term889, term889.getClass(), "timeZone", term890);
        setByteField(term893, term893.getClass(), "hour", (byte) 3);
        setByteField(term893, term893.getClass(), "minute", (byte) 40);
        setByteField(term893, term893.getClass(), "second", (byte) 46);
        setIntField(term893, term893.getClass(), "nano", 759135300);
        setField(term889, term889.getClass(), "fixedTimeFreeze", term893);
        setIntField(term889, term889.getClass(), "dayToUnfreeze", -165587447);
        setField(term888, term888.getClass(), "freezeProperties", term889);
        setField(term887, term887.getClass(), "freezeDateUtils", term888);
        setField(term887, term887.getClass(), "freezeScheduler", null);
        setField(term887, term887.getClass(), "trackUnitService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "recoveryScheduled", argTypes, term887, args);
    }

};


