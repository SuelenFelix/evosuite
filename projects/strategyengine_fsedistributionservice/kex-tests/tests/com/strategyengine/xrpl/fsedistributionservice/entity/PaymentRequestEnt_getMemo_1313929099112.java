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

public class PaymentRequestEnt_getMemo_1313929099112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233702;

    public PaymentRequestEnt_getMemo_1313929099112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233702 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233702, term233702.getClass(), "id", null);
        setField(term233702, term233702.getClass(), "environment", null);
        setField(term233702, term233702.getClass(), "populateEnvironment", null);
        setField(term233702, term233702.getClass(), "createDate", null);
        setField(term233702, term233702.getClass(), "updateDate", null);
        setField(term233702, term233702.getClass(), "startTime", null);
        setField(term233702, term233702.getClass(), "status", null);
        setField(term233702, term233702.getClass(), "fromClassicAddress", null);
        setField(term233702, term233702.getClass(), "fromSigningPublicKey", null);
        setField(term233702, term233702.getClass(), "fromPrivateKey", null);
        setField(term233702, term233702.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233702, term233702.getClass(), "currencyName", null);
        setField(term233702, term233702.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233702, term233702.getClass(), "snapshotCurrencyName", null);
        setField(term233702, term233702.getClass(), "currencyNameForProcess", null);
        setField(term233702, term233702.getClass(), "amount", null);
        setField(term233702, term233702.getClass(), "paymentType", null);
        setField(term233702, term233702.getClass(), "newTrustlinesOnly", null);
        setField(term233702, term233702.getClass(), "useBlacklist", null);
        setField(term233702, term233702.getClass(), "maximumTrustlines", null);
        setField(term233702, term233702.getClass(), "dropType", null);
        setField(term233702, term233702.getClass(), "lockUuid", null);
        setField(term233702, term233702.getClass(), "failReason", null);
        setField(term233702, term233702.getClass(), "feesPaid", null);
        setField(term233702, term233702.getClass(), "minBalance", null);
        setField(term233702, term233702.getClass(), "maxBalance", null);
        setField(term233702, term233702.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233702, term233702.getClass(), "retryOfId", null);
        setField(term233702, term233702.getClass(), "nftIssuerAddress", null);
        setField(term233702, term233702.getClass(), "nftTaxon", null);
        setField(term233702, term233702.getClass(), "contactEmail", null);
        setField(term233702, term233702.getClass(), "autoApprove", null);
        setField(term233702, term233702.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemo", argTypes, term233702, args);
    }

};


