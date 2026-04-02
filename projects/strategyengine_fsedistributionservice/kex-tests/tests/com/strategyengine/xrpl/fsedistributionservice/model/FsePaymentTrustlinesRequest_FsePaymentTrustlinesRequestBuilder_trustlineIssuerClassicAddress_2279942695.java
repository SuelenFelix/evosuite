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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_trustlineIssuerClassicAddress_2279942695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419164;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_trustlineIssuerClassicAddress_2279942695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term419253 = new Integer(-1214628358);
        Double term419255 = new Double(0.4772043271031934);
        Double term419257 = new Double(0.2446504549754045);
        Long term419271 = new Long(-5567719604161729601L);
        Class<? extends Object> term419425 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term419424 = ((Class) term419425).getDeclaredField((String) "FLAT");
        ((Field) term419424).setAccessible(true);
        Object enum781 = ((Field) term419424).get((Object) null);
        Class<? extends Object> term419819 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term419818 = ((Class) term419819).getDeclaredField((String) "WEEKLY");
        ((Field) term419818).setAccessible(true);
        Object enum782 = ((Field) term419818).get((Object) null);
        term419164 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term419305 = newInstance(Class.forName("java.util.Date"));
        Object term419317 = newInstance(Class.forName("java.util.Date"));
        setField(term419164, term419164.getClass(), "memo", "FbmXCvKRwt");
        setField(term419164, term419164.getClass(), "fromClassicAddress", "vfuyVTMcUs");
        setField(term419164, term419164.getClass(), "fromSigningPublicKey", "opHgXUwQGP");
        setField(term419164, term419164.getClass(), "fromPrivateKey", "wjTDJQrHWE");
        setField(term419164, term419164.getClass(), "trustlineIssuerClassicAddress", "KSaLmJhcxE");
        setField(term419164, term419164.getClass(), "currencyName", "sryEMADEOO");
        setField(term419164, term419164.getClass(), "amount", "xKDNNGzjvj");
        setBooleanField(term419164, term419164.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term419164, term419164.getClass(), "globalIdVerified", true);
        setBooleanField(term419164, term419164.getClass(), "useBlacklist", false);
        setBooleanField(term419164, term419164.getClass(), "agreeFee", false);
        setField(term419164, term419164.getClass(), "maximumTrustlines", term419253);
        setField(term419164, term419164.getClass(), "minBalance", term419255);
        setField(term419164, term419164.getClass(), "maxBalance", term419257);
        setField(term419164, term419164.getClass(), "maxXrpFeePerTransaction", "ApBiNWRnEc");
        setField(term419164, term419164.getClass(), "retryOfId", term419271);
        setField(term419164, term419164.getClass(), "paymentType", enum781);
        setField(term419164, term419164.getClass(), "snapshotTrustlineIssuerClassicAddress", "IDmKgcRPdh");
        setField(term419164, term419164.getClass(), "snapshotCurrencyName", "caxOjNGwiL");
        setLongField(term419305, term419305.getClass(), "fastTime", 1402541065051L);
        setField(term419305, term419305.getClass(), "cdate", null);
        setField(term419164, term419164.getClass(), "startTime", term419305);
        setField(term419164, term419164.getClass(), "frequency", enum782);
        setLongField(term419317, term419317.getClass(), "fastTime", 1369359628442L);
        setField(term419317, term419317.getClass(), "cdate", null);
        setField(term419164, term419164.getClass(), "repeatUntilDate", term419317);
        setField(term419164, term419164.getClass(), "email", "JtJYkiGrDe");
        setBooleanField(term419164, term419164.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vkcceVjOTT";
        callMethod(klass, "trustlineIssuerClassicAddress", argTypes, term419164, args);
    }

};


