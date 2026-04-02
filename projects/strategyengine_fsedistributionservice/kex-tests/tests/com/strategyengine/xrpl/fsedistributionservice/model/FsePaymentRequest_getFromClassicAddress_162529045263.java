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

public class FsePaymentRequest_getFromClassicAddress_162529045263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406051;

    public FsePaymentRequest_getFromClassicAddress_162529045263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406051 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        setField(term406051, term406051.getClass(), "memo", null);
        setField(term406051, term406051.getClass(), "fromClassicAddress", null);
        setField(term406051, term406051.getClass(), "fromSigningPublicKey", null);
        setField(term406051, term406051.getClass(), "fromPrivateKey", null);
        setField(term406051, term406051.getClass(), "toClassicAddresses", null);
        setField(term406051, term406051.getClass(), "amount", null);
        setField(term406051, term406051.getClass(), "startTime", null);
        setField(term406051, term406051.getClass(), "destinationTag", null);
        setField(term406051, term406051.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term406051, term406051.getClass(), "currencyName", null);
        setBooleanField(term406051, term406051.getClass(), "agreeFee", false);
        setField(term406051, term406051.getClass(), "maxXrpFeePerTransaction", null);
        setBooleanField(term406051, term406051.getClass(), "globalIdVerified", false);
        setBooleanField(term406051, term406051.getClass(), "useBlacklist", false);
        setField(term406051, term406051.getClass(), "retryOfId", null);
        setField(term406051, term406051.getClass(), "paymentType", null);
        setField(term406051, term406051.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term406051, term406051.getClass(), "snapshotCurrencyName", null);
        setField(term406051, term406051.getClass(), "nftIssuingAddress", null);
        setField(term406051, term406051.getClass(), "nftTaxon", null);
        setField(term406051, term406051.getClass(), "frequency", null);
        setField(term406051, term406051.getClass(), "repeatUntilDate", null);
        setField(term406051, term406051.getClass(), "email", null);
        setBooleanField(term406051, term406051.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromClassicAddress", argTypes, term406051, args);
    }

};


