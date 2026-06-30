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

public class ScammerAddress_ScammerAddressBuilder_id_14802561081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606002;
     Object term606033;

    public ScammerAddress_ScammerAddressBuilder_id_14802561081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term606003 = new Long(-447638576776090708L);
        term606002 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress$ScammerAddressBuilder"));
        Object term606017 = newInstance(Class.forName("java.util.Date"));
        Object term606019 = newInstance(Class.forName("java.util.Date"));
        setField(term606002, term606002.getClass(), "id", term606003);
        setField(term606002, term606002.getClass(), "account", "hOUYxUxiHr");
        setLongField(term606017, term606017.getClass(), "fastTime", 1507636607552L);
        setField(term606017, term606017.getClass(), "cdate", null);
        setField(term606002, term606002.getClass(), "createDate", term606017);
        setLongField(term606019, term606019.getClass(), "fastTime", 1558289740119L);
        setField(term606019, term606019.getClass(), "cdate", null);
        setField(term606002, term606002.getClass(), "updateDate", term606019);
        setField(term606002, term606002.getClass(), "type", "enxtAKeukF");
        term606033 = new Long(-3876284999950409934L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress$ScammerAddressBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term606033;
        callMethod(klass, "id", argTypes, term606002, args);
    }

};


