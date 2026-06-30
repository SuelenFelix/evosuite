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

public class PaymentRequestEnt_PaymentRequestEntBuilder_feesPaid_137034059760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109380;

    public PaymentRequestEnt_PaymentRequestEntBuilder_feesPaid_137034059760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109380 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        setField(term109380, term109380.getClass(), "id", null);
        setField(term109380, term109380.getClass(), "environment", null);
        setField(term109380, term109380.getClass(), "populateEnvironment", null);
        setField(term109380, term109380.getClass(), "createDate", null);
        setField(term109380, term109380.getClass(), "updateDate", null);
        setField(term109380, term109380.getClass(), "startTime", null);
        setField(term109380, term109380.getClass(), "status", null);
        setField(term109380, term109380.getClass(), "fromClassicAddress", null);
        setField(term109380, term109380.getClass(), "fromSigningPublicKey", null);
        setField(term109380, term109380.getClass(), "fromPrivateKey", null);
        setField(term109380, term109380.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term109380, term109380.getClass(), "currencyName", null);
        setField(term109380, term109380.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term109380, term109380.getClass(), "snapshotCurrencyName", null);
        setField(term109380, term109380.getClass(), "currencyNameForProcess", null);
        setField(term109380, term109380.getClass(), "amount", null);
        setField(term109380, term109380.getClass(), "paymentType", null);
        setField(term109380, term109380.getClass(), "newTrustlinesOnly", null);
        setField(term109380, term109380.getClass(), "useBlacklist", null);
        setField(term109380, term109380.getClass(), "maximumTrustlines", null);
        setField(term109380, term109380.getClass(), "dropType", null);
        setField(term109380, term109380.getClass(), "lockUuid", null);
        setField(term109380, term109380.getClass(), "failReason", null);
        setField(term109380, term109380.getClass(), "feesPaid", null);
        setField(term109380, term109380.getClass(), "minBalance", null);
        setField(term109380, term109380.getClass(), "maxBalance", null);
        setField(term109380, term109380.getClass(), "maxXrpFeePerTransaction", null);
        setField(term109380, term109380.getClass(), "retryOfId", null);
        setField(term109380, term109380.getClass(), "nftIssuerAddress", null);
        setField(term109380, term109380.getClass(), "nftTaxon", null);
        setField(term109380, term109380.getClass(), "contactEmail", null);
        setField(term109380, term109380.getClass(), "autoApprove", null);
        setField(term109380, term109380.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "feesPaid", argTypes, term109380, args);
    }

};


