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

public class DropScheduleEnt_DropScheduleEntBuilder_dropRequestId_19077771727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248256;
     Object term248300;

    public DropScheduleEnt_DropScheduleEntBuilder_dropRequestId_19077771727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term248257 = new Long(5817794709356277010L);
        Class<? extends Object> term248303 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term248302 = ((Class) term248303).getDeclaredField((String) "MONTHLY");
        ((Field) term248302).setAccessible(true);
        Object enum435 = ((Field) term248302).get((Object) null);
        Class<? extends Object> term248706 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term248705 = ((Class) term248706).getDeclaredField((String) "COMPLETE");
        ((Field) term248705).setAccessible(true);
        Object enum436 = ((Field) term248705).get((Object) null);
        Long term248298 = new Long(-205762347192500511L);
        term248256 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder"));
        Object term248270 = newInstance(Class.forName("java.util.Date"));
        Object term248272 = newInstance(Class.forName("java.util.Date"));
        setField(term248256, term248256.getClass(), "id", term248257);
        setField(term248256, term248256.getClass(), "frequency", enum435);
        setLongField(term248270, term248270.getClass(), "fastTime", 1837854973493L);
        setField(term248270, term248270.getClass(), "cdate", null);
        setField(term248256, term248256.getClass(), "repeatUntilDate", term248270);
        setLongField(term248272, term248272.getClass(), "fastTime", 1391602026527L);
        setField(term248272, term248272.getClass(), "cdate", null);
        setField(term248256, term248256.getClass(), "createDate", term248272);
        setField(term248256, term248256.getClass(), "lockUuid", "VwpicfUdWr");
        setField(term248256, term248256.getClass(), "dropScheduleStatus", enum436);
        setField(term248256, term248256.getClass(), "dropRequestId", term248298);
        term248300 = new Long(-4987344934532917085L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term248300;
        callMethod(klass, "dropRequestId", argTypes, term248256, args);
    }

};


