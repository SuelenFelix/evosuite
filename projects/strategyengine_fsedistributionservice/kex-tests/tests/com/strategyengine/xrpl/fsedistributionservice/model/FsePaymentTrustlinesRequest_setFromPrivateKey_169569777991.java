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

public class FsePaymentTrustlinesRequest_setFromPrivateKey_169569777991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77619;

    public FsePaymentTrustlinesRequest_setFromPrivateKey_169569777991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77619 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        setField(term77619, term77619.getClass(), "memo", null);
        setField(term77619, term77619.getClass(), "fromClassicAddress", null);
        setField(term77619, term77619.getClass(), "fromSigningPublicKey", null);
        setField(term77619, term77619.getClass(), "fromPrivateKey", null);
        setField(term77619, term77619.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term77619, term77619.getClass(), "currencyName", null);
        setField(term77619, term77619.getClass(), "amount", null);
        setBooleanField(term77619, term77619.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term77619, term77619.getClass(), "globalIdVerified", false);
        setBooleanField(term77619, term77619.getClass(), "useBlacklist", false);
        setBooleanField(term77619, term77619.getClass(), "agreeFee", false);
        setField(term77619, term77619.getClass(), "maximumTrustlines", null);
        setField(term77619, term77619.getClass(), "minBalance", null);
        setField(term77619, term77619.getClass(), "maxBalance", null);
        setField(term77619, term77619.getClass(), "maxXrpFeePerTransaction", null);
        setField(term77619, term77619.getClass(), "retryOfId", null);
        setField(term77619, term77619.getClass(), "paymentType", null);
        setField(term77619, term77619.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term77619, term77619.getClass(), "snapshotCurrencyName", null);
        setField(term77619, term77619.getClass(), "startTime", null);
        setField(term77619, term77619.getClass(), "frequency", null);
        setField(term77619, term77619.getClass(), "repeatUntilDate", null);
        setField(term77619, term77619.getClass(), "email", null);
        setBooleanField(term77619, term77619.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFromPrivateKey", argTypes, term77619, args);
    }

};


