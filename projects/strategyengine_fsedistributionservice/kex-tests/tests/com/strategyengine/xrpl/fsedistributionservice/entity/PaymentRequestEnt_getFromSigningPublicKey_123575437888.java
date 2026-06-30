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

public class PaymentRequestEnt_getFromSigningPublicKey_123575437888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233678;

    public PaymentRequestEnt_getFromSigningPublicKey_123575437888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233678 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233678, term233678.getClass(), "id", null);
        setField(term233678, term233678.getClass(), "environment", null);
        setField(term233678, term233678.getClass(), "populateEnvironment", null);
        setField(term233678, term233678.getClass(), "createDate", null);
        setField(term233678, term233678.getClass(), "updateDate", null);
        setField(term233678, term233678.getClass(), "startTime", null);
        setField(term233678, term233678.getClass(), "status", null);
        setField(term233678, term233678.getClass(), "fromClassicAddress", null);
        setField(term233678, term233678.getClass(), "fromSigningPublicKey", null);
        setField(term233678, term233678.getClass(), "fromPrivateKey", null);
        setField(term233678, term233678.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233678, term233678.getClass(), "currencyName", null);
        setField(term233678, term233678.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233678, term233678.getClass(), "snapshotCurrencyName", null);
        setField(term233678, term233678.getClass(), "currencyNameForProcess", null);
        setField(term233678, term233678.getClass(), "amount", null);
        setField(term233678, term233678.getClass(), "paymentType", null);
        setField(term233678, term233678.getClass(), "newTrustlinesOnly", null);
        setField(term233678, term233678.getClass(), "useBlacklist", null);
        setField(term233678, term233678.getClass(), "maximumTrustlines", null);
        setField(term233678, term233678.getClass(), "dropType", null);
        setField(term233678, term233678.getClass(), "lockUuid", null);
        setField(term233678, term233678.getClass(), "failReason", null);
        setField(term233678, term233678.getClass(), "feesPaid", null);
        setField(term233678, term233678.getClass(), "minBalance", null);
        setField(term233678, term233678.getClass(), "maxBalance", null);
        setField(term233678, term233678.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233678, term233678.getClass(), "retryOfId", null);
        setField(term233678, term233678.getClass(), "nftIssuerAddress", null);
        setField(term233678, term233678.getClass(), "nftTaxon", null);
        setField(term233678, term233678.getClass(), "contactEmail", null);
        setField(term233678, term233678.getClass(), "autoApprove", null);
        setField(term233678, term233678.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromSigningPublicKey", argTypes, term233678, args);
    }

};


