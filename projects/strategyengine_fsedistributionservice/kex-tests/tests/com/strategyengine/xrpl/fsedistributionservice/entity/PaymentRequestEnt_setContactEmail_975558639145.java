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

public class PaymentRequestEnt_setContactEmail_975558639145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233733;

    public PaymentRequestEnt_setContactEmail_975558639145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233733 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233733, term233733.getClass(), "id", null);
        setField(term233733, term233733.getClass(), "environment", null);
        setField(term233733, term233733.getClass(), "populateEnvironment", null);
        setField(term233733, term233733.getClass(), "createDate", null);
        setField(term233733, term233733.getClass(), "updateDate", null);
        setField(term233733, term233733.getClass(), "startTime", null);
        setField(term233733, term233733.getClass(), "status", null);
        setField(term233733, term233733.getClass(), "fromClassicAddress", null);
        setField(term233733, term233733.getClass(), "fromSigningPublicKey", null);
        setField(term233733, term233733.getClass(), "fromPrivateKey", null);
        setField(term233733, term233733.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233733, term233733.getClass(), "currencyName", null);
        setField(term233733, term233733.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233733, term233733.getClass(), "snapshotCurrencyName", null);
        setField(term233733, term233733.getClass(), "currencyNameForProcess", null);
        setField(term233733, term233733.getClass(), "amount", null);
        setField(term233733, term233733.getClass(), "paymentType", null);
        setField(term233733, term233733.getClass(), "newTrustlinesOnly", null);
        setField(term233733, term233733.getClass(), "useBlacklist", null);
        setField(term233733, term233733.getClass(), "maximumTrustlines", null);
        setField(term233733, term233733.getClass(), "dropType", null);
        setField(term233733, term233733.getClass(), "lockUuid", null);
        setField(term233733, term233733.getClass(), "failReason", null);
        setField(term233733, term233733.getClass(), "feesPaid", null);
        setField(term233733, term233733.getClass(), "minBalance", null);
        setField(term233733, term233733.getClass(), "maxBalance", null);
        setField(term233733, term233733.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233733, term233733.getClass(), "retryOfId", null);
        setField(term233733, term233733.getClass(), "nftIssuerAddress", null);
        setField(term233733, term233733.getClass(), "nftTaxon", null);
        setField(term233733, term233733.getClass(), "contactEmail", null);
        setField(term233733, term233733.getClass(), "autoApprove", null);
        setField(term233733, term233733.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setContactEmail", argTypes, term233733, args);
    }

};


