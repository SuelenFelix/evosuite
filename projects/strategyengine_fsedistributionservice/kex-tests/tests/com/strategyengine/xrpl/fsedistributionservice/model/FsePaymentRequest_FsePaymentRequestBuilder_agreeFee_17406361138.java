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

public class FsePaymentRequest_FsePaymentRequestBuilder_agreeFee_17406361138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599485;
     Object term599490;

    public FsePaymentRequest_FsePaymentRequestBuilder_agreeFee_17406361138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term599485 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        setField(term599485, term599485.getClass(), "memo", null);
        setField(term599485, term599485.getClass(), "fromClassicAddress", null);
        setField(term599485, term599485.getClass(), "fromSigningPublicKey", null);
        setField(term599485, term599485.getClass(), "fromPrivateKey", null);
        setField(term599485, term599485.getClass(), "toClassicAddresses", null);
        setField(term599485, term599485.getClass(), "amount", null);
        setField(term599485, term599485.getClass(), "startTime", null);
        setField(term599485, term599485.getClass(), "destinationTag", null);
        setField(term599485, term599485.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term599485, term599485.getClass(), "currencyName", null);
        setBooleanField(term599485, term599485.getClass(), "agreeFee", false);
        setField(term599485, term599485.getClass(), "maxXrpFeePerTransaction", null);
        setBooleanField(term599485, term599485.getClass(), "globalIdVerified", false);
        setBooleanField(term599485, term599485.getClass(), "useBlacklist", false);
        setField(term599485, term599485.getClass(), "retryOfId", null);
        setField(term599485, term599485.getClass(), "paymentType", null);
        setField(term599485, term599485.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term599485, term599485.getClass(), "snapshotCurrencyName", null);
        setField(term599485, term599485.getClass(), "nftIssuingAddress", null);
        setField(term599485, term599485.getClass(), "nftTaxon", null);
        setField(term599485, term599485.getClass(), "frequency", null);
        setField(term599485, term599485.getClass(), "repeatUntilDate", null);
        setField(term599485, term599485.getClass(), "email", null);
        setBooleanField(term599485, term599485.getClass(), "autoApprove", false);
        term599490 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term599490;
        callMethod(klass, "agreeFee", argTypes, term599485, args);
    }

};


