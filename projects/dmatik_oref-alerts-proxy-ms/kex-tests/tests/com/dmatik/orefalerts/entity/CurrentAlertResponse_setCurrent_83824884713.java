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

public class CurrentAlertResponse_setCurrent_83824884713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1792;

    public CurrentAlertResponse_setCurrent_83824884713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1792 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse"));
        setField(term1792, term1792.getClass(), "alert", null);
        setField(term1792, term1792.getClass(), "current", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.dmatik.orefalerts.entity.CurrentAlert");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCurrent", argTypes, term1792, args);
    }

};


