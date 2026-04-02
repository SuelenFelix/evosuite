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

public class PaymentRequestEnt_setFailReason_1563354475137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233725;

    public PaymentRequestEnt_setFailReason_1563354475137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233725 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233725, term233725.getClass(), "id", null);
        setField(term233725, term233725.getClass(), "environment", null);
        setField(term233725, term233725.getClass(), "populateEnvironment", null);
        setField(term233725, term233725.getClass(), "createDate", null);
        setField(term233725, term233725.getClass(), "updateDate", null);
        setField(term233725, term233725.getClass(), "startTime", null);
        setField(term233725, term233725.getClass(), "status", null);
        setField(term233725, term233725.getClass(), "fromClassicAddress", null);
        setField(term233725, term233725.getClass(), "fromSigningPublicKey", null);
        setField(term233725, term233725.getClass(), "fromPrivateKey", null);
        setField(term233725, term233725.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233725, term233725.getClass(), "currencyName", null);
        setField(term233725, term233725.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233725, term233725.getClass(), "snapshotCurrencyName", null);
        setField(term233725, term233725.getClass(), "currencyNameForProcess", null);
        setField(term233725, term233725.getClass(), "amount", null);
        setField(term233725, term233725.getClass(), "paymentType", null);
        setField(term233725, term233725.getClass(), "newTrustlinesOnly", null);
        setField(term233725, term233725.getClass(), "useBlacklist", null);
        setField(term233725, term233725.getClass(), "maximumTrustlines", null);
        setField(term233725, term233725.getClass(), "dropType", null);
        setField(term233725, term233725.getClass(), "lockUuid", null);
        setField(term233725, term233725.getClass(), "failReason", null);
        setField(term233725, term233725.getClass(), "feesPaid", null);
        setField(term233725, term233725.getClass(), "minBalance", null);
        setField(term233725, term233725.getClass(), "maxBalance", null);
        setField(term233725, term233725.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233725, term233725.getClass(), "retryOfId", null);
        setField(term233725, term233725.getClass(), "nftIssuerAddress", null);
        setField(term233725, term233725.getClass(), "nftTaxon", null);
        setField(term233725, term233725.getClass(), "contactEmail", null);
        setField(term233725, term233725.getClass(), "autoApprove", null);
        setField(term233725, term233725.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFailReason", argTypes, term233725, args);
    }

};


