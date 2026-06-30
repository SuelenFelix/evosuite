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

public class AirDropSchedulerImpl_getNextRun_12557898295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19952;
     Object enum35;

    public AirDropSchedulerImpl_getNextRun_12557898295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19952 = newInstance(Class.forName("java.util.Date"));
        setLongField(term19952, term19952.getClass(), "fastTime", 1426018874434L);
        setField(term19952, term19952.getClass(), "cdate", null);
        Class<? extends Object> term19966 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term19965 = ((Class) term19966).getDeclaredField((String) "MONTHLY");
        ((Field) term19965).setAccessible(true);
        enum35 = ((Field) term19965).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.AirDropSchedulerImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Object[] args = new Object[2];
        args[0] = term19952;
        args[1] = enum35;
        callMethod(klass, "getNextRun", argTypes, null, args);
    }

};


