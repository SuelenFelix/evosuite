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

public class PaymentRequestEnt_setUseBlacklist_1043539302133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233721;

    public PaymentRequestEnt_setUseBlacklist_1043539302133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233721 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        setField(term233721, term233721.getClass(), "id", null);
        setField(term233721, term233721.getClass(), "environment", null);
        setField(term233721, term233721.getClass(), "populateEnvironment", null);
        setField(term233721, term233721.getClass(), "createDate", null);
        setField(term233721, term233721.getClass(), "updateDate", null);
        setField(term233721, term233721.getClass(), "startTime", null);
        setField(term233721, term233721.getClass(), "status", null);
        setField(term233721, term233721.getClass(), "fromClassicAddress", null);
        setField(term233721, term233721.getClass(), "fromSigningPublicKey", null);
        setField(term233721, term233721.getClass(), "fromPrivateKey", null);
        setField(term233721, term233721.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term233721, term233721.getClass(), "currencyName", null);
        setField(term233721, term233721.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term233721, term233721.getClass(), "snapshotCurrencyName", null);
        setField(term233721, term233721.getClass(), "currencyNameForProcess", null);
        setField(term233721, term233721.getClass(), "amount", null);
        setField(term233721, term233721.getClass(), "paymentType", null);
        setField(term233721, term233721.getClass(), "newTrustlinesOnly", null);
        setField(term233721, term233721.getClass(), "useBlacklist", null);
        setField(term233721, term233721.getClass(), "maximumTrustlines", null);
        setField(term233721, term233721.getClass(), "dropType", null);
        setField(term233721, term233721.getClass(), "lockUuid", null);
        setField(term233721, term233721.getClass(), "failReason", null);
        setField(term233721, term233721.getClass(), "feesPaid", null);
        setField(term233721, term233721.getClass(), "minBalance", null);
        setField(term233721, term233721.getClass(), "maxBalance", null);
        setField(term233721, term233721.getClass(), "maxXrpFeePerTransaction", null);
        setField(term233721, term233721.getClass(), "retryOfId", null);
        setField(term233721, term233721.getClass(), "nftIssuerAddress", null);
        setField(term233721, term233721.getClass(), "nftTaxon", null);
        setField(term233721, term233721.getClass(), "contactEmail", null);
        setField(term233721, term233721.getClass(), "autoApprove", null);
        setField(term233721, term233721.getClass(), "memo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUseBlacklist", argTypes, term233721, args);
    }

};


