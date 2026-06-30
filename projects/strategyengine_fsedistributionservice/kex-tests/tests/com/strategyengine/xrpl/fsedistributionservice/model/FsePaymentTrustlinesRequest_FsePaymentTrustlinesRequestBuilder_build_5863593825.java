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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_build_5863593825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441048;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_build_5863593825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term441137 = new Integer(982388293);
        Double term441139 = new Double(0.16755811343784477);
        Double term441141 = new Double(0.9090793968999221);
        Long term441155 = new Long(-9094760859641883612L);
        Class<? extends Object> term441296 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term441295 = ((Class) term441296).getDeclaredField((String) "FLAT");
        ((Field) term441295).setAccessible(true);
        Object enum822 = ((Field) term441295).get((Object) null);
        Class<? extends Object> term441690 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term441689 = ((Class) term441690).getDeclaredField((String) "DAILY");
        ((Field) term441689).setAccessible(true);
        Object enum823 = ((Field) term441689).get((Object) null);
        term441048 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term441189 = newInstance(Class.forName("java.util.Date"));
        Object term441200 = newInstance(Class.forName("java.util.Date"));
        setField(term441048, term441048.getClass(), "memo", "igRyvonSOa");
        setField(term441048, term441048.getClass(), "fromClassicAddress", "UcbrVDXNGS");
        setField(term441048, term441048.getClass(), "fromSigningPublicKey", "hAEsjlbkLq");
        setField(term441048, term441048.getClass(), "fromPrivateKey", "JkPsDinvhK");
        setField(term441048, term441048.getClass(), "trustlineIssuerClassicAddress", "lXozXkJEdb");
        setField(term441048, term441048.getClass(), "currencyName", "NvtklZtQTp");
        setField(term441048, term441048.getClass(), "amount", "EMCPKNYNKM");
        setBooleanField(term441048, term441048.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term441048, term441048.getClass(), "globalIdVerified", true);
        setBooleanField(term441048, term441048.getClass(), "useBlacklist", false);
        setBooleanField(term441048, term441048.getClass(), "agreeFee", false);
        setField(term441048, term441048.getClass(), "maximumTrustlines", term441137);
        setField(term441048, term441048.getClass(), "minBalance", term441139);
        setField(term441048, term441048.getClass(), "maxBalance", term441141);
        setField(term441048, term441048.getClass(), "maxXrpFeePerTransaction", "yAiKtebcQV");
        setField(term441048, term441048.getClass(), "retryOfId", term441155);
        setField(term441048, term441048.getClass(), "paymentType", enum822);
        setField(term441048, term441048.getClass(), "snapshotTrustlineIssuerClassicAddress", "igVVyETyDE");
        setField(term441048, term441048.getClass(), "snapshotCurrencyName", "aXIXlzWYYW");
        setLongField(term441189, term441189.getClass(), "fastTime", 1886426672262L);
        setField(term441189, term441189.getClass(), "cdate", null);
        setField(term441048, term441048.getClass(), "startTime", term441189);
        setField(term441048, term441048.getClass(), "frequency", enum823);
        setLongField(term441200, term441200.getClass(), "fastTime", 1722825697851L);
        setField(term441200, term441200.getClass(), "cdate", null);
        setField(term441048, term441048.getClass(), "repeatUntilDate", term441200);
        setField(term441048, term441048.getClass(), "email", "uHpOafvlYb");
        setBooleanField(term441048, term441048.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term441048, args);
    }

};


