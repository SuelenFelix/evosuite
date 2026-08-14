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

public class CurrentAlert_getDesc_15648073794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3535;

    public CurrentAlert_getDesc_15648073794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3535 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term3572 = (Object[]) newArray("java.lang.String", 3);
        setField(term3535, term3535.getClass(), "id", "aNWLJdrZMq");
        setField(term3535, term3535.getClass(), "cat", "HHmNoYxIGj");
        setField(term3535, term3535.getClass(), "title", "PtirvZmsGt");
        setElement(term3572, 0, "HWkpTmtlrc");
        setElement(term3572, 1, "hMmaoREuCK");
        setElement(term3572, 2, "VeDtgDzGAN");
        setField(term3535, term3535.getClass(), "data", term3572);
        setField(term3535, term3535.getClass(), "desc", "aWYOWZFyaX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDesc", argTypes, term3535, args);
    }

};


