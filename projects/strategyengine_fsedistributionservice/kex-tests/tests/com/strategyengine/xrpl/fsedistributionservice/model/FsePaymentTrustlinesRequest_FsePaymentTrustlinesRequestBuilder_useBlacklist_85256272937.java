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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_useBlacklist_85256272937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443182;
     Object term443188;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_useBlacklist_85256272937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443182 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        setField(term443182, term443182.getClass(), "memo", null);
        setField(term443182, term443182.getClass(), "fromClassicAddress", null);
        setField(term443182, term443182.getClass(), "fromSigningPublicKey", null);
        setField(term443182, term443182.getClass(), "fromPrivateKey", null);
        setField(term443182, term443182.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term443182, term443182.getClass(), "currencyName", null);
        setField(term443182, term443182.getClass(), "amount", null);
        setBooleanField(term443182, term443182.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term443182, term443182.getClass(), "globalIdVerified", false);
        setBooleanField(term443182, term443182.getClass(), "useBlacklist", false);
        setBooleanField(term443182, term443182.getClass(), "agreeFee", false);
        setField(term443182, term443182.getClass(), "maximumTrustlines", null);
        setField(term443182, term443182.getClass(), "minBalance", null);
        setField(term443182, term443182.getClass(), "maxBalance", null);
        setField(term443182, term443182.getClass(), "maxXrpFeePerTransaction", null);
        setField(term443182, term443182.getClass(), "retryOfId", null);
        setField(term443182, term443182.getClass(), "paymentType", null);
        setField(term443182, term443182.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term443182, term443182.getClass(), "snapshotCurrencyName", null);
        setField(term443182, term443182.getClass(), "startTime", null);
        setField(term443182, term443182.getClass(), "frequency", null);
        setField(term443182, term443182.getClass(), "repeatUntilDate", null);
        setField(term443182, term443182.getClass(), "email", null);
        setBooleanField(term443182, term443182.getClass(), "autoApprove", false);
        term443188 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term443188;
        callMethod(klass, "useBlacklist", argTypes, term443182, args);
    }

};


