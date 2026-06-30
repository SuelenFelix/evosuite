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

public class FreezeService_unfreezeLastRecord_26679818110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886;

    public FreezeService_unfreezeLastRecord_26679818110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term886 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeService"));
        setField(term886, term886.getClass(), "freezeSchedulePlanner", null);
        setField(term886, term886.getClass(), "crudFreezeService", null);
        setField(term886, term886.getClass(), "freezeValidator", null);
        setField(term886, term886.getClass(), "freezeDateUtils", null);
        setField(term886, term886.getClass(), "lockManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unfreezeLastRecord", argTypes, term886, args);
    }

};


