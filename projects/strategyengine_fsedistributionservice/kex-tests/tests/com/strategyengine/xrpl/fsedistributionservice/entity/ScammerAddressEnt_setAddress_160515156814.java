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
import java.lang.Object;

public class ScammerAddressEnt_setAddress_160515156814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239506;

    public ScammerAddressEnt_setAddress_160515156814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239507 = new Long(7440648013789140935L);
        term239506 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt"));
        Object term239521 = newInstance(Class.forName("java.util.Date"));
        Object term239523 = newInstance(Class.forName("java.util.Date"));
        setField(term239506, term239506.getClass(), "id", term239507);
        setField(term239506, term239506.getClass(), "address", "XEdoshuvxD");
        setLongField(term239521, term239521.getClass(), "fastTime", 1662200363293L);
        setField(term239521, term239521.getClass(), "cdate", null);
        setField(term239506, term239506.getClass(), "createDate", term239521);
        setLongField(term239523, term239523.getClass(), "fastTime", 1766045265437L);
        setField(term239523, term239523.getClass(), "cdate", null);
        setField(term239506, term239506.getClass(), "updateDate", term239523);
        setField(term239506, term239506.getClass(), "type", "ljtopXMcRl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HHtcAGkfuz";
        callMethod(klass, "setAddress", argTypes, term239506, args);
    }

};


