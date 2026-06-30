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

public class Vehicle_getPower_16753276034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320;

    public Vehicle_getPower_16753276034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320 = newInstance(Class.forName("com.zxl.dailypractice.java.bookExample.Vehicle"));
        setDoubleField(term320, term320.getClass(), "speed", 0.544608645520025);
        setIntField(term320, term320.getClass(), "power", 597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.java.bookExample.Vehicle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPower", argTypes, term320, args);
    }

};


