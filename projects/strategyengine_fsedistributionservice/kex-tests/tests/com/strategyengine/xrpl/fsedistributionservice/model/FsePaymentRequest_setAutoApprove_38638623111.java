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

public class FsePaymentRequest_setAutoApprove_38638623111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406295;
     Object term406300;

    public FsePaymentRequest_setAutoApprove_38638623111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406295 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        setField(term406295, term406295.getClass(), "memo", null);
        setField(term406295, term406295.getClass(), "fromClassicAddress", null);
        setField(term406295, term406295.getClass(), "fromSigningPublicKey", null);
        setField(term406295, term406295.getClass(), "fromPrivateKey", null);
        setField(term406295, term406295.getClass(), "toClassicAddresses", null);
        setField(term406295, term406295.getClass(), "amount", null);
        setField(term406295, term406295.getClass(), "startTime", null);
        setField(term406295, term406295.getClass(), "destinationTag", null);
        setField(term406295, term406295.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term406295, term406295.getClass(), "currencyName", null);
        setBooleanField(term406295, term406295.getClass(), "agreeFee", false);
        setField(term406295, term406295.getClass(), "maxXrpFeePerTransaction", null);
        setBooleanField(term406295, term406295.getClass(), "globalIdVerified", false);
        setBooleanField(term406295, term406295.getClass(), "useBlacklist", false);
        setField(term406295, term406295.getClass(), "retryOfId", null);
        setField(term406295, term406295.getClass(), "paymentType", null);
        setField(term406295, term406295.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term406295, term406295.getClass(), "snapshotCurrencyName", null);
        setField(term406295, term406295.getClass(), "nftIssuingAddress", null);
        setField(term406295, term406295.getClass(), "nftTaxon", null);
        setField(term406295, term406295.getClass(), "frequency", null);
        setField(term406295, term406295.getClass(), "repeatUntilDate", null);
        setField(term406295, term406295.getClass(), "email", null);
        setBooleanField(term406295, term406295.getClass(), "autoApprove", false);
        term406300 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term406300;
        callMethod(klass, "setAutoApprove", argTypes, term406295, args);
    }

};


