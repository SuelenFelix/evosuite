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
     Object term4783;

    public FreezeSchedulePlanner_cancel_6143774846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4783 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term4784 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term4785 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term4786 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term4788 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term4789 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4783, term4783.getClass(), "crudFreezeService", null);
        setField(term4786, term4786.getClass(), "id", "");
        setField(term4788, term4788.getClass(), "standardTransitions", null);
        setField(term4788, term4788.getClass(), "standardOffsets", null);
        setField(term4788, term4788.getClass(), "savingsInstantTransitions", null);
        setField(term4788, term4788.getClass(), "savingsLocalTransitions", null);
        setField(term4788, term4788.getClass(), "wallOffsets", null);
        setField(term4788, term4788.getClass(), "lastRules", null);
        setField(term4788, term4788.getClass(), "lastRulesCache", null);
        setField(term4786, term4786.getClass(), "rules", term4788);
        setField(term4785, term4785.getClass(), "timeZone", term4786);
        setByteField(term4789, term4789.getClass(), "hour", (byte) 13);
        setByteField(term4789, term4789.getClass(), "minute", (byte) 2);
        setByteField(term4789, term4789.getClass(), "second", (byte) 21);
        setIntField(term4789, term4789.getClass(), "nano", 2264678);
        setField(term4785, term4785.getClass(), "fixedTimeFreeze", term4789);
        setIntField(term4785, term4785.getClass(), "dayToUnfreeze", -542712742);
        setField(term4784, term4784.getClass(), "freezeProperties", term4785);
        setField(term4783, term4783.getClass(), "freezeDateUtils", term4784);
        setField(term4783, term4783.getClass(), "freezeScheduler", null);
        setField(term4783, term4783.getClass(), "trackUnitService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "cancel", argTypes, term4783, args);
    }

};


