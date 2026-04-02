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

public class FsePaymentTrustlinesRequest_setAgreeFee_66587967498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77667;
     Object term77673;

    public FsePaymentTrustlinesRequest_setAgreeFee_66587967498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77667 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        setField(term77667, term77667.getClass(), "memo", null);
        setField(term77667, term77667.getClass(), "fromClassicAddress", null);
        setField(term77667, term77667.getClass(), "fromSigningPublicKey", null);
        setField(term77667, term77667.getClass(), "fromPrivateKey", null);
        setField(term77667, term77667.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term77667, term77667.getClass(), "currencyName", null);
        setField(term77667, term77667.getClass(), "amount", null);
        setBooleanField(term77667, term77667.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term77667, term77667.getClass(), "globalIdVerified", false);
        setBooleanField(term77667, term77667.getClass(), "useBlacklist", false);
        setBooleanField(term77667, term77667.getClass(), "agreeFee", false);
        setField(term77667, term77667.getClass(), "maximumTrustlines", null);
        setField(term77667, term77667.getClass(), "minBalance", null);
        setField(term77667, term77667.getClass(), "maxBalance", null);
        setField(term77667, term77667.getClass(), "maxXrpFeePerTransaction", null);
        setField(term77667, term77667.getClass(), "retryOfId", null);
        setField(term77667, term77667.getClass(), "paymentType", null);
        setField(term77667, term77667.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term77667, term77667.getClass(), "snapshotCurrencyName", null);
        setField(term77667, term77667.getClass(), "startTime", null);
        setField(term77667, term77667.getClass(), "frequency", null);
        setField(term77667, term77667.getClass(), "repeatUntilDate", null);
        setField(term77667, term77667.getClass(), "email", null);
        setBooleanField(term77667, term77667.getClass(), "autoApprove", false);
        term77673 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term77673;
        callMethod(klass, "setAgreeFee", argTypes, term77667, args);
    }

};


