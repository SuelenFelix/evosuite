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

public class Msi_MsiBuilder_computerName_20812357785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1648;

    public Msi_MsiBuilder_computerName_20812357785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1648 = newInstance(Class.forName("com.patika.designpatern.creation.a5.abstractfactory.Msi$MsiBuilder"));
        setField(term1648, term1648.getClass(), "computerName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.designpatern.creation.a5.abstractfactory.Msi$MsiBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "computerName", argTypes, term1648, args);
    }

};


