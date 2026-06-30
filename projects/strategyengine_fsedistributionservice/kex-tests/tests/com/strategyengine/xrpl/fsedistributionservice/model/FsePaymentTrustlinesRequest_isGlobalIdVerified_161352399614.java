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

public class FsePaymentTrustlinesRequest_isGlobalIdVerified_161352399614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32795;

    public FsePaymentTrustlinesRequest_isGlobalIdVerified_161352399614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32884 = new Integer(1193880199);
        Double term32886 = new Double(0.8823181080774973);
        Double term32888 = new Double(0.2192450926212024);
        Long term32902 = new Long(-2850532706972744550L);
        Class<? extends Object> term33054 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term33053 = ((Class) term33054).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term33053).setAccessible(true);
        Object enum57 = ((Field) term33053).get((Object) null);
        Class<? extends Object> term33472 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term33471 = ((Class) term33472).getDeclaredField((String) "ANNUALLY");
        ((Field) term33471).setAccessible(true);
        Object enum58 = ((Field) term33471).get((Object) null);
        term32795 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term32944 = newInstance(Class.forName("java.util.Date"));
        Object term32958 = newInstance(Class.forName("java.util.Date"));
        setField(term32795, term32795.getClass(), "memo", "FiYYLuailz");
        setField(term32795, term32795.getClass(), "fromClassicAddress", "XebAeSnCKZ");
        setField(term32795, term32795.getClass(), "fromSigningPublicKey", "GeddnXjHGy");
        setField(term32795, term32795.getClass(), "fromPrivateKey", "vLTbaoAxBm");
        setField(term32795, term32795.getClass(), "trustlineIssuerClassicAddress", "BXTjEyEZxD");
        setField(term32795, term32795.getClass(), "currencyName", "oKhVzOKUFW");
        setField(term32795, term32795.getClass(), "amount", "mNHyqmOAFy");
        setBooleanField(term32795, term32795.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term32795, term32795.getClass(), "globalIdVerified", true);
        setBooleanField(term32795, term32795.getClass(), "useBlacklist", true);
        setBooleanField(term32795, term32795.getClass(), "agreeFee", false);
        setField(term32795, term32795.getClass(), "maximumTrustlines", term32884);
        setField(term32795, term32795.getClass(), "minBalance", term32886);
        setField(term32795, term32795.getClass(), "maxBalance", term32888);
        setField(term32795, term32795.getClass(), "maxXrpFeePerTransaction", "UxgSdhxPCH");
        setField(term32795, term32795.getClass(), "retryOfId", term32902);
        setField(term32795, term32795.getClass(), "paymentType", enum57);
        setField(term32795, term32795.getClass(), "snapshotTrustlineIssuerClassicAddress", "DAujxZPHJC");
        setField(term32795, term32795.getClass(), "snapshotCurrencyName", "IlBhdrCvHq");
        setLongField(term32944, term32944.getClass(), "fastTime", 1819191638549L);
        setField(term32944, term32944.getClass(), "cdate", null);
        setField(term32795, term32795.getClass(), "startTime", term32944);
        setField(term32795, term32795.getClass(), "frequency", enum58);
        setLongField(term32958, term32958.getClass(), "fastTime", 1400691778698L);
        setField(term32958, term32958.getClass(), "cdate", null);
        setField(term32795, term32795.getClass(), "repeatUntilDate", term32958);
        setField(term32795, term32795.getClass(), "email", "OirVUQhauU");
        setBooleanField(term32795, term32795.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isGlobalIdVerified", argTypes, term32795, args);
    }

};


