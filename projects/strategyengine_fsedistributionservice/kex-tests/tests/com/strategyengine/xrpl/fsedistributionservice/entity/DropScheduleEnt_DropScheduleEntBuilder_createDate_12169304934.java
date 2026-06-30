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

public class DropScheduleEnt_DropScheduleEntBuilder_createDate_12169304934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245664;
     Object term245707;

    public DropScheduleEnt_DropScheduleEntBuilder_createDate_12169304934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term245665 = new Long(7429946509853918683L);
        Class<? extends Object> term245710 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term245709 = ((Class) term245710).getDeclaredField((String) "WEEKLY");
        ((Field) term245709).setAccessible(true);
        Object enum429 = ((Field) term245709).get((Object) null);
        Class<? extends Object> term246110 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term246109 = ((Class) term246110).getDeclaredField((String) "COMPLETE");
        ((Field) term246109).setAccessible(true);
        Object enum430 = ((Field) term246109).get((Object) null);
        Long term245705 = new Long(-7148236042086608592L);
        term245664 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder"));
        Object term245677 = newInstance(Class.forName("java.util.Date"));
        Object term245679 = newInstance(Class.forName("java.util.Date"));
        setField(term245664, term245664.getClass(), "id", term245665);
        setField(term245664, term245664.getClass(), "frequency", enum429);
        setLongField(term245677, term245677.getClass(), "fastTime", 1576191814059L);
        setField(term245677, term245677.getClass(), "cdate", null);
        setField(term245664, term245664.getClass(), "repeatUntilDate", term245677);
        setLongField(term245679, term245679.getClass(), "fastTime", 1782487642199L);
        setField(term245679, term245679.getClass(), "cdate", null);
        setField(term245664, term245664.getClass(), "createDate", term245679);
        setField(term245664, term245664.getClass(), "lockUuid", "YPVZjrbvVl");
        setField(term245664, term245664.getClass(), "dropScheduleStatus", enum430);
        setField(term245664, term245664.getClass(), "dropRequestId", term245705);
        term245707 = newInstance(Class.forName("java.util.Date"));
        setLongField(term245707, term245707.getClass(), "fastTime", 1372540799326L);
        setField(term245707, term245707.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term245707;
        callMethod(klass, "createDate", argTypes, term245664, args);
    }

};


