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

public class FsePaymentTrustlinesRequest_hashCode_10918934894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22155;

    public FsePaymentTrustlinesRequest_hashCode_10918934894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term22244 = new Integer(-1007160944);
        Double term22246 = new Double(0.5840714198152577);
        Double term22248 = new Double(0.7559240768573477);
        Long term22262 = new Long(-6645965768855543712L);
        Class<? extends Object> term22414 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term22413 = ((Class) term22414).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term22413).setAccessible(true);
        Object enum37 = ((Field) term22413).get((Object) null);
        Class<? extends Object> term22832 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term22831 = ((Class) term22832).getDeclaredField((String) "ANNUALLY");
        ((Field) term22831).setAccessible(true);
        Object enum38 = ((Field) term22831).get((Object) null);
        term22155 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term22304 = newInstance(Class.forName("java.util.Date"));
        Object term22318 = newInstance(Class.forName("java.util.Date"));
        setField(term22155, term22155.getClass(), "memo", "jiUSjqwSIQ");
        setField(term22155, term22155.getClass(), "fromClassicAddress", "MgLCedQfoj");
        setField(term22155, term22155.getClass(), "fromSigningPublicKey", "zgKiINdgNu");
        setField(term22155, term22155.getClass(), "fromPrivateKey", "zLMTXDQHYH");
        setField(term22155, term22155.getClass(), "trustlineIssuerClassicAddress", "PqywFWJlpE");
        setField(term22155, term22155.getClass(), "currencyName", "OzXRsFGTIp");
        setField(term22155, term22155.getClass(), "amount", "TjWpyghUWN");
        setBooleanField(term22155, term22155.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term22155, term22155.getClass(), "globalIdVerified", true);
        setBooleanField(term22155, term22155.getClass(), "useBlacklist", true);
        setBooleanField(term22155, term22155.getClass(), "agreeFee", true);
        setField(term22155, term22155.getClass(), "maximumTrustlines", term22244);
        setField(term22155, term22155.getClass(), "minBalance", term22246);
        setField(term22155, term22155.getClass(), "maxBalance", term22248);
        setField(term22155, term22155.getClass(), "maxXrpFeePerTransaction", "dkZFDZxcde");
        setField(term22155, term22155.getClass(), "retryOfId", term22262);
        setField(term22155, term22155.getClass(), "paymentType", enum37);
        setField(term22155, term22155.getClass(), "snapshotTrustlineIssuerClassicAddress", "WXcZEtUKlI");
        setField(term22155, term22155.getClass(), "snapshotCurrencyName", "IkpjUOuWQU");
        setLongField(term22304, term22304.getClass(), "fastTime", 1630952644759L);
        setField(term22304, term22304.getClass(), "cdate", null);
        setField(term22155, term22155.getClass(), "startTime", term22304);
        setField(term22155, term22155.getClass(), "frequency", enum38);
        setLongField(term22318, term22318.getClass(), "fastTime", 1739417792956L);
        setField(term22318, term22318.getClass(), "cdate", null);
        setField(term22155, term22155.getClass(), "repeatUntilDate", term22318);
        setField(term22155, term22155.getClass(), "email", "boSSpezHeU");
        setBooleanField(term22155, term22155.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term22155, args);
    }

};


