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

public class DropScheduleEnt_DropScheduleEntBuilder_repeatUntilDate_9234296363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244790;
     Object term244835;

    public DropScheduleEnt_DropScheduleEntBuilder_repeatUntilDate_9234296363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term244791 = new Long(-3684549603148553700L);
        Class<? extends Object> term244838 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term244837 = ((Class) term244838).getDeclaredField((String) "ANNUALLY");
        ((Field) term244837).setAccessible(true);
        Object enum427 = ((Field) term244837).get((Object) null);
        Class<? extends Object> term245244 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term245243 = ((Class) term245244).getDeclaredField((String) "COMPLETE");
        ((Field) term245243).setAccessible(true);
        Object enum428 = ((Field) term245243).get((Object) null);
        Long term244833 = new Long(4665980239039735158L);
        term244790 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder"));
        Object term244805 = newInstance(Class.forName("java.util.Date"));
        Object term244807 = newInstance(Class.forName("java.util.Date"));
        setField(term244790, term244790.getClass(), "id", term244791);
        setField(term244790, term244790.getClass(), "frequency", enum427);
        setLongField(term244805, term244805.getClass(), "fastTime", 1340665162291L);
        setField(term244805, term244805.getClass(), "cdate", null);
        setField(term244790, term244790.getClass(), "repeatUntilDate", term244805);
        setLongField(term244807, term244807.getClass(), "fastTime", 1683480855730L);
        setField(term244807, term244807.getClass(), "cdate", null);
        setField(term244790, term244790.getClass(), "createDate", term244807);
        setField(term244790, term244790.getClass(), "lockUuid", "zDtePZrZQH");
        setField(term244790, term244790.getClass(), "dropScheduleStatus", enum428);
        setField(term244790, term244790.getClass(), "dropRequestId", term244833);
        term244835 = newInstance(Class.forName("java.util.Date"));
        setLongField(term244835, term244835.getClass(), "fastTime", 1627004574434L);
        setField(term244835, term244835.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term244835;
        callMethod(klass, "repeatUntilDate", argTypes, term244790, args);
    }

};


