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

public class FsePaymentTrustlinesRequest_getSnapshotTrustlineIssuerClassicAddress_159178515879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77549;

    public FsePaymentTrustlinesRequest_getSnapshotTrustlineIssuerClassicAddress_159178515879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77549 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        setField(term77549, term77549.getClass(), "memo", null);
        setField(term77549, term77549.getClass(), "fromClassicAddress", null);
        setField(term77549, term77549.getClass(), "fromSigningPublicKey", null);
        setField(term77549, term77549.getClass(), "fromPrivateKey", null);
        setField(term77549, term77549.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term77549, term77549.getClass(), "currencyName", null);
        setField(term77549, term77549.getClass(), "amount", null);
        setBooleanField(term77549, term77549.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term77549, term77549.getClass(), "globalIdVerified", false);
        setBooleanField(term77549, term77549.getClass(), "useBlacklist", false);
        setBooleanField(term77549, term77549.getClass(), "agreeFee", false);
        setField(term77549, term77549.getClass(), "maximumTrustlines", null);
        setField(term77549, term77549.getClass(), "minBalance", null);
        setField(term77549, term77549.getClass(), "maxBalance", null);
        setField(term77549, term77549.getClass(), "maxXrpFeePerTransaction", null);
        setField(term77549, term77549.getClass(), "retryOfId", null);
        setField(term77549, term77549.getClass(), "paymentType", null);
        setField(term77549, term77549.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term77549, term77549.getClass(), "snapshotCurrencyName", null);
        setField(term77549, term77549.getClass(), "startTime", null);
        setField(term77549, term77549.getClass(), "frequency", null);
        setField(term77549, term77549.getClass(), "repeatUntilDate", null);
        setField(term77549, term77549.getClass(), "email", null);
        setBooleanField(term77549, term77549.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSnapshotTrustlineIssuerClassicAddress", argTypes, term77549, args);
    }

};


