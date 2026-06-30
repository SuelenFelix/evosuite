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

public class SequareEquation_setCoefficient_6372871026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term749;
     Object term756;
     Object term758;
     Object term760;

    public SequareEquation_setCoefficient_6372871026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term749 = newInstance(Class.forName("com.zxl.dailypractice.java.bookExample.SequareEquation"));
        setDoubleField(term749, term749.getClass(), "a", 0.0);
        setDoubleField(term749, term749.getClass(), "b", 0.0);
        setDoubleField(term749, term749.getClass(), "c", 0.0);
        setDoubleField(term749, term749.getClass(), "root1", 0.0);
        setDoubleField(term749, term749.getClass(), "root2", 0.0);
        setBooleanField(term749, term749.getClass(), "boo", false);
        term756 = new Double(0.0);
        term758 = new Double(0.0);
        term760 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.java.bookExample.SequareEquation");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term756;
        args[1] = term758;
        args[2] = term760;
        callMethod(klass, "setCoefficient", argTypes, term749, args);
    }

};


