package com.strategyengine.xrpl.fsedistributionservice.service.impl;

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
import static com.strategyengine.xrpl.fsedistributionservice.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;

public class PaymentServiceImpl_allowPayment_9852790211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6892;
     Object term7167;

    public PaymentServiceImpl_allowPayment_9852790211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6941 = new ArrayList();
        ((ArrayList) term6941).add("gCWtLVKVVe");
        ((ArrayList) term6941).add("fWKJoSoCwE");
        ((ArrayList) term6941).add("wfaXBpWAUH");
        ((ArrayList) term6941).add("VMeAzAHwZj");
        ((ArrayList) term6941).add("PznxWXsZME");
        ((ArrayList) term6941).add("ZzIujlwVsw");
        ((ArrayList) term6941).add("LWyEaeIyAo");
        Long term7094 = new Long(6617340557564669657L);
        Class<? extends Object> term7423 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term7422 = ((Class) term7423).getDeclaredField((String) "FLAT");
        ((Field) term7422).setAccessible(true);
        Object enum11 = ((Field) term7422).get((Object) null);
        Long term7140 = new Long(1439298019805881866L);
        Class<? extends Object> term7827 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term7826 = ((Class) term7827).getDeclaredField((String) "WEEKLY");
        ((Field) term7826).setAccessible(true);
        Object enum12 = ((Field) term7826).get((Object) null);
        term6892 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term7041 = newInstance(Class.forName("java.util.Date"));
        Object term7152 = newInstance(Class.forName("java.util.Date"));
        setField(term6892, term6892.getClass(), "memo", "OJJtVNPyKZ");
        setField(term6892, term6892.getClass(), "fromClassicAddress", "AKNapTAfmD");
        setField(term6892, term6892.getClass(), "fromSigningPublicKey", "xJgPlLxpgC");
        setField(term6892, term6892.getClass(), "fromPrivateKey", "EYtfuJaxiM");
        setField(term6892, term6892.getClass(), "toClassicAddresses", term6941);
        setField(term6892, term6892.getClass(), "amount", "yVMkkQhvmN");
        setLongField(term7041, term7041.getClass(), "fastTime", 1668569229825L);
        setField(term7041, term7041.getClass(), "cdate", null);
        setField(term6892, term6892.getClass(), "startTime", term7041);
        setField(term6892, term6892.getClass(), "destinationTag", "mvrkADEgpp");
        setField(term6892, term6892.getClass(), "trustlineIssuerClassicAddress", "pXOkjyeIRb");
        setField(term6892, term6892.getClass(), "currencyName", "GgZWSjxjyE");
        setBooleanField(term6892, term6892.getClass(), "agreeFee", true);
        setField(term6892, term6892.getClass(), "maxXrpFeePerTransaction", "EeBVbzjcCI");
        setBooleanField(term6892, term6892.getClass(), "globalIdVerified", true);
        setBooleanField(term6892, term6892.getClass(), "useBlacklist", true);
        setField(term6892, term6892.getClass(), "retryOfId", term7094);
        setField(term6892, term6892.getClass(), "paymentType", enum11);
        setField(term6892, term6892.getClass(), "snapshotTrustlineIssuerClassicAddress", "UfQtPRyWRC");
        setField(term6892, term6892.getClass(), "snapshotCurrencyName", "FPvxVzzSvD");
        setField(term6892, term6892.getClass(), "nftIssuingAddress", "WHcwFgsGFC");
        setField(term6892, term6892.getClass(), "nftTaxon", term7140);
        setField(term6892, term6892.getClass(), "frequency", enum12);
        setLongField(term7152, term7152.getClass(), "fastTime", 1725122217647L);
        setField(term7152, term7152.getClass(), "cdate", null);
        setField(term6892, term6892.getClass(), "repeatUntilDate", term7152);
        setField(term6892, term6892.getClass(), "email", "HzqpegHiRq");
        setBooleanField(term6892, term6892.getClass(), "autoApprove", true);
        Long term7168 = new Long(-8708192233349544946L);
        Class<? extends Object> term8237 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term8236 = ((Class) term8237).getDeclaredField((String) "VERIFIED");
        ((Field) term8236).setAccessible(true);
        Object enum13 = ((Field) term8236).get((Object) null);
        Integer term7222 = new Integer(-2038273078);
        Long term7224 = new Long(5907001541142728739L);
        term7167 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term7182 = newInstance(Class.forName("java.util.Date"));
        Object term7184 = newInstance(Class.forName("java.util.Date"));
        setField(term7167, term7167.getClass(), "id", term7168);
        setField(term7167, term7167.getClass(), "address", "jwsfVjMoJT");
        setLongField(term7182, term7182.getClass(), "fastTime", 1550698994689L);
        setField(term7182, term7182.getClass(), "cdate", null);
        setField(term7167, term7167.getClass(), "createDate", term7182);
        setLongField(term7184, term7184.getClass(), "fastTime", 1804998087131L);
        setField(term7184, term7184.getClass(), "cdate", null);
        setField(term7167, term7167.getClass(), "updateDate", term7184);
        setField(term7167, term7167.getClass(), "status", enum13);
        setField(term7167, term7167.getClass(), "failReason", "ZfdXfCCFDf");
        setField(term7167, term7167.getClass(), "code", "MwwjNtdOFT");
        setField(term7167, term7167.getClass(), "retryAttempt", term7222);
        setField(term7167, term7167.getClass(), "dropRequestId", term7224);
        setField(term7167, term7167.getClass(), "snapshotBalance", "VYkqXKVlAJ");
        setField(term7167, term7167.getClass(), "payAmount", "XkIoWJRNwN");
        setField(term7167, term7167.getClass(), "ownedNftId", "aNWLJdrZMq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.PaymentServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        argTypes[1] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Object[] args = new Object[2];
        args[0] = term6892;
        args[1] = term7167;
        callMethod(klass, "allowPayment", argTypes, null, args);
    }

};


