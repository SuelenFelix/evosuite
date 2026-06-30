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

public class DropScheduleEnt_getRepeatUntilDate_18350665988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9497;

    public DropScheduleEnt_getRepeatUntilDate_18350665988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9498 = new Long(6843866297465638866L);
        Class<? extends Object> term9540 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term9539 = ((Class) term9540).getDeclaredField((String) "MONTHLY");
        ((Field) term9539).setAccessible(true);
        Object enum16 = ((Field) term9539).get((Object) null);
        Class<? extends Object> term9943 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term9942 = ((Class) term9943).getDeclaredField((String) "ACTIVE");
        ((Field) term9942).setAccessible(true);
        Object enum17 = ((Field) term9942).get((Object) null);
        Long term9537 = new Long(-4023935540989049732L);
        term9497 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term9511 = newInstance(Class.forName("java.util.Date"));
        Object term9513 = newInstance(Class.forName("java.util.Date"));
        setField(term9497, term9497.getClass(), "id", term9498);
        setField(term9497, term9497.getClass(), "frequency", enum16);
        setLongField(term9511, term9511.getClass(), "fastTime", 1762147441299L);
        setField(term9511, term9511.getClass(), "cdate", null);
        setField(term9497, term9497.getClass(), "repeatUntilDate", term9511);
        setLongField(term9513, term9513.getClass(), "fastTime", 1395479491666L);
        setField(term9513, term9513.getClass(), "cdate", null);
        setField(term9497, term9497.getClass(), "createDate", term9513);
        setField(term9497, term9497.getClass(), "lockUuid", "sEccwbJKYE");
        setField(term9497, term9497.getClass(), "dropScheduleStatus", enum17);
        setField(term9497, term9497.getClass(), "dropRequestId", term9537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRepeatUntilDate", argTypes, term9497, args);
    }

};


