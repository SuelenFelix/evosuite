package com.innova.entity;

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
import static com.innova.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Double;

public class ComputerEntity_init_67840729616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2294;
     Object term2320;
     Object term2322;

    public ComputerEntity_init_67840729616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2294 = new Long(-5788180182343976541L);
        term2320 = new Double(0.25937345430928016);
        term2322 = newInstance(Class.forName("java.util.Date"));
        setLongField(term2322, term2322.getClass(), "fastTime", 1628695316832L);
        setField(term2322, term2322.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = double.class;
        argTypes[4] = Class.forName("java.util.Date");
        Object[] args = new Object[5];
        args[0] = term2294;
        args[1] = "TimdotUuNC";
        args[2] = "PkWMRdJcBb";
        args[3] = term2320;
        args[4] = term2322;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


