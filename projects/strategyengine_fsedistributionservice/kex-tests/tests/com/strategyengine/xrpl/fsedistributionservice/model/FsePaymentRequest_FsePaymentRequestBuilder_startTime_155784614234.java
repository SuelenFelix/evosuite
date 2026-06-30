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

public class FsePaymentRequest_FsePaymentRequestBuilder_startTime_155784614234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599465;

    public FsePaymentRequest_FsePaymentRequestBuilder_startTime_155784614234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term599465 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        setField(term599465, term599465.getClass(), "memo", null);
        setField(term599465, term599465.getClass(), "fromClassicAddress", null);
        setField(term599465, term599465.getClass(), "fromSigningPublicKey", null);
        setField(term599465, term599465.getClass(), "fromPrivateKey", null);
        setField(term599465, term599465.getClass(), "toClassicAddresses", null);
        setField(term599465, term599465.getClass(), "amount", null);
        setField(term599465, term599465.getClass(), "startTime", null);
        setField(term599465, term599465.getClass(), "destinationTag", null);
        setField(term599465, term599465.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term599465, term599465.getClass(), "currencyName", null);
        setBooleanField(term599465, term599465.getClass(), "agreeFee", false);
        setField(term599465, term599465.getClass(), "maxXrpFeePerTransaction", null);
        setBooleanField(term599465, term599465.getClass(), "globalIdVerified", false);
        setBooleanField(term599465, term599465.getClass(), "useBlacklist", false);
        setField(term599465, term599465.getClass(), "retryOfId", null);
        setField(term599465, term599465.getClass(), "paymentType", null);
        setField(term599465, term599465.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term599465, term599465.getClass(), "snapshotCurrencyName", null);
        setField(term599465, term599465.getClass(), "nftIssuingAddress", null);
        setField(term599465, term599465.getClass(), "nftTaxon", null);
        setField(term599465, term599465.getClass(), "frequency", null);
        setField(term599465, term599465.getClass(), "repeatUntilDate", null);
        setField(term599465, term599465.getClass(), "email", null);
        setBooleanField(term599465, term599465.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "startTime", argTypes, term599465, args);
    }

};


