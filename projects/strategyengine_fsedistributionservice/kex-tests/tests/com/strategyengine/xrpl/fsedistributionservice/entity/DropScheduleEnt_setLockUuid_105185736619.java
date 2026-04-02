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

public class DropScheduleEnt_setLockUuid_105185736619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18530;

    public DropScheduleEnt_setLockUuid_105185736619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18531 = new Long(-8603648071751666348L);
        Class<? extends Object> term18584 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term18583 = ((Class) term18584).getDeclaredField((String) "WEEKLY");
        ((Field) term18583).setAccessible(true);
        Object enum37 = ((Field) term18583).get((Object) null);
        Class<? extends Object> term18984 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term18983 = ((Class) term18984).getDeclaredField((String) "ACTIVE");
        ((Field) term18983).setAccessible(true);
        Object enum38 = ((Field) term18983).get((Object) null);
        Long term18569 = new Long(-7884871963229073324L);
        term18530 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term18543 = newInstance(Class.forName("java.util.Date"));
        Object term18545 = newInstance(Class.forName("java.util.Date"));
        setField(term18530, term18530.getClass(), "id", term18531);
        setField(term18530, term18530.getClass(), "frequency", enum37);
        setLongField(term18543, term18543.getClass(), "fastTime", 1450865259896L);
        setField(term18543, term18543.getClass(), "cdate", null);
        setField(term18530, term18530.getClass(), "repeatUntilDate", term18543);
        setLongField(term18545, term18545.getClass(), "fastTime", 1467783054847L);
        setField(term18545, term18545.getClass(), "cdate", null);
        setField(term18530, term18530.getClass(), "createDate", term18545);
        setField(term18530, term18530.getClass(), "lockUuid", "SJiQaLvSKv");
        setField(term18530, term18530.getClass(), "dropScheduleStatus", enum38);
        setField(term18530, term18530.getClass(), "dropRequestId", term18569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OEXDRUKcFl";
        callMethod(klass, "setLockUuid", argTypes, term18530, args);
    }

};


