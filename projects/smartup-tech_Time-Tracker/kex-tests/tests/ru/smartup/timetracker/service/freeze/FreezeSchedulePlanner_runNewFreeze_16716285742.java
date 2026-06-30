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

public class FreezeSchedulePlanner_runNewFreeze_16716285742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1836;

    public FreezeSchedulePlanner_runNewFreeze_16716285742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1836 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term1837 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term1838 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term1839 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1841 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term1842 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1836, term1836.getClass(), "crudFreezeService", null);
        setField(term1839, term1839.getClass(), "id", "");
        setField(term1841, term1841.getClass(), "standardTransitions", null);
        setField(term1841, term1841.getClass(), "standardOffsets", null);
        setField(term1841, term1841.getClass(), "savingsInstantTransitions", null);
        setField(term1841, term1841.getClass(), "savingsLocalTransitions", null);
        setField(term1841, term1841.getClass(), "wallOffsets", null);
        setField(term1841, term1841.getClass(), "lastRules", null);
        setField(term1841, term1841.getClass(), "lastRulesCache", null);
        setField(term1839, term1839.getClass(), "rules", term1841);
        setField(term1838, term1838.getClass(), "timeZone", term1839);
        setByteField(term1842, term1842.getClass(), "hour", (byte) 4);
        setByteField(term1842, term1842.getClass(), "minute", (byte) 46);
        setByteField(term1842, term1842.getClass(), "second", (byte) 12);
        setIntField(term1842, term1842.getClass(), "nano", 580494898);
        setField(term1838, term1838.getClass(), "fixedTimeFreeze", term1842);
        setIntField(term1838, term1838.getClass(), "dayToUnfreeze", -916584829);
        setField(term1837, term1837.getClass(), "freezeProperties", term1838);
        setField(term1836, term1836.getClass(), "freezeDateUtils", term1837);
        setField(term1836, term1836.getClass(), "freezeScheduler", null);
        setField(term1836, term1836.getClass(), "trackUnitService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "runNewFreeze", argTypes, term1836, args);
    }

};


