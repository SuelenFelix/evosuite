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

public class PaymentRequestEnt_setCurrencyNameForProcess_1544029525129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233717;

    public PaymentRequestEnt_setCurrencyNameForProcess_1544029525129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233717 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233717, term233717.getClass(), "id", null);
        setField(term233717, term233717.getClass(), "environment", null);
        setField(term233717, term233717.getClass(), "populateEnvironment", null);
        setField(term233717, term233717.getClass(), "createDate", null);
        setField(term233717, term233717.getClass(), "updateDate", null);
        setField(term233717, term233717.getClass(), "startTime", null);
        setField(term233717, term233717.getClass(), "status", null);
        setField(term233717, term233717.getClass(), "fromClassicAddress", null);
        setField(term233717, term233717.getClass(), "fromSigningPublicKey", null);
        setField(term233717, term233717.getClass(), "fromPrivateKey", null);
        setField(term233717, term233717.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233717, term233717.getClass(), "currencyName", null);
        setField(term233717, term233717.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233717, term233717.getClass(), "snapshotCurrencyName", null);
        setField(term233717, term233717.getClass(), "currencyNameForProcess", null);
        setField(term233717, term233717.getClass(), "amount", null);
        setField(term233717, term233717.getClass(), "paymentType", null);
        setField(term233717, term233717.getClass(), "newTrustlinesOnly", null);
        setField(term233717, term233717.getClass(), "useBlacklist", null);
        setField(term233717, term233717.getClass(), "maximumTrustlines", null);
        setField(term233717, term233717.getClass(), "dropType", null);
        setField(term233717, term233717.getClass(), "lockUuid", null);
        setField(term233717, term233717.getClass(), "failReason", null);
        setField(term233717, term233717.getClass(), "feesPaid", null);
        setField(term233717, term233717.getClass(), "minBalance", null);
        setField(term233717, term233717.getClass(), "maxBalance", null);
        setField(term233717, term233717.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233717, term233717.getClass(), "retryOfId", null);
        setField(term233717, term233717.getClass(), "nftIssuerAddress", null);
        setField(term233717, term233717.getClass(), "nftTaxon", null);
        setField(term233717, term233717.getClass(), "contactEmail", null);
        setField(term233717, term233717.getClass(), "autoApprove", null);
        setField(term233717, term233717.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCurrencyNameForProcess", argTypes, term233717, args);
    }

};


