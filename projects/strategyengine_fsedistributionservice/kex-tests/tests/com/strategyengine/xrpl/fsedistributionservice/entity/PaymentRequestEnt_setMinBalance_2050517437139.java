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

public class PaymentRequestEnt_setMinBalance_2050517437139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233727;

    public PaymentRequestEnt_setMinBalance_2050517437139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233727 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233727, term233727.getClass(), "id", null);
        setField(term233727, term233727.getClass(), "environment", null);
        setField(term233727, term233727.getClass(), "populateEnvironment", null);
        setField(term233727, term233727.getClass(), "createDate", null);
        setField(term233727, term233727.getClass(), "updateDate", null);
        setField(term233727, term233727.getClass(), "startTime", null);
        setField(term233727, term233727.getClass(), "status", null);
        setField(term233727, term233727.getClass(), "fromClassicAddress", null);
        setField(term233727, term233727.getClass(), "fromSigningPublicKey", null);
        setField(term233727, term233727.getClass(), "fromPrivateKey", null);
        setField(term233727, term233727.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233727, term233727.getClass(), "currencyName", null);
        setField(term233727, term233727.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233727, term233727.getClass(), "snapshotCurrencyName", null);
        setField(term233727, term233727.getClass(), "currencyNameForProcess", null);
        setField(term233727, term233727.getClass(), "amount", null);
        setField(term233727, term233727.getClass(), "paymentType", null);
        setField(term233727, term233727.getClass(), "newTrustlinesOnly", null);
        setField(term233727, term233727.getClass(), "useBlacklist", null);
        setField(term233727, term233727.getClass(), "maximumTrustlines", null);
        setField(term233727, term233727.getClass(), "dropType", null);
        setField(term233727, term233727.getClass(), "lockUuid", null);
        setField(term233727, term233727.getClass(), "failReason", null);
        setField(term233727, term233727.getClass(), "feesPaid", null);
        setField(term233727, term233727.getClass(), "minBalance", null);
        setField(term233727, term233727.getClass(), "maxBalance", null);
        setField(term233727, term233727.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233727, term233727.getClass(), "retryOfId", null);
        setField(term233727, term233727.getClass(), "nftIssuerAddress", null);
        setField(term233727, term233727.getClass(), "nftTaxon", null);
        setField(term233727, term233727.getClass(), "contactEmail", null);
        setField(term233727, term233727.getClass(), "autoApprove", null);
        setField(term233727, term233727.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMinBalance", argTypes, term233727, args);
    }

};


