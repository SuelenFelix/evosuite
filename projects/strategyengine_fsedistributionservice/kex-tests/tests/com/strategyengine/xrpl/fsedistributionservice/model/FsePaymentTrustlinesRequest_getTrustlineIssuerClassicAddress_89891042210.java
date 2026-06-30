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

public class FsePaymentTrustlinesRequest_getTrustlineIssuerClassicAddress_89891042210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28515;

    public FsePaymentTrustlinesRequest_getTrustlineIssuerClassicAddress_89891042210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28604 = new Integer(-203030934);
        Double term28606 = new Double(0.5279279537140873);
        Double term28608 = new Double(0.3202192021706908);
        Long term28622 = new Long(-3842548265506930260L);
        Class<? extends Object> term28763 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term28762 = ((Class) term28763).getDeclaredField((String) "FLAT");
        ((Field) term28762).setAccessible(true);
        Object enum49 = ((Field) term28762).get((Object) null);
        Class<? extends Object> term29157 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term29156 = ((Class) term29157).getDeclaredField((String) "DAILY");
        ((Field) term29156).setAccessible(true);
        Object enum50 = ((Field) term29156).get((Object) null);
        term28515 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term28656 = newInstance(Class.forName("java.util.Date"));
        Object term28667 = newInstance(Class.forName("java.util.Date"));
        setField(term28515, term28515.getClass(), "memo", "yevIIoVYHq");
        setField(term28515, term28515.getClass(), "fromClassicAddress", "UuYWMTqWTV");
        setField(term28515, term28515.getClass(), "fromSigningPublicKey", "DSFGlcaXUb");
        setField(term28515, term28515.getClass(), "fromPrivateKey", "sHMXNUzNeM");
        setField(term28515, term28515.getClass(), "trustlineIssuerClassicAddress", "gPzGDOEPPw");
        setField(term28515, term28515.getClass(), "currencyName", "rwKoAngzCu");
        setField(term28515, term28515.getClass(), "amount", "VUkRVwROTl");
        setBooleanField(term28515, term28515.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term28515, term28515.getClass(), "globalIdVerified", true);
        setBooleanField(term28515, term28515.getClass(), "useBlacklist", true);
        setBooleanField(term28515, term28515.getClass(), "agreeFee", true);
        setField(term28515, term28515.getClass(), "maximumTrustlines", term28604);
        setField(term28515, term28515.getClass(), "minBalance", term28606);
        setField(term28515, term28515.getClass(), "maxBalance", term28608);
        setField(term28515, term28515.getClass(), "maxXrpFeePerTransaction", "UDlkdccCRn");
        setField(term28515, term28515.getClass(), "retryOfId", term28622);
        setField(term28515, term28515.getClass(), "paymentType", enum49);
        setField(term28515, term28515.getClass(), "snapshotTrustlineIssuerClassicAddress", "McpzErOcYb");
        setField(term28515, term28515.getClass(), "snapshotCurrencyName", "jqrVEUvYEz");
        setLongField(term28656, term28656.getClass(), "fastTime", 1595517583842L);
        setField(term28656, term28656.getClass(), "cdate", null);
        setField(term28515, term28515.getClass(), "startTime", term28656);
        setField(term28515, term28515.getClass(), "frequency", enum50);
        setLongField(term28667, term28667.getClass(), "fastTime", 1464421789888L);
        setField(term28667, term28667.getClass(), "cdate", null);
        setField(term28515, term28515.getClass(), "repeatUntilDate", term28667);
        setField(term28515, term28515.getClass(), "email", "QITgiBrmfj");
        setBooleanField(term28515, term28515.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrustlineIssuerClassicAddress", argTypes, term28515, args);
    }

};


