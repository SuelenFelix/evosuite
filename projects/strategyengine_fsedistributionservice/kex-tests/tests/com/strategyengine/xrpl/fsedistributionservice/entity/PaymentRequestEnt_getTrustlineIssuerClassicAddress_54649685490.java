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

public class PaymentRequestEnt_getTrustlineIssuerClassicAddress_54649685490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233680;

    public PaymentRequestEnt_getTrustlineIssuerClassicAddress_54649685490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233680 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233680, term233680.getClass(), "id", null);
        setField(term233680, term233680.getClass(), "environment", null);
        setField(term233680, term233680.getClass(), "populateEnvironment", null);
        setField(term233680, term233680.getClass(), "createDate", null);
        setField(term233680, term233680.getClass(), "updateDate", null);
        setField(term233680, term233680.getClass(), "startTime", null);
        setField(term233680, term233680.getClass(), "status", null);
        setField(term233680, term233680.getClass(), "fromClassicAddress", null);
        setField(term233680, term233680.getClass(), "fromSigningPublicKey", null);
        setField(term233680, term233680.getClass(), "fromPrivateKey", null);
        setField(term233680, term233680.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233680, term233680.getClass(), "currencyName", null);
        setField(term233680, term233680.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233680, term233680.getClass(), "snapshotCurrencyName", null);
        setField(term233680, term233680.getClass(), "currencyNameForProcess", null);
        setField(term233680, term233680.getClass(), "amount", null);
        setField(term233680, term233680.getClass(), "paymentType", null);
        setField(term233680, term233680.getClass(), "newTrustlinesOnly", null);
        setField(term233680, term233680.getClass(), "useBlacklist", null);
        setField(term233680, term233680.getClass(), "maximumTrustlines", null);
        setField(term233680, term233680.getClass(), "dropType", null);
        setField(term233680, term233680.getClass(), "lockUuid", null);
        setField(term233680, term233680.getClass(), "failReason", null);
        setField(term233680, term233680.getClass(), "feesPaid", null);
        setField(term233680, term233680.getClass(), "minBalance", null);
        setField(term233680, term233680.getClass(), "maxBalance", null);
        setField(term233680, term233680.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233680, term233680.getClass(), "retryOfId", null);
        setField(term233680, term233680.getClass(), "nftIssuerAddress", null);
        setField(term233680, term233680.getClass(), "nftTaxon", null);
        setField(term233680, term233680.getClass(), "contactEmail", null);
        setField(term233680, term233680.getClass(), "autoApprove", null);
        setField(term233680, term233680.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrustlineIssuerClassicAddress", argTypes, term233680, args);
    }

};


