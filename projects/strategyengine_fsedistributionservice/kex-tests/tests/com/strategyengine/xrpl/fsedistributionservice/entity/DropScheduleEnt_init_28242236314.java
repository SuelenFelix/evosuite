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

public class DropScheduleEnt_init_28242236314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13801;
     Object enum26;
     Object term13813;
     Object term13815;
     Object enum27;
     Object term13841;

    public DropScheduleEnt_init_28242236314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13801 = new Long(-3948863953565024517L);
        Class<? extends Object> term13844 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term13843 = ((Class) term13844).getDeclaredField((String) "WEEKLY");
        ((Field) term13843).setAccessible(true);
        enum26 = ((Field) term13843).get((Object) null);
        term13813 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13813, term13813.getClass(), "fastTime", 1272776321768L);
        setField(term13813, term13813.getClass(), "cdate", null);
        term13815 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13815, term13815.getClass(), "fastTime", 1597352397295L);
        setField(term13815, term13815.getClass(), "cdate", null);
        Class<? extends Object> term14244 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term14243 = ((Class) term14244).getDeclaredField((String) "COMPLETE");
        ((Field) term14243).setAccessible(true);
        enum27 = ((Field) term14243).get((Object) null);
        term13841 = new Long(-6587807377747738663L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        argTypes[2] = Class.forName("java.util.Date");
        argTypes[3] = Class.forName("java.util.Date");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        argTypes[6] = Class.forName("java.lang.Long");
        Object[] args = new Object[7];
        args[0] = term13801;
        args[1] = enum26;
        args[2] = term13813;
        args[3] = term13815;
        args[4] = "xBsXSDjXYK";
        args[5] = enum27;
        args[6] = term13841;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


