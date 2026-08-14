package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Plan_init_134827877126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34716;
     Object term34718;
     Object term34720;
     Object term34724;
     Object term34764;

    public Plan_init_134827877126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34716 = new Integer(107945604);
        term34718 = new Integer(-1963464809);
        term34720 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term34720, term34720.getClass(), "year", 2012);
        setShortField(term34720, term34720.getClass(), "month", (short) 4);
        setShortField(term34720, term34720.getClass(), "day", (short) 25);
        term34724 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term34724, term34724.getClass(), "year", 2021);
        setShortField(term34724, term34724.getClass(), "month", (short) 3);
        setShortField(term34724, term34724.getClass(), "day", (short) 27);
        term34764 = new Integer(71190297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.Integer");
        argTypes[2] = Class.forName("java.time.LocalDate");
        argTypes[3] = Class.forName("java.time.LocalDate");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.Integer");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        Object[] args = new Object[10];
        args[0] = term34716;
        args[1] = term34718;
        args[2] = term34720;
        args[3] = term34724;
        args[4] = "qsjXSwKloH";
        args[5] = "DDZHUPglvb";
        args[6] = "rWoaXvNyVg";
        args[7] = term34764;
        args[8] = "FLzaBCFjGv";
        args[9] = "OLYhTSqTqJ";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


