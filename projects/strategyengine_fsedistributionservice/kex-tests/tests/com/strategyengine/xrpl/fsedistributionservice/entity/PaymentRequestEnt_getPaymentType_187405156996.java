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

public class PaymentRequestEnt_getPaymentType_187405156996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233686;

    public PaymentRequestEnt_getPaymentType_187405156996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233686 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233686, term233686.getClass(), "id", null);
        setField(term233686, term233686.getClass(), "environment", null);
        setField(term233686, term233686.getClass(), "populateEnvironment", null);
        setField(term233686, term233686.getClass(), "createDate", null);
        setField(term233686, term233686.getClass(), "updateDate", null);
        setField(term233686, term233686.getClass(), "startTime", null);
        setField(term233686, term233686.getClass(), "status", null);
        setField(term233686, term233686.getClass(), "fromClassicAddress", null);
        setField(term233686, term233686.getClass(), "fromSigningPublicKey", null);
        setField(term233686, term233686.getClass(), "fromPrivateKey", null);
        setField(term233686, term233686.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233686, term233686.getClass(), "currencyName", null);
        setField(term233686, term233686.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233686, term233686.getClass(), "snapshotCurrencyName", null);
        setField(term233686, term233686.getClass(), "currencyNameForProcess", null);
        setField(term233686, term233686.getClass(), "amount", null);
        setField(term233686, term233686.getClass(), "paymentType", null);
        setField(term233686, term233686.getClass(), "newTrustlinesOnly", null);
        setField(term233686, term233686.getClass(), "useBlacklist", null);
        setField(term233686, term233686.getClass(), "maximumTrustlines", null);
        setField(term233686, term233686.getClass(), "dropType", null);
        setField(term233686, term233686.getClass(), "lockUuid", null);
        setField(term233686, term233686.getClass(), "failReason", null);
        setField(term233686, term233686.getClass(), "feesPaid", null);
        setField(term233686, term233686.getClass(), "minBalance", null);
        setField(term233686, term233686.getClass(), "maxBalance", null);
        setField(term233686, term233686.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233686, term233686.getClass(), "retryOfId", null);
        setField(term233686, term233686.getClass(), "nftIssuerAddress", null);
        setField(term233686, term233686.getClass(), "nftTaxon", null);
        setField(term233686, term233686.getClass(), "contactEmail", null);
        setField(term233686, term233686.getClass(), "autoApprove", null);
        setField(term233686, term233686.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPaymentType", argTypes, term233686, args);
    }

};


