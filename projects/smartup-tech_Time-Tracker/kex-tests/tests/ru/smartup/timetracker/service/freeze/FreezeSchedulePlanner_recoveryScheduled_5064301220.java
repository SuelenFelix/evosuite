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
     Object term1068;

    public FreezeSchedulePlanner_recoveryScheduled_5064301220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1068 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term1069 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term1070 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term1071 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1073 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term1074 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1068, term1068.getClass(), "crudFreezeService", null);
        setField(term1071, term1071.getClass(), "id", "");
        setField(term1073, term1073.getClass(), "standardTransitions", null);
        setField(term1073, term1073.getClass(), "standardOffsets", null);
        setField(term1073, term1073.getClass(), "savingsInstantTransitions", null);
        setField(term1073, term1073.getClass(), "savingsLocalTransitions", null);
        setField(term1073, term1073.getClass(), "wallOffsets", null);
        setField(term1073, term1073.getClass(), "lastRules", null);
        setField(term1073, term1073.getClass(), "lastRulesCache", null);
        setField(term1071, term1071.getClass(), "rules", term1073);
        setField(term1070, term1070.getClass(), "timeZone", term1071);
        setByteField(term1074, term1074.getClass(), "hour", (byte) 3);
        setByteField(term1074, term1074.getClass(), "minute", (byte) 40);
        setByteField(term1074, term1074.getClass(), "second", (byte) 46);
        setIntField(term1074, term1074.getClass(), "nano", 759135300);
        setField(term1070, term1070.getClass(), "fixedTimeFreeze", term1074);
        setIntField(term1070, term1070.getClass(), "dayToUnfreeze", -165587447);
        setField(term1069, term1069.getClass(), "freezeProperties", term1070);
        setField(term1068, term1068.getClass(), "freezeDateUtils", term1069);
        setField(term1068, term1068.getClass(), "freezeScheduler", null);
        setField(term1068, term1068.getClass(), "trackUnitService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "recoveryScheduled", argTypes, term1068, args);
    }

};


