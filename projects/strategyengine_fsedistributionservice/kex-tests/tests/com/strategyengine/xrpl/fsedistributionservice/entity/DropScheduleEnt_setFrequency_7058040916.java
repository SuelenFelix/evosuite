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

public class DropScheduleEnt_setFrequency_7058040916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15530;
     Object enum32;

    public DropScheduleEnt_setFrequency_7058040916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15531 = new Long(138235087558060686L);
        Class<? extends Object> term15583 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term15582 = ((Class) term15583).getDeclaredField((String) "WEEKLY");
        ((Field) term15582).setAccessible(true);
        Object enum30 = ((Field) term15582).get((Object) null);
        Class<? extends Object> term15983 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term15982 = ((Class) term15983).getDeclaredField((String) "REJECTED");
        ((Field) term15982).setAccessible(true);
        Object enum31 = ((Field) term15982).get((Object) null);
        Long term15571 = new Long(5381386339318883012L);
        term15530 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term15543 = newInstance(Class.forName("java.util.Date"));
        Object term15545 = newInstance(Class.forName("java.util.Date"));
        setField(term15530, term15530.getClass(), "id", term15531);
        setField(term15530, term15530.getClass(), "frequency", enum30);
        setLongField(term15543, term15543.getClass(), "fastTime", 1263744156294L);
        setField(term15543, term15543.getClass(), "cdate", null);
        setField(term15530, term15530.getClass(), "repeatUntilDate", term15543);
        setLongField(term15545, term15545.getClass(), "fastTime", 1490956290070L);
        setField(term15545, term15545.getClass(), "cdate", null);
        setField(term15530, term15530.getClass(), "createDate", term15545);
        setField(term15530, term15530.getClass(), "lockUuid", "ZVecLZMLHF");
        setField(term15530, term15530.getClass(), "dropScheduleStatus", enum31);
        setField(term15530, term15530.getClass(), "dropRequestId", term15571);
        Class<? extends Object> term16404 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term16403 = ((Class) term16404).getDeclaredField((String) "DAILY");
        ((Field) term16403).setAccessible(true);
        enum32 = ((Field) term16403).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Object[] args = new Object[1];
        args[0] = enum32;
        callMethod(klass, "setFrequency", argTypes, term15530, args);
    }

};


