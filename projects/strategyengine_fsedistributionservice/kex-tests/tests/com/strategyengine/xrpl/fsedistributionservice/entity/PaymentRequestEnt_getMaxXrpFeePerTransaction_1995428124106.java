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

public class PaymentRequestEnt_getMaxXrpFeePerTransaction_1995428124106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233696;

    public PaymentRequestEnt_getMaxXrpFeePerTransaction_1995428124106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233696 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233696, term233696.getClass(), "id", null);
        setField(term233696, term233696.getClass(), "environment", null);
        setField(term233696, term233696.getClass(), "populateEnvironment", null);
        setField(term233696, term233696.getClass(), "createDate", null);
        setField(term233696, term233696.getClass(), "updateDate", null);
        setField(term233696, term233696.getClass(), "startTime", null);
        setField(term233696, term233696.getClass(), "status", null);
        setField(term233696, term233696.getClass(), "fromClassicAddress", null);
        setField(term233696, term233696.getClass(), "fromSigningPublicKey", null);
        setField(term233696, term233696.getClass(), "fromPrivateKey", null);
        setField(term233696, term233696.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233696, term233696.getClass(), "currencyName", null);
        setField(term233696, term233696.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233696, term233696.getClass(), "snapshotCurrencyName", null);
        setField(term233696, term233696.getClass(), "currencyNameForProcess", null);
        setField(term233696, term233696.getClass(), "amount", null);
        setField(term233696, term233696.getClass(), "paymentType", null);
        setField(term233696, term233696.getClass(), "newTrustlinesOnly", null);
        setField(term233696, term233696.getClass(), "useBlacklist", null);
        setField(term233696, term233696.getClass(), "maximumTrustlines", null);
        setField(term233696, term233696.getClass(), "dropType", null);
        setField(term233696, term233696.getClass(), "lockUuid", null);
        setField(term233696, term233696.getClass(), "failReason", null);
        setField(term233696, term233696.getClass(), "feesPaid", null);
        setField(term233696, term233696.getClass(), "minBalance", null);
        setField(term233696, term233696.getClass(), "maxBalance", null);
        setField(term233696, term233696.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233696, term233696.getClass(), "retryOfId", null);
        setField(term233696, term233696.getClass(), "nftIssuerAddress", null);
        setField(term233696, term233696.getClass(), "nftTaxon", null);
        setField(term233696, term233696.getClass(), "contactEmail", null);
        setField(term233696, term233696.getClass(), "autoApprove", null);
        setField(term233696, term233696.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxXrpFeePerTransaction", argTypes, term233696, args);
    }

};


