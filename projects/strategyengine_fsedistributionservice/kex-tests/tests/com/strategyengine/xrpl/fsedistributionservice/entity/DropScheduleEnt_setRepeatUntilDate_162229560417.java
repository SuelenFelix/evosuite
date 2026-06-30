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

public class DropScheduleEnt_setRepeatUntilDate_162229560417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16790;
     Object term16834;

    public DropScheduleEnt_setRepeatUntilDate_162229560417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16791 = new Long(-1333707622307134180L);
        Class<? extends Object> term16837 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term16836 = ((Class) term16837).getDeclaredField((String) "MONTHLY");
        ((Field) term16836).setAccessible(true);
        Object enum33 = ((Field) term16836).get((Object) null);
        Class<? extends Object> term17240 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term17239 = ((Class) term17240).getDeclaredField((String) "COMPLETE");
        ((Field) term17239).setAccessible(true);
        Object enum34 = ((Field) term17239).get((Object) null);
        Long term16832 = new Long(-4360569253593381888L);
        term16790 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term16804 = newInstance(Class.forName("java.util.Date"));
        Object term16806 = newInstance(Class.forName("java.util.Date"));
        setField(term16790, term16790.getClass(), "id", term16791);
        setField(term16790, term16790.getClass(), "frequency", enum33);
        setLongField(term16804, term16804.getClass(), "fastTime", 1285661498273L);
        setField(term16804, term16804.getClass(), "cdate", null);
        setField(term16790, term16790.getClass(), "repeatUntilDate", term16804);
        setLongField(term16806, term16806.getClass(), "fastTime", 1643981113575L);
        setField(term16806, term16806.getClass(), "cdate", null);
        setField(term16790, term16790.getClass(), "createDate", term16806);
        setField(term16790, term16790.getClass(), "lockUuid", "fztQhjqwdP");
        setField(term16790, term16790.getClass(), "dropScheduleStatus", enum34);
        setField(term16790, term16790.getClass(), "dropRequestId", term16832);
        term16834 = newInstance(Class.forName("java.util.Date"));
        setLongField(term16834, term16834.getClass(), "fastTime", 1689428810999L);
        setField(term16834, term16834.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term16834;
        callMethod(klass, "setRepeatUntilDate", argTypes, term16790, args);
    }

};


