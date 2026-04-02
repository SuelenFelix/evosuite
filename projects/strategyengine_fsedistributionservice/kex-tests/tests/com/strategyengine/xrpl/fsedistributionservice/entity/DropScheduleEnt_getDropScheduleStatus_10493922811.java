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

public class DropScheduleEnt_getDropScheduleStatus_10493922811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12073;

    public DropScheduleEnt_getDropScheduleStatus_10493922811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12074 = new Long(4513004407927379358L);
        Class<? extends Object> term12117 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term12116 = ((Class) term12117).getDeclaredField((String) "WEEKLY");
        ((Field) term12116).setAccessible(true);
        Object enum22 = ((Field) term12116).get((Object) null);
        Class<? extends Object> term12517 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term12516 = ((Class) term12517).getDeclaredField((String) "COMPLETE");
        ((Field) term12516).setAccessible(true);
        Object enum23 = ((Field) term12516).get((Object) null);
        Long term12114 = new Long(-7115418542247301000L);
        term12073 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term12086 = newInstance(Class.forName("java.util.Date"));
        Object term12088 = newInstance(Class.forName("java.util.Date"));
        setField(term12073, term12073.getClass(), "id", term12074);
        setField(term12073, term12073.getClass(), "frequency", enum22);
        setLongField(term12086, term12086.getClass(), "fastTime", 1332871705432L);
        setField(term12086, term12086.getClass(), "cdate", null);
        setField(term12073, term12073.getClass(), "repeatUntilDate", term12086);
        setLongField(term12088, term12088.getClass(), "fastTime", 1597233967116L);
        setField(term12088, term12088.getClass(), "cdate", null);
        setField(term12073, term12073.getClass(), "createDate", term12088);
        setField(term12073, term12073.getClass(), "lockUuid", "QXzGXbEXMu");
        setField(term12073, term12073.getClass(), "dropScheduleStatus", enum23);
        setField(term12073, term12073.getClass(), "dropRequestId", term12114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDropScheduleStatus", argTypes, term12073, args);
    }

};


