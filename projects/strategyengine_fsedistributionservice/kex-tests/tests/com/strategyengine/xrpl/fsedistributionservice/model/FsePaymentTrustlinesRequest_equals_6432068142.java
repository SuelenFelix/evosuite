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

public class FsePaymentTrustlinesRequest_equals_6432068142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20029;
     Object term20207;

    public FsePaymentTrustlinesRequest_equals_6432068142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term20118 = new Integer(-2068769794);
        Double term20120 = new Double(0.43692187681405226);
        Double term20122 = new Double(0.7633268466829064);
        Long term20136 = new Long(-2068172595987555756L);
        Class<? extends Object> term20289 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term20288 = ((Class) term20289).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term20288).setAccessible(true);
        Object enum33 = ((Field) term20288).get((Object) null);
        Class<? extends Object> term20707 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term20706 = ((Class) term20707).getDeclaredField((String) "ANNUALLY");
        ((Field) term20706).setAccessible(true);
        Object enum34 = ((Field) term20706).get((Object) null);
        term20029 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term20178 = newInstance(Class.forName("java.util.Date"));
        Object term20192 = newInstance(Class.forName("java.util.Date"));
        setField(term20029, term20029.getClass(), "memo", "llRfwANcVF");
        setField(term20029, term20029.getClass(), "fromClassicAddress", "sUEeHQTWkA");
        setField(term20029, term20029.getClass(), "fromSigningPublicKey", "BDIRCxAWLA");
        setField(term20029, term20029.getClass(), "fromPrivateKey", "eOJfbiZLnb");
        setField(term20029, term20029.getClass(), "trustlineIssuerClassicAddress", "nKZKnxWYCK");
        setField(term20029, term20029.getClass(), "currencyName", "JOqQxuzRuZ");
        setField(term20029, term20029.getClass(), "amount", "RSaoipUlsg");
        setBooleanField(term20029, term20029.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term20029, term20029.getClass(), "globalIdVerified", false);
        setBooleanField(term20029, term20029.getClass(), "useBlacklist", true);
        setBooleanField(term20029, term20029.getClass(), "agreeFee", false);
        setField(term20029, term20029.getClass(), "maximumTrustlines", term20118);
        setField(term20029, term20029.getClass(), "minBalance", term20120);
        setField(term20029, term20029.getClass(), "maxBalance", term20122);
        setField(term20029, term20029.getClass(), "maxXrpFeePerTransaction", "cSHGbqKqlN");
        setField(term20029, term20029.getClass(), "retryOfId", term20136);
        setField(term20029, term20029.getClass(), "paymentType", enum33);
        setField(term20029, term20029.getClass(), "snapshotTrustlineIssuerClassicAddress", "pFAfANnxup");
        setField(term20029, term20029.getClass(), "snapshotCurrencyName", "FbSIUZyBXZ");
        setLongField(term20178, term20178.getClass(), "fastTime", 1538078916394L);
        setField(term20178, term20178.getClass(), "cdate", null);
        setField(term20029, term20029.getClass(), "startTime", term20178);
        setField(term20029, term20029.getClass(), "frequency", enum34);
        setLongField(term20192, term20192.getClass(), "fastTime", 1744090065937L);
        setField(term20192, term20192.getClass(), "cdate", null);
        setField(term20029, term20029.getClass(), "repeatUntilDate", term20192);
        setField(term20029, term20029.getClass(), "email", "mhQDwIyrRi");
        setBooleanField(term20029, term20029.getClass(), "autoApprove", false);
        term20207 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20207;
        callMethod(klass, "equals", argTypes, term20029, args);
    }

};


