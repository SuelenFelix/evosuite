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
import java.lang.Object;

public class DropScheduleRunEnt_equals_11470124762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238751;
     Object term238760;

    public DropScheduleRunEnt_equals_11470124762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238752 = new Long(3221586604131689186L);
        Long term238754 = new Long(-1283936527800858962L);
        Long term238756 = new Long(-8901189796092679153L);
        term238751 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt"));
        Object term238758 = newInstance(Class.forName("java.util.Date"));
        setField(term238751, term238751.getClass(), "id", term238752);
        setField(term238751, term238751.getClass(), "dropScheduleId", term238754);
        setField(term238751, term238751.getClass(), "dropRequestId", term238756);
        setLongField(term238758, term238758.getClass(), "fastTime", 1289717239692L);
        setField(term238758, term238758.getClass(), "cdate", null);
        setField(term238751, term238751.getClass(), "createDate", term238758);
        term238760 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term238760;
        callMethod(klass, "equals", argTypes, term238751, args);
    }

};


