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

public class PaymentRequestEnt_toString_15724590379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233669;

    public PaymentRequestEnt_toString_15724590379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233669 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233669, term233669.getClass(), "id", null);
        setField(term233669, term233669.getClass(), "environment", null);
        setField(term233669, term233669.getClass(), "populateEnvironment", null);
        setField(term233669, term233669.getClass(), "createDate", null);
        setField(term233669, term233669.getClass(), "updateDate", null);
        setField(term233669, term233669.getClass(), "startTime", null);
        setField(term233669, term233669.getClass(), "status", null);
        setField(term233669, term233669.getClass(), "fromClassicAddress", null);
        setField(term233669, term233669.getClass(), "fromSigningPublicKey", null);
        setField(term233669, term233669.getClass(), "fromPrivateKey", null);
        setField(term233669, term233669.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233669, term233669.getClass(), "currencyName", null);
        setField(term233669, term233669.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233669, term233669.getClass(), "snapshotCurrencyName", null);
        setField(term233669, term233669.getClass(), "currencyNameForProcess", null);
        setField(term233669, term233669.getClass(), "amount", null);
        setField(term233669, term233669.getClass(), "paymentType", null);
        setField(term233669, term233669.getClass(), "newTrustlinesOnly", null);
        setField(term233669, term233669.getClass(), "useBlacklist", null);
        setField(term233669, term233669.getClass(), "maximumTrustlines", null);
        setField(term233669, term233669.getClass(), "dropType", null);
        setField(term233669, term233669.getClass(), "lockUuid", null);
        setField(term233669, term233669.getClass(), "failReason", null);
        setField(term233669, term233669.getClass(), "feesPaid", null);
        setField(term233669, term233669.getClass(), "minBalance", null);
        setField(term233669, term233669.getClass(), "maxBalance", null);
        setField(term233669, term233669.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233669, term233669.getClass(), "retryOfId", null);
        setField(term233669, term233669.getClass(), "nftIssuerAddress", null);
        setField(term233669, term233669.getClass(), "nftTaxon", null);
        setField(term233669, term233669.getClass(), "contactEmail", null);
        setField(term233669, term233669.getClass(), "autoApprove", null);
        setField(term233669, term233669.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term233669, args);
    }

};


