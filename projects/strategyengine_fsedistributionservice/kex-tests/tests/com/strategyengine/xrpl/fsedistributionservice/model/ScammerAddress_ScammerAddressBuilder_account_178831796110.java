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

public class ScammerAddress_ScammerAddressBuilder_account_178831796110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606410;

    public ScammerAddress_ScammerAddressBuilder_account_178831796110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term606410 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress$ScammerAddressBuilder"));
        setField(term606410, term606410.getClass(), "id", null);
        setField(term606410, term606410.getClass(), "account", null);
        setField(term606410, term606410.getClass(), "createDate", null);
        setField(term606410, term606410.getClass(), "updateDate", null);
        setField(term606410, term606410.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress$ScammerAddressBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "account", argTypes, term606410, args);
    }

};


