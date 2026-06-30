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

public class RetryPaymentRequest_RetryPaymentRequestBuilder_toString_12883293805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18307;

    public RetryPaymentRequest_RetryPaymentRequestBuilder_toString_12883293805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18332 = new Long(5907001541142728739L);
        term18307 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.RetryPaymentRequest$RetryPaymentRequestBuilder"));
        setField(term18307, term18307.getClass(), "fromSigningPublicKey", "BbNeQJpYPr");
        setField(term18307, term18307.getClass(), "fromPrivateKey", "riMtzCoxNj");
        setField(term18307, term18307.getClass(), "dropRequestId", term18332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.RetryPaymentRequest$RetryPaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term18307, args);
    }

};


