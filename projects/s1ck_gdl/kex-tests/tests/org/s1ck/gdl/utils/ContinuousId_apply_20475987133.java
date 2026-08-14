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

public class ContinuousId_apply_20475987133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1252;

    public ContinuousId_apply_20475987133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1252 = newInstance(Class.forName("org.s1ck.gdl.utils.ContinuousId"));
        setLongField(term1252, term1252.getClass(), "nextId", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.utils.ContinuousId");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Optional");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "apply", argTypes, term1252, args);
    }

};


