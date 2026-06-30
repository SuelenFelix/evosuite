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

public class PaymentRequestEnt_setEnvironment_397826722116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233704;

    public PaymentRequestEnt_setEnvironment_397826722116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233704 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233704, term233704.getClass(), "id", null);
        setField(term233704, term233704.getClass(), "environment", null);
        setField(term233704, term233704.getClass(), "populateEnvironment", null);
        setField(term233704, term233704.getClass(), "createDate", null);
        setField(term233704, term233704.getClass(), "updateDate", null);
        setField(term233704, term233704.getClass(), "startTime", null);
        setField(term233704, term233704.getClass(), "status", null);
        setField(term233704, term233704.getClass(), "fromClassicAddress", null);
        setField(term233704, term233704.getClass(), "fromSigningPublicKey", null);
        setField(term233704, term233704.getClass(), "fromPrivateKey", null);
        setField(term233704, term233704.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233704, term233704.getClass(), "currencyName", null);
        setField(term233704, term233704.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233704, term233704.getClass(), "snapshotCurrencyName", null);
        setField(term233704, term233704.getClass(), "currencyNameForProcess", null);
        setField(term233704, term233704.getClass(), "amount", null);
        setField(term233704, term233704.getClass(), "paymentType", null);
        setField(term233704, term233704.getClass(), "newTrustlinesOnly", null);
        setField(term233704, term233704.getClass(), "useBlacklist", null);
        setField(term233704, term233704.getClass(), "maximumTrustlines", null);
        setField(term233704, term233704.getClass(), "dropType", null);
        setField(term233704, term233704.getClass(), "lockUuid", null);
        setField(term233704, term233704.getClass(), "failReason", null);
        setField(term233704, term233704.getClass(), "feesPaid", null);
        setField(term233704, term233704.getClass(), "minBalance", null);
        setField(term233704, term233704.getClass(), "maxBalance", null);
        setField(term233704, term233704.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233704, term233704.getClass(), "retryOfId", null);
        setField(term233704, term233704.getClass(), "nftIssuerAddress", null);
        setField(term233704, term233704.getClass(), "nftTaxon", null);
        setField(term233704, term233704.getClass(), "contactEmail", null);
        setField(term233704, term233704.getClass(), "autoApprove", null);
        setField(term233704, term233704.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEnvironment", argTypes, term233704, args);
    }

};


