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

public class FsePaymentRequest_getSnapshotCurrencyName_69468804079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406131;

    public FsePaymentRequest_getSnapshotCurrencyName_69468804079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406131 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        setField(term406131, term406131.getClass(), "memo", null);
        setField(term406131, term406131.getClass(), "fromClassicAddress", null);
        setField(term406131, term406131.getClass(), "fromSigningPublicKey", null);
        setField(term406131, term406131.getClass(), "fromPrivateKey", null);
        setField(term406131, term406131.getClass(), "toClassicAddresses", null);
        setField(term406131, term406131.getClass(), "amount", null);
        setField(term406131, term406131.getClass(), "startTime", null);
        setField(term406131, term406131.getClass(), "destinationTag", null);
        setField(term406131, term406131.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term406131, term406131.getClass(), "currencyName", null);
        setBooleanField(term406131, term406131.getClass(), "agreeFee", false);
        setField(term406131, term406131.getClass(), "maxXrpFeePerTransaction", null);
        setBooleanField(term406131, term406131.getClass(), "globalIdVerified", false);
        setBooleanField(term406131, term406131.getClass(), "useBlacklist", false);
        setField(term406131, term406131.getClass(), "retryOfId", null);
        setField(term406131, term406131.getClass(), "paymentType", null);
        setField(term406131, term406131.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term406131, term406131.getClass(), "snapshotCurrencyName", null);
        setField(term406131, term406131.getClass(), "nftIssuingAddress", null);
        setField(term406131, term406131.getClass(), "nftTaxon", null);
        setField(term406131, term406131.getClass(), "frequency", null);
        setField(term406131, term406131.getClass(), "repeatUntilDate", null);
        setField(term406131, term406131.getClass(), "email", null);
        setBooleanField(term406131, term406131.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSnapshotCurrencyName", argTypes, term406131, args);
    }

};


