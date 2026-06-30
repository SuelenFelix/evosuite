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

public class ScammerAddressEnt_toString_9683327385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239097;

    public ScammerAddressEnt_toString_9683327385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239098 = new Long(-2922851649897789783L);
        term239097 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt"));
        Object term239112 = newInstance(Class.forName("java.util.Date"));
        Object term239114 = newInstance(Class.forName("java.util.Date"));
        setField(term239097, term239097.getClass(), "id", term239098);
        setField(term239097, term239097.getClass(), "address", "OutjKNDSgR");
        setLongField(term239112, term239112.getClass(), "fastTime", 1873249572660L);
        setField(term239112, term239112.getClass(), "cdate", null);
        setField(term239097, term239097.getClass(), "createDate", term239112);
        setLongField(term239114, term239114.getClass(), "fastTime", 1501084582011L);
        setField(term239114, term239114.getClass(), "cdate", null);
        setField(term239097, term239097.getClass(), "updateDate", term239114);
        setField(term239097, term239097.getClass(), "type", "brfLLGXcwA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term239097, args);
    }

};


