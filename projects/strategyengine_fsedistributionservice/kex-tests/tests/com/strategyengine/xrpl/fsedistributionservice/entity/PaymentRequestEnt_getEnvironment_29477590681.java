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

public class PaymentRequestEnt_getEnvironment_29477590681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233671;

    public PaymentRequestEnt_getEnvironment_29477590681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233671 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233671, term233671.getClass(), "id", null);
        setField(term233671, term233671.getClass(), "environment", null);
        setField(term233671, term233671.getClass(), "populateEnvironment", null);
        setField(term233671, term233671.getClass(), "createDate", null);
        setField(term233671, term233671.getClass(), "updateDate", null);
        setField(term233671, term233671.getClass(), "startTime", null);
        setField(term233671, term233671.getClass(), "status", null);
        setField(term233671, term233671.getClass(), "fromClassicAddress", null);
        setField(term233671, term233671.getClass(), "fromSigningPublicKey", null);
        setField(term233671, term233671.getClass(), "fromPrivateKey", null);
        setField(term233671, term233671.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233671, term233671.getClass(), "currencyName", null);
        setField(term233671, term233671.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233671, term233671.getClass(), "snapshotCurrencyName", null);
        setField(term233671, term233671.getClass(), "currencyNameForProcess", null);
        setField(term233671, term233671.getClass(), "amount", null);
        setField(term233671, term233671.getClass(), "paymentType", null);
        setField(term233671, term233671.getClass(), "newTrustlinesOnly", null);
        setField(term233671, term233671.getClass(), "useBlacklist", null);
        setField(term233671, term233671.getClass(), "maximumTrustlines", null);
        setField(term233671, term233671.getClass(), "dropType", null);
        setField(term233671, term233671.getClass(), "lockUuid", null);
        setField(term233671, term233671.getClass(), "failReason", null);
        setField(term233671, term233671.getClass(), "feesPaid", null);
        setField(term233671, term233671.getClass(), "minBalance", null);
        setField(term233671, term233671.getClass(), "maxBalance", null);
        setField(term233671, term233671.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233671, term233671.getClass(), "retryOfId", null);
        setField(term233671, term233671.getClass(), "nftIssuerAddress", null);
        setField(term233671, term233671.getClass(), "nftTaxon", null);
        setField(term233671, term233671.getClass(), "contactEmail", null);
        setField(term233671, term233671.getClass(), "autoApprove", null);
        setField(term233671, term233671.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnvironment", argTypes, term233671, args);
    }

};


