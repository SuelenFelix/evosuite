package com.zxl.dailypractice.java.bookExample;

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
import static com.zxl.dailypractice.java.bookExample.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class SequareEquation_setCoefficient_6372871022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590;
     Object term597;
     Object term599;
     Object term601;

    public SequareEquation_setCoefficient_6372871022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term590 = newInstance(Class.forName("com.zxl.dailypractice.java.bookExample.SequareEquation"));
        setDoubleField(term590, term590.getClass(), "a", 0.1374549299694151);
        setDoubleField(term590, term590.getClass(), "b", 0.7031006357544823);
        setDoubleField(term590, term590.getClass(), "c", 0.9527281779865117);
        setDoubleField(term590, term590.getClass(), "root1", 0.9828442029246764);
        setDoubleField(term590, term590.getClass(), "root2", 0.2779719046761513);
        setBooleanField(term590, term590.getClass(), "boo", false);
        term597 = new Double(0.6436713023569729);
        term599 = new Double(0.7332741045694002);
        term601 = new Double(0.4569171842750229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.java.bookExample.SequareEquation");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term597;
        args[1] = term599;
        args[2] = term601;
        callMethod(klass, "setCoefficient", argTypes, term590, args);
    }

};


