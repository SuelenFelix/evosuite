package com.strategyengine.xrpl.fsedistributionservice.service.impl;

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
import static com.strategyengine.xrpl.fsedistributionservice.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class PaymentsChangeServiceImpl_validateDropRequestChange_5254393404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5054;

    public PaymentsChangeServiceImpl_validateDropRequestChange_5254393404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5054 = new Long(-2585684163342970173L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.PaymentsChangeServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term5054;
        args[1] = "whBvTVIIlC";
        callMethod(klass, "validateDropRequestChange", argTypes, null, args);
    }

};


