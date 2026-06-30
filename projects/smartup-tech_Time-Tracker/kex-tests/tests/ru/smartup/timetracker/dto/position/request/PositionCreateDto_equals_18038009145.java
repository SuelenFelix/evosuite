package ru.smartup.timetracker.dto.position.request;

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
import static ru.smartup.timetracker.dto.position.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PositionCreateDto_equals_18038009145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121;
     Object term135;

    public PositionCreateDto_equals_18038009145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.request.PositionCreateDto"));
        setField(term121, term121.getClass(), "name", "EGtDIRbSSb");
        setFloatField(term121, term121.getClass(), "externalRate", 0.8564069F);
        term135 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.request.PositionCreateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term135;
        callMethod(klass, "equals", argTypes, term121, args);
    }

};


