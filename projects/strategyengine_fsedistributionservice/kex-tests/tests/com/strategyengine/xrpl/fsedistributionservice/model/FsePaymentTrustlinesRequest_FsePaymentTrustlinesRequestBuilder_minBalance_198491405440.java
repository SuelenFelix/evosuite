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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_minBalance_198491405440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443204;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_minBalance_198491405440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443204 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        setField(term443204, term443204.getClass(), "memo", null);
        setField(term443204, term443204.getClass(), "fromClassicAddress", null);
        setField(term443204, term443204.getClass(), "fromSigningPublicKey", null);
        setField(term443204, term443204.getClass(), "fromPrivateKey", null);
        setField(term443204, term443204.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term443204, term443204.getClass(), "currencyName", null);
        setField(term443204, term443204.getClass(), "amount", null);
        setBooleanField(term443204, term443204.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term443204, term443204.getClass(), "globalIdVerified", false);
        setBooleanField(term443204, term443204.getClass(), "useBlacklist", false);
        setBooleanField(term443204, term443204.getClass(), "agreeFee", false);
        setField(term443204, term443204.getClass(), "maximumTrustlines", null);
        setField(term443204, term443204.getClass(), "minBalance", null);
        setField(term443204, term443204.getClass(), "maxBalance", null);
        setField(term443204, term443204.getClass(), "maxXrpFeePerTransaction", null);
        setField(term443204, term443204.getClass(), "retryOfId", null);
        setField(term443204, term443204.getClass(), "paymentType", null);
        setField(term443204, term443204.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term443204, term443204.getClass(), "snapshotCurrencyName", null);
        setField(term443204, term443204.getClass(), "startTime", null);
        setField(term443204, term443204.getClass(), "frequency", null);
        setField(term443204, term443204.getClass(), "repeatUntilDate", null);
        setField(term443204, term443204.getClass(), "email", null);
        setBooleanField(term443204, term443204.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "minBalance", argTypes, term443204, args);
    }

};


