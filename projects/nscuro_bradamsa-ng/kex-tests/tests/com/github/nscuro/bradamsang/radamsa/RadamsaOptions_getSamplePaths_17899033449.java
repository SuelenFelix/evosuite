package com.github.nscuro.bradamsang.radamsa;

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
import static com.github.nscuro.bradamsang.radamsa.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RadamsaOptions_getSamplePaths_17899033449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438;

    public RadamsaOptions_getSamplePaths_17899033449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term438 = newInstance(Class.forName("com.github.nscuro.bradamsang.radamsa.RadamsaOptions"));
        setField(term438, term438.getClass(), "sample", null);
        setField(term438, term438.getClass(), "samplePaths", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.radamsa.RadamsaOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSamplePaths", argTypes, term438, args);
    }

};


