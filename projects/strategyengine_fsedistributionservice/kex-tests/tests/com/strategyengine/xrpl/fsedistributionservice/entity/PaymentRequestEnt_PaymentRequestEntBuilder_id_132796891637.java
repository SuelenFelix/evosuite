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

public class PaymentRequestEnt_PaymentRequestEntBuilder_id_132796891637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109357;

    public PaymentRequestEnt_PaymentRequestEntBuilder_id_132796891637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109357 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        setField(term109357, term109357.getClass(), "id", null);
        setField(term109357, term109357.getClass(), "environment", null);
        setField(term109357, term109357.getClass(), "populateEnvironment", null);
        setField(term109357, term109357.getClass(), "createDate", null);
        setField(term109357, term109357.getClass(), "updateDate", null);
        setField(term109357, term109357.getClass(), "startTime", null);
        setField(term109357, term109357.getClass(), "status", null);
        setField(term109357, term109357.getClass(), "fromClassicAddress", null);
        setField(term109357, term109357.getClass(), "fromSigningPublicKey", null);
        setField(term109357, term109357.getClass(), "fromPrivateKey", null);
        setField(term109357, term109357.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term109357, term109357.getClass(), "currencyName", null);
        setField(term109357, term109357.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term109357, term109357.getClass(), "snapshotCurrencyName", null);
        setField(term109357, term109357.getClass(), "currencyNameForProcess", null);
        setField(term109357, term109357.getClass(), "amount", null);
        setField(term109357, term109357.getClass(), "paymentType", null);
        setField(term109357, term109357.getClass(), "newTrustlinesOnly", null);
        setField(term109357, term109357.getClass(), "useBlacklist", null);
        setField(term109357, term109357.getClass(), "maximumTrustlines", null);
        setField(term109357, term109357.getClass(), "dropType", null);
        setField(term109357, term109357.getClass(), "lockUuid", null);
        setField(term109357, term109357.getClass(), "failReason", null);
        setField(term109357, term109357.getClass(), "feesPaid", null);
        setField(term109357, term109357.getClass(), "minBalance", null);
        setField(term109357, term109357.getClass(), "maxBalance", null);
        setField(term109357, term109357.getClass(), "maxXrpFeePerTransaction", null);
        setField(term109357, term109357.getClass(), "retryOfId", null);
        setField(term109357, term109357.getClass(), "nftIssuerAddress", null);
        setField(term109357, term109357.getClass(), "nftTaxon", null);
        setField(term109357, term109357.getClass(), "contactEmail", null);
        setField(term109357, term109357.getClass(), "autoApprove", null);
        setField(term109357, term109357.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "id", argTypes, term109357, args);
    }

};


