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

public class DropScheduleEnt_DropScheduleEntBuilder_lockUuid_6616367065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246530;

    public DropScheduleEnt_DropScheduleEntBuilder_lockUuid_6616367065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term246531 = new Long(7716258711075652753L);
        Class<? extends Object> term246583 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term246582 = ((Class) term246583).getDeclaredField((String) "DAILY");
        ((Field) term246582).setAccessible(true);
        Object enum431 = ((Field) term246582).get((Object) null);
        Class<? extends Object> term246980 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term246979 = ((Class) term246980).getDeclaredField((String) "ACTIVE");
        ((Field) term246979).setAccessible(true);
        Object enum432 = ((Field) term246979).get((Object) null);
        Long term246568 = new Long(-3988042285731673145L);
        term246530 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder"));
        Object term246542 = newInstance(Class.forName("java.util.Date"));
        Object term246544 = newInstance(Class.forName("java.util.Date"));
        setField(term246530, term246530.getClass(), "id", term246531);
        setField(term246530, term246530.getClass(), "frequency", enum431);
        setLongField(term246542, term246542.getClass(), "fastTime", 1849537151339L);
        setField(term246542, term246542.getClass(), "cdate", null);
        setField(term246530, term246530.getClass(), "repeatUntilDate", term246542);
        setLongField(term246544, term246544.getClass(), "fastTime", 1588914209956L);
        setField(term246544, term246544.getClass(), "cdate", null);
        setField(term246530, term246530.getClass(), "createDate", term246544);
        setField(term246530, term246530.getClass(), "lockUuid", "TWsXTUTREq");
        setField(term246530, term246530.getClass(), "dropScheduleStatus", enum432);
        setField(term246530, term246530.getClass(), "dropRequestId", term246568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tVsPWASlsh";
        callMethod(klass, "lockUuid", argTypes, term246530, args);
    }

};


