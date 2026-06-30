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

public class PaymentRequestEnt_PaymentRequestEntBuilder_build_140766603070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109390;

    public PaymentRequestEnt_PaymentRequestEntBuilder_build_140766603070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109390 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        setField(term109390, term109390.getClass(), "id", null);
        setField(term109390, term109390.getClass(), "environment", null);
        setField(term109390, term109390.getClass(), "populateEnvironment", null);
        setField(term109390, term109390.getClass(), "createDate", null);
        setField(term109390, term109390.getClass(), "updateDate", null);
        setField(term109390, term109390.getClass(), "startTime", null);
        setField(term109390, term109390.getClass(), "status", null);
        setField(term109390, term109390.getClass(), "fromClassicAddress", null);
        setField(term109390, term109390.getClass(), "fromSigningPublicKey", null);
        setField(term109390, term109390.getClass(), "fromPrivateKey", null);
        setField(term109390, term109390.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term109390, term109390.getClass(), "currencyName", null);
        setField(term109390, term109390.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term109390, term109390.getClass(), "snapshotCurrencyName", null);
        setField(term109390, term109390.getClass(), "currencyNameForProcess", null);
        setField(term109390, term109390.getClass(), "amount", null);
        setField(term109390, term109390.getClass(), "paymentType", null);
        setField(term109390, term109390.getClass(), "newTrustlinesOnly", null);
        setField(term109390, term109390.getClass(), "useBlacklist", null);
        setField(term109390, term109390.getClass(), "maximumTrustlines", null);
        setField(term109390, term109390.getClass(), "dropType", null);
        setField(term109390, term109390.getClass(), "lockUuid", null);
        setField(term109390, term109390.getClass(), "failReason", null);
        setField(term109390, term109390.getClass(), "feesPaid", null);
        setField(term109390, term109390.getClass(), "minBalance", null);
        setField(term109390, term109390.getClass(), "maxBalance", null);
        setField(term109390, term109390.getClass(), "maxXrpFeePerTransaction", null);
        setField(term109390, term109390.getClass(), "retryOfId", null);
        setField(term109390, term109390.getClass(), "nftIssuerAddress", null);
        setField(term109390, term109390.getClass(), "nftTaxon", null);
        setField(term109390, term109390.getClass(), "contactEmail", null);
        setField(term109390, term109390.getClass(), "autoApprove", null);
        setField(term109390, term109390.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term109390, args);
    }

};


