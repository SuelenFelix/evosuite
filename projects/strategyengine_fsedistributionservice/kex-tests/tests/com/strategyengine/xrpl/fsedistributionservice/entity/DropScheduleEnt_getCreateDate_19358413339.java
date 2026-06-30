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

public class DropScheduleEnt_getCreateDate_19358413339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10357;

    public DropScheduleEnt_getCreateDate_19358413339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10358 = new Long(855932984568615096L);
        Class<? extends Object> term10399 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term10398 = ((Class) term10399).getDeclaredField((String) "WEEKLY");
        ((Field) term10398).setAccessible(true);
        Object enum18 = ((Field) term10398).get((Object) null);
        Class<? extends Object> term10799 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term10798 = ((Class) term10799).getDeclaredField((String) "ACTIVE");
        ((Field) term10798).setAccessible(true);
        Object enum19 = ((Field) term10798).get((Object) null);
        Long term10396 = new Long(-1616722610139554082L);
        term10357 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term10370 = newInstance(Class.forName("java.util.Date"));
        Object term10372 = newInstance(Class.forName("java.util.Date"));
        setField(term10357, term10357.getClass(), "id", term10358);
        setField(term10357, term10357.getClass(), "frequency", enum18);
        setLongField(term10370, term10370.getClass(), "fastTime", 1466008719289L);
        setField(term10370, term10370.getClass(), "cdate", null);
        setField(term10357, term10357.getClass(), "repeatUntilDate", term10370);
        setLongField(term10372, term10372.getClass(), "fastTime", 1535838449065L);
        setField(term10372, term10372.getClass(), "cdate", null);
        setField(term10357, term10357.getClass(), "createDate", term10372);
        setField(term10357, term10357.getClass(), "lockUuid", "AWRooQKkdW");
        setField(term10357, term10357.getClass(), "dropScheduleStatus", enum19);
        setField(term10357, term10357.getClass(), "dropRequestId", term10396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateDate", argTypes, term10357, args);
    }

};


