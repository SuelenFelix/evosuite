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

public class PaymentRequestEnt_PaymentRequestEntBuilder_currencyName_32935535248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109368;

    public PaymentRequestEnt_PaymentRequestEntBuilder_currencyName_32935535248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109368 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        setField(term109368, term109368.getClass(), "id", null);
        setField(term109368, term109368.getClass(), "environment", null);
        setField(term109368, term109368.getClass(), "populateEnvironment", null);
        setField(term109368, term109368.getClass(), "createDate", null);
        setField(term109368, term109368.getClass(), "updateDate", null);
        setField(term109368, term109368.getClass(), "startTime", null);
        setField(term109368, term109368.getClass(), "status", null);
        setField(term109368, term109368.getClass(), "fromClassicAddress", null);
        setField(term109368, term109368.getClass(), "fromSigningPublicKey", null);
        setField(term109368, term109368.getClass(), "fromPrivateKey", null);
        setField(term109368, term109368.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term109368, term109368.getClass(), "currencyName", null);
        setField(term109368, term109368.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term109368, term109368.getClass(), "snapshotCurrencyName", null);
        setField(term109368, term109368.getClass(), "currencyNameForProcess", null);
        setField(term109368, term109368.getClass(), "amount", null);
        setField(term109368, term109368.getClass(), "paymentType", null);
        setField(term109368, term109368.getClass(), "newTrustlinesOnly", null);
        setField(term109368, term109368.getClass(), "useBlacklist", null);
        setField(term109368, term109368.getClass(), "maximumTrustlines", null);
        setField(term109368, term109368.getClass(), "dropType", null);
        setField(term109368, term109368.getClass(), "lockUuid", null);
        setField(term109368, term109368.getClass(), "failReason", null);
        setField(term109368, term109368.getClass(), "feesPaid", null);
        setField(term109368, term109368.getClass(), "minBalance", null);
        setField(term109368, term109368.getClass(), "maxBalance", null);
        setField(term109368, term109368.getClass(), "maxXrpFeePerTransaction", null);
        setField(term109368, term109368.getClass(), "retryOfId", null);
        setField(term109368, term109368.getClass(), "nftIssuerAddress", null);
        setField(term109368, term109368.getClass(), "nftTaxon", null);
        setField(term109368, term109368.getClass(), "contactEmail", null);
        setField(term109368, term109368.getClass(), "autoApprove", null);
        setField(term109368, term109368.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "currencyName", argTypes, term109368, args);
    }

};


