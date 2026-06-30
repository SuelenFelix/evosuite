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

public class DropScheduleEnt_setDropScheduleStatus_170250576420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19408;
     Object enum41;

    public DropScheduleEnt_setDropScheduleStatus_170250576420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19409 = new Long(-8649738738252714180L);
        Class<? extends Object> term19461 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term19460 = ((Class) term19461).getDeclaredField((String) "DAILY");
        ((Field) term19460).setAccessible(true);
        Object enum39 = ((Field) term19460).get((Object) null);
        Class<? extends Object> term19858 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term19857 = ((Class) term19858).getDeclaredField((String) "ACTIVE");
        ((Field) term19857).setAccessible(true);
        Object enum40 = ((Field) term19857).get((Object) null);
        Long term19446 = new Long(-7278883608542636188L);
        term19408 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term19420 = newInstance(Class.forName("java.util.Date"));
        Object term19422 = newInstance(Class.forName("java.util.Date"));
        setField(term19408, term19408.getClass(), "id", term19409);
        setField(term19408, term19408.getClass(), "frequency", enum39);
        setLongField(term19420, term19420.getClass(), "fastTime", 1825608844992L);
        setField(term19420, term19420.getClass(), "cdate", null);
        setField(term19408, term19408.getClass(), "repeatUntilDate", term19420);
        setLongField(term19422, term19422.getClass(), "fastTime", 1465782799700L);
        setField(term19422, term19422.getClass(), "cdate", null);
        setField(term19408, term19408.getClass(), "createDate", term19422);
        setField(term19408, term19408.getClass(), "lockUuid", "RYdKCNNMBR");
        setField(term19408, term19408.getClass(), "dropScheduleStatus", enum40);
        setField(term19408, term19408.getClass(), "dropRequestId", term19446);
        Class<? extends Object> term20273 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term20272 = ((Class) term20273).getDeclaredField((String) "COMPLETE");
        ((Field) term20272).setAccessible(true);
        enum41 = ((Field) term20272).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Object[] args = new Object[1];
        args[0] = enum41;
        callMethod(klass, "setDropScheduleStatus", argTypes, term19408, args);
    }

};


