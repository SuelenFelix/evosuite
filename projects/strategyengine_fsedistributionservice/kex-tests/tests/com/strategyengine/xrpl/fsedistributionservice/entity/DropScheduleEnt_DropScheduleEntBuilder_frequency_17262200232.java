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

public class DropScheduleEnt_DropScheduleEntBuilder_frequency_17262200232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243522;
     Object enum426;

    public DropScheduleEnt_DropScheduleEntBuilder_frequency_17262200232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term243523 = new Long(-6339531459447942677L);
        Class<? extends Object> term243577 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term243576 = ((Class) term243577).getDeclaredField((String) "MONTHLY");
        ((Field) term243576).setAccessible(true);
        Object enum424 = ((Field) term243576).get((Object) null);
        Class<? extends Object> term243980 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term243979 = ((Class) term243980).getDeclaredField((String) "ACTIVE");
        ((Field) term243979).setAccessible(true);
        Object enum425 = ((Field) term243979).get((Object) null);
        Long term243562 = new Long(2014229530618878786L);
        term243522 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder"));
        Object term243536 = newInstance(Class.forName("java.util.Date"));
        Object term243538 = newInstance(Class.forName("java.util.Date"));
        setField(term243522, term243522.getClass(), "id", term243523);
        setField(term243522, term243522.getClass(), "frequency", enum424);
        setLongField(term243536, term243536.getClass(), "fastTime", 1332619715133L);
        setField(term243536, term243536.getClass(), "cdate", null);
        setField(term243522, term243522.getClass(), "repeatUntilDate", term243536);
        setLongField(term243538, term243538.getClass(), "fastTime", 1561164757620L);
        setField(term243538, term243538.getClass(), "cdate", null);
        setField(term243522, term243522.getClass(), "createDate", term243538);
        setField(term243522, term243522.getClass(), "lockUuid", "FlZbOFNISk");
        setField(term243522, term243522.getClass(), "dropScheduleStatus", enum425);
        setField(term243522, term243522.getClass(), "dropRequestId", term243562);
        Class<? extends Object> term244395 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term244394 = ((Class) term244395).getDeclaredField((String) "ANNUALLY");
        ((Field) term244394).setAccessible(true);
        enum426 = ((Field) term244394).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Object[] args = new Object[1];
        args[0] = enum426;
        callMethod(klass, "frequency", argTypes, term243522, args);
    }

};


