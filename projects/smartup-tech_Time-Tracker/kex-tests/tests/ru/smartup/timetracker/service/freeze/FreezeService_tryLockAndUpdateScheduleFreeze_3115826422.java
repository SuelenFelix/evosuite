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
import java.util.LinkedHashMap;

public class FreezeService_tryLockAndUpdateScheduleFreeze_3115826422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term620;
     Object term643;

    public FreezeService_tryLockAndUpdateScheduleFreeze_3115826422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term620 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeService"));
        Object term621 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term622 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term623 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term624 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term626 = newInstance(Class.forName("java.time.LocalTime"));
        Object term632 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term633 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term634 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term636 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term637 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term621, term621.getClass(), "crudFreezeService", null);
        setIntField(term624, term624.getClass(), "totalSeconds", -25200);
        setField(term624, term624.getClass(), "id", null);
        setField(term623, term623.getClass(), "timeZone", term624);
        setByteField(term626, term626.getClass(), "hour", (byte) 16);
        setByteField(term626, term626.getClass(), "minute", (byte) 37);
        setByteField(term626, term626.getClass(), "second", (byte) 16);
        setIntField(term626, term626.getClass(), "nano", 982844201);
        setField(term623, term623.getClass(), "fixedTimeFreeze", term626);
        setIntField(term623, term623.getClass(), "dayToUnfreeze", -522618178);
        setField(term622, term622.getClass(), "freezeProperties", term623);
        setField(term621, term621.getClass(), "freezeDateUtils", term622);
        setField(term621, term621.getClass(), "freezeScheduler", null);
        setField(term621, term621.getClass(), "trackUnitService", null);
        setField(term620, term620.getClass(), "freezeSchedulePlanner", term621);
        setField(term620, term620.getClass(), "crudFreezeService", null);
        setField(term620, term620.getClass(), "freezeValidator", null);
        setField(term634, term634.getClass(), "id", "");
        setField(term636, term636.getClass(), "standardTransitions", null);
        setField(term636, term636.getClass(), "standardOffsets", null);
        setField(term636, term636.getClass(), "savingsInstantTransitions", null);
        setField(term636, term636.getClass(), "savingsLocalTransitions", null);
        setField(term636, term636.getClass(), "wallOffsets", null);
        setField(term636, term636.getClass(), "lastRules", null);
        setField(term636, term636.getClass(), "lastRulesCache", null);
        setField(term634, term634.getClass(), "rules", term636);
        setField(term633, term633.getClass(), "timeZone", term634);
        setByteField(term637, term637.getClass(), "hour", (byte) 17);
        setByteField(term637, term637.getClass(), "minute", (byte) 25);
        setByteField(term637, term637.getClass(), "second", (byte) 50);
        setIntField(term637, term637.getClass(), "nano", 456917183);
        setField(term633, term633.getClass(), "fixedTimeFreeze", term637);
        setIntField(term633, term633.getClass(), "dayToUnfreeze", 1134449235);
        setField(term632, term632.getClass(), "freezeProperties", term633);
        setField(term620, term620.getClass(), "freezeDateUtils", term632);
        setField(term620, term620.getClass(), "lockManager", null);
        term643 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term643;
        callMethod(klass, "tryLockAndUpdateScheduleFreeze", argTypes, term620, args);
    }

};


