package com.example.paymentgateway.provider.impl;

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
import static com.example.paymentgateway.provider.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DefaultPaymentProviderImpl_getProvider_9435680320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public DefaultPaymentProviderImpl_getProvider_9435680320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68 = Class.forName((String) "com.example.paymentgateway.model.constant.PaymentProviderType");
        Field term67 = ((Class) term68).getDeclaredField((String) "PROVIDER_TWO");
        ((Field) term67).setAccessible(true);
        enum0 = ((Field) term67).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.paymentgateway.provider.impl.DefaultPaymentProviderImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.paymentgateway.model.constant.PaymentProviderType");
        Object[] args = new Object[1];
        args[0] = enum0;
        callMethod(klass, "getProvider", argTypes, null, args);
    }

};


