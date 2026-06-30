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

public class DropScheduleEnt_setCreateDate_62693639918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17660;
     Object term17704;

    public DropScheduleEnt_setCreateDate_62693639918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17661 = new Long(1457594663983990440L);
        Class<? extends Object> term17707 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term17706 = ((Class) term17707).getDeclaredField((String) "MONTHLY");
        ((Field) term17706).setAccessible(true);
        Object enum35 = ((Field) term17706).get((Object) null);
        Class<? extends Object> term18110 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term18109 = ((Class) term18110).getDeclaredField((String) "COMPLETE");
        ((Field) term18109).setAccessible(true);
        Object enum36 = ((Field) term18109).get((Object) null);
        Long term17702 = new Long(3452833434644634217L);
        term17660 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term17674 = newInstance(Class.forName("java.util.Date"));
        Object term17676 = newInstance(Class.forName("java.util.Date"));
        setField(term17660, term17660.getClass(), "id", term17661);
        setField(term17660, term17660.getClass(), "frequency", enum35);
        setLongField(term17674, term17674.getClass(), "fastTime", 1570714321079L);
        setField(term17674, term17674.getClass(), "cdate", null);
        setField(term17660, term17660.getClass(), "repeatUntilDate", term17674);
        setLongField(term17676, term17676.getClass(), "fastTime", 1531331402053L);
        setField(term17676, term17676.getClass(), "cdate", null);
        setField(term17660, term17660.getClass(), "createDate", term17676);
        setField(term17660, term17660.getClass(), "lockUuid", "eVpkWxjuki");
        setField(term17660, term17660.getClass(), "dropScheduleStatus", enum36);
        setField(term17660, term17660.getClass(), "dropRequestId", term17702);
        term17704 = newInstance(Class.forName("java.util.Date"));
        setLongField(term17704, term17704.getClass(), "fastTime", 1264037800343L);
        setField(term17704, term17704.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term17704;
        callMethod(klass, "setCreateDate", argTypes, term17660, args);
    }

};


