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

public class FsePaymentRequest_setGlobalIdVerified_706987467100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406236;
     Object term406241;

    public FsePaymentRequest_setGlobalIdVerified_706987467100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406236 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        setField(term406236, term406236.getClass(), "memo", null);
        setField(term406236, term406236.getClass(), "fromClassicAddress", null);
        setField(term406236, term406236.getClass(), "fromSigningPublicKey", null);
        setField(term406236, term406236.getClass(), "fromPrivateKey", null);
        setField(term406236, term406236.getClass(), "toClassicAddresses", null);
        setField(term406236, term406236.getClass(), "amount", null);
        setField(term406236, term406236.getClass(), "startTime", null);
        setField(term406236, term406236.getClass(), "destinationTag", null);
        setField(term406236, term406236.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term406236, term406236.getClass(), "currencyName", null);
        setBooleanField(term406236, term406236.getClass(), "agreeFee", false);
        setField(term406236, term406236.getClass(), "maxXrpFeePerTransaction", null);
        setBooleanField(term406236, term406236.getClass(), "globalIdVerified", false);
        setBooleanField(term406236, term406236.getClass(), "useBlacklist", false);
        setField(term406236, term406236.getClass(), "retryOfId", null);
        setField(term406236, term406236.getClass(), "paymentType", null);
        setField(term406236, term406236.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term406236, term406236.getClass(), "snapshotCurrencyName", null);
        setField(term406236, term406236.getClass(), "nftIssuingAddress", null);
        setField(term406236, term406236.getClass(), "nftTaxon", null);
        setField(term406236, term406236.getClass(), "frequency", null);
        setField(term406236, term406236.getClass(), "repeatUntilDate", null);
        setField(term406236, term406236.getClass(), "email", null);
        setBooleanField(term406236, term406236.getClass(), "autoApprove", false);
        term406241 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term406241;
        callMethod(klass, "setGlobalIdVerified", argTypes, term406236, args);
    }

};


