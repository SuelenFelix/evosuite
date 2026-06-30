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

public class ScheduleFreezeProperties_getTimeZone_6127208705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253;

    public ScheduleFreezeProperties_getTimeZone_6127208705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        setField(term253, term253.getClass(), "timeZone", null);
        setField(term253, term253.getClass(), "fixedTimeFreeze", null);
        setIntField(term253, term253.getClass(), "dayToUnfreeze", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeZone", argTypes, term253, args);
    }

};


