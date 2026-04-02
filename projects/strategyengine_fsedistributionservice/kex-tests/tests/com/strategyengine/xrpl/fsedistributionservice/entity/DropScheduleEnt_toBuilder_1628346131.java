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

public class DropScheduleEnt_toBuilder_1628346131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3371;

    public DropScheduleEnt_toBuilder_1628346131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3372 = new Long(-7268507582722666254L);
        Class<? extends Object> term3456 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term3455 = ((Class) term3456).getDeclaredField((String) "DAILY");
        ((Field) term3455).setAccessible(true);
        Object enum2 = ((Field) term3455).get((Object) null);
        Class<? extends Object> term3887 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term3886 = ((Class) term3887).getDeclaredField((String) "COMPLETE");
        ((Field) term3886).setAccessible(true);
        Object enum3 = ((Field) term3886).get((Object) null);
        Long term3411 = new Long(5671808784468963649L);
        term3371 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term3383 = newInstance(Class.forName("java.util.Date"));
        Object term3385 = newInstance(Class.forName("java.util.Date"));
        setField(term3371, term3371.getClass(), "id", term3372);
        setField(term3371, term3371.getClass(), "frequency", enum2);
        setLongField(term3383, term3383.getClass(), "fastTime", 1426018874434L);
        setField(term3383, term3383.getClass(), "cdate", null);
        setField(term3371, term3371.getClass(), "repeatUntilDate", term3383);
        setLongField(term3385, term3385.getClass(), "fastTime", 1633004775487L);
        setField(term3385, term3385.getClass(), "cdate", null);
        setField(term3371, term3371.getClass(), "createDate", term3385);
        setField(term3371, term3371.getClass(), "lockUuid", "jiKYgYHqIS");
        setField(term3371, term3371.getClass(), "dropScheduleStatus", enum3);
        setField(term3371, term3371.getClass(), "dropRequestId", term3411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term3371, args);
    }

};


