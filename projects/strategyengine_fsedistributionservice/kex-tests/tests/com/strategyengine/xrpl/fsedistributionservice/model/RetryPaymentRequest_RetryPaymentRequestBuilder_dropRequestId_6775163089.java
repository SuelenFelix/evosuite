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

public class RetryPaymentRequest_RetryPaymentRequestBuilder_dropRequestId_6775163089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18356;

    public RetryPaymentRequest_RetryPaymentRequestBuilder_dropRequestId_6775163089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18356 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.RetryPaymentRequest$RetryPaymentRequestBuilder"));
        setField(term18356, term18356.getClass(), "fromSigningPublicKey", null);
        setField(term18356, term18356.getClass(), "fromPrivateKey", null);
        setField(term18356, term18356.getClass(), "dropRequestId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.RetryPaymentRequest$RetryPaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "dropRequestId", argTypes, term18356, args);
    }

};


