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

public class PaymentRequestEnt_toBuilder_137954713475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233665;

    public PaymentRequestEnt_toBuilder_137954713475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233665 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233665, term233665.getClass(), "id", null);
        setField(term233665, term233665.getClass(), "environment", null);
        setField(term233665, term233665.getClass(), "populateEnvironment", null);
        setField(term233665, term233665.getClass(), "createDate", null);
        setField(term233665, term233665.getClass(), "updateDate", null);
        setField(term233665, term233665.getClass(), "startTime", null);
        setField(term233665, term233665.getClass(), "status", null);
        setField(term233665, term233665.getClass(), "fromClassicAddress", null);
        setField(term233665, term233665.getClass(), "fromSigningPublicKey", null);
        setField(term233665, term233665.getClass(), "fromPrivateKey", null);
        setField(term233665, term233665.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233665, term233665.getClass(), "currencyName", null);
        setField(term233665, term233665.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233665, term233665.getClass(), "snapshotCurrencyName", null);
        setField(term233665, term233665.getClass(), "currencyNameForProcess", null);
        setField(term233665, term233665.getClass(), "amount", null);
        setField(term233665, term233665.getClass(), "paymentType", null);
        setField(term233665, term233665.getClass(), "newTrustlinesOnly", null);
        setField(term233665, term233665.getClass(), "useBlacklist", null);
        setField(term233665, term233665.getClass(), "maximumTrustlines", null);
        setField(term233665, term233665.getClass(), "dropType", null);
        setField(term233665, term233665.getClass(), "lockUuid", null);
        setField(term233665, term233665.getClass(), "failReason", null);
        setField(term233665, term233665.getClass(), "feesPaid", null);
        setField(term233665, term233665.getClass(), "minBalance", null);
        setField(term233665, term233665.getClass(), "maxBalance", null);
        setField(term233665, term233665.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233665, term233665.getClass(), "retryOfId", null);
        setField(term233665, term233665.getClass(), "nftIssuerAddress", null);
        setField(term233665, term233665.getClass(), "nftTaxon", null);
        setField(term233665, term233665.getClass(), "contactEmail", null);
        setField(term233665, term233665.getClass(), "autoApprove", null);
        setField(term233665, term233665.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term233665, args);
    }

};


