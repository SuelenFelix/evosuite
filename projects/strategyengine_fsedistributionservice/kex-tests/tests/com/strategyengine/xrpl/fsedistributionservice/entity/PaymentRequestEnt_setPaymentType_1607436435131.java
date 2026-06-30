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

public class PaymentRequestEnt_setPaymentType_1607436435131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233719;

    public PaymentRequestEnt_setPaymentType_1607436435131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233719 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233719, term233719.getClass(), "id", null);
        setField(term233719, term233719.getClass(), "environment", null);
        setField(term233719, term233719.getClass(), "populateEnvironment", null);
        setField(term233719, term233719.getClass(), "createDate", null);
        setField(term233719, term233719.getClass(), "updateDate", null);
        setField(term233719, term233719.getClass(), "startTime", null);
        setField(term233719, term233719.getClass(), "status", null);
        setField(term233719, term233719.getClass(), "fromClassicAddress", null);
        setField(term233719, term233719.getClass(), "fromSigningPublicKey", null);
        setField(term233719, term233719.getClass(), "fromPrivateKey", null);
        setField(term233719, term233719.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233719, term233719.getClass(), "currencyName", null);
        setField(term233719, term233719.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233719, term233719.getClass(), "snapshotCurrencyName", null);
        setField(term233719, term233719.getClass(), "currencyNameForProcess", null);
        setField(term233719, term233719.getClass(), "amount", null);
        setField(term233719, term233719.getClass(), "paymentType", null);
        setField(term233719, term233719.getClass(), "newTrustlinesOnly", null);
        setField(term233719, term233719.getClass(), "useBlacklist", null);
        setField(term233719, term233719.getClass(), "maximumTrustlines", null);
        setField(term233719, term233719.getClass(), "dropType", null);
        setField(term233719, term233719.getClass(), "lockUuid", null);
        setField(term233719, term233719.getClass(), "failReason", null);
        setField(term233719, term233719.getClass(), "feesPaid", null);
        setField(term233719, term233719.getClass(), "minBalance", null);
        setField(term233719, term233719.getClass(), "maxBalance", null);
        setField(term233719, term233719.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233719, term233719.getClass(), "retryOfId", null);
        setField(term233719, term233719.getClass(), "nftIssuerAddress", null);
        setField(term233719, term233719.getClass(), "nftTaxon", null);
        setField(term233719, term233719.getClass(), "contactEmail", null);
        setField(term233719, term233719.getClass(), "autoApprove", null);
        setField(term233719, term233719.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPaymentType", argTypes, term233719, args);
    }

};


