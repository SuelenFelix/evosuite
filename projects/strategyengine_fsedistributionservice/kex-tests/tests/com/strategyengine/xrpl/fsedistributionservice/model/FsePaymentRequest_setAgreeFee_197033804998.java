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

public class FsePaymentRequest_setAgreeFee_197033804998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406224;
     Object term406229;

    public FsePaymentRequest_setAgreeFee_197033804998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406224 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        setField(term406224, term406224.getClass(), "memo", null);
        setField(term406224, term406224.getClass(), "fromClassicAddress", null);
        setField(term406224, term406224.getClass(), "fromSigningPublicKey", null);
        setField(term406224, term406224.getClass(), "fromPrivateKey", null);
        setField(term406224, term406224.getClass(), "toClassicAddresses", null);
        setField(term406224, term406224.getClass(), "amount", null);
        setField(term406224, term406224.getClass(), "startTime", null);
        setField(term406224, term406224.getClass(), "destinationTag", null);
        setField(term406224, term406224.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term406224, term406224.getClass(), "currencyName", null);
        setBooleanField(term406224, term406224.getClass(), "agreeFee", false);
        setField(term406224, term406224.getClass(), "maxXrpFeePerTransaction", null);
        setBooleanField(term406224, term406224.getClass(), "globalIdVerified", false);
        setBooleanField(term406224, term406224.getClass(), "useBlacklist", false);
        setField(term406224, term406224.getClass(), "retryOfId", null);
        setField(term406224, term406224.getClass(), "paymentType", null);
        setField(term406224, term406224.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term406224, term406224.getClass(), "snapshotCurrencyName", null);
        setField(term406224, term406224.getClass(), "nftIssuingAddress", null);
        setField(term406224, term406224.getClass(), "nftTaxon", null);
        setField(term406224, term406224.getClass(), "frequency", null);
        setField(term406224, term406224.getClass(), "repeatUntilDate", null);
        setField(term406224, term406224.getClass(), "email", null);
        setBooleanField(term406224, term406224.getClass(), "autoApprove", false);
        term406229 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term406229;
        callMethod(klass, "setAgreeFee", argTypes, term406224, args);
    }

};


