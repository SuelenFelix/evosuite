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

public class FsePaymentTrustlinesRequest_setAutoApprove_1343096998111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77747;
     Object term77753;

    public FsePaymentTrustlinesRequest_setAutoApprove_1343096998111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77747 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        setField(term77747, term77747.getClass(), "memo", null);
        setField(term77747, term77747.getClass(), "fromClassicAddress", null);
        setField(term77747, term77747.getClass(), "fromSigningPublicKey", null);
        setField(term77747, term77747.getClass(), "fromPrivateKey", null);
        setField(term77747, term77747.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term77747, term77747.getClass(), "currencyName", null);
        setField(term77747, term77747.getClass(), "amount", null);
        setBooleanField(term77747, term77747.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term77747, term77747.getClass(), "globalIdVerified", false);
        setBooleanField(term77747, term77747.getClass(), "useBlacklist", false);
        setBooleanField(term77747, term77747.getClass(), "agreeFee", false);
        setField(term77747, term77747.getClass(), "maximumTrustlines", null);
        setField(term77747, term77747.getClass(), "minBalance", null);
        setField(term77747, term77747.getClass(), "maxBalance", null);
        setField(term77747, term77747.getClass(), "maxXrpFeePerTransaction", null);
        setField(term77747, term77747.getClass(), "retryOfId", null);
        setField(term77747, term77747.getClass(), "paymentType", null);
        setField(term77747, term77747.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term77747, term77747.getClass(), "snapshotCurrencyName", null);
        setField(term77747, term77747.getClass(), "startTime", null);
        setField(term77747, term77747.getClass(), "frequency", null);
        setField(term77747, term77747.getClass(), "repeatUntilDate", null);
        setField(term77747, term77747.getClass(), "email", null);
        setBooleanField(term77747, term77747.getClass(), "autoApprove", false);
        term77753 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term77753;
        callMethod(klass, "setAutoApprove", argTypes, term77747, args);
    }

};


