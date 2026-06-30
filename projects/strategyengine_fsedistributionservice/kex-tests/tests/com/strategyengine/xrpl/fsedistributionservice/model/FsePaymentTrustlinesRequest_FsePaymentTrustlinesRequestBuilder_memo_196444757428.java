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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_memo_196444757428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443124;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_memo_196444757428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443124 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        setField(term443124, term443124.getClass(), "memo", null);
        setField(term443124, term443124.getClass(), "fromClassicAddress", null);
        setField(term443124, term443124.getClass(), "fromSigningPublicKey", null);
        setField(term443124, term443124.getClass(), "fromPrivateKey", null);
        setField(term443124, term443124.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term443124, term443124.getClass(), "currencyName", null);
        setField(term443124, term443124.getClass(), "amount", null);
        setBooleanField(term443124, term443124.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term443124, term443124.getClass(), "globalIdVerified", false);
        setBooleanField(term443124, term443124.getClass(), "useBlacklist", false);
        setBooleanField(term443124, term443124.getClass(), "agreeFee", false);
        setField(term443124, term443124.getClass(), "maximumTrustlines", null);
        setField(term443124, term443124.getClass(), "minBalance", null);
        setField(term443124, term443124.getClass(), "maxBalance", null);
        setField(term443124, term443124.getClass(), "maxXrpFeePerTransaction", null);
        setField(term443124, term443124.getClass(), "retryOfId", null);
        setField(term443124, term443124.getClass(), "paymentType", null);
        setField(term443124, term443124.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term443124, term443124.getClass(), "snapshotCurrencyName", null);
        setField(term443124, term443124.getClass(), "startTime", null);
        setField(term443124, term443124.getClass(), "frequency", null);
        setField(term443124, term443124.getClass(), "repeatUntilDate", null);
        setField(term443124, term443124.getClass(), "email", null);
        setBooleanField(term443124, term443124.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "memo", argTypes, term443124, args);
    }

};


