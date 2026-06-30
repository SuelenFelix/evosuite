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

public class PaymentRequestEnt_PaymentRequestEntBuilder_useBlacklist_99347049955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109375;

    public PaymentRequestEnt_PaymentRequestEntBuilder_useBlacklist_99347049955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109375 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        setField(term109375, term109375.getClass(), "id", null);
        setField(term109375, term109375.getClass(), "environment", null);
        setField(term109375, term109375.getClass(), "populateEnvironment", null);
        setField(term109375, term109375.getClass(), "createDate", null);
        setField(term109375, term109375.getClass(), "updateDate", null);
        setField(term109375, term109375.getClass(), "startTime", null);
        setField(term109375, term109375.getClass(), "status", null);
        setField(term109375, term109375.getClass(), "fromClassicAddress", null);
        setField(term109375, term109375.getClass(), "fromSigningPublicKey", null);
        setField(term109375, term109375.getClass(), "fromPrivateKey", null);
        setField(term109375, term109375.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term109375, term109375.getClass(), "currencyName", null);
        setField(term109375, term109375.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term109375, term109375.getClass(), "snapshotCurrencyName", null);
        setField(term109375, term109375.getClass(), "currencyNameForProcess", null);
        setField(term109375, term109375.getClass(), "amount", null);
        setField(term109375, term109375.getClass(), "paymentType", null);
        setField(term109375, term109375.getClass(), "newTrustlinesOnly", null);
        setField(term109375, term109375.getClass(), "useBlacklist", null);
        setField(term109375, term109375.getClass(), "maximumTrustlines", null);
        setField(term109375, term109375.getClass(), "dropType", null);
        setField(term109375, term109375.getClass(), "lockUuid", null);
        setField(term109375, term109375.getClass(), "failReason", null);
        setField(term109375, term109375.getClass(), "feesPaid", null);
        setField(term109375, term109375.getClass(), "minBalance", null);
        setField(term109375, term109375.getClass(), "maxBalance", null);
        setField(term109375, term109375.getClass(), "maxXrpFeePerTransaction", null);
        setField(term109375, term109375.getClass(), "retryOfId", null);
        setField(term109375, term109375.getClass(), "nftIssuerAddress", null);
        setField(term109375, term109375.getClass(), "nftTaxon", null);
        setField(term109375, term109375.getClass(), "contactEmail", null);
        setField(term109375, term109375.getClass(), "autoApprove", null);
        setField(term109375, term109375.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "useBlacklist", argTypes, term109375, args);
    }

};


