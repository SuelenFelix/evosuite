package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class ScammerAddress_ScammerAddressBuilder_createDate_8260035813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606128;
     Object term606159;

    public ScammerAddress_ScammerAddressBuilder_createDate_8260035813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term606129 = new Long(1549908057368393138L);
        term606128 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress$ScammerAddressBuilder"));
        Object term606143 = newInstance(Class.forName("java.util.Date"));
        Object term606145 = newInstance(Class.forName("java.util.Date"));
        setField(term606128, term606128.getClass(), "id", term606129);
        setField(term606128, term606128.getClass(), "account", "UhFHtcXzAx");
        setLongField(term606143, term606143.getClass(), "fastTime", 1570166946483L);
        setField(term606143, term606143.getClass(), "cdate", null);
        setField(term606128, term606128.getClass(), "createDate", term606143);
        setLongField(term606145, term606145.getClass(), "fastTime", 1870495851805L);
        setField(term606145, term606145.getClass(), "cdate", null);
        setField(term606128, term606128.getClass(), "updateDate", term606145);
        setField(term606128, term606128.getClass(), "type", "cDCGHIFISc");
        term606159 = newInstance(Class.forName("java.util.Date"));
        setLongField(term606159, term606159.getClass(), "fastTime", 1881663596188L);
        setField(term606159, term606159.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress$ScammerAddressBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term606159;
        callMethod(klass, "createDate", argTypes, term606128, args);
    }

};


