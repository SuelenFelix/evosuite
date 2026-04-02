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
import java.lang.Integer;

public class DropRecipientEnt_init_11376468819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32227;
     Object term32241;
     Object term32243;
     Object enum63;
     Object term32279;
     Object term32281;

    public DropRecipientEnt_init_11376468819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32227 = new Long(-7310273014364148916L);
        term32241 = newInstance(Class.forName("java.util.Date"));
        setLongField(term32241, term32241.getClass(), "fastTime", 1456374715658L);
        setField(term32241, term32241.getClass(), "cdate", null);
        term32243 = newInstance(Class.forName("java.util.Date"));
        setLongField(term32243, term32243.getClass(), "fastTime", 1340909568660L);
        setField(term32243, term32243.getClass(), "cdate", null);
        Class<? extends Object> term32330 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term32329 = ((Class) term32330).getDeclaredField((String) "FAILED");
        ((Field) term32329).setAccessible(true);
        enum63 = ((Field) term32329).get((Object) null);
        term32279 = new Integer(-1456670397);
        term32281 = new Long(8863790908271299748L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[12];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.Date");
        argTypes[3] = Class.forName("java.util.Date");
        argTypes[4] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.Integer");
        argTypes[8] = Class.forName("java.lang.Long");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.String");
        Object[] args = new Object[12];
        args[0] = term32227;
        args[1] = "CFyoseFGLF";
        args[2] = term32241;
        args[3] = term32243;
        args[4] = enum63;
        args[5] = "SFqCrhEWLm";
        args[6] = "GZdcJyZntS";
        args[7] = term32279;
        args[8] = term32281;
        args[9] = "OIHoJeysUi";
        args[10] = "WXMWFDGcLB";
        args[11] = "wKWbJssZuG";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


