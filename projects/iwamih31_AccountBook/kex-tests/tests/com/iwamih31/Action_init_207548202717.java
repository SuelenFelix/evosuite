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

public class Action_init_207548202717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13699;
     Object term13701;
     Object term13729;
     Object term13731;

    public Action_init_207548202717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13699 = new Integer(-2095575670);
        term13701 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term13701, term13701.getClass(), "year", 2012);
        setShortField(term13701, term13701.getClass(), "month", (short) 4);
        setShortField(term13701, term13701.getClass(), "day", (short) 19);
        term13729 = new Integer(1225272962);
        term13731 = new Integer(1324040357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.time.LocalDate");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.Integer");
        argTypes[5] = Class.forName("java.lang.Integer");
        Object[] args = new Object[6];
        args[0] = term13699;
        args[1] = term13701;
        args[2] = "zcorEihhLK";
        args[3] = "GrqozDKFOk";
        args[4] = term13729;
        args[5] = term13731;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


