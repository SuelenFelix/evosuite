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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_startTime_161113325047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443246;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_startTime_161113325047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443246 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        setField(term443246, term443246.getClass(), "memo", null);
        setField(term443246, term443246.getClass(), "fromClassicAddress", null);
        setField(term443246, term443246.getClass(), "fromSigningPublicKey", null);
        setField(term443246, term443246.getClass(), "fromPrivateKey", null);
        setField(term443246, term443246.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term443246, term443246.getClass(), "currencyName", null);
        setField(term443246, term443246.getClass(), "amount", null);
        setBooleanField(term443246, term443246.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term443246, term443246.getClass(), "globalIdVerified", false);
        setBooleanField(term443246, term443246.getClass(), "useBlacklist", false);
        setBooleanField(term443246, term443246.getClass(), "agreeFee", false);
        setField(term443246, term443246.getClass(), "maximumTrustlines", null);
        setField(term443246, term443246.getClass(), "minBalance", null);
        setField(term443246, term443246.getClass(), "maxBalance", null);
        setField(term443246, term443246.getClass(), "maxXrpFeePerTransaction", null);
        setField(term443246, term443246.getClass(), "retryOfId", null);
        setField(term443246, term443246.getClass(), "paymentType", null);
        setField(term443246, term443246.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term443246, term443246.getClass(), "snapshotCurrencyName", null);
        setField(term443246, term443246.getClass(), "startTime", null);
        setField(term443246, term443246.getClass(), "frequency", null);
        setField(term443246, term443246.getClass(), "repeatUntilDate", null);
        setField(term443246, term443246.getClass(), "email", null);
        setBooleanField(term443246, term443246.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "startTime", argTypes, term443246, args);
    }

};


