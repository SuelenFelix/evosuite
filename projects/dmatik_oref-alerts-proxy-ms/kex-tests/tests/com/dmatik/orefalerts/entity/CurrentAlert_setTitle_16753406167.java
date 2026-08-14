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

public class CurrentAlert_setTitle_16753406167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3937;

    public CurrentAlert_setTitle_16753406167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3937 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term3974 = (Object[]) newArray("java.lang.String", 2);
        setField(term3937, term3937.getClass(), "id", "vwbEQQNQrx");
        setField(term3937, term3937.getClass(), "cat", "xtftXXMbem");
        setField(term3937, term3937.getClass(), "title", "cudZvLMQon");
        setElement(term3974, 0, "lihXWlGDxk");
        setElement(term3974, 1, "JmcmxoGhIK");
        setField(term3937, term3937.getClass(), "data", term3974);
        setField(term3937, term3937.getClass(), "desc", "jXzmYyrnnT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "igCAtimmYB";
        callMethod(klass, "setTitle", argTypes, term3937, args);
    }

};


