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

public class PaymentRequestEnt_getMaximumTrustlines_64012454999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233689;

    public PaymentRequestEnt_getMaximumTrustlines_64012454999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233689 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233689, term233689.getClass(), "id", null);
        setField(term233689, term233689.getClass(), "environment", null);
        setField(term233689, term233689.getClass(), "populateEnvironment", null);
        setField(term233689, term233689.getClass(), "createDate", null);
        setField(term233689, term233689.getClass(), "updateDate", null);
        setField(term233689, term233689.getClass(), "startTime", null);
        setField(term233689, term233689.getClass(), "status", null);
        setField(term233689, term233689.getClass(), "fromClassicAddress", null);
        setField(term233689, term233689.getClass(), "fromSigningPublicKey", null);
        setField(term233689, term233689.getClass(), "fromPrivateKey", null);
        setField(term233689, term233689.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233689, term233689.getClass(), "currencyName", null);
        setField(term233689, term233689.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233689, term233689.getClass(), "snapshotCurrencyName", null);
        setField(term233689, term233689.getClass(), "currencyNameForProcess", null);
        setField(term233689, term233689.getClass(), "amount", null);
        setField(term233689, term233689.getClass(), "paymentType", null);
        setField(term233689, term233689.getClass(), "newTrustlinesOnly", null);
        setField(term233689, term233689.getClass(), "useBlacklist", null);
        setField(term233689, term233689.getClass(), "maximumTrustlines", null);
        setField(term233689, term233689.getClass(), "dropType", null);
        setField(term233689, term233689.getClass(), "lockUuid", null);
        setField(term233689, term233689.getClass(), "failReason", null);
        setField(term233689, term233689.getClass(), "feesPaid", null);
        setField(term233689, term233689.getClass(), "minBalance", null);
        setField(term233689, term233689.getClass(), "maxBalance", null);
        setField(term233689, term233689.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233689, term233689.getClass(), "retryOfId", null);
        setField(term233689, term233689.getClass(), "nftIssuerAddress", null);
        setField(term233689, term233689.getClass(), "nftTaxon", null);
        setField(term233689, term233689.getClass(), "contactEmail", null);
        setField(term233689, term233689.getClass(), "autoApprove", null);
        setField(term233689, term233689.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaximumTrustlines", argTypes, term233689, args);
    }

};


