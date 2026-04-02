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

public class FsePaymentTrustlinesRequest_setRetryOfId_121202539447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67081;
     Object term67248;

    public FsePaymentTrustlinesRequest_setRetryOfId_121202539447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term67170 = new Integer(-93135961);
        Double term67172 = new Double(0.623231822150205);
        Double term67174 = new Double(0.09037487793444521);
        Long term67188 = new Long(2701184207686293431L);
        Class<? extends Object> term67331 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term67330 = ((Class) term67331).getDeclaredField((String) "FLAT");
        ((Field) term67330).setAccessible(true);
        Object enum121 = ((Field) term67330).get((Object) null);
        Class<? extends Object> term67725 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term67724 = ((Class) term67725).getDeclaredField((String) "DAILY");
        ((Field) term67724).setAccessible(true);
        Object enum122 = ((Field) term67724).get((Object) null);
        term67081 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term67222 = newInstance(Class.forName("java.util.Date"));
        Object term67233 = newInstance(Class.forName("java.util.Date"));
        setField(term67081, term67081.getClass(), "memo", "FLQJOzEXff");
        setField(term67081, term67081.getClass(), "fromClassicAddress", "qlaIVJBSfQ");
        setField(term67081, term67081.getClass(), "fromSigningPublicKey", "lYvIWBFFsq");
        setField(term67081, term67081.getClass(), "fromPrivateKey", "tThwsqWKcE");
        setField(term67081, term67081.getClass(), "trustlineIssuerClassicAddress", "bkSgsDrkCN");
        setField(term67081, term67081.getClass(), "currencyName", "hwjlcimgJH");
        setField(term67081, term67081.getClass(), "amount", "TLxQzxvizR");
        setBooleanField(term67081, term67081.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term67081, term67081.getClass(), "globalIdVerified", true);
        setBooleanField(term67081, term67081.getClass(), "useBlacklist", true);
        setBooleanField(term67081, term67081.getClass(), "agreeFee", false);
        setField(term67081, term67081.getClass(), "maximumTrustlines", term67170);
        setField(term67081, term67081.getClass(), "minBalance", term67172);
        setField(term67081, term67081.getClass(), "maxBalance", term67174);
        setField(term67081, term67081.getClass(), "maxXrpFeePerTransaction", "uUgJfKAzDM");
        setField(term67081, term67081.getClass(), "retryOfId", term67188);
        setField(term67081, term67081.getClass(), "paymentType", enum121);
        setField(term67081, term67081.getClass(), "snapshotTrustlineIssuerClassicAddress", "gZPZNkweEp");
        setField(term67081, term67081.getClass(), "snapshotCurrencyName", "vfennwtmqe");
        setLongField(term67222, term67222.getClass(), "fastTime", 1316972437233L);
        setField(term67222, term67222.getClass(), "cdate", null);
        setField(term67081, term67081.getClass(), "startTime", term67222);
        setField(term67081, term67081.getClass(), "frequency", enum122);
        setLongField(term67233, term67233.getClass(), "fastTime", 1870028835492L);
        setField(term67233, term67233.getClass(), "cdate", null);
        setField(term67081, term67081.getClass(), "repeatUntilDate", term67233);
        setField(term67081, term67081.getClass(), "email", "zZxoNkohbw");
        setBooleanField(term67081, term67081.getClass(), "autoApprove", true);
        term67248 = new Long(4474998035090263139L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term67248;
        callMethod(klass, "setRetryOfId", argTypes, term67081, args);
    }

};


