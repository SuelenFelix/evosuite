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

public class ScheduleFreezeProperties_getTimeZone_6127208701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public ScheduleFreezeProperties_getTimeZone_6127208701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term28 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term38 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28, term28.getClass(), "totalSeconds", -36000);
        setField(term28, term28.getClass(), "id", "-10:00");
        setField(term27, term27.getClass(), "timeZone", term28);
        setByteField(term38, term38.getClass(), "hour", (byte) 12);
        setByteField(term38, term38.getClass(), "minute", (byte) 32);
        setByteField(term38, term38.getClass(), "second", (byte) 20);
        setIntField(term38, term38.getClass(), "nano", 132387463);
        setField(term27, term27.getClass(), "fixedTimeFreeze", term38);
        setIntField(term27, term27.getClass(), "dayToUnfreeze", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeZone", argTypes, term27, args);
    }

};


