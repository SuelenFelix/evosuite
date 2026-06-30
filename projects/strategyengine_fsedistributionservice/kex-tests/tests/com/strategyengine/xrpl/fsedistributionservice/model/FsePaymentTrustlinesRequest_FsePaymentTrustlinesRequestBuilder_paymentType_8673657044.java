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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_paymentType_8673657044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443228;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_paymentType_8673657044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443228 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        setField(term443228, term443228.getClass(), "memo", null);
        setField(term443228, term443228.getClass(), "fromClassicAddress", null);
        setField(term443228, term443228.getClass(), "fromSigningPublicKey", null);
        setField(term443228, term443228.getClass(), "fromPrivateKey", null);
        setField(term443228, term443228.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term443228, term443228.getClass(), "currencyName", null);
        setField(term443228, term443228.getClass(), "amount", null);
        setBooleanField(term443228, term443228.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term443228, term443228.getClass(), "globalIdVerified", false);
        setBooleanField(term443228, term443228.getClass(), "useBlacklist", false);
        setBooleanField(term443228, term443228.getClass(), "agreeFee", false);
        setField(term443228, term443228.getClass(), "maximumTrustlines", null);
        setField(term443228, term443228.getClass(), "minBalance", null);
        setField(term443228, term443228.getClass(), "maxBalance", null);
        setField(term443228, term443228.getClass(), "maxXrpFeePerTransaction", null);
        setField(term443228, term443228.getClass(), "retryOfId", null);
        setField(term443228, term443228.getClass(), "paymentType", null);
        setField(term443228, term443228.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term443228, term443228.getClass(), "snapshotCurrencyName", null);
        setField(term443228, term443228.getClass(), "startTime", null);
        setField(term443228, term443228.getClass(), "frequency", null);
        setField(term443228, term443228.getClass(), "repeatUntilDate", null);
        setField(term443228, term443228.getClass(), "email", null);
        setBooleanField(term443228, term443228.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paymentType", argTypes, term443228, args);
    }

};


