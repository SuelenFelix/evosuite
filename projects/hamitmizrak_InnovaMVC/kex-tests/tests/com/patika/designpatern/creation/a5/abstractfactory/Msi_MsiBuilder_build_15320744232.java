package com.patika.designpatern.creation.a5.abstractfactory;

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
import static com.patika.designpatern.creation.a5.abstractfactory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Msi_MsiBuilder_build_15320744232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300;

    public Msi_MsiBuilder_build_15320744232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300 = newInstance(Class.forName("com.patika.designpatern.creation.a5.abstractfactory.Msi$MsiBuilder"));
        setField(term300, term300.getClass(), "computerName", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.designpatern.creation.a5.abstractfactory.Msi$MsiBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term300, args);
    }

};


