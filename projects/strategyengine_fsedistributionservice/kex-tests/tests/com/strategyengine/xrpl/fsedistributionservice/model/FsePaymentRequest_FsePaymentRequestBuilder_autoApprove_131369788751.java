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

public class FsePaymentRequest_FsePaymentRequestBuilder_autoApprove_131369788751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599556;
     Object term599561;

    public FsePaymentRequest_FsePaymentRequestBuilder_autoApprove_131369788751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term599556 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        setField(term599556, term599556.getClass(), "memo", null);
        setField(term599556, term599556.getClass(), "fromClassicAddress", null);
        setField(term599556, term599556.getClass(), "fromSigningPublicKey", null);
        setField(term599556, term599556.getClass(), "fromPrivateKey", null);
        setField(term599556, term599556.getClass(), "toClassicAddresses", null);
        setField(term599556, term599556.getClass(), "amount", null);
        setField(term599556, term599556.getClass(), "startTime", null);
        setField(term599556, term599556.getClass(), "destinationTag", null);
        setField(term599556, term599556.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term599556, term599556.getClass(), "currencyName", null);
        setBooleanField(term599556, term599556.getClass(), "agreeFee", false);
        setField(term599556, term599556.getClass(), "maxXrpFeePerTransaction", null);
        setBooleanField(term599556, term599556.getClass(), "globalIdVerified", false);
        setBooleanField(term599556, term599556.getClass(), "useBlacklist", false);
        setField(term599556, term599556.getClass(), "retryOfId", null);
        setField(term599556, term599556.getClass(), "paymentType", null);
        setField(term599556, term599556.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term599556, term599556.getClass(), "snapshotCurrencyName", null);
        setField(term599556, term599556.getClass(), "nftIssuingAddress", null);
        setField(term599556, term599556.getClass(), "nftTaxon", null);
        setField(term599556, term599556.getClass(), "frequency", null);
        setField(term599556, term599556.getClass(), "repeatUntilDate", null);
        setField(term599556, term599556.getClass(), "email", null);
        setBooleanField(term599556, term599556.getClass(), "autoApprove", false);
        term599561 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term599561;
        callMethod(klass, "autoApprove", argTypes, term599556, args);
    }

};


