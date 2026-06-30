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

public class FsePaymentRequest_toBuilder_153372051957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406021;

    public FsePaymentRequest_toBuilder_153372051957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406021 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        setField(term406021, term406021.getClass(), "memo", null);
        setField(term406021, term406021.getClass(), "fromClassicAddress", null);
        setField(term406021, term406021.getClass(), "fromSigningPublicKey", null);
        setField(term406021, term406021.getClass(), "fromPrivateKey", null);
        setField(term406021, term406021.getClass(), "toClassicAddresses", null);
        setField(term406021, term406021.getClass(), "amount", null);
        setField(term406021, term406021.getClass(), "startTime", null);
        setField(term406021, term406021.getClass(), "destinationTag", null);
        setField(term406021, term406021.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term406021, term406021.getClass(), "currencyName", null);
        setBooleanField(term406021, term406021.getClass(), "agreeFee", false);
        setField(term406021, term406021.getClass(), "maxXrpFeePerTransaction", null);
        setBooleanField(term406021, term406021.getClass(), "globalIdVerified", false);
        setBooleanField(term406021, term406021.getClass(), "useBlacklist", false);
        setField(term406021, term406021.getClass(), "retryOfId", null);
        setField(term406021, term406021.getClass(), "paymentType", null);
        setField(term406021, term406021.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term406021, term406021.getClass(), "snapshotCurrencyName", null);
        setField(term406021, term406021.getClass(), "nftIssuingAddress", null);
        setField(term406021, term406021.getClass(), "nftTaxon", null);
        setField(term406021, term406021.getClass(), "frequency", null);
        setField(term406021, term406021.getClass(), "repeatUntilDate", null);
        setField(term406021, term406021.getClass(), "email", null);
        setBooleanField(term406021, term406021.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term406021, args);
    }

};


