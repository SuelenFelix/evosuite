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

public class ScammerAddressEnt_ScammerAddressEntBuilder_toString_11104344567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236345;

    public ScammerAddressEnt_ScammerAddressEntBuilder_toString_11104344567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term236346 = new Long(-4561371668792438386L);
        term236345 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt$ScammerAddressEntBuilder"));
        Object term236360 = newInstance(Class.forName("java.util.Date"));
        Object term236362 = newInstance(Class.forName("java.util.Date"));
        setField(term236345, term236345.getClass(), "id", term236346);
        setField(term236345, term236345.getClass(), "address", "WjUrdNMIOj");
        setLongField(term236360, term236360.getClass(), "fastTime", 1496618165193L);
        setField(term236360, term236360.getClass(), "cdate", null);
        setField(term236345, term236345.getClass(), "createDate", term236360);
        setLongField(term236362, term236362.getClass(), "fastTime", 1710813940014L);
        setField(term236362, term236362.getClass(), "cdate", null);
        setField(term236345, term236345.getClass(), "updateDate", term236362);
        setField(term236345, term236345.getClass(), "type", "aQUpwHjYvS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt$ScammerAddressEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term236345, args);
    }

};


