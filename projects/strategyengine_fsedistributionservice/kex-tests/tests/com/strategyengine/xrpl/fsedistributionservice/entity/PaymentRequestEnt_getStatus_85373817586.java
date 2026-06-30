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

public class PaymentRequestEnt_getStatus_85373817586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233676;

    public PaymentRequestEnt_getStatus_85373817586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233676 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233676, term233676.getClass(), "id", null);
        setField(term233676, term233676.getClass(), "environment", null);
        setField(term233676, term233676.getClass(), "populateEnvironment", null);
        setField(term233676, term233676.getClass(), "createDate", null);
        setField(term233676, term233676.getClass(), "updateDate", null);
        setField(term233676, term233676.getClass(), "startTime", null);
        setField(term233676, term233676.getClass(), "status", null);
        setField(term233676, term233676.getClass(), "fromClassicAddress", null);
        setField(term233676, term233676.getClass(), "fromSigningPublicKey", null);
        setField(term233676, term233676.getClass(), "fromPrivateKey", null);
        setField(term233676, term233676.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233676, term233676.getClass(), "currencyName", null);
        setField(term233676, term233676.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233676, term233676.getClass(), "snapshotCurrencyName", null);
        setField(term233676, term233676.getClass(), "currencyNameForProcess", null);
        setField(term233676, term233676.getClass(), "amount", null);
        setField(term233676, term233676.getClass(), "paymentType", null);
        setField(term233676, term233676.getClass(), "newTrustlinesOnly", null);
        setField(term233676, term233676.getClass(), "useBlacklist", null);
        setField(term233676, term233676.getClass(), "maximumTrustlines", null);
        setField(term233676, term233676.getClass(), "dropType", null);
        setField(term233676, term233676.getClass(), "lockUuid", null);
        setField(term233676, term233676.getClass(), "failReason", null);
        setField(term233676, term233676.getClass(), "feesPaid", null);
        setField(term233676, term233676.getClass(), "minBalance", null);
        setField(term233676, term233676.getClass(), "maxBalance", null);
        setField(term233676, term233676.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233676, term233676.getClass(), "retryOfId", null);
        setField(term233676, term233676.getClass(), "nftIssuerAddress", null);
        setField(term233676, term233676.getClass(), "nftTaxon", null);
        setField(term233676, term233676.getClass(), "contactEmail", null);
        setField(term233676, term233676.getClass(), "autoApprove", null);
        setField(term233676, term233676.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term233676, args);
    }

};


