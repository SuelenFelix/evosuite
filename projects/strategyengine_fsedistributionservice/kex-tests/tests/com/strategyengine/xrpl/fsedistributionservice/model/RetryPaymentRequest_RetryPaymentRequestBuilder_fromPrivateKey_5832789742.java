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

public class RetryPaymentRequest_RetryPaymentRequestBuilder_fromPrivateKey_5832789742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18142;

    public RetryPaymentRequest_RetryPaymentRequestBuilder_fromPrivateKey_5832789742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18167 = new Long(1233889271256172047L);
        term18142 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.RetryPaymentRequest$RetryPaymentRequestBuilder"));
        setField(term18142, term18142.getClass(), "fromSigningPublicKey", "aQFUvuaYxd");
        setField(term18142, term18142.getClass(), "fromPrivateKey", "zNFLXMifnS");
        setField(term18142, term18142.getClass(), "dropRequestId", term18167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.RetryPaymentRequest$RetryPaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HHQcYMSBVc";
        callMethod(klass, "fromPrivateKey", argTypes, term18142, args);
    }

};


