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

public class FsePaymentRequest_getCurrencyName_115689362871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406091;

    public FsePaymentRequest_getCurrencyName_115689362871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406091 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        setField(term406091, term406091.getClass(), "memo", null);
        setField(term406091, term406091.getClass(), "fromClassicAddress", null);
        setField(term406091, term406091.getClass(), "fromSigningPublicKey", null);
        setField(term406091, term406091.getClass(), "fromPrivateKey", null);
        setField(term406091, term406091.getClass(), "toClassicAddresses", null);
        setField(term406091, term406091.getClass(), "amount", null);
        setField(term406091, term406091.getClass(), "startTime", null);
        setField(term406091, term406091.getClass(), "destinationTag", null);
        setField(term406091, term406091.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term406091, term406091.getClass(), "currencyName", null);
        setBooleanField(term406091, term406091.getClass(), "agreeFee", false);
        setField(term406091, term406091.getClass(), "maxXrpFeePerTransaction", null);
        setBooleanField(term406091, term406091.getClass(), "globalIdVerified", false);
        setBooleanField(term406091, term406091.getClass(), "useBlacklist", false);
        setField(term406091, term406091.getClass(), "retryOfId", null);
        setField(term406091, term406091.getClass(), "paymentType", null);
        setField(term406091, term406091.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term406091, term406091.getClass(), "snapshotCurrencyName", null);
        setField(term406091, term406091.getClass(), "nftIssuingAddress", null);
        setField(term406091, term406091.getClass(), "nftTaxon", null);
        setField(term406091, term406091.getClass(), "frequency", null);
        setField(term406091, term406091.getClass(), "repeatUntilDate", null);
        setField(term406091, term406091.getClass(), "email", null);
        setBooleanField(term406091, term406091.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrencyName", argTypes, term406091, args);
    }

};


