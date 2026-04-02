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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_build_5863593852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443278;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_build_5863593852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443278 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        setField(term443278, term443278.getClass(), "memo", null);
        setField(term443278, term443278.getClass(), "fromClassicAddress", null);
        setField(term443278, term443278.getClass(), "fromSigningPublicKey", null);
        setField(term443278, term443278.getClass(), "fromPrivateKey", null);
        setField(term443278, term443278.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term443278, term443278.getClass(), "currencyName", null);
        setField(term443278, term443278.getClass(), "amount", null);
        setBooleanField(term443278, term443278.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term443278, term443278.getClass(), "globalIdVerified", false);
        setBooleanField(term443278, term443278.getClass(), "useBlacklist", false);
        setBooleanField(term443278, term443278.getClass(), "agreeFee", false);
        setField(term443278, term443278.getClass(), "maximumTrustlines", null);
        setField(term443278, term443278.getClass(), "minBalance", null);
        setField(term443278, term443278.getClass(), "maxBalance", null);
        setField(term443278, term443278.getClass(), "maxXrpFeePerTransaction", null);
        setField(term443278, term443278.getClass(), "retryOfId", null);
        setField(term443278, term443278.getClass(), "paymentType", null);
        setField(term443278, term443278.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term443278, term443278.getClass(), "snapshotCurrencyName", null);
        setField(term443278, term443278.getClass(), "startTime", null);
        setField(term443278, term443278.getClass(), "frequency", null);
        setField(term443278, term443278.getClass(), "repeatUntilDate", null);
        setField(term443278, term443278.getClass(), "email", null);
        setBooleanField(term443278, term443278.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term443278, args);
    }

};


