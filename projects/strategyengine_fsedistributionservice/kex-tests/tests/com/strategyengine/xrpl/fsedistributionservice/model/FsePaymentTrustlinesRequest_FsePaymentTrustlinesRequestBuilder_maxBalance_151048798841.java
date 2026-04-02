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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_maxBalance_151048798841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443210;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_maxBalance_151048798841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443210 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        setField(term443210, term443210.getClass(), "memo", null);
        setField(term443210, term443210.getClass(), "fromClassicAddress", null);
        setField(term443210, term443210.getClass(), "fromSigningPublicKey", null);
        setField(term443210, term443210.getClass(), "fromPrivateKey", null);
        setField(term443210, term443210.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term443210, term443210.getClass(), "currencyName", null);
        setField(term443210, term443210.getClass(), "amount", null);
        setBooleanField(term443210, term443210.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term443210, term443210.getClass(), "globalIdVerified", false);
        setBooleanField(term443210, term443210.getClass(), "useBlacklist", false);
        setBooleanField(term443210, term443210.getClass(), "agreeFee", false);
        setField(term443210, term443210.getClass(), "maximumTrustlines", null);
        setField(term443210, term443210.getClass(), "minBalance", null);
        setField(term443210, term443210.getClass(), "maxBalance", null);
        setField(term443210, term443210.getClass(), "maxXrpFeePerTransaction", null);
        setField(term443210, term443210.getClass(), "retryOfId", null);
        setField(term443210, term443210.getClass(), "paymentType", null);
        setField(term443210, term443210.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term443210, term443210.getClass(), "snapshotCurrencyName", null);
        setField(term443210, term443210.getClass(), "startTime", null);
        setField(term443210, term443210.getClass(), "frequency", null);
        setField(term443210, term443210.getClass(), "repeatUntilDate", null);
        setField(term443210, term443210.getClass(), "email", null);
        setBooleanField(term443210, term443210.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "maxBalance", argTypes, term443210, args);
    }

};


