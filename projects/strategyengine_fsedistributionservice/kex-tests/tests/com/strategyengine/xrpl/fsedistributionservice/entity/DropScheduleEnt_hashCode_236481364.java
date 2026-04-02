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

public class DropScheduleEnt_hashCode_236481364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6037;

    public DropScheduleEnt_hashCode_236481364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6038 = new Long(3620247240684476031L);
        Class<? extends Object> term6080 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term6079 = ((Class) term6080).getDeclaredField((String) "DAILY");
        ((Field) term6079).setAccessible(true);
        Object enum8 = ((Field) term6079).get((Object) null);
        Class<? extends Object> term6477 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term6476 = ((Class) term6477).getDeclaredField((String) "REJECTED");
        ((Field) term6476).setAccessible(true);
        Object enum9 = ((Field) term6476).get((Object) null);
        Long term6077 = new Long(8313800941204938919L);
        term6037 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term6049 = newInstance(Class.forName("java.util.Date"));
        Object term6051 = newInstance(Class.forName("java.util.Date"));
        setField(term6037, term6037.getClass(), "id", term6038);
        setField(term6037, term6037.getClass(), "frequency", enum8);
        setLongField(term6049, term6049.getClass(), "fastTime", 1695425269458L);
        setField(term6049, term6049.getClass(), "cdate", null);
        setField(term6037, term6037.getClass(), "repeatUntilDate", term6049);
        setLongField(term6051, term6051.getClass(), "fastTime", 1362780563394L);
        setField(term6051, term6051.getClass(), "cdate", null);
        setField(term6037, term6037.getClass(), "createDate", term6051);
        setField(term6037, term6037.getClass(), "lockUuid", "JiVRgTZvKc");
        setField(term6037, term6037.getClass(), "dropScheduleStatus", enum9);
        setField(term6037, term6037.getClass(), "dropRequestId", term6077);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6037, args);
    }

};


