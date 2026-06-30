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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_frequency_160467796148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443252;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_frequency_160467796148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443252 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        setField(term443252, term443252.getClass(), "memo", null);
        setField(term443252, term443252.getClass(), "fromClassicAddress", null);
        setField(term443252, term443252.getClass(), "fromSigningPublicKey", null);
        setField(term443252, term443252.getClass(), "fromPrivateKey", null);
        setField(term443252, term443252.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term443252, term443252.getClass(), "currencyName", null);
        setField(term443252, term443252.getClass(), "amount", null);
        setBooleanField(term443252, term443252.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term443252, term443252.getClass(), "globalIdVerified", false);
        setBooleanField(term443252, term443252.getClass(), "useBlacklist", false);
        setBooleanField(term443252, term443252.getClass(), "agreeFee", false);
        setField(term443252, term443252.getClass(), "maximumTrustlines", null);
        setField(term443252, term443252.getClass(), "minBalance", null);
        setField(term443252, term443252.getClass(), "maxBalance", null);
        setField(term443252, term443252.getClass(), "maxXrpFeePerTransaction", null);
        setField(term443252, term443252.getClass(), "retryOfId", null);
        setField(term443252, term443252.getClass(), "paymentType", null);
        setField(term443252, term443252.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term443252, term443252.getClass(), "snapshotCurrencyName", null);
        setField(term443252, term443252.getClass(), "startTime", null);
        setField(term443252, term443252.getClass(), "frequency", null);
        setField(term443252, term443252.getClass(), "repeatUntilDate", null);
        setField(term443252, term443252.getClass(), "email", null);
        setBooleanField(term443252, term443252.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "frequency", argTypes, term443252, args);
    }

};


