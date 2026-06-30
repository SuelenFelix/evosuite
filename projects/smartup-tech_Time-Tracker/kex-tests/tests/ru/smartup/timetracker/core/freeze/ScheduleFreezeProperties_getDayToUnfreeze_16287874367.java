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

public class ScheduleFreezeProperties_getDayToUnfreeze_16287874367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257;

    public ScheduleFreezeProperties_getDayToUnfreeze_16287874367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        setField(term257, term257.getClass(), "timeZone", null);
        setField(term257, term257.getClass(), "fixedTimeFreeze", null);
        setIntField(term257, term257.getClass(), "dayToUnfreeze", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDayToUnfreeze", argTypes, term257, args);
    }

};


