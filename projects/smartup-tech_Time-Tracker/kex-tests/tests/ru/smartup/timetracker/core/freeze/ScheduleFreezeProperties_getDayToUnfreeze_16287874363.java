package ru.smartup.timetracker.core.freeze;

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
import static ru.smartup.timetracker.core.freeze.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ScheduleFreezeProperties_getDayToUnfreeze_16287874363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226;

    public ScheduleFreezeProperties_getDayToUnfreeze_16287874363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term227 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term237 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term227, term227.getClass(), "totalSeconds", -25200);
        setField(term227, term227.getClass(), "id", "-07:00");
        setField(term226, term226.getClass(), "timeZone", term227);
        setByteField(term237, term237.getClass(), "hour", (byte) 11);
        setByteField(term237, term237.getClass(), "minute", (byte) 50);
        setByteField(term237, term237.getClass(), "second", (byte) 22);
        setIntField(term237, term237.getClass(), "nano", 607649559);
        setField(term226, term226.getClass(), "fixedTimeFreeze", term237);
        setIntField(term226, term226.getClass(), "dayToUnfreeze", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDayToUnfreeze", argTypes, term226, args);
    }

};


