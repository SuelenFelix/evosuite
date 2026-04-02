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

public class DropScheduleEnt_canEqual_12292011683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5172;
     Object term5215;

    public DropScheduleEnt_canEqual_12292011683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5173 = new Long(1084801489398441516L);
        Class<? extends Object> term5217 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term5216 = ((Class) term5217).getDeclaredField((String) "WEEKLY");
        ((Field) term5216).setAccessible(true);
        Object enum6 = ((Field) term5216).get((Object) null);
        Class<? extends Object> term5617 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term5616 = ((Class) term5617).getDeclaredField((String) "COMPLETE");
        ((Field) term5616).setAccessible(true);
        Object enum7 = ((Field) term5616).get((Object) null);
        Long term5213 = new Long(6273754186658578034L);
        term5172 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term5185 = newInstance(Class.forName("java.util.Date"));
        Object term5187 = newInstance(Class.forName("java.util.Date"));
        setField(term5172, term5172.getClass(), "id", term5173);
        setField(term5172, term5172.getClass(), "frequency", enum6);
        setLongField(term5185, term5185.getClass(), "fastTime", 1741444563811L);
        setField(term5185, term5185.getClass(), "cdate", null);
        setField(term5172, term5172.getClass(), "repeatUntilDate", term5185);
        setLongField(term5187, term5187.getClass(), "fastTime", 1761994701322L);
        setField(term5187, term5187.getClass(), "cdate", null);
        setField(term5172, term5172.getClass(), "createDate", term5187);
        setField(term5172, term5172.getClass(), "lockUuid", "XqgfKFvPSD");
        setField(term5172, term5172.getClass(), "dropScheduleStatus", enum7);
        setField(term5172, term5172.getClass(), "dropRequestId", term5213);
        term5215 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5215;
        callMethod(klass, "canEqual", argTypes, term5172, args);
    }

};


