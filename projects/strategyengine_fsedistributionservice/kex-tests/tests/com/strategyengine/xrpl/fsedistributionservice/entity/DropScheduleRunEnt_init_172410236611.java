package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class DropScheduleRunEnt_init_172410236611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238825;
     Object term238827;
     Object term238829;
     Object term238831;

    public DropScheduleRunEnt_init_172410236611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238825 = new Long(-3189918180129674609L);
        term238827 = new Long(5271284328066798769L);
        term238829 = new Long(1924411240174876881L);
        term238831 = newInstance(Class.forName("java.util.Date"));
        setLongField(term238831, term238831.getClass(), "fastTime", 1400580910260L);
        setField(term238831, term238831.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.util.Date");
        Object[] args = new Object[4];
        args[0] = term238825;
        args[1] = term238827;
        args[2] = term238829;
        args[3] = term238831;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


