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

public class FsePaymentTrustlinesRequest_getAmount_149211658368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77483;

    public FsePaymentTrustlinesRequest_getAmount_149211658368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77483 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        setField(term77483, term77483.getClass(), "memo", null);
        setField(term77483, term77483.getClass(), "fromClassicAddress", null);
        setField(term77483, term77483.getClass(), "fromSigningPublicKey", null);
        setField(term77483, term77483.getClass(), "fromPrivateKey", null);
        setField(term77483, term77483.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term77483, term77483.getClass(), "currencyName", null);
        setField(term77483, term77483.getClass(), "amount", null);
        setBooleanField(term77483, term77483.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term77483, term77483.getClass(), "globalIdVerified", false);
        setBooleanField(term77483, term77483.getClass(), "useBlacklist", false);
        setBooleanField(term77483, term77483.getClass(), "agreeFee", false);
        setField(term77483, term77483.getClass(), "maximumTrustlines", null);
        setField(term77483, term77483.getClass(), "minBalance", null);
        setField(term77483, term77483.getClass(), "maxBalance", null);
        setField(term77483, term77483.getClass(), "maxXrpFeePerTransaction", null);
        setField(term77483, term77483.getClass(), "retryOfId", null);
        setField(term77483, term77483.getClass(), "paymentType", null);
        setField(term77483, term77483.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term77483, term77483.getClass(), "snapshotCurrencyName", null);
        setField(term77483, term77483.getClass(), "startTime", null);
        setField(term77483, term77483.getClass(), "frequency", null);
        setField(term77483, term77483.getClass(), "repeatUntilDate", null);
        setField(term77483, term77483.getClass(), "email", null);
        setBooleanField(term77483, term77483.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAmount", argTypes, term77483, args);
    }

};


