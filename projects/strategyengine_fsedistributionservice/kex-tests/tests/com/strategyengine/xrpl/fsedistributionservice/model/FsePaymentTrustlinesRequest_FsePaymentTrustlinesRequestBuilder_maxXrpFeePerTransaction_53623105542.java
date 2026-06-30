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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_maxXrpFeePerTransaction_53623105542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443216;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_maxXrpFeePerTransaction_53623105542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443216 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        setField(term443216, term443216.getClass(), "memo", null);
        setField(term443216, term443216.getClass(), "fromClassicAddress", null);
        setField(term443216, term443216.getClass(), "fromSigningPublicKey", null);
        setField(term443216, term443216.getClass(), "fromPrivateKey", null);
        setField(term443216, term443216.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term443216, term443216.getClass(), "currencyName", null);
        setField(term443216, term443216.getClass(), "amount", null);
        setBooleanField(term443216, term443216.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term443216, term443216.getClass(), "globalIdVerified", false);
        setBooleanField(term443216, term443216.getClass(), "useBlacklist", false);
        setBooleanField(term443216, term443216.getClass(), "agreeFee", false);
        setField(term443216, term443216.getClass(), "maximumTrustlines", null);
        setField(term443216, term443216.getClass(), "minBalance", null);
        setField(term443216, term443216.getClass(), "maxBalance", null);
        setField(term443216, term443216.getClass(), "maxXrpFeePerTransaction", null);
        setField(term443216, term443216.getClass(), "retryOfId", null);
        setField(term443216, term443216.getClass(), "paymentType", null);
        setField(term443216, term443216.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term443216, term443216.getClass(), "snapshotCurrencyName", null);
        setField(term443216, term443216.getClass(), "startTime", null);
        setField(term443216, term443216.getClass(), "frequency", null);
        setField(term443216, term443216.getClass(), "repeatUntilDate", null);
        setField(term443216, term443216.getClass(), "email", null);
        setBooleanField(term443216, term443216.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "maxXrpFeePerTransaction", argTypes, term443216, args);
    }

};


