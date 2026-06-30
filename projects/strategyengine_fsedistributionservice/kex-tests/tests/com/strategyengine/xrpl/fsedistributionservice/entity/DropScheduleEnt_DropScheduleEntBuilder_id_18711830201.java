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

public class DropScheduleEnt_DropScheduleEntBuilder_id_18711830201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242656;
     Object term242699;

    public DropScheduleEnt_DropScheduleEntBuilder_id_18711830201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term242657 = new Long(-3355167737637002830L);
        Class<? extends Object> term242702 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term242701 = ((Class) term242702).getDeclaredField((String) "ANNUALLY");
        ((Field) term242701).setAccessible(true);
        Object enum422 = ((Field) term242701).get((Object) null);
        Class<? extends Object> term243108 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term243107 = ((Class) term243108).getDeclaredField((String) "ACTIVE");
        ((Field) term243107).setAccessible(true);
        Object enum423 = ((Field) term243107).get((Object) null);
        Long term242697 = new Long(-8854988339892073229L);
        term242656 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder"));
        Object term242671 = newInstance(Class.forName("java.util.Date"));
        Object term242673 = newInstance(Class.forName("java.util.Date"));
        setField(term242656, term242656.getClass(), "id", term242657);
        setField(term242656, term242656.getClass(), "frequency", enum422);
        setLongField(term242671, term242671.getClass(), "fastTime", 1285430389159L);
        setField(term242671, term242671.getClass(), "cdate", null);
        setField(term242656, term242656.getClass(), "repeatUntilDate", term242671);
        setLongField(term242673, term242673.getClass(), "fastTime", 1671688617204L);
        setField(term242673, term242673.getClass(), "cdate", null);
        setField(term242656, term242656.getClass(), "createDate", term242673);
        setField(term242656, term242656.getClass(), "lockUuid", "fmWYICGnwt");
        setField(term242656, term242656.getClass(), "dropScheduleStatus", enum423);
        setField(term242656, term242656.getClass(), "dropRequestId", term242697);
        term242699 = new Long(2769081086274438111L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term242699;
        callMethod(klass, "id", argTypes, term242656, args);
    }

};


