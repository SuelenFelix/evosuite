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
import java.lang.String;
import java.lang.Object;

public class DropScheduleEnt_toString_5344078265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6897;

    public DropScheduleEnt_toString_5344078265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6898 = new Long(-1214968196781083707L);
        Class<? extends Object> term6940 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term6939 = ((Class) term6940).getDeclaredField((String) "MONTHLY");
        ((Field) term6939).setAccessible(true);
        Object enum10 = ((Field) term6939).get((Object) null);
        Class<? extends Object> term7343 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term7342 = ((Class) term7343).getDeclaredField((String) "ACTIVE");
        ((Field) term7342).setAccessible(true);
        Object enum11 = ((Field) term7342).get((Object) null);
        Long term6937 = new Long(-1804015692891701666L);
        term6897 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term6911 = newInstance(Class.forName("java.util.Date"));
        Object term6913 = newInstance(Class.forName("java.util.Date"));
        setField(term6897, term6897.getClass(), "id", term6898);
        setField(term6897, term6897.getClass(), "frequency", enum10);
        setLongField(term6911, term6911.getClass(), "fastTime", 1853963979281L);
        setField(term6911, term6911.getClass(), "cdate", null);
        setField(term6897, term6897.getClass(), "repeatUntilDate", term6911);
        setLongField(term6913, term6913.getClass(), "fastTime", 1795936337628L);
        setField(term6913, term6913.getClass(), "cdate", null);
        setField(term6897, term6897.getClass(), "createDate", term6913);
        setField(term6897, term6897.getClass(), "lockUuid", "XPKmummaqg");
        setField(term6897, term6897.getClass(), "dropScheduleStatus", enum11);
        setField(term6897, term6897.getClass(), "dropRequestId", term6937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6897, args);
    }

};


