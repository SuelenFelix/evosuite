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

public class DropScheduleEnt_DropScheduleEntBuilder_toString_14386914489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249998;

    public DropScheduleEnt_DropScheduleEntBuilder_toString_14386914489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term249999 = new Long(-4069312743655862444L);
        Class<? extends Object> term250044 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term250043 = ((Class) term250044).getDeclaredField((String) "ANNUALLY");
        ((Field) term250043).setAccessible(true);
        Object enum439 = ((Field) term250043).get((Object) null);
        Class<? extends Object> term250450 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term250449 = ((Class) term250450).getDeclaredField((String) "REJECTED");
        ((Field) term250449).setAccessible(true);
        Object enum440 = ((Field) term250449).get((Object) null);
        Long term250041 = new Long(3233502115953753827L);
        term249998 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder"));
        Object term250013 = newInstance(Class.forName("java.util.Date"));
        Object term250015 = newInstance(Class.forName("java.util.Date"));
        setField(term249998, term249998.getClass(), "id", term249999);
        setField(term249998, term249998.getClass(), "frequency", enum439);
        setLongField(term250013, term250013.getClass(), "fastTime", 1838376511046L);
        setField(term250013, term250013.getClass(), "cdate", null);
        setField(term249998, term249998.getClass(), "repeatUntilDate", term250013);
        setLongField(term250015, term250015.getClass(), "fastTime", 1804062451288L);
        setField(term250015, term250015.getClass(), "cdate", null);
        setField(term249998, term249998.getClass(), "createDate", term250015);
        setField(term249998, term249998.getClass(), "lockUuid", "bNeNAYRdqb");
        setField(term249998, term249998.getClass(), "dropScheduleStatus", enum440);
        setField(term249998, term249998.getClass(), "dropRequestId", term250041);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term249998, args);
    }

};


