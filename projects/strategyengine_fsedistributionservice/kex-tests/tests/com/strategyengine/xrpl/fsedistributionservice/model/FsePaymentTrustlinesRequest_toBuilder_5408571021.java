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
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FsePaymentTrustlinesRequest_toBuilder_5408571021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18987;

    public FsePaymentTrustlinesRequest_toBuilder_5408571021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term19076 = new Integer(-6029667);
        Double term19078 = new Double(0.4569171842750229);
        Double term19080 = new Double(0.8598297828918529);
        Long term19094 = new Long(4178434741742309755L);
        Class<? extends Object> term19236 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term19235 = ((Class) term19236).getDeclaredField((String) "FLAT");
        ((Field) term19235).setAccessible(true);
        Object enum31 = ((Field) term19235).get((Object) null);
        Class<? extends Object> term19630 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term19629 = ((Class) term19630).getDeclaredField((String) "WEEKLY");
        ((Field) term19629).setAccessible(true);
        Object enum32 = ((Field) term19629).get((Object) null);
        term18987 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term19128 = newInstance(Class.forName("java.util.Date"));
        Object term19140 = newInstance(Class.forName("java.util.Date"));
        setField(term18987, term18987.getClass(), "memo", "zsWKWiTFuo");
        setField(term18987, term18987.getClass(), "fromClassicAddress", "UPUbwyHQKN");
        setField(term18987, term18987.getClass(), "fromSigningPublicKey", "lgQkrXANyI");
        setField(term18987, term18987.getClass(), "fromPrivateKey", "MeTmRZXErV");
        setField(term18987, term18987.getClass(), "trustlineIssuerClassicAddress", "jNxbVmoZgq");
        setField(term18987, term18987.getClass(), "currencyName", "PvmBHIXaMY");
        setField(term18987, term18987.getClass(), "amount", "hulYxtowxw");
        setBooleanField(term18987, term18987.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term18987, term18987.getClass(), "globalIdVerified", false);
        setBooleanField(term18987, term18987.getClass(), "useBlacklist", true);
        setBooleanField(term18987, term18987.getClass(), "agreeFee", false);
        setField(term18987, term18987.getClass(), "maximumTrustlines", term19076);
        setField(term18987, term18987.getClass(), "minBalance", term19078);
        setField(term18987, term18987.getClass(), "maxBalance", term19080);
        setField(term18987, term18987.getClass(), "maxXrpFeePerTransaction", "GNEmuHPNcU");
        setField(term18987, term18987.getClass(), "retryOfId", term19094);
        setField(term18987, term18987.getClass(), "paymentType", enum31);
        setField(term18987, term18987.getClass(), "snapshotTrustlineIssuerClassicAddress", "IoSfuKDFRe");
        setField(term18987, term18987.getClass(), "snapshotCurrencyName", "AWYyZiNfsm");
        setLongField(term19128, term19128.getClass(), "fastTime", 1550698994689L);
        setField(term19128, term19128.getClass(), "cdate", null);
        setField(term18987, term18987.getClass(), "startTime", term19128);
        setField(term18987, term18987.getClass(), "frequency", enum32);
        setLongField(term19140, term19140.getClass(), "fastTime", 1804998087131L);
        setField(term19140, term19140.getClass(), "cdate", null);
        setField(term18987, term18987.getClass(), "repeatUntilDate", term19140);
        setField(term18987, term18987.getClass(), "email", "ITRRYiuDwH");
        setBooleanField(term18987, term18987.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term18987, args);
    }

};


