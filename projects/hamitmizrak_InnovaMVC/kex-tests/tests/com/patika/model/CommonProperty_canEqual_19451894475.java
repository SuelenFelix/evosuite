package com.patika.model;

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
import static com.patika.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CommonProperty_canEqual_19451894475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5569;
     Object term5573;

    public CommonProperty_canEqual_19451894475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5569 = newInstance(Class.forName("com.patika.model.CommonProperty"));
        Object term5571 = newInstance(Class.forName("java.util.Date"));
        setIntField(term5569, term5569.getClass(), "id", 1227103734);
        setLongField(term5571, term5571.getClass(), "fastTime", 1429023851389L);
        setField(term5571, term5571.getClass(), "cdate", null);
        setField(term5569, term5569.getClass(), "date", term5571);
        term5573 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.CommonProperty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5573;
        callMethod(klass, "canEqual", argTypes, term5569, args);
    }

};


