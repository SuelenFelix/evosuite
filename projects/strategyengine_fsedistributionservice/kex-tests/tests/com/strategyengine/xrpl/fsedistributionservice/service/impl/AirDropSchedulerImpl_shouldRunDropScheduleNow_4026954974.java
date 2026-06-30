package com.strategyengine.xrpl.fsedistributionservice.service.impl;

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
import static com.strategyengine.xrpl.fsedistributionservice.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class AirDropSchedulerImpl_shouldRunDropScheduleNow_4026954974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19540;
     Object term19542;
     Object enum34;

    public AirDropSchedulerImpl_shouldRunDropScheduleNow_4026954974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19540 = newInstance(Class.forName("java.util.Date"));
        setLongField(term19540, term19540.getClass(), "fastTime", 1678177615298L);
        setField(term19540, term19540.getClass(), "cdate", null);
        term19542 = newInstance(Class.forName("java.util.Date"));
        setLongField(term19542, term19542.getClass(), "fastTime", 1666076287186L);
        setField(term19542, term19542.getClass(), "cdate", null);
        Class<? extends Object> term19557 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term19556 = ((Class) term19557).getDeclaredField((String) "ANNUALLY");
        ((Field) term19556).setAccessible(true);
        enum34 = ((Field) term19556).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.AirDropSchedulerImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.Date");
        argTypes[2] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Object[] args = new Object[3];
        args[0] = term19540;
        args[1] = term19542;
        args[2] = enum34;
        callMethod(klass, "shouldRunDropScheduleNow", argTypes, null, args);
    }

};


