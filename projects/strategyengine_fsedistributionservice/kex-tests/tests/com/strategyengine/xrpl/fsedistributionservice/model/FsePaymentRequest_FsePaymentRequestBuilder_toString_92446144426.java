package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;

public class FsePaymentRequest_FsePaymentRequestBuilder_toString_92446144426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term598328;

    public FsePaymentRequest_FsePaymentRequestBuilder_toString_92446144426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term598377 = new ArrayList();
        ((ArrayList) term598377).add("twjymkvbft");
        Long term598458 = new Long(7842681756773659507L);
        Class<? extends Object> term598632 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term598631 = ((Class) term598632).getDeclaredField((String) "FLAT");
        ((Field) term598631).setAccessible(true);
        Object enum1123 = ((Field) term598631).get((Object) null);
        Long term598504 = new Long(4491201672462106083L);
        Class<? extends Object> term599036 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term599035 = ((Class) term599036).getDeclaredField((String) "WEEKLY");
        ((Field) term599035).setAccessible(true);
        Object enum1124 = ((Field) term599035).get((Object) null);
        term598328 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term598405 = newInstance(Class.forName("java.util.Date"));
        Object term598516 = newInstance(Class.forName("java.util.Date"));
        setField(term598328, term598328.getClass(), "memo", "iQPdAhoTek");
        setField(term598328, term598328.getClass(), "fromClassicAddress", "IBmkVoFQfR");
        setField(term598328, term598328.getClass(), "fromSigningPublicKey", "fvqExLyjOZ");
        setField(term598328, term598328.getClass(), "fromPrivateKey", "XkzjjKogww");
        setField(term598328, term598328.getClass(), "toClassicAddresses", term598377);
        setField(term598328, term598328.getClass(), "amount", "YwLqpBnVFV");
        setLongField(term598405, term598405.getClass(), "fastTime", 1425956280345L);
        setField(term598405, term598405.getClass(), "cdate", null);
        setField(term598328, term598328.getClass(), "startTime", term598405);
        setField(term598328, term598328.getClass(), "destinationTag", "brGgmTeuRs");
        setField(term598328, term598328.getClass(), "trustlineIssuerClassicAddress", "zMLmSyuwNB");
        setField(term598328, term598328.getClass(), "currencyName", "QtjqcVtEVk");
        setBooleanField(term598328, term598328.getClass(), "agreeFee", false);
        setField(term598328, term598328.getClass(), "maxXrpFeePerTransaction", "KggRnGvBBV");
        setBooleanField(term598328, term598328.getClass(), "globalIdVerified", true);
        setBooleanField(term598328, term598328.getClass(), "useBlacklist", true);
        setField(term598328, term598328.getClass(), "retryOfId", term598458);
        setField(term598328, term598328.getClass(), "paymentType", enum1123);
        setField(term598328, term598328.getClass(), "snapshotTrustlineIssuerClassicAddress", "xqIPePiGzm");
        setField(term598328, term598328.getClass(), "snapshotCurrencyName", "aTdFvWUkRg");
        setField(term598328, term598328.getClass(), "nftIssuingAddress", "EvatbEpuBU");
        setField(term598328, term598328.getClass(), "nftTaxon", term598504);
        setField(term598328, term598328.getClass(), "frequency", enum1124);
        setLongField(term598516, term598516.getClass(), "fastTime", 1846633431500L);
        setField(term598516, term598516.getClass(), "cdate", null);
        setField(term598328, term598328.getClass(), "repeatUntilDate", term598516);
        setField(term598328, term598328.getClass(), "email", "HKZGEhlODe");
        setBooleanField(term598328, term598328.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term598328, args);
    }

};


