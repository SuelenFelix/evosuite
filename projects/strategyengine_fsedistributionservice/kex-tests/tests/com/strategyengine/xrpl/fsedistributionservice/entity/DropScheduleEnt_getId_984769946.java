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

public class DropScheduleEnt_getId_984769946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7757;

    public DropScheduleEnt_getId_984769946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7758 = new Long(-6432617521836576658L);
        Class<? extends Object> term7803 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term7802 = ((Class) term7803).getDeclaredField((String) "ANNUALLY");
        ((Field) term7802).setAccessible(true);
        Object enum12 = ((Field) term7802).get((Object) null);
        Class<? extends Object> term8209 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term8208 = ((Class) term8209).getDeclaredField((String) "COMPLETE");
        ((Field) term8208).setAccessible(true);
        Object enum13 = ((Field) term8208).get((Object) null);
        Long term7800 = new Long(-2255965562447970862L);
        term7757 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term7772 = newInstance(Class.forName("java.util.Date"));
        Object term7774 = newInstance(Class.forName("java.util.Date"));
        setField(term7757, term7757.getClass(), "id", term7758);
        setField(term7757, term7757.getClass(), "frequency", enum12);
        setLongField(term7772, term7772.getClass(), "fastTime", 1802995433545L);
        setField(term7772, term7772.getClass(), "cdate", null);
        setField(term7757, term7757.getClass(), "repeatUntilDate", term7772);
        setLongField(term7774, term7774.getClass(), "fastTime", 1843214817357L);
        setField(term7774, term7774.getClass(), "cdate", null);
        setField(term7757, term7757.getClass(), "createDate", term7774);
        setField(term7757, term7757.getClass(), "lockUuid", "BKLfkLiZTH");
        setField(term7757, term7757.getClass(), "dropScheduleStatus", enum13);
        setField(term7757, term7757.getClass(), "dropRequestId", term7800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term7757, args);
    }

};


