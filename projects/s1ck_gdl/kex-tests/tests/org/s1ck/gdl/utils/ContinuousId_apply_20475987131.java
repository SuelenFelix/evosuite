package org.s1ck.gdl.utils;

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
import static org.s1ck.gdl.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ContinuousId_apply_20475987131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1227;
     Object term1229;

    public ContinuousId_apply_20475987131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1227 = newInstance(Class.forName("org.s1ck.gdl.utils.ContinuousId"));
        setLongField(term1227, term1227.getClass(), "nextId", 2442117782898005296L);
        term1229 = newInstance(Class.forName("java.util.Optional"));
        setField(term1229, term1229.getClass(), "value", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.utils.ContinuousId");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Optional");
        Object[] args = new Object[1];
        args[0] = term1229;
        callMethod(klass, "apply", argTypes, term1227, args);
    }

};


