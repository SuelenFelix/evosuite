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

public class FsePaymentRequest_FsePaymentRequestBuilder_globalIdVerified_46673939940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599497;
     Object term599502;

    public FsePaymentRequest_FsePaymentRequestBuilder_globalIdVerified_46673939940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term599497 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        setField(term599497, term599497.getClass(), "memo", null);
        setField(term599497, term599497.getClass(), "fromClassicAddress", null);
        setField(term599497, term599497.getClass(), "fromSigningPublicKey", null);
        setField(term599497, term599497.getClass(), "fromPrivateKey", null);
        setField(term599497, term599497.getClass(), "toClassicAddresses", null);
        setField(term599497, term599497.getClass(), "amount", null);
        setField(term599497, term599497.getClass(), "startTime", null);
        setField(term599497, term599497.getClass(), "destinationTag", null);
        setField(term599497, term599497.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term599497, term599497.getClass(), "currencyName", null);
        setBooleanField(term599497, term599497.getClass(), "agreeFee", false);
        setField(term599497, term599497.getClass(), "maxXrpFeePerTransaction", null);
        setBooleanField(term599497, term599497.getClass(), "globalIdVerified", false);
        setBooleanField(term599497, term599497.getClass(), "useBlacklist", false);
        setField(term599497, term599497.getClass(), "retryOfId", null);
        setField(term599497, term599497.getClass(), "paymentType", null);
        setField(term599497, term599497.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term599497, term599497.getClass(), "snapshotCurrencyName", null);
        setField(term599497, term599497.getClass(), "nftIssuingAddress", null);
        setField(term599497, term599497.getClass(), "nftTaxon", null);
        setField(term599497, term599497.getClass(), "frequency", null);
        setField(term599497, term599497.getClass(), "repeatUntilDate", null);
        setField(term599497, term599497.getClass(), "email", null);
        setBooleanField(term599497, term599497.getClass(), "autoApprove", false);
        term599502 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term599502;
        callMethod(klass, "globalIdVerified", argTypes, term599497, args);
    }

};


