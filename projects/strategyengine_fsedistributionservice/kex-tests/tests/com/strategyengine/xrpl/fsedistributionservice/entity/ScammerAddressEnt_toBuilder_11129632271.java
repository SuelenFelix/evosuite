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

public class ScammerAddressEnt_toBuilder_11129632271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238891;

    public ScammerAddressEnt_toBuilder_11129632271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238892 = new Long(-6900715686580158779L);
        term238891 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt"));
        Object term238906 = newInstance(Class.forName("java.util.Date"));
        Object term238908 = newInstance(Class.forName("java.util.Date"));
        setField(term238891, term238891.getClass(), "id", term238892);
        setField(term238891, term238891.getClass(), "address", "NACnGDmVPl");
        setLongField(term238906, term238906.getClass(), "fastTime", 1862854611939L);
        setField(term238906, term238906.getClass(), "cdate", null);
        setField(term238891, term238891.getClass(), "createDate", term238906);
        setLongField(term238908, term238908.getClass(), "fastTime", 1636361701604L);
        setField(term238908, term238908.getClass(), "cdate", null);
        setField(term238891, term238891.getClass(), "updateDate", term238908);
        setField(term238891, term238891.getClass(), "type", "SfWiFjkLGW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term238891, args);
    }

};


