package org.s1ck.gdl.model.comparables;

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
import static org.s1ck.gdl.model.comparables.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Literal_getVariable_12163914552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398;

    public Literal_getVariable_12163914552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term398 = newInstance(Class.forName("org.s1ck.gdl.model.comparables.Literal"));
        Object term399 = newInstance(Class.forName("java.lang.Object"));
        setField(term398, term398.getClass(), "value", term399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.comparables.Literal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVariable", argTypes, term398, args);
    }

};


