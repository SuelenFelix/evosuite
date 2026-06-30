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

public class FsePaymentTrustlinesRequest_isNewTrustlinesOnly_199085849913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31717;

    public FsePaymentTrustlinesRequest_isNewTrustlinesOnly_199085849913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31806 = new Integer(-226514366);
        Double term31808 = new Double(0.25937345430928016);
        Double term31810 = new Double(0.5873228247510078);
        Long term31824 = new Long(-1154553077993834885L);
        Class<? extends Object> term31975 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term31974 = ((Class) term31975).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term31974).setAccessible(true);
        Object enum55 = ((Field) term31974).get((Object) null);
        Class<? extends Object> term32393 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term32392 = ((Class) term32393).getDeclaredField((String) "MONTHLY");
        ((Field) term32392).setAccessible(true);
        Object enum56 = ((Field) term32392).get((Object) null);
        term31717 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term31866 = newInstance(Class.forName("java.util.Date"));
        Object term31879 = newInstance(Class.forName("java.util.Date"));
        setField(term31717, term31717.getClass(), "memo", "CAgxWjhxNf");
        setField(term31717, term31717.getClass(), "fromClassicAddress", "goAoCMhKBu");
        setField(term31717, term31717.getClass(), "fromSigningPublicKey", "BWxJSgKHRT");
        setField(term31717, term31717.getClass(), "fromPrivateKey", "AGXoIndFnm");
        setField(term31717, term31717.getClass(), "trustlineIssuerClassicAddress", "mwmFMNEzkK");
        setField(term31717, term31717.getClass(), "currencyName", "kVAmKknVln");
        setField(term31717, term31717.getClass(), "amount", "MRFLbEGYKG");
        setBooleanField(term31717, term31717.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term31717, term31717.getClass(), "globalIdVerified", false);
        setBooleanField(term31717, term31717.getClass(), "useBlacklist", true);
        setBooleanField(term31717, term31717.getClass(), "agreeFee", false);
        setField(term31717, term31717.getClass(), "maximumTrustlines", term31806);
        setField(term31717, term31717.getClass(), "minBalance", term31808);
        setField(term31717, term31717.getClass(), "maxBalance", term31810);
        setField(term31717, term31717.getClass(), "maxXrpFeePerTransaction", "BYrGukTyof");
        setField(term31717, term31717.getClass(), "retryOfId", term31824);
        setField(term31717, term31717.getClass(), "paymentType", enum55);
        setField(term31717, term31717.getClass(), "snapshotTrustlineIssuerClassicAddress", "jiCGTTzKGB");
        setField(term31717, term31717.getClass(), "snapshotCurrencyName", "MqICFYzDJj");
        setLongField(term31866, term31866.getClass(), "fastTime", 1426018874434L);
        setField(term31866, term31866.getClass(), "cdate", null);
        setField(term31717, term31717.getClass(), "startTime", term31866);
        setField(term31717, term31717.getClass(), "frequency", enum56);
        setLongField(term31879, term31879.getClass(), "fastTime", 1633004775487L);
        setField(term31879, term31879.getClass(), "cdate", null);
        setField(term31717, term31717.getClass(), "repeatUntilDate", term31879);
        setField(term31717, term31717.getClass(), "email", "YgQvdcBQKw");
        setBooleanField(term31717, term31717.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNewTrustlinesOnly", argTypes, term31717, args);
    }

};


