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
import java.lang.Integer;

public class FreezeService_compareFreezeDatesWithActualAndMapByWaitingAndDeleting_5393926857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1062;
     Object term1063;

    public FreezeService_compareFreezeDatesWithActualAndMapByWaitingAndDeleting_5393926857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1062 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeService"));
        setField(term1062, term1062.getClass(), "freezeSchedulePlanner", null);
        setField(term1062, term1062.getClass(), "crudFreezeService", null);
        setField(term1062, term1062.getClass(), "freezeValidator", null);
        setField(term1062, term1062.getClass(), "freezeDateUtils", null);
        setField(term1062, term1062.getClass(), "lockManager", null);
        term1063 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeService");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1063;
        callMethod(klass, "compareFreezeDatesWithActualAndMapByWaitingAndDeleting", argTypes, term1062, args);
    }

};


