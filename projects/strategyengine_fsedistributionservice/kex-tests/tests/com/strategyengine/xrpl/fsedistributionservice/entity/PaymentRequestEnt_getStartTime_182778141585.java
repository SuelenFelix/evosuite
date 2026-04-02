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

public class PaymentRequestEnt_getStartTime_182778141585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233675;

    public PaymentRequestEnt_getStartTime_182778141585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233675 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233675, term233675.getClass(), "id", null);
        setField(term233675, term233675.getClass(), "environment", null);
        setField(term233675, term233675.getClass(), "populateEnvironment", null);
        setField(term233675, term233675.getClass(), "createDate", null);
        setField(term233675, term233675.getClass(), "updateDate", null);
        setField(term233675, term233675.getClass(), "startTime", null);
        setField(term233675, term233675.getClass(), "status", null);
        setField(term233675, term233675.getClass(), "fromClassicAddress", null);
        setField(term233675, term233675.getClass(), "fromSigningPublicKey", null);
        setField(term233675, term233675.getClass(), "fromPrivateKey", null);
        setField(term233675, term233675.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233675, term233675.getClass(), "currencyName", null);
        setField(term233675, term233675.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233675, term233675.getClass(), "snapshotCurrencyName", null);
        setField(term233675, term233675.getClass(), "currencyNameForProcess", null);
        setField(term233675, term233675.getClass(), "amount", null);
        setField(term233675, term233675.getClass(), "paymentType", null);
        setField(term233675, term233675.getClass(), "newTrustlinesOnly", null);
        setField(term233675, term233675.getClass(), "useBlacklist", null);
        setField(term233675, term233675.getClass(), "maximumTrustlines", null);
        setField(term233675, term233675.getClass(), "dropType", null);
        setField(term233675, term233675.getClass(), "lockUuid", null);
        setField(term233675, term233675.getClass(), "failReason", null);
        setField(term233675, term233675.getClass(), "feesPaid", null);
        setField(term233675, term233675.getClass(), "minBalance", null);
        setField(term233675, term233675.getClass(), "maxBalance", null);
        setField(term233675, term233675.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233675, term233675.getClass(), "retryOfId", null);
        setField(term233675, term233675.getClass(), "nftIssuerAddress", null);
        setField(term233675, term233675.getClass(), "nftTaxon", null);
        setField(term233675, term233675.getClass(), "contactEmail", null);
        setField(term233675, term233675.getClass(), "autoApprove", null);
        setField(term233675, term233675.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartTime", argTypes, term233675, args);
    }

};


