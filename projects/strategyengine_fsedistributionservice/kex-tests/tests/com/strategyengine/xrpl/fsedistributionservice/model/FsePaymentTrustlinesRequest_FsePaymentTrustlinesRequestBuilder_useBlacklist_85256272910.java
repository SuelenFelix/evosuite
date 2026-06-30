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
import java.lang.Boolean;

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_useBlacklist_85256272910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424508;
     Object term424685;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_useBlacklist_85256272910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term424597 = new Integer(-1310015129);
        Double term424599 = new Double(0.007493740494434409);
        Double term424601 = new Double(0.29172553321356776);
        Long term424615 = new Long(-8538252445590221089L);
        Class<? extends Object> term424768 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term424767 = ((Class) term424768).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term424767).setAccessible(true);
        Object enum791 = ((Field) term424767).get((Object) null);
        Class<? extends Object> term425186 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term425185 = ((Class) term425186).getDeclaredField((String) "MONTHLY");
        ((Field) term425185).setAccessible(true);
        Object enum792 = ((Field) term425185).get((Object) null);
        term424508 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term424657 = newInstance(Class.forName("java.util.Date"));
        Object term424670 = newInstance(Class.forName("java.util.Date"));
        setField(term424508, term424508.getClass(), "memo", "ZyrBdfnXeY");
        setField(term424508, term424508.getClass(), "fromClassicAddress", "bDxxtRkvDR");
        setField(term424508, term424508.getClass(), "fromSigningPublicKey", "DXBdXbduQR");
        setField(term424508, term424508.getClass(), "fromPrivateKey", "VDhtmUjQiN");
        setField(term424508, term424508.getClass(), "trustlineIssuerClassicAddress", "WfovQKooYd");
        setField(term424508, term424508.getClass(), "currencyName", "rGPyIinCpj");
        setField(term424508, term424508.getClass(), "amount", "IaOmsLcrtn");
        setBooleanField(term424508, term424508.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term424508, term424508.getClass(), "globalIdVerified", false);
        setBooleanField(term424508, term424508.getClass(), "useBlacklist", false);
        setBooleanField(term424508, term424508.getClass(), "agreeFee", false);
        setField(term424508, term424508.getClass(), "maximumTrustlines", term424597);
        setField(term424508, term424508.getClass(), "minBalance", term424599);
        setField(term424508, term424508.getClass(), "maxBalance", term424601);
        setField(term424508, term424508.getClass(), "maxXrpFeePerTransaction", "ORKzUipLcn");
        setField(term424508, term424508.getClass(), "retryOfId", term424615);
        setField(term424508, term424508.getClass(), "paymentType", enum791);
        setField(term424508, term424508.getClass(), "snapshotTrustlineIssuerClassicAddress", "BogHZveAYL");
        setField(term424508, term424508.getClass(), "snapshotCurrencyName", "burBurEYAD");
        setLongField(term424657, term424657.getClass(), "fastTime", 1602283215864L);
        setField(term424657, term424657.getClass(), "cdate", null);
        setField(term424508, term424508.getClass(), "startTime", term424657);
        setField(term424508, term424508.getClass(), "frequency", enum792);
        setLongField(term424670, term424670.getClass(), "fastTime", 1334967656941L);
        setField(term424670, term424670.getClass(), "cdate", null);
        setField(term424508, term424508.getClass(), "repeatUntilDate", term424670);
        setField(term424508, term424508.getClass(), "email", "EjzJWaQxzV");
        setBooleanField(term424508, term424508.getClass(), "autoApprove", true);
        term424685 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term424685;
        callMethod(klass, "useBlacklist", argTypes, term424508, args);
    }

};


