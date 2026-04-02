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

public class DropScheduleEnt_equals_4250385392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4307;
     Object term4350;

    public DropScheduleEnt_equals_4250385392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4308 = new Long(2297097306706899827L);
        Class<? extends Object> term4352 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term4351 = ((Class) term4352).getDeclaredField((String) "WEEKLY");
        ((Field) term4351).setAccessible(true);
        Object enum4 = ((Field) term4351).get((Object) null);
        Class<? extends Object> term4752 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term4751 = ((Class) term4752).getDeclaredField((String) "REJECTED");
        ((Field) term4751).setAccessible(true);
        Object enum5 = ((Field) term4751).get((Object) null);
        Long term4348 = new Long(-900457279156388404L);
        term4307 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term4320 = newInstance(Class.forName("java.util.Date"));
        Object term4322 = newInstance(Class.forName("java.util.Date"));
        setField(term4307, term4307.getClass(), "id", term4308);
        setField(term4307, term4307.getClass(), "frequency", enum4);
        setLongField(term4320, term4320.getClass(), "fastTime", 1819191638549L);
        setField(term4320, term4320.getClass(), "cdate", null);
        setField(term4307, term4307.getClass(), "repeatUntilDate", term4320);
        setLongField(term4322, term4322.getClass(), "fastTime", 1400691778698L);
        setField(term4322, term4322.getClass(), "cdate", null);
        setField(term4307, term4307.getClass(), "createDate", term4322);
        setField(term4307, term4307.getClass(), "lockUuid", "DfISiziTgG");
        setField(term4307, term4307.getClass(), "dropScheduleStatus", enum5);
        setField(term4307, term4307.getClass(), "dropRequestId", term4348);
        term4350 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4350;
        callMethod(klass, "equals", argTypes, term4307, args);
    }

};


