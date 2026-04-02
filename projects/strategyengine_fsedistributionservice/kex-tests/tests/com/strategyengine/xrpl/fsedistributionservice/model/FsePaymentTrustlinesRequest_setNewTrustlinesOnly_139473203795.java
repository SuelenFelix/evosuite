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

public class FsePaymentTrustlinesRequest_setNewTrustlinesOnly_139473203795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77643;
     Object term77649;

    public FsePaymentTrustlinesRequest_setNewTrustlinesOnly_139473203795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77643 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        setField(term77643, term77643.getClass(), "memo", null);
        setField(term77643, term77643.getClass(), "fromClassicAddress", null);
        setField(term77643, term77643.getClass(), "fromSigningPublicKey", null);
        setField(term77643, term77643.getClass(), "fromPrivateKey", null);
        setField(term77643, term77643.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term77643, term77643.getClass(), "currencyName", null);
        setField(term77643, term77643.getClass(), "amount", null);
        setBooleanField(term77643, term77643.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term77643, term77643.getClass(), "globalIdVerified", false);
        setBooleanField(term77643, term77643.getClass(), "useBlacklist", false);
        setBooleanField(term77643, term77643.getClass(), "agreeFee", false);
        setField(term77643, term77643.getClass(), "maximumTrustlines", null);
        setField(term77643, term77643.getClass(), "minBalance", null);
        setField(term77643, term77643.getClass(), "maxBalance", null);
        setField(term77643, term77643.getClass(), "maxXrpFeePerTransaction", null);
        setField(term77643, term77643.getClass(), "retryOfId", null);
        setField(term77643, term77643.getClass(), "paymentType", null);
        setField(term77643, term77643.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term77643, term77643.getClass(), "snapshotCurrencyName", null);
        setField(term77643, term77643.getClass(), "startTime", null);
        setField(term77643, term77643.getClass(), "frequency", null);
        setField(term77643, term77643.getClass(), "repeatUntilDate", null);
        setField(term77643, term77643.getClass(), "email", null);
        setBooleanField(term77643, term77643.getClass(), "autoApprove", false);
        term77649 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term77649;
        callMethod(klass, "setNewTrustlinesOnly", argTypes, term77643, args);
    }

};


