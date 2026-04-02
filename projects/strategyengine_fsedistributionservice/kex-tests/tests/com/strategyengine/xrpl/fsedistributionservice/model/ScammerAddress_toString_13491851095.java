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

public class ScammerAddress_toString_13491851095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567023;

    public ScammerAddress_toString_13491851095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term567024 = new Long(915665059113544268L);
        term567023 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress"));
        Object term567038 = newInstance(Class.forName("java.util.Date"));
        Object term567040 = newInstance(Class.forName("java.util.Date"));
        setField(term567023, term567023.getClass(), "id", term567024);
        setField(term567023, term567023.getClass(), "account", "GpEbHHguTm");
        setLongField(term567038, term567038.getClass(), "fastTime", 1482247217362L);
        setField(term567038, term567038.getClass(), "cdate", null);
        setField(term567023, term567023.getClass(), "createDate", term567038);
        setLongField(term567040, term567040.getClass(), "fastTime", 1577662220966L);
        setField(term567040, term567040.getClass(), "cdate", null);
        setField(term567023, term567023.getClass(), "updateDate", term567040);
        setField(term567023, term567023.getClass(), "type", "vtSiSVFRIe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term567023, args);
    }

};


