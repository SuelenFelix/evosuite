package ru.smartup.timetracker.dto.freeze.request;

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
import static ru.smartup.timetracker.dto.freeze.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FreezeDateDtoRequest_getDates_18768423588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147;

    public FreezeDateDtoRequest_getDates_18768423588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.request.FreezeDateDtoRequest"));
        setField(term147, term147.getClass(), "dates", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.request.FreezeDateDtoRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDates", argTypes, term147, args);
    }

};


