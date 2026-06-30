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

public class FsePaymentTrustlinesRequest_setPaymentType_124212358548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68121;
     Object enum125;

    public FsePaymentTrustlinesRequest_setPaymentType_124212358548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term68210 = new Integer(-112921587);
        Double term68212 = new Double(0.6561919196821765);
        Double term68214 = new Double(0.7330178886612495);
        Long term68228 = new Long(2848819812340321742L);
        Class<? extends Object> term68385 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term68384 = ((Class) term68385).getDeclaredField((String) "FLAT");
        ((Field) term68384).setAccessible(true);
        Object enum123 = ((Field) term68384).get((Object) null);
        Class<? extends Object> term68779 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term68778 = ((Class) term68779).getDeclaredField((String) "DAILY");
        ((Field) term68778).setAccessible(true);
        Object enum124 = ((Field) term68778).get((Object) null);
        term68121 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term68262 = newInstance(Class.forName("java.util.Date"));
        Object term68273 = newInstance(Class.forName("java.util.Date"));
        setField(term68121, term68121.getClass(), "memo", "DQrjPcLysX");
        setField(term68121, term68121.getClass(), "fromClassicAddress", "VWPFyrpmmb");
        setField(term68121, term68121.getClass(), "fromSigningPublicKey", "gYYKrIeThw");
        setField(term68121, term68121.getClass(), "fromPrivateKey", "UsxeLMVkAK");
        setField(term68121, term68121.getClass(), "trustlineIssuerClassicAddress", "ITrhiKKzcb");
        setField(term68121, term68121.getClass(), "currencyName", "qMKmSzOQXg");
        setField(term68121, term68121.getClass(), "amount", "CURQCMkqbZ");
        setBooleanField(term68121, term68121.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term68121, term68121.getClass(), "globalIdVerified", true);
        setBooleanField(term68121, term68121.getClass(), "useBlacklist", true);
        setBooleanField(term68121, term68121.getClass(), "agreeFee", true);
        setField(term68121, term68121.getClass(), "maximumTrustlines", term68210);
        setField(term68121, term68121.getClass(), "minBalance", term68212);
        setField(term68121, term68121.getClass(), "maxBalance", term68214);
        setField(term68121, term68121.getClass(), "maxXrpFeePerTransaction", "VZwkkQktrm");
        setField(term68121, term68121.getClass(), "retryOfId", term68228);
        setField(term68121, term68121.getClass(), "paymentType", enum123);
        setField(term68121, term68121.getClass(), "snapshotTrustlineIssuerClassicAddress", "wIuJvIvEMb");
        setField(term68121, term68121.getClass(), "snapshotCurrencyName", "EyojsbSjWT");
        setLongField(term68262, term68262.getClass(), "fastTime", 1655668811013L);
        setField(term68262, term68262.getClass(), "cdate", null);
        setField(term68121, term68121.getClass(), "startTime", term68262);
        setField(term68121, term68121.getClass(), "frequency", enum124);
        setLongField(term68273, term68273.getClass(), "fastTime", 1319355084958L);
        setField(term68273, term68273.getClass(), "cdate", null);
        setField(term68121, term68121.getClass(), "repeatUntilDate", term68273);
        setField(term68121, term68121.getClass(), "email", "szGicGyWDL");
        setBooleanField(term68121, term68121.getClass(), "autoApprove", true);
        Class<? extends Object> term69176 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term69175 = ((Class) term69176).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term69175).setAccessible(true);
        enum125 = ((Field) term69175).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Object[] args = new Object[1];
        args[0] = enum125;
        callMethod(klass, "setPaymentType", argTypes, term68121, args);
    }

};


