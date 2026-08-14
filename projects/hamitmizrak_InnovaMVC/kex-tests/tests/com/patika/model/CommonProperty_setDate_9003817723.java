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

public class CommonProperty_setDate_9003817723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;
     Object term19;

    public CommonProperty_setDate_9003817723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = newInstance(Class.forName("com.patika.model.CommonProperty"));
        Object term17 = newInstance(Class.forName("java.util.Date"));
        setIntField(term15, term15.getClass(), "id", -1922583790);
        setLongField(term17, term17.getClass(), "fastTime", 1606045635837L);
        setField(term17, term17.getClass(), "cdate", null);
        setField(term15, term15.getClass(), "date", term17);
        term19 = newInstance(Class.forName("java.util.Date"));
        setLongField(term19, term19.getClass(), "fastTime", 1442639565302L);
        setField(term19, term19.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.CommonProperty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term19;
        callMethod(klass, "setDate", argTypes, term15, args);
    }

};


