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

public class FsePaymentTrustlinesRequest_setFromClassicAddress_167342023789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77607;

    public FsePaymentTrustlinesRequest_setFromClassicAddress_167342023789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77607 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        setField(term77607, term77607.getClass(), "memo", null);
        setField(term77607, term77607.getClass(), "fromClassicAddress", null);
        setField(term77607, term77607.getClass(), "fromSigningPublicKey", null);
        setField(term77607, term77607.getClass(), "fromPrivateKey", null);
        setField(term77607, term77607.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term77607, term77607.getClass(), "currencyName", null);
        setField(term77607, term77607.getClass(), "amount", null);
        setBooleanField(term77607, term77607.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term77607, term77607.getClass(), "globalIdVerified", false);
        setBooleanField(term77607, term77607.getClass(), "useBlacklist", false);
        setBooleanField(term77607, term77607.getClass(), "agreeFee", false);
        setField(term77607, term77607.getClass(), "maximumTrustlines", null);
        setField(term77607, term77607.getClass(), "minBalance", null);
        setField(term77607, term77607.getClass(), "maxBalance", null);
        setField(term77607, term77607.getClass(), "maxXrpFeePerTransaction", null);
        setField(term77607, term77607.getClass(), "retryOfId", null);
        setField(term77607, term77607.getClass(), "paymentType", null);
        setField(term77607, term77607.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term77607, term77607.getClass(), "snapshotCurrencyName", null);
        setField(term77607, term77607.getClass(), "startTime", null);
        setField(term77607, term77607.getClass(), "frequency", null);
        setField(term77607, term77607.getClass(), "repeatUntilDate", null);
        setField(term77607, term77607.getClass(), "email", null);
        setBooleanField(term77607, term77607.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFromClassicAddress", argTypes, term77607, args);
    }

};


