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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_snapshotCurrencyName_194612768419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434158;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_snapshotCurrencyName_194612768419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term434247 = new Integer(937859191);
        Double term434249 = new Double(0.5179319342588155);
        Double term434251 = new Double(0.25025774487844066);
        Long term434265 = new Long(4361302085818491893L);
        Class<? extends Object> term434428 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term434427 = ((Class) term434428).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term434427).setAccessible(true);
        Object enum809 = ((Field) term434427).get((Object) null);
        Class<? extends Object> term434846 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term434845 = ((Class) term434846).getDeclaredField((String) "MONTHLY");
        ((Field) term434845).setAccessible(true);
        Object enum810 = ((Field) term434845).get((Object) null);
        term434158 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term434307 = newInstance(Class.forName("java.util.Date"));
        Object term434320 = newInstance(Class.forName("java.util.Date"));
        setField(term434158, term434158.getClass(), "memo", "TwCbrCjzwL");
        setField(term434158, term434158.getClass(), "fromClassicAddress", "hOZqhvhcjq");
        setField(term434158, term434158.getClass(), "fromSigningPublicKey", "zNPOnpEodJ");
        setField(term434158, term434158.getClass(), "fromPrivateKey", "KVzirWEvHZ");
        setField(term434158, term434158.getClass(), "trustlineIssuerClassicAddress", "MEuRnwyHJN");
        setField(term434158, term434158.getClass(), "currencyName", "mXAcZWCaIl");
        setField(term434158, term434158.getClass(), "amount", "wxQIQXYisx");
        setBooleanField(term434158, term434158.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term434158, term434158.getClass(), "globalIdVerified", true);
        setBooleanField(term434158, term434158.getClass(), "useBlacklist", false);
        setBooleanField(term434158, term434158.getClass(), "agreeFee", true);
        setField(term434158, term434158.getClass(), "maximumTrustlines", term434247);
        setField(term434158, term434158.getClass(), "minBalance", term434249);
        setField(term434158, term434158.getClass(), "maxBalance", term434251);
        setField(term434158, term434158.getClass(), "maxXrpFeePerTransaction", "PtuPKKkQqS");
        setField(term434158, term434158.getClass(), "retryOfId", term434265);
        setField(term434158, term434158.getClass(), "paymentType", enum809);
        setField(term434158, term434158.getClass(), "snapshotTrustlineIssuerClassicAddress", "kgVwdNODbO");
        setField(term434158, term434158.getClass(), "snapshotCurrencyName", "yEORGYKBvc");
        setLongField(term434307, term434307.getClass(), "fastTime", 1778670337396L);
        setField(term434307, term434307.getClass(), "cdate", null);
        setField(term434158, term434158.getClass(), "startTime", term434307);
        setField(term434158, term434158.getClass(), "frequency", enum810);
        setLongField(term434320, term434320.getClass(), "fastTime", 1590494983137L);
        setField(term434320, term434320.getClass(), "cdate", null);
        setField(term434158, term434158.getClass(), "repeatUntilDate", term434320);
        setField(term434158, term434158.getClass(), "email", "vgSfMyOiip");
        setBooleanField(term434158, term434158.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nsBmlIaWyH";
        callMethod(klass, "snapshotCurrencyName", argTypes, term434158, args);
    }

};


