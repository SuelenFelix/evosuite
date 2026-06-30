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

public class FsePaymentTrustlinesRequest_getMaximumTrustlines_208553182573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77513;

    public FsePaymentTrustlinesRequest_getMaximumTrustlines_208553182573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77513 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        setField(term77513, term77513.getClass(), "memo", null);
        setField(term77513, term77513.getClass(), "fromClassicAddress", null);
        setField(term77513, term77513.getClass(), "fromSigningPublicKey", null);
        setField(term77513, term77513.getClass(), "fromPrivateKey", null);
        setField(term77513, term77513.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term77513, term77513.getClass(), "currencyName", null);
        setField(term77513, term77513.getClass(), "amount", null);
        setBooleanField(term77513, term77513.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term77513, term77513.getClass(), "globalIdVerified", false);
        setBooleanField(term77513, term77513.getClass(), "useBlacklist", false);
        setBooleanField(term77513, term77513.getClass(), "agreeFee", false);
        setField(term77513, term77513.getClass(), "maximumTrustlines", null);
        setField(term77513, term77513.getClass(), "minBalance", null);
        setField(term77513, term77513.getClass(), "maxBalance", null);
        setField(term77513, term77513.getClass(), "maxXrpFeePerTransaction", null);
        setField(term77513, term77513.getClass(), "retryOfId", null);
        setField(term77513, term77513.getClass(), "paymentType", null);
        setField(term77513, term77513.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term77513, term77513.getClass(), "snapshotCurrencyName", null);
        setField(term77513, term77513.getClass(), "startTime", null);
        setField(term77513, term77513.getClass(), "frequency", null);
        setField(term77513, term77513.getClass(), "repeatUntilDate", null);
        setField(term77513, term77513.getClass(), "email", null);
        setBooleanField(term77513, term77513.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaximumTrustlines", argTypes, term77513, args);
    }

};


