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
import java.lang.Integer;

public class FsePaymentTrustlinesMinTriggeredRequest_FsePaymentTrustlinesMinTriggeredRequestBuilder_minTrustLinesTriggerValue_15044936517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563815;
     Object term563817;

    public FsePaymentTrustlinesMinTriggeredRequest_FsePaymentTrustlinesMinTriggeredRequestBuilder_minTrustLinesTriggerValue_15044936517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563815 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest$FsePaymentTrustlinesMinTriggeredRequestBuilder"));
        setField(term563815, term563815.getClass(), "trustlinePaymentRequest", null);
        setIntField(term563815, term563815.getClass(), "minTrustLinesTriggerValue", 0);
        term563817 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest$FsePaymentTrustlinesMinTriggeredRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term563817;
        callMethod(klass, "minTrustLinesTriggerValue", argTypes, term563815, args);
    }

};


