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

public class FsePaymentRequest_FsePaymentRequestBuilder_build_97555473352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599563;

    public FsePaymentRequest_FsePaymentRequestBuilder_build_97555473352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term599563 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        setField(term599563, term599563.getClass(), "memo", null);
        setField(term599563, term599563.getClass(), "fromClassicAddress", null);
        setField(term599563, term599563.getClass(), "fromSigningPublicKey", null);
        setField(term599563, term599563.getClass(), "fromPrivateKey", null);
        setField(term599563, term599563.getClass(), "toClassicAddresses", null);
        setField(term599563, term599563.getClass(), "amount", null);
        setField(term599563, term599563.getClass(), "startTime", null);
        setField(term599563, term599563.getClass(), "destinationTag", null);
        setField(term599563, term599563.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term599563, term599563.getClass(), "currencyName", null);
        setBooleanField(term599563, term599563.getClass(), "agreeFee", false);
        setField(term599563, term599563.getClass(), "maxXrpFeePerTransaction", null);
        setBooleanField(term599563, term599563.getClass(), "globalIdVerified", false);
        setBooleanField(term599563, term599563.getClass(), "useBlacklist", false);
        setField(term599563, term599563.getClass(), "retryOfId", null);
        setField(term599563, term599563.getClass(), "paymentType", null);
        setField(term599563, term599563.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term599563, term599563.getClass(), "snapshotCurrencyName", null);
        setField(term599563, term599563.getClass(), "nftIssuingAddress", null);
        setField(term599563, term599563.getClass(), "nftTaxon", null);
        setField(term599563, term599563.getClass(), "frequency", null);
        setField(term599563, term599563.getClass(), "repeatUntilDate", null);
        setField(term599563, term599563.getClass(), "email", null);
        setBooleanField(term599563, term599563.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term599563, args);
    }

};


