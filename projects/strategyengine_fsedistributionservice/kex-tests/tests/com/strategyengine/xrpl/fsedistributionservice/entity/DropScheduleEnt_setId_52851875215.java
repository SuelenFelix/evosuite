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

public class DropScheduleEnt_setId_52851875215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14664;
     Object term14707;

    public DropScheduleEnt_setId_52851875215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14665 = new Long(-6301101997917060727L);
        Class<? extends Object> term14710 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term14709 = ((Class) term14710).getDeclaredField((String) "ANNUALLY");
        ((Field) term14709).setAccessible(true);
        Object enum28 = ((Field) term14709).get((Object) null);
        Class<? extends Object> term15116 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term15115 = ((Class) term15116).getDeclaredField((String) "ACTIVE");
        ((Field) term15115).setAccessible(true);
        Object enum29 = ((Field) term15115).get((Object) null);
        Long term14705 = new Long(8166095254618543564L);
        term14664 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term14679 = newInstance(Class.forName("java.util.Date"));
        Object term14681 = newInstance(Class.forName("java.util.Date"));
        setField(term14664, term14664.getClass(), "id", term14665);
        setField(term14664, term14664.getClass(), "frequency", enum28);
        setLongField(term14679, term14679.getClass(), "fastTime", 1713891155263L);
        setField(term14679, term14679.getClass(), "cdate", null);
        setField(term14664, term14664.getClass(), "repeatUntilDate", term14679);
        setLongField(term14681, term14681.getClass(), "fastTime", 1663413767651L);
        setField(term14681, term14681.getClass(), "cdate", null);
        setField(term14664, term14664.getClass(), "createDate", term14681);
        setField(term14664, term14664.getClass(), "lockUuid", "sEnIVFtZuQ");
        setField(term14664, term14664.getClass(), "dropScheduleStatus", enum29);
        setField(term14664, term14664.getClass(), "dropRequestId", term14705);
        term14707 = new Long(-4598158870068953328L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term14707;
        callMethod(klass, "setId", argTypes, term14664, args);
    }

};


