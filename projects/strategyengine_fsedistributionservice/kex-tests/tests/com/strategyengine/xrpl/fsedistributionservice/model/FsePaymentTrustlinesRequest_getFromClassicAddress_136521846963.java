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

public class FsePaymentTrustlinesRequest_getFromClassicAddress_136521846963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77453;

    public FsePaymentTrustlinesRequest_getFromClassicAddress_136521846963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77453 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        setField(term77453, term77453.getClass(), "memo", null);
        setField(term77453, term77453.getClass(), "fromClassicAddress", null);
        setField(term77453, term77453.getClass(), "fromSigningPublicKey", null);
        setField(term77453, term77453.getClass(), "fromPrivateKey", null);
        setField(term77453, term77453.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term77453, term77453.getClass(), "currencyName", null);
        setField(term77453, term77453.getClass(), "amount", null);
        setBooleanField(term77453, term77453.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term77453, term77453.getClass(), "globalIdVerified", false);
        setBooleanField(term77453, term77453.getClass(), "useBlacklist", false);
        setBooleanField(term77453, term77453.getClass(), "agreeFee", false);
        setField(term77453, term77453.getClass(), "maximumTrustlines", null);
        setField(term77453, term77453.getClass(), "minBalance", null);
        setField(term77453, term77453.getClass(), "maxBalance", null);
        setField(term77453, term77453.getClass(), "maxXrpFeePerTransaction", null);
        setField(term77453, term77453.getClass(), "retryOfId", null);
        setField(term77453, term77453.getClass(), "paymentType", null);
        setField(term77453, term77453.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term77453, term77453.getClass(), "snapshotCurrencyName", null);
        setField(term77453, term77453.getClass(), "startTime", null);
        setField(term77453, term77453.getClass(), "frequency", null);
        setField(term77453, term77453.getClass(), "repeatUntilDate", null);
        setField(term77453, term77453.getClass(), "email", null);
        setBooleanField(term77453, term77453.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromClassicAddress", argTypes, term77453, args);
    }

};


