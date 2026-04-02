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

public class PaymentRequestEnt_hashCode_35351378778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233668;

    public PaymentRequestEnt_hashCode_35351378778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233668 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233668, term233668.getClass(), "id", null);
        setField(term233668, term233668.getClass(), "environment", null);
        setField(term233668, term233668.getClass(), "populateEnvironment", null);
        setField(term233668, term233668.getClass(), "createDate", null);
        setField(term233668, term233668.getClass(), "updateDate", null);
        setField(term233668, term233668.getClass(), "startTime", null);
        setField(term233668, term233668.getClass(), "status", null);
        setField(term233668, term233668.getClass(), "fromClassicAddress", null);
        setField(term233668, term233668.getClass(), "fromSigningPublicKey", null);
        setField(term233668, term233668.getClass(), "fromPrivateKey", null);
        setField(term233668, term233668.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233668, term233668.getClass(), "currencyName", null);
        setField(term233668, term233668.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233668, term233668.getClass(), "snapshotCurrencyName", null);
        setField(term233668, term233668.getClass(), "currencyNameForProcess", null);
        setField(term233668, term233668.getClass(), "amount", null);
        setField(term233668, term233668.getClass(), "paymentType", null);
        setField(term233668, term233668.getClass(), "newTrustlinesOnly", null);
        setField(term233668, term233668.getClass(), "useBlacklist", null);
        setField(term233668, term233668.getClass(), "maximumTrustlines", null);
        setField(term233668, term233668.getClass(), "dropType", null);
        setField(term233668, term233668.getClass(), "lockUuid", null);
        setField(term233668, term233668.getClass(), "failReason", null);
        setField(term233668, term233668.getClass(), "feesPaid", null);
        setField(term233668, term233668.getClass(), "minBalance", null);
        setField(term233668, term233668.getClass(), "maxBalance", null);
        setField(term233668, term233668.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233668, term233668.getClass(), "retryOfId", null);
        setField(term233668, term233668.getClass(), "nftIssuerAddress", null);
        setField(term233668, term233668.getClass(), "nftTaxon", null);
        setField(term233668, term233668.getClass(), "contactEmail", null);
        setField(term233668, term233668.getClass(), "autoApprove", null);
        setField(term233668, term233668.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term233668, args);
    }

};


