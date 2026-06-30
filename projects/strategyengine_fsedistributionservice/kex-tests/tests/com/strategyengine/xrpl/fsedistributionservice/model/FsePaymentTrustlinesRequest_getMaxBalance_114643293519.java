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

public class FsePaymentTrustlinesRequest_getMaxBalance_114643293519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38077;

    public FsePaymentTrustlinesRequest_getMaxBalance_114643293519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38166 = new Integer(679763016);
        Double term38168 = new Double(0.5804948995371725);
        Double term38170 = new Double(0.20737514139742264);
        Long term38184 = new Long(-3838084482494604218L);
        Class<? extends Object> term38335 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term38334 = ((Class) term38335).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term38334).setAccessible(true);
        Object enum67 = ((Field) term38334).get((Object) null);
        Class<? extends Object> term38753 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term38752 = ((Class) term38753).getDeclaredField((String) "MONTHLY");
        ((Field) term38752).setAccessible(true);
        Object enum68 = ((Field) term38752).get((Object) null);
        term38077 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term38226 = newInstance(Class.forName("java.util.Date"));
        Object term38239 = newInstance(Class.forName("java.util.Date"));
        setField(term38077, term38077.getClass(), "memo", "nrQjODRMLD");
        setField(term38077, term38077.getClass(), "fromClassicAddress", "PNoWXrsFic");
        setField(term38077, term38077.getClass(), "fromSigningPublicKey", "QZBHZqZope");
        setField(term38077, term38077.getClass(), "fromPrivateKey", "VBUahCvyxC");
        setField(term38077, term38077.getClass(), "trustlineIssuerClassicAddress", "MlzTkzKMCX");
        setField(term38077, term38077.getClass(), "currencyName", "UqKUbMyPMJ");
        setField(term38077, term38077.getClass(), "amount", "QpYltHAdyY");
        setBooleanField(term38077, term38077.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term38077, term38077.getClass(), "globalIdVerified", false);
        setBooleanField(term38077, term38077.getClass(), "useBlacklist", true);
        setBooleanField(term38077, term38077.getClass(), "agreeFee", false);
        setField(term38077, term38077.getClass(), "maximumTrustlines", term38166);
        setField(term38077, term38077.getClass(), "minBalance", term38168);
        setField(term38077, term38077.getClass(), "maxBalance", term38170);
        setField(term38077, term38077.getClass(), "maxXrpFeePerTransaction", "lbmSGBwIiV");
        setField(term38077, term38077.getClass(), "retryOfId", term38184);
        setField(term38077, term38077.getClass(), "paymentType", enum67);
        setField(term38077, term38077.getClass(), "snapshotTrustlineIssuerClassicAddress", "DAxyHoTLzZ");
        setField(term38077, term38077.getClass(), "snapshotCurrencyName", "fhZgTouhCC");
        setLongField(term38226, term38226.getClass(), "fastTime", 1628695316832L);
        setField(term38226, term38226.getClass(), "cdate", null);
        setField(term38077, term38077.getClass(), "startTime", term38226);
        setField(term38077, term38077.getClass(), "frequency", enum68);
        setLongField(term38239, term38239.getClass(), "fastTime", 1393200035243L);
        setField(term38239, term38239.getClass(), "cdate", null);
        setField(term38077, term38077.getClass(), "repeatUntilDate", term38239);
        setField(term38077, term38077.getClass(), "email", "wrikqJwXvL");
        setBooleanField(term38077, term38077.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxBalance", argTypes, term38077, args);
    }

};


