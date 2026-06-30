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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_globalIdVerified_6592485059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423428;
     Object term423605;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_globalIdVerified_6592485059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term423517 = new Integer(-1870495012);
        Double term423519 = new Double(0.44268490778872205);
        Double term423521 = new Double(0.7507333108648018);
        Long term423535 = new Long(1721306000453653222L);
        Class<? extends Object> term423688 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term423687 = ((Class) term423688).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term423687).setAccessible(true);
        Object enum789 = ((Field) term423687).get((Object) null);
        Class<? extends Object> term424106 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term424105 = ((Class) term424106).getDeclaredField((String) "MONTHLY");
        ((Field) term424105).setAccessible(true);
        Object enum790 = ((Field) term424105).get((Object) null);
        term423428 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term423577 = newInstance(Class.forName("java.util.Date"));
        Object term423590 = newInstance(Class.forName("java.util.Date"));
        setField(term423428, term423428.getClass(), "memo", "nGAQeiXMym");
        setField(term423428, term423428.getClass(), "fromClassicAddress", "kUwXxbHTwL");
        setField(term423428, term423428.getClass(), "fromSigningPublicKey", "jyCeUOPFOB");
        setField(term423428, term423428.getClass(), "fromPrivateKey", "ecpmlNmLqr");
        setField(term423428, term423428.getClass(), "trustlineIssuerClassicAddress", "VCpvVubRIo");
        setField(term423428, term423428.getClass(), "currencyName", "ktYPRKLpUd");
        setField(term423428, term423428.getClass(), "amount", "GduPctsAIe");
        setBooleanField(term423428, term423428.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term423428, term423428.getClass(), "globalIdVerified", false);
        setBooleanField(term423428, term423428.getClass(), "useBlacklist", false);
        setBooleanField(term423428, term423428.getClass(), "agreeFee", true);
        setField(term423428, term423428.getClass(), "maximumTrustlines", term423517);
        setField(term423428, term423428.getClass(), "minBalance", term423519);
        setField(term423428, term423428.getClass(), "maxBalance", term423521);
        setField(term423428, term423428.getClass(), "maxXrpFeePerTransaction", "yDJzJsbTrq");
        setField(term423428, term423428.getClass(), "retryOfId", term423535);
        setField(term423428, term423428.getClass(), "paymentType", enum789);
        setField(term423428, term423428.getClass(), "snapshotTrustlineIssuerClassicAddress", "qvcWBAoFhO");
        setField(term423428, term423428.getClass(), "snapshotCurrencyName", "oopBzHkVjN");
        setLongField(term423577, term423577.getClass(), "fastTime", 1648365103654L);
        setField(term423577, term423577.getClass(), "cdate", null);
        setField(term423428, term423428.getClass(), "startTime", term423577);
        setField(term423428, term423428.getClass(), "frequency", enum790);
        setLongField(term423590, term423590.getClass(), "fastTime", 1647593706516L);
        setField(term423590, term423590.getClass(), "cdate", null);
        setField(term423428, term423428.getClass(), "repeatUntilDate", term423590);
        setField(term423428, term423428.getClass(), "email", "RlgumahXAP");
        setBooleanField(term423428, term423428.getClass(), "autoApprove", true);
        term423605 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term423605;
        callMethod(klass, "globalIdVerified", argTypes, term423428, args);
    }

};


