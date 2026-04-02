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
import java.lang.Object;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;

public class FsePaymentTrustlinesMinTriggeredRequest_getMinTrustLinesTriggerValue_18588159896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5317;

    public FsePaymentTrustlinesMinTriggeredRequest_getMinTrustLinesTriggerValue_18588159896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5407 = new Integer(-616727354);
        Double term5409 = new Double(0.8474802076607362);
        Double term5411 = new Double(0.5183269973490326);
        Long term5425 = new Long(7411271909051562686L);
        Class<? extends Object> term5578 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term5577 = ((Class) term5578).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term5577).setAccessible(true);
        Object enum10 = ((Field) term5577).get((Object) null);
        Class<? extends Object> term5996 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term5995 = ((Class) term5996).getDeclaredField((String) "ANNUALLY");
        ((Field) term5995).setAccessible(true);
        Object enum11 = ((Field) term5995).get((Object) null);
        term5317 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest"));
        Object term5318 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term5467 = newInstance(Class.forName("java.util.Date"));
        Object term5481 = newInstance(Class.forName("java.util.Date"));
        setField(term5318, term5318.getClass(), "memo", "YRHGsAkhxb");
        setField(term5318, term5318.getClass(), "fromClassicAddress", "ffYhPOzlUs");
        setField(term5318, term5318.getClass(), "fromSigningPublicKey", "MLqYREekMl");
        setField(term5318, term5318.getClass(), "fromPrivateKey", "ytSBIKXogI");
        setField(term5318, term5318.getClass(), "trustlineIssuerClassicAddress", "nHXjMycHlU");
        setField(term5318, term5318.getClass(), "currencyName", "ieCtQFdkii");
        setField(term5318, term5318.getClass(), "amount", "dEnhdmILtU");
        setBooleanField(term5318, term5318.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term5318, term5318.getClass(), "globalIdVerified", false);
        setBooleanField(term5318, term5318.getClass(), "useBlacklist", false);
        setBooleanField(term5318, term5318.getClass(), "agreeFee", true);
        setField(term5318, term5318.getClass(), "maximumTrustlines", term5407);
        setField(term5318, term5318.getClass(), "minBalance", term5409);
        setField(term5318, term5318.getClass(), "maxBalance", term5411);
        setField(term5318, term5318.getClass(), "maxXrpFeePerTransaction", "hoicvmsovO");
        setField(term5318, term5318.getClass(), "retryOfId", term5425);
        setField(term5318, term5318.getClass(), "paymentType", enum10);
        setField(term5318, term5318.getClass(), "snapshotTrustlineIssuerClassicAddress", "eqJfYWRaEL");
        setField(term5318, term5318.getClass(), "snapshotCurrencyName", "fhkbdRViHi");
        setLongField(term5467, term5467.getClass(), "fastTime", 1797203628025L);
        setField(term5467, term5467.getClass(), "cdate", null);
        setField(term5318, term5318.getClass(), "startTime", term5467);
        setField(term5318, term5318.getClass(), "frequency", enum11);
        setLongField(term5481, term5481.getClass(), "fastTime", 1589457921030L);
        setField(term5481, term5481.getClass(), "cdate", null);
        setField(term5318, term5318.getClass(), "repeatUntilDate", term5481);
        setField(term5318, term5318.getClass(), "email", "uWHnvSvaPl");
        setBooleanField(term5318, term5318.getClass(), "autoApprove", true);
        setField(term5317, term5317.getClass(), "trustlinePaymentRequest", term5318);
        setIntField(term5317, term5317.getClass(), "minTrustLinesTriggerValue", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinTrustLinesTriggerValue", argTypes, term5317, args);
    }

};


