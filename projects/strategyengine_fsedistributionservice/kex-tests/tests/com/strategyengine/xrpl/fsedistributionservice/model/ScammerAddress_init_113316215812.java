package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ScammerAddress_init_113316215812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567329;
     Object term567343;
     Object term567345;

    public ScammerAddress_init_113316215812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term567329 = new Long(-8116658799088527026L);
        term567343 = newInstance(Class.forName("java.util.Date"));
        setLongField(term567343, term567343.getClass(), "fastTime", 1565089189048L);
        setField(term567343, term567343.getClass(), "cdate", null);
        term567345 = newInstance(Class.forName("java.util.Date"));
        setLongField(term567345, term567345.getClass(), "fastTime", 1336883867989L);
        setField(term567345, term567345.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.Date");
        argTypes[3] = Class.forName("java.util.Date");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term567329;
        args[1] = "pTbgOtvRFl";
        args[2] = term567343;
        args[3] = term567345;
        args[4] = "uYsCAnuGyO";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


