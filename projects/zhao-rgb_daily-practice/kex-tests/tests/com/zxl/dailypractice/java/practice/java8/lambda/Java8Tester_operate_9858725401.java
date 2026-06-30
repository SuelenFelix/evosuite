package com.zxl.dailypractice.java.practice.java8.lambda;

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
import static com.zxl.dailypractice.java.practice.java8.lambda.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Java8Tester_operate_9858725401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;
     Object term114;
     Object term116;

    public Java8Tester_operate_9858725401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113 = newInstance(Class.forName("com.zxl.dailypractice.java.practice.java8.lambda.Java8Tester"));
        term114 = new Integer(568599855);
        term116 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.java.practice.java8.lambda.Java8Tester");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.zxl.dailypractice.java.practice.java8.lambda.Java8Tester$MathOperation");
        Object[] args = new Object[3];
        args[0] = term114;
        args[1] = term116;
        args[2] = null;
        callMethod(klass, "operate", argTypes, term113, args);
    }

};


