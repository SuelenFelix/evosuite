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

public class FsePaymentRequest_builder_91159847656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406016;

    public FsePaymentRequest_builder_91159847656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406016 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        setField(term406016, term406016.getClass(), "memo", null);
        setField(term406016, term406016.getClass(), "fromClassicAddress", null);
        setField(term406016, term406016.getClass(), "fromSigningPublicKey", null);
        setField(term406016, term406016.getClass(), "fromPrivateKey", null);
        setField(term406016, term406016.getClass(), "toClassicAddresses", null);
        setField(term406016, term406016.getClass(), "amount", null);
        setField(term406016, term406016.getClass(), "startTime", null);
        setField(term406016, term406016.getClass(), "destinationTag", null);
        setField(term406016, term406016.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term406016, term406016.getClass(), "currencyName", null);
        setBooleanField(term406016, term406016.getClass(), "agreeFee", false);
        setField(term406016, term406016.getClass(), "maxXrpFeePerTransaction", null);
        setBooleanField(term406016, term406016.getClass(), "globalIdVerified", false);
        setBooleanField(term406016, term406016.getClass(), "useBlacklist", false);
        setField(term406016, term406016.getClass(), "retryOfId", null);
        setField(term406016, term406016.getClass(), "paymentType", null);
        setField(term406016, term406016.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term406016, term406016.getClass(), "snapshotCurrencyName", null);
        setField(term406016, term406016.getClass(), "nftIssuingAddress", null);
        setField(term406016, term406016.getClass(), "nftTaxon", null);
        setField(term406016, term406016.getClass(), "frequency", null);
        setField(term406016, term406016.getClass(), "repeatUntilDate", null);
        setField(term406016, term406016.getClass(), "email", null);
        setBooleanField(term406016, term406016.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "builder", argTypes, term406016, args);
    }

};


