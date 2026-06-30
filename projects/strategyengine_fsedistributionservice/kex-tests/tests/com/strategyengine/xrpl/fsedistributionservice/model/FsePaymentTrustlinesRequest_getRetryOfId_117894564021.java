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

public class FsePaymentTrustlinesRequest_getRetryOfId_117894564021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40237;

    public FsePaymentTrustlinesRequest_getRetryOfId_117894564021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40326 = new Integer(767834723);
        Double term40328 = new Double(0.3227335400819148);
        Double term40330 = new Double(0.43337207054070237);
        Long term40344 = new Long(5953383087795962419L);
        Class<? extends Object> term40496 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term40495 = ((Class) term40496).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term40495).setAccessible(true);
        Object enum71 = ((Field) term40495).get((Object) null);
        Class<? extends Object> term40914 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term40913 = ((Class) term40914).getDeclaredField((String) "ANNUALLY");
        ((Field) term40913).setAccessible(true);
        Object enum72 = ((Field) term40913).get((Object) null);
        term40237 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term40386 = newInstance(Class.forName("java.util.Date"));
        Object term40400 = newInstance(Class.forName("java.util.Date"));
        setField(term40237, term40237.getClass(), "memo", "bvSgmFUDOU");
        setField(term40237, term40237.getClass(), "fromClassicAddress", "XMHwbfiHRl");
        setField(term40237, term40237.getClass(), "fromSigningPublicKey", "bucTnYicnp");
        setField(term40237, term40237.getClass(), "fromPrivateKey", "EkgprvqZlM");
        setField(term40237, term40237.getClass(), "trustlineIssuerClassicAddress", "fbnKvthhOz");
        setField(term40237, term40237.getClass(), "currencyName", "PGfCDJTBek");
        setField(term40237, term40237.getClass(), "amount", "ZwjARhAtHC");
        setBooleanField(term40237, term40237.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term40237, term40237.getClass(), "globalIdVerified", false);
        setBooleanField(term40237, term40237.getClass(), "useBlacklist", true);
        setBooleanField(term40237, term40237.getClass(), "agreeFee", true);
        setField(term40237, term40237.getClass(), "maximumTrustlines", term40326);
        setField(term40237, term40237.getClass(), "minBalance", term40328);
        setField(term40237, term40237.getClass(), "maxBalance", term40330);
        setField(term40237, term40237.getClass(), "maxXrpFeePerTransaction", "XXvscsYBWv");
        setField(term40237, term40237.getClass(), "retryOfId", term40344);
        setField(term40237, term40237.getClass(), "paymentType", enum71);
        setField(term40237, term40237.getClass(), "snapshotTrustlineIssuerClassicAddress", "uePedtiAfL");
        setField(term40237, term40237.getClass(), "snapshotCurrencyName", "AdSHvysxQB");
        setLongField(term40386, term40386.getClass(), "fastTime", 1466008719289L);
        setField(term40386, term40386.getClass(), "cdate", null);
        setField(term40237, term40237.getClass(), "startTime", term40386);
        setField(term40237, term40237.getClass(), "frequency", enum72);
        setLongField(term40400, term40400.getClass(), "fastTime", 1535838449065L);
        setField(term40400, term40400.getClass(), "cdate", null);
        setField(term40237, term40237.getClass(), "repeatUntilDate", term40400);
        setField(term40237, term40237.getClass(), "email", "jlraKkBWFA");
        setBooleanField(term40237, term40237.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRetryOfId", argTypes, term40237, args);
    }

};


