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

public class FsePaymentTrustlinesRequest_getMemo_15356309216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24279;

    public FsePaymentTrustlinesRequest_getMemo_15356309216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term24368 = new Integer(590364439);
        Double term24370 = new Double(0.37161417339133307);
        Double term24372 = new Double(0.6805867182029153);
        Long term24386 = new Long(-7612550318181586304L);
        Class<? extends Object> term24527 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term24526 = ((Class) term24527).getDeclaredField((String) "FLAT");
        ((Field) term24526).setAccessible(true);
        Object enum41 = ((Field) term24526).get((Object) null);
        Class<? extends Object> term24921 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term24920 = ((Class) term24921).getDeclaredField((String) "DAILY");
        ((Field) term24920).setAccessible(true);
        Object enum42 = ((Field) term24920).get((Object) null);
        term24279 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term24420 = newInstance(Class.forName("java.util.Date"));
        Object term24431 = newInstance(Class.forName("java.util.Date"));
        setField(term24279, term24279.getClass(), "memo", "UkKvaeJfEC");
        setField(term24279, term24279.getClass(), "fromClassicAddress", "WPxXsahPRq");
        setField(term24279, term24279.getClass(), "fromSigningPublicKey", "IENRuqmwUU");
        setField(term24279, term24279.getClass(), "fromPrivateKey", "GsWxOwXvSu");
        setField(term24279, term24279.getClass(), "trustlineIssuerClassicAddress", "bKBSncrMEZ");
        setField(term24279, term24279.getClass(), "currencyName", "yeSXGqQExb");
        setField(term24279, term24279.getClass(), "amount", "uXYcXVYJZM");
        setBooleanField(term24279, term24279.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term24279, term24279.getClass(), "globalIdVerified", true);
        setBooleanField(term24279, term24279.getClass(), "useBlacklist", false);
        setBooleanField(term24279, term24279.getClass(), "agreeFee", false);
        setField(term24279, term24279.getClass(), "maximumTrustlines", term24368);
        setField(term24279, term24279.getClass(), "minBalance", term24370);
        setField(term24279, term24279.getClass(), "maxBalance", term24372);
        setField(term24279, term24279.getClass(), "maxXrpFeePerTransaction", "BJhjdJUhkz");
        setField(term24279, term24279.getClass(), "retryOfId", term24386);
        setField(term24279, term24279.getClass(), "paymentType", enum41);
        setField(term24279, term24279.getClass(), "snapshotTrustlineIssuerClassicAddress", "cdHYQDgUZR");
        setField(term24279, term24279.getClass(), "snapshotCurrencyName", "KAORSSPSeV");
        setLongField(term24420, term24420.getClass(), "fastTime", 1496859828764L);
        setField(term24420, term24420.getClass(), "cdate", null);
        setField(term24279, term24279.getClass(), "startTime", term24420);
        setField(term24279, term24279.getClass(), "frequency", enum42);
        setLongField(term24431, term24431.getClass(), "fastTime", 1691868468367L);
        setField(term24431, term24431.getClass(), "cdate", null);
        setField(term24279, term24279.getClass(), "repeatUntilDate", term24431);
        setField(term24279, term24279.getClass(), "email", "UimMMORkzd");
        setBooleanField(term24279, term24279.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemo", argTypes, term24279, args);
    }

};


