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

public class FsePaymentTrustlinesRequest_setFrequency_99766494452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72749;
     Object enum134;

    public FsePaymentTrustlinesRequest_setFrequency_99766494452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term72838 = new Integer(1540719661);
        Double term72840 = new Double(0.9511861072660375);
        Double term72842 = new Double(0.05880719443135807);
        Long term72856 = new Long(5836128569274066678L);
        Class<? extends Object> term73007 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term73006 = ((Class) term73007).getDeclaredField((String) "FLAT");
        ((Field) term73006).setAccessible(true);
        Object enum132 = ((Field) term73006).get((Object) null);
        Class<? extends Object> term73401 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term73400 = ((Class) term73401).getDeclaredField((String) "WEEKLY");
        ((Field) term73400).setAccessible(true);
        Object enum133 = ((Field) term73400).get((Object) null);
        term72749 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term72890 = newInstance(Class.forName("java.util.Date"));
        Object term72902 = newInstance(Class.forName("java.util.Date"));
        setField(term72749, term72749.getClass(), "memo", "bsnZXGEvFv");
        setField(term72749, term72749.getClass(), "fromClassicAddress", "osFrHWYeRy");
        setField(term72749, term72749.getClass(), "fromSigningPublicKey", "scpIQUfPKw");
        setField(term72749, term72749.getClass(), "fromPrivateKey", "QKYBpCjuYt");
        setField(term72749, term72749.getClass(), "trustlineIssuerClassicAddress", "vjiRfoGdkl");
        setField(term72749, term72749.getClass(), "currencyName", "TwaxeSHvnR");
        setField(term72749, term72749.getClass(), "amount", "paPzDETzIq");
        setBooleanField(term72749, term72749.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term72749, term72749.getClass(), "globalIdVerified", true);
        setBooleanField(term72749, term72749.getClass(), "useBlacklist", false);
        setBooleanField(term72749, term72749.getClass(), "agreeFee", false);
        setField(term72749, term72749.getClass(), "maximumTrustlines", term72838);
        setField(term72749, term72749.getClass(), "minBalance", term72840);
        setField(term72749, term72749.getClass(), "maxBalance", term72842);
        setField(term72749, term72749.getClass(), "maxXrpFeePerTransaction", "fufeuGfwpN");
        setField(term72749, term72749.getClass(), "retryOfId", term72856);
        setField(term72749, term72749.getClass(), "paymentType", enum132);
        setField(term72749, term72749.getClass(), "snapshotTrustlineIssuerClassicAddress", "XJbkXbljvz");
        setField(term72749, term72749.getClass(), "snapshotCurrencyName", "fuvdkDwBeH");
        setLongField(term72890, term72890.getClass(), "fastTime", 1340909568660L);
        setField(term72890, term72890.getClass(), "cdate", null);
        setField(term72749, term72749.getClass(), "startTime", term72890);
        setField(term72749, term72749.getClass(), "frequency", enum133);
        setLongField(term72902, term72902.getClass(), "fastTime", 1862657813973L);
        setField(term72902, term72902.getClass(), "cdate", null);
        setField(term72749, term72749.getClass(), "repeatUntilDate", term72902);
        setField(term72749, term72749.getClass(), "email", "NTefzwLPhx");
        setBooleanField(term72749, term72749.getClass(), "autoApprove", true);
        Class<? extends Object> term73801 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term73800 = ((Class) term73801).getDeclaredField((String) "DAILY");
        ((Field) term73800).setAccessible(true);
        enum134 = ((Field) term73800).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Object[] args = new Object[1];
        args[0] = enum134;
        callMethod(klass, "setFrequency", argTypes, term72749, args);
    }

};


