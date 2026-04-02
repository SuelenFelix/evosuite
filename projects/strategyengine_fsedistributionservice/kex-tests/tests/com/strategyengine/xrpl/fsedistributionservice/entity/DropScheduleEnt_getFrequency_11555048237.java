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

public class DropScheduleEnt_getFrequency_11555048237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8629;

    public DropScheduleEnt_getFrequency_11555048237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8630 = new Long(148047808219672941L);
        Class<? extends Object> term8674 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term8673 = ((Class) term8674).getDeclaredField((String) "MONTHLY");
        ((Field) term8673).setAccessible(true);
        Object enum14 = ((Field) term8673).get((Object) null);
        Class<? extends Object> term9077 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term9076 = ((Class) term9077).getDeclaredField((String) "REJECTED");
        ((Field) term9076).setAccessible(true);
        Object enum15 = ((Field) term9076).get((Object) null);
        Long term8671 = new Long(7489064039921396098L);
        term8629 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term8643 = newInstance(Class.forName("java.util.Date"));
        Object term8645 = newInstance(Class.forName("java.util.Date"));
        setField(term8629, term8629.getClass(), "id", term8630);
        setField(term8629, term8629.getClass(), "frequency", enum14);
        setLongField(term8643, term8643.getClass(), "fastTime", 1628695316832L);
        setField(term8643, term8643.getClass(), "cdate", null);
        setField(term8629, term8629.getClass(), "repeatUntilDate", term8643);
        setLongField(term8645, term8645.getClass(), "fastTime", 1393200035243L);
        setField(term8645, term8645.getClass(), "cdate", null);
        setField(term8629, term8629.getClass(), "createDate", term8645);
        setField(term8629, term8629.getClass(), "lockUuid", "SPpkrGcPRr");
        setField(term8629, term8629.getClass(), "dropScheduleStatus", enum15);
        setField(term8629, term8629.getClass(), "dropRequestId", term8671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrequency", argTypes, term8629, args);
    }

};


