package com.patika.designpatern.creation.a2.builder;

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
import static com.patika.designpatern.creation.a2.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BuilderMainTest_main_20562103491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1073;

    public BuilderMainTest_main_20562103491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1073 = (Object[]) newArray("java.lang.String", 4);
        setElement(term1073, 0, "LvtrsXUliU");
        setElement(term1073, 1, "xLbjWUgOIL");
        setElement(term1073, 2, "jDtqGUpnZN");
        setElement(term1073, 3, "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.designpatern.creation.a2.builder.BuilderMainTest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1073;
        callMethod(klass, "main", argTypes, null, args);
    }

};


