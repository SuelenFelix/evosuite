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

public class FsePaymentRequest_FsePaymentRequestBuilder_snapshotCurrencyName_82013978045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599526;

    public FsePaymentRequest_FsePaymentRequestBuilder_snapshotCurrencyName_82013978045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term599526 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        setField(term599526, term599526.getClass(), "memo", null);
        setField(term599526, term599526.getClass(), "fromClassicAddress", null);
        setField(term599526, term599526.getClass(), "fromSigningPublicKey", null);
        setField(term599526, term599526.getClass(), "fromPrivateKey", null);
        setField(term599526, term599526.getClass(), "toClassicAddresses", null);
        setField(term599526, term599526.getClass(), "amount", null);
        setField(term599526, term599526.getClass(), "startTime", null);
        setField(term599526, term599526.getClass(), "destinationTag", null);
        setField(term599526, term599526.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term599526, term599526.getClass(), "currencyName", null);
        setBooleanField(term599526, term599526.getClass(), "agreeFee", false);
        setField(term599526, term599526.getClass(), "maxXrpFeePerTransaction", null);
        setBooleanField(term599526, term599526.getClass(), "globalIdVerified", false);
        setBooleanField(term599526, term599526.getClass(), "useBlacklist", false);
        setField(term599526, term599526.getClass(), "retryOfId", null);
        setField(term599526, term599526.getClass(), "paymentType", null);
        setField(term599526, term599526.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term599526, term599526.getClass(), "snapshotCurrencyName", null);
        setField(term599526, term599526.getClass(), "nftIssuingAddress", null);
        setField(term599526, term599526.getClass(), "nftTaxon", null);
        setField(term599526, term599526.getClass(), "frequency", null);
        setField(term599526, term599526.getClass(), "repeatUntilDate", null);
        setField(term599526, term599526.getClass(), "email", null);
        setBooleanField(term599526, term599526.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "snapshotCurrencyName", argTypes, term599526, args);
    }

};


