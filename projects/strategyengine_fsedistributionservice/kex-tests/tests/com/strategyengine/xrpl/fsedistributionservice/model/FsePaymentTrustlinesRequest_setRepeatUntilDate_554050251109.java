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

public class FsePaymentTrustlinesRequest_setRepeatUntilDate_554050251109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77735;

    public FsePaymentTrustlinesRequest_setRepeatUntilDate_554050251109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77735 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        setField(term77735, term77735.getClass(), "memo", null);
        setField(term77735, term77735.getClass(), "fromClassicAddress", null);
        setField(term77735, term77735.getClass(), "fromSigningPublicKey", null);
        setField(term77735, term77735.getClass(), "fromPrivateKey", null);
        setField(term77735, term77735.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term77735, term77735.getClass(), "currencyName", null);
        setField(term77735, term77735.getClass(), "amount", null);
        setBooleanField(term77735, term77735.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term77735, term77735.getClass(), "globalIdVerified", false);
        setBooleanField(term77735, term77735.getClass(), "useBlacklist", false);
        setBooleanField(term77735, term77735.getClass(), "agreeFee", false);
        setField(term77735, term77735.getClass(), "maximumTrustlines", null);
        setField(term77735, term77735.getClass(), "minBalance", null);
        setField(term77735, term77735.getClass(), "maxBalance", null);
        setField(term77735, term77735.getClass(), "maxXrpFeePerTransaction", null);
        setField(term77735, term77735.getClass(), "retryOfId", null);
        setField(term77735, term77735.getClass(), "paymentType", null);
        setField(term77735, term77735.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term77735, term77735.getClass(), "snapshotCurrencyName", null);
        setField(term77735, term77735.getClass(), "startTime", null);
        setField(term77735, term77735.getClass(), "frequency", null);
        setField(term77735, term77735.getClass(), "repeatUntilDate", null);
        setField(term77735, term77735.getClass(), "email", null);
        setBooleanField(term77735, term77735.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRepeatUntilDate", argTypes, term77735, args);
    }

};


