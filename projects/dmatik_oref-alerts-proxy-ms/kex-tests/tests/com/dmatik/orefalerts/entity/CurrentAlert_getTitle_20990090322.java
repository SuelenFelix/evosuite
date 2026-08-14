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

public class CurrentAlert_getTitle_20990090322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3201;

    public CurrentAlert_getTitle_20990090322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3201 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term3238 = (Object[]) newArray("java.lang.String", 5);
        setField(term3201, term3201.getClass(), "id", "LWyEaeIyAo");
        setField(term3201, term3201.getClass(), "cat", "yVMkkQhvmN");
        setField(term3201, term3201.getClass(), "title", "mvrkADEgpp");
        setElement(term3238, 0, "pXOkjyeIRb");
        setElement(term3238, 1, "GgZWSjxjyE");
        setElement(term3238, 2, "EeBVbzjcCI");
        setElement(term3238, 3, "UfQtPRyWRC");
        setElement(term3238, 4, "FPvxVzzSvD");
        setField(term3201, term3201.getClass(), "data", term3238);
        setField(term3201, term3201.getClass(), "desc", "WHcwFgsGFC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term3201, args);
    }

};


