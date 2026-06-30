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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_toString_97164570653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443284;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_toString_97164570653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443284 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        setField(term443284, term443284.getClass(), "memo", null);
        setField(term443284, term443284.getClass(), "fromClassicAddress", null);
        setField(term443284, term443284.getClass(), "fromSigningPublicKey", null);
        setField(term443284, term443284.getClass(), "fromPrivateKey", null);
        setField(term443284, term443284.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term443284, term443284.getClass(), "currencyName", null);
        setField(term443284, term443284.getClass(), "amount", null);
        setBooleanField(term443284, term443284.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term443284, term443284.getClass(), "globalIdVerified", false);
        setBooleanField(term443284, term443284.getClass(), "useBlacklist", false);
        setBooleanField(term443284, term443284.getClass(), "agreeFee", false);
        setField(term443284, term443284.getClass(), "maximumTrustlines", null);
        setField(term443284, term443284.getClass(), "minBalance", null);
        setField(term443284, term443284.getClass(), "maxBalance", null);
        setField(term443284, term443284.getClass(), "maxXrpFeePerTransaction", null);
        setField(term443284, term443284.getClass(), "retryOfId", null);
        setField(term443284, term443284.getClass(), "paymentType", null);
        setField(term443284, term443284.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term443284, term443284.getClass(), "snapshotCurrencyName", null);
        setField(term443284, term443284.getClass(), "startTime", null);
        setField(term443284, term443284.getClass(), "frequency", null);
        setField(term443284, term443284.getClass(), "repeatUntilDate", null);
        setField(term443284, term443284.getClass(), "email", null);
        setBooleanField(term443284, term443284.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term443284, args);
    }

};


