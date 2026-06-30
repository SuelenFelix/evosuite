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

public class RetryPaymentRequest_RetryPaymentRequestBuilder_dropRequestId_6775163083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18211;
     Object term18238;

    public RetryPaymentRequest_RetryPaymentRequestBuilder_dropRequestId_6775163083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18236 = new Long(6617340557564669657L);
        term18211 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.RetryPaymentRequest$RetryPaymentRequestBuilder"));
        setField(term18211, term18211.getClass(), "fromSigningPublicKey", "wdoqITnaAP");
        setField(term18211, term18211.getClass(), "fromPrivateKey", "rIPMBcrNqB");
        setField(term18211, term18211.getClass(), "dropRequestId", term18236);
        term18238 = new Long(1439298019805881866L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.RetryPaymentRequest$RetryPaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term18238;
        callMethod(klass, "dropRequestId", argTypes, term18211, args);
    }

};


