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

public class FreezeService_updateScheduleFreeze_4281941659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1066;

    public FreezeService_updateScheduleFreeze_4281941659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1066 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeService"));
        setField(term1066, term1066.getClass(), "freezeSchedulePlanner", null);
        setField(term1066, term1066.getClass(), "crudFreezeService", null);
        setField(term1066, term1066.getClass(), "freezeValidator", null);
        setField(term1066, term1066.getClass(), "freezeDateUtils", null);
        setField(term1066, term1066.getClass(), "lockManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "updateScheduleFreeze", argTypes, term1066, args);
    }

};


