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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_newTrustlinesOnly_29791333235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443166;
     Object term443172;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_newTrustlinesOnly_29791333235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443166 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        setField(term443166, term443166.getClass(), "memo", null);
        setField(term443166, term443166.getClass(), "fromClassicAddress", null);
        setField(term443166, term443166.getClass(), "fromSigningPublicKey", null);
        setField(term443166, term443166.getClass(), "fromPrivateKey", null);
        setField(term443166, term443166.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term443166, term443166.getClass(), "currencyName", null);
        setField(term443166, term443166.getClass(), "amount", null);
        setBooleanField(term443166, term443166.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term443166, term443166.getClass(), "globalIdVerified", false);
        setBooleanField(term443166, term443166.getClass(), "useBlacklist", false);
        setBooleanField(term443166, term443166.getClass(), "agreeFee", false);
        setField(term443166, term443166.getClass(), "maximumTrustlines", null);
        setField(term443166, term443166.getClass(), "minBalance", null);
        setField(term443166, term443166.getClass(), "maxBalance", null);
        setField(term443166, term443166.getClass(), "maxXrpFeePerTransaction", null);
        setField(term443166, term443166.getClass(), "retryOfId", null);
        setField(term443166, term443166.getClass(), "paymentType", null);
        setField(term443166, term443166.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term443166, term443166.getClass(), "snapshotCurrencyName", null);
        setField(term443166, term443166.getClass(), "startTime", null);
        setField(term443166, term443166.getClass(), "frequency", null);
        setField(term443166, term443166.getClass(), "repeatUntilDate", null);
        setField(term443166, term443166.getClass(), "email", null);
        setBooleanField(term443166, term443166.getClass(), "autoApprove", false);
        term443172 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term443172;
        callMethod(klass, "newTrustlinesOnly", argTypes, term443166, args);
    }

};


