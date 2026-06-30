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

public class FsePaymentTrustlinesRequest_setMinBalance_3687112144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63853;
     Object term64030;

    public FsePaymentTrustlinesRequest_setMinBalance_3687112144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term63942 = new Integer(1225272962);
        Double term63944 = new Double(0.07417792024383196);
        Double term63946 = new Double(0.686293604788188);
        Long term63960 = new Long(-1983291584002806658L);
        Class<? extends Object> term64113 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term64112 = ((Class) term64113).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term64112).setAccessible(true);
        Object enum115 = ((Field) term64112).get((Object) null);
        Class<? extends Object> term64531 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term64530 = ((Class) term64531).getDeclaredField((String) "MONTHLY");
        ((Field) term64530).setAccessible(true);
        Object enum116 = ((Field) term64530).get((Object) null);
        term63853 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term64002 = newInstance(Class.forName("java.util.Date"));
        Object term64015 = newInstance(Class.forName("java.util.Date"));
        setField(term63853, term63853.getClass(), "memo", "kwteHWzwcc");
        setField(term63853, term63853.getClass(), "fromClassicAddress", "uMsWXqNhln");
        setField(term63853, term63853.getClass(), "fromSigningPublicKey", "MAnhIPOtHL");
        setField(term63853, term63853.getClass(), "fromPrivateKey", "dikKjYjmRO");
        setField(term63853, term63853.getClass(), "trustlineIssuerClassicAddress", "GJnnMDVnEP");
        setField(term63853, term63853.getClass(), "currencyName", "zSMVllDpfk");
        setField(term63853, term63853.getClass(), "amount", "iptRXVDoYE");
        setBooleanField(term63853, term63853.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term63853, term63853.getClass(), "globalIdVerified", true);
        setBooleanField(term63853, term63853.getClass(), "useBlacklist", false);
        setBooleanField(term63853, term63853.getClass(), "agreeFee", false);
        setField(term63853, term63853.getClass(), "maximumTrustlines", term63942);
        setField(term63853, term63853.getClass(), "minBalance", term63944);
        setField(term63853, term63853.getClass(), "maxBalance", term63946);
        setField(term63853, term63853.getClass(), "maxXrpFeePerTransaction", "kucsxnvbES");
        setField(term63853, term63853.getClass(), "retryOfId", term63960);
        setField(term63853, term63853.getClass(), "paymentType", enum115);
        setField(term63853, term63853.getClass(), "snapshotTrustlineIssuerClassicAddress", "IdGzDFfcZf");
        setField(term63853, term63853.getClass(), "snapshotCurrencyName", "KDdRNhZmnU");
        setLongField(term64002, term64002.getClass(), "fastTime", 1309132342717L);
        setField(term64002, term64002.getClass(), "cdate", null);
        setField(term63853, term63853.getClass(), "startTime", term64002);
        setField(term63853, term63853.getClass(), "frequency", enum116);
        setLongField(term64015, term64015.getClass(), "fastTime", 1695470381249L);
        setField(term64015, term64015.getClass(), "cdate", null);
        setField(term63853, term63853.getClass(), "repeatUntilDate", term64015);
        setField(term63853, term63853.getClass(), "email", "iMsqJaKlDC");
        setBooleanField(term63853, term63853.getClass(), "autoApprove", true);
        term64030 = new Double(0.12764449157430724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term64030;
        callMethod(klass, "setMinBalance", argTypes, term63853, args);
    }

};


