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

public class DropScheduleEnt_DropScheduleEntBuilder_dropScheduleStatus_20055085846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247404;
     Object enum434;

    public DropScheduleEnt_DropScheduleEntBuilder_dropScheduleStatus_20055085846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term247405 = new Long(1729206737148270563L);
        Class<? extends Object> term247445 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term247444 = ((Class) term247445).getDeclaredField((String) "DAILY");
        ((Field) term247444).setAccessible(true);
        Object enum433 = ((Field) term247444).get((Object) null);
        Class<? extends Object> term247842 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term247841 = ((Class) term247842).getDeclaredField((String) "ACTIVE");
        ((Field) term247841).setAccessible(true);
        enum434 = ((Field) term247841).get((Object) null);
        Long term247442 = new Long(-932981811228171529L);
        term247404 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder"));
        Object term247416 = newInstance(Class.forName("java.util.Date"));
        Object term247418 = newInstance(Class.forName("java.util.Date"));
        setField(term247404, term247404.getClass(), "id", term247405);
        setField(term247404, term247404.getClass(), "frequency", enum433);
        setLongField(term247416, term247416.getClass(), "fastTime", 1321552128063L);
        setField(term247416, term247416.getClass(), "cdate", null);
        setField(term247404, term247404.getClass(), "repeatUntilDate", term247416);
        setLongField(term247418, term247418.getClass(), "fastTime", 1681108752090L);
        setField(term247418, term247418.getClass(), "cdate", null);
        setField(term247404, term247404.getClass(), "createDate", term247418);
        setField(term247404, term247404.getClass(), "lockUuid", "PjZoebHrvq");
        setField(term247404, term247404.getClass(), "dropScheduleStatus", enum434);
        setField(term247404, term247404.getClass(), "dropRequestId", term247442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Object[] args = new Object[1];
        args[0] = enum434;
        callMethod(klass, "dropScheduleStatus", argTypes, term247404, args);
    }

};


