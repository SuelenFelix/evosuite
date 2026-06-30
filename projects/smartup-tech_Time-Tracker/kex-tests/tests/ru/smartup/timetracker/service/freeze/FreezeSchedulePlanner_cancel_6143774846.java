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

public class FreezeSchedulePlanner_cancel_6143774846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4602;

    public FreezeSchedulePlanner_cancel_6143774846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4602 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term4603 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term4604 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term4605 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term4607 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term4608 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4602, term4602.getClass(), "crudFreezeService", null);
        setField(term4605, term4605.getClass(), "id", "");
        setField(term4607, term4607.getClass(), "standardTransitions", null);
        setField(term4607, term4607.getClass(), "standardOffsets", null);
        setField(term4607, term4607.getClass(), "savingsInstantTransitions", null);
        setField(term4607, term4607.getClass(), "savingsLocalTransitions", null);
        setField(term4607, term4607.getClass(), "wallOffsets", null);
        setField(term4607, term4607.getClass(), "lastRules", null);
        setField(term4607, term4607.getClass(), "lastRulesCache", null);
        setField(term4605, term4605.getClass(), "rules", term4607);
        setField(term4604, term4604.getClass(), "timeZone", term4605);
        setByteField(term4608, term4608.getClass(), "hour", (byte) 13);
        setByteField(term4608, term4608.getClass(), "minute", (byte) 2);
        setByteField(term4608, term4608.getClass(), "second", (byte) 21);
        setIntField(term4608, term4608.getClass(), "nano", 2264678);
        setField(term4604, term4604.getClass(), "fixedTimeFreeze", term4608);
        setIntField(term4604, term4604.getClass(), "dayToUnfreeze", -542712742);
        setField(term4603, term4603.getClass(), "freezeProperties", term4604);
        setField(term4602, term4602.getClass(), "freezeDateUtils", term4603);
        setField(term4602, term4602.getClass(), "freezeScheduler", null);
        setField(term4602, term4602.getClass(), "trackUnitService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "cancel", argTypes, term4602, args);
    }

};


