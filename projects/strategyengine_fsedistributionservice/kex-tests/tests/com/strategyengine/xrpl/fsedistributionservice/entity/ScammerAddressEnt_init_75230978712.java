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

public class ScammerAddressEnt_init_75230978712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239403;
     Object term239417;
     Object term239419;

    public ScammerAddressEnt_init_75230978712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239403 = new Long(2923644849350978175L);
        term239417 = newInstance(Class.forName("java.util.Date"));
        setLongField(term239417, term239417.getClass(), "fastTime", 1842605815206L);
        setField(term239417, term239417.getClass(), "cdate", null);
        term239419 = newInstance(Class.forName("java.util.Date"));
        setLongField(term239419, term239419.getClass(), "fastTime", 1425762525389L);
        setField(term239419, term239419.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.Date");
        argTypes[3] = Class.forName("java.util.Date");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term239403;
        args[1] = "OxlZVhvedR";
        args[2] = term239417;
        args[3] = term239419;
        args[4] = "eoDtSQyUsr";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


