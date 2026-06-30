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

public class PaymentRequestEnt_canEqual_160636309177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233667;

    public PaymentRequestEnt_canEqual_160636309177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233667 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233667, term233667.getClass(), "id", null);
        setField(term233667, term233667.getClass(), "environment", null);
        setField(term233667, term233667.getClass(), "populateEnvironment", null);
        setField(term233667, term233667.getClass(), "createDate", null);
        setField(term233667, term233667.getClass(), "updateDate", null);
        setField(term233667, term233667.getClass(), "startTime", null);
        setField(term233667, term233667.getClass(), "status", null);
        setField(term233667, term233667.getClass(), "fromClassicAddress", null);
        setField(term233667, term233667.getClass(), "fromSigningPublicKey", null);
        setField(term233667, term233667.getClass(), "fromPrivateKey", null);
        setField(term233667, term233667.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233667, term233667.getClass(), "currencyName", null);
        setField(term233667, term233667.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233667, term233667.getClass(), "snapshotCurrencyName", null);
        setField(term233667, term233667.getClass(), "currencyNameForProcess", null);
        setField(term233667, term233667.getClass(), "amount", null);
        setField(term233667, term233667.getClass(), "paymentType", null);
        setField(term233667, term233667.getClass(), "newTrustlinesOnly", null);
        setField(term233667, term233667.getClass(), "useBlacklist", null);
        setField(term233667, term233667.getClass(), "maximumTrustlines", null);
        setField(term233667, term233667.getClass(), "dropType", null);
        setField(term233667, term233667.getClass(), "lockUuid", null);
        setField(term233667, term233667.getClass(), "failReason", null);
        setField(term233667, term233667.getClass(), "feesPaid", null);
        setField(term233667, term233667.getClass(), "minBalance", null);
        setField(term233667, term233667.getClass(), "maxBalance", null);
        setField(term233667, term233667.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233667, term233667.getClass(), "retryOfId", null);
        setField(term233667, term233667.getClass(), "nftIssuerAddress", null);
        setField(term233667, term233667.getClass(), "nftTaxon", null);
        setField(term233667, term233667.getClass(), "contactEmail", null);
        setField(term233667, term233667.getClass(), "autoApprove", null);
        setField(term233667, term233667.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term233667, args);
    }

};


