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

public class FsePaymentTrustlinesRequest_canEqual_1609558153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21112;
     Object term21280;

    public FsePaymentTrustlinesRequest_canEqual_1609558153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term21201 = new Integer(-117576464);
        Double term21203 = new Double(0.13481025392611334);
        Double term21205 = new Double(0.3800088629986428);
        Long term21219 = new Long(-6292278961887936280L);
        Class<? extends Object> term21362 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term21361 = ((Class) term21362).getDeclaredField((String) "FLAT");
        ((Field) term21361).setAccessible(true);
        Object enum35 = ((Field) term21361).get((Object) null);
        Class<? extends Object> term21756 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term21755 = ((Class) term21756).getDeclaredField((String) "WEEKLY");
        ((Field) term21755).setAccessible(true);
        Object enum36 = ((Field) term21755).get((Object) null);
        term21112 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term21253 = newInstance(Class.forName("java.util.Date"));
        Object term21265 = newInstance(Class.forName("java.util.Date"));
        setField(term21112, term21112.getClass(), "memo", "HpZXWDPhlg");
        setField(term21112, term21112.getClass(), "fromClassicAddress", "lBOokzEPfe");
        setField(term21112, term21112.getClass(), "fromSigningPublicKey", "dtGZCsKXbW");
        setField(term21112, term21112.getClass(), "fromPrivateKey", "bdyhHbDAmJ");
        setField(term21112, term21112.getClass(), "trustlineIssuerClassicAddress", "BBXiTNHqGE");
        setField(term21112, term21112.getClass(), "currencyName", "IEYhJmgCVd");
        setField(term21112, term21112.getClass(), "amount", "KSJeYkkvpk");
        setBooleanField(term21112, term21112.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term21112, term21112.getClass(), "globalIdVerified", false);
        setBooleanField(term21112, term21112.getClass(), "useBlacklist", true);
        setBooleanField(term21112, term21112.getClass(), "agreeFee", true);
        setField(term21112, term21112.getClass(), "maximumTrustlines", term21201);
        setField(term21112, term21112.getClass(), "minBalance", term21203);
        setField(term21112, term21112.getClass(), "maxBalance", term21205);
        setField(term21112, term21112.getClass(), "maxXrpFeePerTransaction", "qUtkFGMNUV");
        setField(term21112, term21112.getClass(), "retryOfId", term21219);
        setField(term21112, term21112.getClass(), "paymentType", enum35);
        setField(term21112, term21112.getClass(), "snapshotTrustlineIssuerClassicAddress", "mGRiYhnMcR");
        setField(term21112, term21112.getClass(), "snapshotCurrencyName", "NFlvfJCVPO");
        setLongField(term21253, term21253.getClass(), "fastTime", 1347400561385L);
        setField(term21253, term21253.getClass(), "cdate", null);
        setField(term21112, term21112.getClass(), "startTime", term21253);
        setField(term21112, term21112.getClass(), "frequency", enum36);
        setLongField(term21265, term21265.getClass(), "fastTime", 1502158153899L);
        setField(term21265, term21265.getClass(), "cdate", null);
        setField(term21112, term21112.getClass(), "repeatUntilDate", term21265);
        setField(term21112, term21112.getClass(), "email", "KarbTXFmUU");
        setBooleanField(term21112, term21112.getClass(), "autoApprove", false);
        term21280 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term21280;
        callMethod(klass, "canEqual", argTypes, term21112, args);
    }

};


