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

public class FsePaymentRequest_setCurrencyName_16255280497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406219;

    public FsePaymentRequest_setCurrencyName_16255280497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406219 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        setField(term406219, term406219.getClass(), "memo", null);
        setField(term406219, term406219.getClass(), "fromClassicAddress", null);
        setField(term406219, term406219.getClass(), "fromSigningPublicKey", null);
        setField(term406219, term406219.getClass(), "fromPrivateKey", null);
        setField(term406219, term406219.getClass(), "toClassicAddresses", null);
        setField(term406219, term406219.getClass(), "amount", null);
        setField(term406219, term406219.getClass(), "startTime", null);
        setField(term406219, term406219.getClass(), "destinationTag", null);
        setField(term406219, term406219.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term406219, term406219.getClass(), "currencyName", null);
        setBooleanField(term406219, term406219.getClass(), "agreeFee", false);
        setField(term406219, term406219.getClass(), "maxXrpFeePerTransaction", null);
        setBooleanField(term406219, term406219.getClass(), "globalIdVerified", false);
        setBooleanField(term406219, term406219.getClass(), "useBlacklist", false);
        setField(term406219, term406219.getClass(), "retryOfId", null);
        setField(term406219, term406219.getClass(), "paymentType", null);
        setField(term406219, term406219.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term406219, term406219.getClass(), "snapshotCurrencyName", null);
        setField(term406219, term406219.getClass(), "nftIssuingAddress", null);
        setField(term406219, term406219.getClass(), "nftTaxon", null);
        setField(term406219, term406219.getClass(), "frequency", null);
        setField(term406219, term406219.getClass(), "repeatUntilDate", null);
        setField(term406219, term406219.getClass(), "email", null);
        setBooleanField(term406219, term406219.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCurrencyName", argTypes, term406219, args);
    }

};


