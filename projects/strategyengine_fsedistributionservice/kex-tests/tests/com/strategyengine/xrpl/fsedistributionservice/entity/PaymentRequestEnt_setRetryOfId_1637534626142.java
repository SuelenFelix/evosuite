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

public class PaymentRequestEnt_setRetryOfId_1637534626142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233730;

    public PaymentRequestEnt_setRetryOfId_1637534626142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233730 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233730, term233730.getClass(), "id", null);
        setField(term233730, term233730.getClass(), "environment", null);
        setField(term233730, term233730.getClass(), "populateEnvironment", null);
        setField(term233730, term233730.getClass(), "createDate", null);
        setField(term233730, term233730.getClass(), "updateDate", null);
        setField(term233730, term233730.getClass(), "startTime", null);
        setField(term233730, term233730.getClass(), "status", null);
        setField(term233730, term233730.getClass(), "fromClassicAddress", null);
        setField(term233730, term233730.getClass(), "fromSigningPublicKey", null);
        setField(term233730, term233730.getClass(), "fromPrivateKey", null);
        setField(term233730, term233730.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233730, term233730.getClass(), "currencyName", null);
        setField(term233730, term233730.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233730, term233730.getClass(), "snapshotCurrencyName", null);
        setField(term233730, term233730.getClass(), "currencyNameForProcess", null);
        setField(term233730, term233730.getClass(), "amount", null);
        setField(term233730, term233730.getClass(), "paymentType", null);
        setField(term233730, term233730.getClass(), "newTrustlinesOnly", null);
        setField(term233730, term233730.getClass(), "useBlacklist", null);
        setField(term233730, term233730.getClass(), "maximumTrustlines", null);
        setField(term233730, term233730.getClass(), "dropType", null);
        setField(term233730, term233730.getClass(), "lockUuid", null);
        setField(term233730, term233730.getClass(), "failReason", null);
        setField(term233730, term233730.getClass(), "feesPaid", null);
        setField(term233730, term233730.getClass(), "minBalance", null);
        setField(term233730, term233730.getClass(), "maxBalance", null);
        setField(term233730, term233730.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233730, term233730.getClass(), "retryOfId", null);
        setField(term233730, term233730.getClass(), "nftIssuerAddress", null);
        setField(term233730, term233730.getClass(), "nftTaxon", null);
        setField(term233730, term233730.getClass(), "contactEmail", null);
        setField(term233730, term233730.getClass(), "autoApprove", null);
        setField(term233730, term233730.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRetryOfId", argTypes, term233730, args);
    }

};


