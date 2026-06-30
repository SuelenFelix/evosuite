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

public class FsePaymentTrustlinesRequest_getMaxXrpFeePerTransaction_85413189620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39155;

    public FsePaymentTrustlinesRequest_getMaxXrpFeePerTransaction_85413189620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39244 = new Integer(1962444399);
        Double term39246 = new Double(0.7919370314903882);
        Double term39248 = new Double(0.2109867221632754);
        Long term39262 = new Long(3892018155439224435L);
        Class<? extends Object> term39414 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term39413 = ((Class) term39414).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term39413).setAccessible(true);
        Object enum69 = ((Field) term39413).get((Object) null);
        Class<? extends Object> term39832 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term39831 = ((Class) term39832).getDeclaredField((String) "ANNUALLY");
        ((Field) term39831).setAccessible(true);
        Object enum70 = ((Field) term39831).get((Object) null);
        term39155 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term39304 = newInstance(Class.forName("java.util.Date"));
        Object term39318 = newInstance(Class.forName("java.util.Date"));
        setField(term39155, term39155.getClass(), "memo", "UiWhvbypdr");
        setField(term39155, term39155.getClass(), "fromClassicAddress", "CgleElJNje");
        setField(term39155, term39155.getClass(), "fromSigningPublicKey", "ZrchvNGMtd");
        setField(term39155, term39155.getClass(), "fromPrivateKey", "WaEcyVlcIx");
        setField(term39155, term39155.getClass(), "trustlineIssuerClassicAddress", "ONcbPCQnHd");
        setField(term39155, term39155.getClass(), "currencyName", "AobDaplFLl");
        setField(term39155, term39155.getClass(), "amount", "pDkMNnAGgv");
        setBooleanField(term39155, term39155.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term39155, term39155.getClass(), "globalIdVerified", false);
        setBooleanField(term39155, term39155.getClass(), "useBlacklist", false);
        setBooleanField(term39155, term39155.getClass(), "agreeFee", false);
        setField(term39155, term39155.getClass(), "maximumTrustlines", term39244);
        setField(term39155, term39155.getClass(), "minBalance", term39246);
        setField(term39155, term39155.getClass(), "maxBalance", term39248);
        setField(term39155, term39155.getClass(), "maxXrpFeePerTransaction", "PaCpFXGzdX");
        setField(term39155, term39155.getClass(), "retryOfId", term39262);
        setField(term39155, term39155.getClass(), "paymentType", enum69);
        setField(term39155, term39155.getClass(), "snapshotTrustlineIssuerClassicAddress", "FftYCNbnks");
        setField(term39155, term39155.getClass(), "snapshotCurrencyName", "lJoltmsadS");
        setLongField(term39304, term39304.getClass(), "fastTime", 1762147441299L);
        setField(term39304, term39304.getClass(), "cdate", null);
        setField(term39155, term39155.getClass(), "startTime", term39304);
        setField(term39155, term39155.getClass(), "frequency", enum70);
        setLongField(term39318, term39318.getClass(), "fastTime", 1395479491666L);
        setField(term39318, term39318.getClass(), "cdate", null);
        setField(term39155, term39155.getClass(), "repeatUntilDate", term39318);
        setField(term39155, term39155.getClass(), "email", "mvfDtZNEHr");
        setBooleanField(term39155, term39155.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxXrpFeePerTransaction", argTypes, term39155, args);
    }

};


