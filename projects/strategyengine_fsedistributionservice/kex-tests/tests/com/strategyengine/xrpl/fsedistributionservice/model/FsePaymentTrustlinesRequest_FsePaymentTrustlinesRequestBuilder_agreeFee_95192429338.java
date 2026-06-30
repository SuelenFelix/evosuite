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
import java.lang.Boolean;

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_agreeFee_95192429338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443190;
     Object term443196;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_agreeFee_95192429338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443190 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        setField(term443190, term443190.getClass(), "memo", null);
        setField(term443190, term443190.getClass(), "fromClassicAddress", null);
        setField(term443190, term443190.getClass(), "fromSigningPublicKey", null);
        setField(term443190, term443190.getClass(), "fromPrivateKey", null);
        setField(term443190, term443190.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term443190, term443190.getClass(), "currencyName", null);
        setField(term443190, term443190.getClass(), "amount", null);
        setBooleanField(term443190, term443190.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term443190, term443190.getClass(), "globalIdVerified", false);
        setBooleanField(term443190, term443190.getClass(), "useBlacklist", false);
        setBooleanField(term443190, term443190.getClass(), "agreeFee", false);
        setField(term443190, term443190.getClass(), "maximumTrustlines", null);
        setField(term443190, term443190.getClass(), "minBalance", null);
        setField(term443190, term443190.getClass(), "maxBalance", null);
        setField(term443190, term443190.getClass(), "maxXrpFeePerTransaction", null);
        setField(term443190, term443190.getClass(), "retryOfId", null);
        setField(term443190, term443190.getClass(), "paymentType", null);
        setField(term443190, term443190.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term443190, term443190.getClass(), "snapshotCurrencyName", null);
        setField(term443190, term443190.getClass(), "startTime", null);
        setField(term443190, term443190.getClass(), "frequency", null);
        setField(term443190, term443190.getClass(), "repeatUntilDate", null);
        setField(term443190, term443190.getClass(), "email", null);
        setBooleanField(term443190, term443190.getClass(), "autoApprove", false);
        term443196 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term443196;
        callMethod(klass, "agreeFee", argTypes, term443190, args);
    }

};


