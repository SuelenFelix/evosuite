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

public class FsePaymentTrustlinesMinTriggeredRequest_FsePaymentTrustlinesMinTriggeredRequestBuilder_trustlinePaymentRequest_17155367796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563813;

    public FsePaymentTrustlinesMinTriggeredRequest_FsePaymentTrustlinesMinTriggeredRequestBuilder_trustlinePaymentRequest_17155367796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563813 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest$FsePaymentTrustlinesMinTriggeredRequestBuilder"));
        setField(term563813, term563813.getClass(), "trustlinePaymentRequest", null);
        setIntField(term563813, term563813.getClass(), "minTrustLinesTriggerValue", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest$FsePaymentTrustlinesMinTriggeredRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "trustlinePaymentRequest", argTypes, term563813, args);
    }

};


