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
import java.lang.Float;

public class PositionCreateDto_setExternalRate_11689638974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;
     Object term109;

    public PositionCreateDto_setExternalRate_11689638974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.request.PositionCreateDto"));
        setField(term95, term95.getClass(), "name", "jJCZpVmanW");
        setFloatField(term95, term95.getClass(), "externalRate", 0.09123778F);
        term109 = new Float(0.5523636F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.request.PositionCreateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term109;
        callMethod(klass, "setExternalRate", argTypes, term95, args);
    }

};


