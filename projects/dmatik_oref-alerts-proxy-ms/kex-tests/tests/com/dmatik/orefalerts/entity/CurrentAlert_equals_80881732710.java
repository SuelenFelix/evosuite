package com.dmatik.orefalerts.entity;

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
import static com.dmatik.orefalerts.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CurrentAlert_equals_80881732710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4648;
     Object term4710;

    public CurrentAlert_equals_80881732710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4648 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term4685 = (Object[]) newArray("java.lang.String", 1);
        setField(term4648, term4648.getClass(), "id", "vGiuZVPJNH");
        setField(term4648, term4648.getClass(), "cat", "tlzpzIjMib");
        setField(term4648, term4648.getClass(), "title", "AZdLeSugwv");
        setElement(term4685, 0, "RMsXuyzKJV");
        setField(term4648, term4648.getClass(), "data", term4685);
        setField(term4648, term4648.getClass(), "desc", "FwPbDZcHmB");
        term4710 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4710;
        callMethod(klass, "equals", argTypes, term4648, args);
    }

};


