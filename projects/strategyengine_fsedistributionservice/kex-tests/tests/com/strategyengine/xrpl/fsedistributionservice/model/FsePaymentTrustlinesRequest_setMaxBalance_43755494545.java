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

public class FsePaymentTrustlinesRequest_setMaxBalance_43755494545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64933;
     Object term65101;

    public FsePaymentTrustlinesRequest_setMaxBalance_43755494545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term65022 = new Integer(1324040357);
        Double term65024 = new Double(0.39446728256884744);
        Double term65026 = new Double(0.7865909711092062);
        Long term65040 = new Long(5946780097489996391L);
        Class<? extends Object> term65184 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term65183 = ((Class) term65184).getDeclaredField((String) "FLAT");
        ((Field) term65183).setAccessible(true);
        Object enum117 = ((Field) term65183).get((Object) null);
        Class<? extends Object> term65578 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term65577 = ((Class) term65578).getDeclaredField((String) "WEEKLY");
        ((Field) term65577).setAccessible(true);
        Object enum118 = ((Field) term65577).get((Object) null);
        term64933 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term65074 = newInstance(Class.forName("java.util.Date"));
        Object term65086 = newInstance(Class.forName("java.util.Date"));
        setField(term64933, term64933.getClass(), "memo", "aPkGHbZyjj");
        setField(term64933, term64933.getClass(), "fromClassicAddress", "nSWdsVyJRI");
        setField(term64933, term64933.getClass(), "fromSigningPublicKey", "JBOPGgGKnc");
        setField(term64933, term64933.getClass(), "fromPrivateKey", "GlPTiCMCGP");
        setField(term64933, term64933.getClass(), "trustlineIssuerClassicAddress", "jlcBpLoWfd");
        setField(term64933, term64933.getClass(), "currencyName", "oYymmLqbfJ");
        setField(term64933, term64933.getClass(), "amount", "YaDWphDOSz");
        setBooleanField(term64933, term64933.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term64933, term64933.getClass(), "globalIdVerified", false);
        setBooleanField(term64933, term64933.getClass(), "useBlacklist", true);
        setBooleanField(term64933, term64933.getClass(), "agreeFee", true);
        setField(term64933, term64933.getClass(), "maximumTrustlines", term65022);
        setField(term64933, term64933.getClass(), "minBalance", term65024);
        setField(term64933, term64933.getClass(), "maxBalance", term65026);
        setField(term64933, term64933.getClass(), "maxXrpFeePerTransaction", "nnnmCgFBLw");
        setField(term64933, term64933.getClass(), "retryOfId", term65040);
        setField(term64933, term64933.getClass(), "paymentType", enum117);
        setField(term64933, term64933.getClass(), "snapshotTrustlineIssuerClassicAddress", "hSSCyNEhyH");
        setField(term64933, term64933.getClass(), "snapshotCurrencyName", "jDFNSuvZqm");
        setLongField(term65074, term65074.getClass(), "fastTime", 1342877876146L);
        setField(term65074, term65074.getClass(), "cdate", null);
        setField(term64933, term64933.getClass(), "startTime", term65074);
        setField(term64933, term64933.getClass(), "frequency", enum118);
        setLongField(term65086, term65086.getClass(), "fastTime", 1511283614327L);
        setField(term65086, term65086.getClass(), "cdate", null);
        setField(term64933, term64933.getClass(), "repeatUntilDate", term65086);
        setField(term64933, term64933.getClass(), "email", "pLvkKHqNYX");
        setBooleanField(term64933, term64933.getClass(), "autoApprove", false);
        term65101 = new Double(0.06587158449170749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term65101;
        callMethod(klass, "setMaxBalance", argTypes, term64933, args);
    }

};


