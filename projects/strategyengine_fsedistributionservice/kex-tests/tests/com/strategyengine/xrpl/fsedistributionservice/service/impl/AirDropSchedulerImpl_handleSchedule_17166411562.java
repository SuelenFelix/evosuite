package com.strategyengine.xrpl.fsedistributionservice.service.impl;

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
import static com.strategyengine.xrpl.fsedistributionservice.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class AirDropSchedulerImpl_handleSchedule_17166411562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16040;

    public AirDropSchedulerImpl_handleSchedule_17166411562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16041 = new Long(-2850532706972744550L);
        Class<? extends Object> term16083 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term16082 = ((Class) term16083).getDeclaredField((String) "DAILY");
        ((Field) term16082).setAccessible(true);
        Object enum27 = ((Field) term16082).get((Object) null);
        Class<? extends Object> term16514 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term16513 = ((Class) term16514).getDeclaredField((String) "COMPLETE");
        ((Field) term16513).setAccessible(true);
        Object enum28 = ((Field) term16513).get((Object) null);
        Long term16080 = new Long(-2644215923136513282L);
        term16040 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term16052 = newInstance(Class.forName("java.util.Date"));
        Object term16054 = newInstance(Class.forName("java.util.Date"));
        setField(term16040, term16040.getClass(), "id", term16041);
        setField(term16040, term16040.getClass(), "frequency", enum27);
        setLongField(term16052, term16052.getClass(), "fastTime", 1304532099366L);
        setField(term16052, term16052.getClass(), "cdate", null);
        setField(term16040, term16040.getClass(), "repeatUntilDate", term16052);
        setLongField(term16054, term16054.getClass(), "fastTime", 1488725902101L);
        setField(term16054, term16054.getClass(), "cdate", null);
        setField(term16040, term16040.getClass(), "createDate", term16054);
        setField(term16040, term16040.getClass(), "lockUuid", "MHGKyEnwKc");
        setField(term16040, term16040.getClass(), "dropScheduleStatus", enum28);
        setField(term16040, term16040.getClass(), "dropRequestId", term16080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.AirDropSchedulerImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Object[] args = new Object[1];
        args[0] = term16040;
        callMethod(klass, "handleSchedule", argTypes, null, args);
    }

};


