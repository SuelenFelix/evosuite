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

public class RetryPaymentRequest_RetryPaymentRequestBuilder_fromSigningPublicKey_1371382811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18073;

    public RetryPaymentRequest_RetryPaymentRequestBuilder_fromSigningPublicKey_1371382811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18098 = new Long(-484994522244390100L);
        term18073 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.RetryPaymentRequest$RetryPaymentRequestBuilder"));
        setField(term18073, term18073.getClass(), "fromSigningPublicKey", "OeQLvhVERT");
        setField(term18073, term18073.getClass(), "fromPrivateKey", "IlvgFINwIa");
        setField(term18073, term18073.getClass(), "dropRequestId", term18098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.RetryPaymentRequest$RetryPaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GEJABPlHSI";
        callMethod(klass, "fromSigningPublicKey", argTypes, term18073, args);
    }

};


