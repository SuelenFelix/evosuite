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

public class PaymentRequestEnt_PaymentRequestEntBuilder_toString_169495621071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109391;

    public PaymentRequestEnt_PaymentRequestEntBuilder_toString_169495621071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109391 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        setField(term109391, term109391.getClass(), "id", null);
        setField(term109391, term109391.getClass(), "environment", null);
        setField(term109391, term109391.getClass(), "populateEnvironment", null);
        setField(term109391, term109391.getClass(), "createDate", null);
        setField(term109391, term109391.getClass(), "updateDate", null);
        setField(term109391, term109391.getClass(), "startTime", null);
        setField(term109391, term109391.getClass(), "status", null);
        setField(term109391, term109391.getClass(), "fromClassicAddress", null);
        setField(term109391, term109391.getClass(), "fromSigningPublicKey", null);
        setField(term109391, term109391.getClass(), "fromPrivateKey", null);
        setField(term109391, term109391.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term109391, term109391.getClass(), "currencyName", null);
        setField(term109391, term109391.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term109391, term109391.getClass(), "snapshotCurrencyName", null);
        setField(term109391, term109391.getClass(), "currencyNameForProcess", null);
        setField(term109391, term109391.getClass(), "amount", null);
        setField(term109391, term109391.getClass(), "paymentType", null);
        setField(term109391, term109391.getClass(), "newTrustlinesOnly", null);
        setField(term109391, term109391.getClass(), "useBlacklist", null);
        setField(term109391, term109391.getClass(), "maximumTrustlines", null);
        setField(term109391, term109391.getClass(), "dropType", null);
        setField(term109391, term109391.getClass(), "lockUuid", null);
        setField(term109391, term109391.getClass(), "failReason", null);
        setField(term109391, term109391.getClass(), "feesPaid", null);
        setField(term109391, term109391.getClass(), "minBalance", null);
        setField(term109391, term109391.getClass(), "maxBalance", null);
        setField(term109391, term109391.getClass(), "maxXrpFeePerTransaction", null);
        setField(term109391, term109391.getClass(), "retryOfId", null);
        setField(term109391, term109391.getClass(), "nftIssuerAddress", null);
        setField(term109391, term109391.getClass(), "nftTaxon", null);
        setField(term109391, term109391.getClass(), "contactEmail", null);
        setField(term109391, term109391.getClass(), "autoApprove", null);
        setField(term109391, term109391.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term109391, args);
    }

};


