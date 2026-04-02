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

public class DropScheduleEnt_getLockUuid_165676749010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11213;

    public DropScheduleEnt_getLockUuid_165676749010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11214 = new Long(7495904023107549024L);
        Class<? extends Object> term11256 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term11255 = ((Class) term11256).getDeclaredField((String) "MONTHLY");
        ((Field) term11255).setAccessible(true);
        Object enum20 = ((Field) term11255).get((Object) null);
        Class<? extends Object> term11659 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term11658 = ((Class) term11659).getDeclaredField((String) "ACTIVE");
        ((Field) term11658).setAccessible(true);
        Object enum21 = ((Field) term11658).get((Object) null);
        Long term11253 = new Long(8802866251294305945L);
        term11213 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term11227 = newInstance(Class.forName("java.util.Date"));
        Object term11229 = newInstance(Class.forName("java.util.Date"));
        setField(term11213, term11213.getClass(), "id", term11214);
        setField(term11213, term11213.getClass(), "frequency", enum20);
        setLongField(term11227, term11227.getClass(), "fastTime", 1345923503543L);
        setField(term11227, term11227.getClass(), "cdate", null);
        setField(term11213, term11213.getClass(), "repeatUntilDate", term11227);
        setLongField(term11229, term11229.getClass(), "fastTime", 1838357779277L);
        setField(term11229, term11229.getClass(), "cdate", null);
        setField(term11213, term11213.getClass(), "createDate", term11229);
        setField(term11213, term11213.getClass(), "lockUuid", "vjxIhXHxGR");
        setField(term11213, term11213.getClass(), "dropScheduleStatus", enum21);
        setField(term11213, term11213.getClass(), "dropRequestId", term11253);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLockUuid", argTypes, term11213, args);
    }

};


