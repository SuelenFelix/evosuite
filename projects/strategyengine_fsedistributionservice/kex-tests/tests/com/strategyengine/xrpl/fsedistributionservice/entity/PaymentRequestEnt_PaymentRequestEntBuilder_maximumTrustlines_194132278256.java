package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PaymentRequestEnt_PaymentRequestEntBuilder_maximumTrustlines_194132278256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109376;

    public PaymentRequestEnt_PaymentRequestEntBuilder_maximumTrustlines_194132278256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109376 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        setField(term109376, term109376.getClass(), "id", null);
        setField(term109376, term109376.getClass(), "environment", null);
        setField(term109376, term109376.getClass(), "populateEnvironment", null);
        setField(term109376, term109376.getClass(), "createDate", null);
        setField(term109376, term109376.getClass(), "updateDate", null);
        setField(term109376, term109376.getClass(), "startTime", null);
        setField(term109376, term109376.getClass(), "status", null);
        setField(term109376, term109376.getClass(), "fromClassicAddress", null);
        setField(term109376, term109376.getClass(), "fromSigningPublicKey", null);
        setField(term109376, term109376.getClass(), "fromPrivateKey", null);
        setField(term109376, term109376.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term109376, term109376.getClass(), "currencyName", null);
        setField(term109376, term109376.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term109376, term109376.getClass(), "snapshotCurrencyName", null);
        setField(term109376, term109376.getClass(), "currencyNameForProcess", null);
        setField(term109376, term109376.getClass(), "amount", null);
        setField(term109376, term109376.getClass(), "paymentType", null);
        setField(term109376, term109376.getClass(), "newTrustlinesOnly", null);
        setField(term109376, term109376.getClass(), "useBlacklist", null);
        setField(term109376, term109376.getClass(), "maximumTrustlines", null);
        setField(term109376, term109376.getClass(), "dropType", null);
        setField(term109376, term109376.getClass(), "lockUuid", null);
        setField(term109376, term109376.getClass(), "failReason", null);
        setField(term109376, term109376.getClass(), "feesPaid", null);
        setField(term109376, term109376.getClass(), "minBalance", null);
        setField(term109376, term109376.getClass(), "maxBalance", null);
        setField(term109376, term109376.getClass(), "maxXrpFeePerTransaction", null);
        setField(term109376, term109376.getClass(), "retryOfId", null);
        setField(term109376, term109376.getClass(), "nftIssuerAddress", null);
        setField(term109376, term109376.getClass(), "nftTaxon", null);
        setField(term109376, term109376.getClass(), "contactEmail", null);
        setField(term109376, term109376.getClass(), "autoApprove", null);
        setField(term109376, term109376.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "maximumTrustlines", argTypes, term109376, args);
    }

};


