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

public class FsePaymentRequest_FsePaymentRequestBuilder_toClassicAddresses_65349656232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599455;

    public FsePaymentRequest_FsePaymentRequestBuilder_toClassicAddresses_65349656232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term599455 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        setField(term599455, term599455.getClass(), "memo", null);
        setField(term599455, term599455.getClass(), "fromClassicAddress", null);
        setField(term599455, term599455.getClass(), "fromSigningPublicKey", null);
        setField(term599455, term599455.getClass(), "fromPrivateKey", null);
        setField(term599455, term599455.getClass(), "toClassicAddresses", null);
        setField(term599455, term599455.getClass(), "amount", null);
        setField(term599455, term599455.getClass(), "startTime", null);
        setField(term599455, term599455.getClass(), "destinationTag", null);
        setField(term599455, term599455.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term599455, term599455.getClass(), "currencyName", null);
        setBooleanField(term599455, term599455.getClass(), "agreeFee", false);
        setField(term599455, term599455.getClass(), "maxXrpFeePerTransaction", null);
        setBooleanField(term599455, term599455.getClass(), "globalIdVerified", false);
        setBooleanField(term599455, term599455.getClass(), "useBlacklist", false);
        setField(term599455, term599455.getClass(), "retryOfId", null);
        setField(term599455, term599455.getClass(), "paymentType", null);
        setField(term599455, term599455.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term599455, term599455.getClass(), "snapshotCurrencyName", null);
        setField(term599455, term599455.getClass(), "nftIssuingAddress", null);
        setField(term599455, term599455.getClass(), "nftTaxon", null);
        setField(term599455, term599455.getClass(), "frequency", null);
        setField(term599455, term599455.getClass(), "repeatUntilDate", null);
        setField(term599455, term599455.getClass(), "email", null);
        setBooleanField(term599455, term599455.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toClassicAddresses", argTypes, term599455, args);
    }

};


