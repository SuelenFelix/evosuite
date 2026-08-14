package com.voodoodyne.hattery;

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
import static com.voodoodyne.hattery.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Param_concat_13949259659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9894;

    public Param_concat_13949259659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9894 = newInstance(Class.forName("com.voodoodyne.hattery.Param"));
        setField(term9894, term9894.getClass(), "name", null);
        setField(term9894, term9894.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.Param");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.voodoodyne.hattery.Param"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.voodoodyne.hattery.Param"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "concat", argTypes, term9894, args);
    }

};


