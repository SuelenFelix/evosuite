package com.zxl.dailypractice.card.two.june.june5;

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
import static com.zxl.dailypractice.card.two.june.june5.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Solution_randPoint_9588776493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22;

    public Solution_randPoint_9588776493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22 = newInstance(Class.forName("com.zxl.dailypractice.card.two.june.june5.Solution"));
        setField(term22, term22.getClass(), "random", null);
        setDoubleField(term22, term22.getClass(), "xc", 0.0);
        setDoubleField(term22, term22.getClass(), "yc", 0.0);
        setDoubleField(term22, term22.getClass(), "r", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.june.june5.Solution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "randPoint", argTypes, term22, args);
    }

};


