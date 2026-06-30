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

public class ScammerAddress_ScammerAddressBuilder_type_15384230825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606234;

    public ScammerAddress_ScammerAddressBuilder_type_15384230825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term606235 = new Long(-6445063982585716818L);
        term606234 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress$ScammerAddressBuilder"));
        Object term606249 = newInstance(Class.forName("java.util.Date"));
        Object term606251 = newInstance(Class.forName("java.util.Date"));
        setField(term606234, term606234.getClass(), "id", term606235);
        setField(term606234, term606234.getClass(), "account", "NAeiHxWYxI");
        setLongField(term606249, term606249.getClass(), "fastTime", 1405703267378L);
        setField(term606249, term606249.getClass(), "cdate", null);
        setField(term606234, term606234.getClass(), "createDate", term606249);
        setLongField(term606251, term606251.getClass(), "fastTime", 1858805743397L);
        setField(term606251, term606251.getClass(), "cdate", null);
        setField(term606234, term606234.getClass(), "updateDate", term606251);
        setField(term606234, term606234.getClass(), "type", "qSfOhoIMpr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress$ScammerAddressBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bAowmWKEGP";
        callMethod(klass, "type", argTypes, term606234, args);
    }

};


