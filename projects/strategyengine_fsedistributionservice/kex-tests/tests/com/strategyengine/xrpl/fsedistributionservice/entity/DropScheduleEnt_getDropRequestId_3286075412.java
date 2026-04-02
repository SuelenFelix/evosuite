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

public class DropScheduleEnt_getDropRequestId_3286075412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12937;

    public DropScheduleEnt_getDropRequestId_3286075412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12938 = new Long(8034714140377562739L);
        Class<? extends Object> term12981 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term12980 = ((Class) term12981).getDeclaredField((String) "ANNUALLY");
        ((Field) term12980).setAccessible(true);
        Object enum24 = ((Field) term12980).get((Object) null);
        Class<? extends Object> term13387 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term13386 = ((Class) term13387).getDeclaredField((String) "ACTIVE");
        ((Field) term13386).setAccessible(true);
        Object enum25 = ((Field) term13386).get((Object) null);
        Long term12978 = new Long(-2924531382671518368L);
        term12937 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term12952 = newInstance(Class.forName("java.util.Date"));
        Object term12954 = newInstance(Class.forName("java.util.Date"));
        setField(term12937, term12937.getClass(), "id", term12938);
        setField(term12937, term12937.getClass(), "frequency", enum24);
        setLongField(term12952, term12952.getClass(), "fastTime", 1276505397937L);
        setField(term12952, term12952.getClass(), "cdate", null);
        setField(term12937, term12937.getClass(), "repeatUntilDate", term12952);
        setLongField(term12954, term12954.getClass(), "fastTime", 1278177575793L);
        setField(term12954, term12954.getClass(), "cdate", null);
        setField(term12937, term12937.getClass(), "createDate", term12954);
        setField(term12937, term12937.getClass(), "lockUuid", "qxSDVejjiY");
        setField(term12937, term12937.getClass(), "dropScheduleStatus", enum25);
        setField(term12937, term12937.getClass(), "dropRequestId", term12978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDropRequestId", argTypes, term12937, args);
    }

};


