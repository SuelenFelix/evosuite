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

public class PositionCreateDto_getExternalRate_11367390052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;

    public PositionCreateDto_getExternalRate_11367390052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.request.PositionCreateDto"));
        setField(term25, term25.getClass(), "name", "sjlJAEtRrb");
        setFloatField(term25, term25.getClass(), "externalRate", 0.2707036F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.request.PositionCreateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternalRate", argTypes, term25, args);
    }

};


