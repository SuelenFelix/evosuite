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

public class PaymentRequestEnt_getSnapshotTrustlineIssuerClassicAddress_125777486292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233682;

    public PaymentRequestEnt_getSnapshotTrustlineIssuerClassicAddress_125777486292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233682 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233682, term233682.getClass(), "id", null);
        setField(term233682, term233682.getClass(), "environment", null);
        setField(term233682, term233682.getClass(), "populateEnvironment", null);
        setField(term233682, term233682.getClass(), "createDate", null);
        setField(term233682, term233682.getClass(), "updateDate", null);
        setField(term233682, term233682.getClass(), "startTime", null);
        setField(term233682, term233682.getClass(), "status", null);
        setField(term233682, term233682.getClass(), "fromClassicAddress", null);
        setField(term233682, term233682.getClass(), "fromSigningPublicKey", null);
        setField(term233682, term233682.getClass(), "fromPrivateKey", null);
        setField(term233682, term233682.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233682, term233682.getClass(), "currencyName", null);
        setField(term233682, term233682.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233682, term233682.getClass(), "snapshotCurrencyName", null);
        setField(term233682, term233682.getClass(), "currencyNameForProcess", null);
        setField(term233682, term233682.getClass(), "amount", null);
        setField(term233682, term233682.getClass(), "paymentType", null);
        setField(term233682, term233682.getClass(), "newTrustlinesOnly", null);
        setField(term233682, term233682.getClass(), "useBlacklist", null);
        setField(term233682, term233682.getClass(), "maximumTrustlines", null);
        setField(term233682, term233682.getClass(), "dropType", null);
        setField(term233682, term233682.getClass(), "lockUuid", null);
        setField(term233682, term233682.getClass(), "failReason", null);
        setField(term233682, term233682.getClass(), "feesPaid", null);
        setField(term233682, term233682.getClass(), "minBalance", null);
        setField(term233682, term233682.getClass(), "maxBalance", null);
        setField(term233682, term233682.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233682, term233682.getClass(), "retryOfId", null);
        setField(term233682, term233682.getClass(), "nftIssuerAddress", null);
        setField(term233682, term233682.getClass(), "nftTaxon", null);
        setField(term233682, term233682.getClass(), "contactEmail", null);
        setField(term233682, term233682.getClass(), "autoApprove", null);
        setField(term233682, term233682.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSnapshotTrustlineIssuerClassicAddress", argTypes, term233682, args);
    }

};


