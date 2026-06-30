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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_minBalance_198491405413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427708;
     Object term427876;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_minBalance_198491405413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term427797 = new Integer(-165587447);
        Double term427799 = new Double(0.5335953039331021);
        Double term427801 = new Double(0.5725602309856443);
        Long term427815 = new Long(-1596611740124054468L);
        Class<? extends Object> term427959 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term427958 = ((Class) term427959).getDeclaredField((String) "FLAT");
        ((Field) term427958).setAccessible(true);
        Object enum797 = ((Field) term427958).get((Object) null);
        Class<? extends Object> term428353 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term428352 = ((Class) term428353).getDeclaredField((String) "WEEKLY");
        ((Field) term428352).setAccessible(true);
        Object enum798 = ((Field) term428352).get((Object) null);
        term427708 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term427849 = newInstance(Class.forName("java.util.Date"));
        Object term427861 = newInstance(Class.forName("java.util.Date"));
        setField(term427708, term427708.getClass(), "memo", "LDVdMfqhmz");
        setField(term427708, term427708.getClass(), "fromClassicAddress", "RwbNOPHwhW");
        setField(term427708, term427708.getClass(), "fromSigningPublicKey", "FSKhxZvpnl");
        setField(term427708, term427708.getClass(), "fromPrivateKey", "dKmYpbxoRS");
        setField(term427708, term427708.getClass(), "trustlineIssuerClassicAddress", "azUzzteCGy");
        setField(term427708, term427708.getClass(), "currencyName", "BLBvGRqyYM");
        setField(term427708, term427708.getClass(), "amount", "oKQiVhGGYR");
        setBooleanField(term427708, term427708.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term427708, term427708.getClass(), "globalIdVerified", false);
        setBooleanField(term427708, term427708.getClass(), "useBlacklist", false);
        setBooleanField(term427708, term427708.getClass(), "agreeFee", false);
        setField(term427708, term427708.getClass(), "maximumTrustlines", term427797);
        setField(term427708, term427708.getClass(), "minBalance", term427799);
        setField(term427708, term427708.getClass(), "maxBalance", term427801);
        setField(term427708, term427708.getClass(), "maxXrpFeePerTransaction", "TzLaUPSnqj");
        setField(term427708, term427708.getClass(), "retryOfId", term427815);
        setField(term427708, term427708.getClass(), "paymentType", enum797);
        setField(term427708, term427708.getClass(), "snapshotTrustlineIssuerClassicAddress", "aBNUlBwETR");
        setField(term427708, term427708.getClass(), "snapshotCurrencyName", "qjmxrabYcx");
        setLongField(term427849, term427849.getClass(), "fastTime", 1351258059262L);
        setField(term427849, term427849.getClass(), "cdate", null);
        setField(term427708, term427708.getClass(), "startTime", term427849);
        setField(term427708, term427708.getClass(), "frequency", enum798);
        setLongField(term427861, term427861.getClass(), "fastTime", 1728499472597L);
        setField(term427861, term427861.getClass(), "cdate", null);
        setField(term427708, term427708.getClass(), "repeatUntilDate", term427861);
        setField(term427708, term427708.getClass(), "email", "myWRMyEhIt");
        setBooleanField(term427708, term427708.getClass(), "autoApprove", true);
        term427876 = new Double(0.5310967137636303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term427876;
        callMethod(klass, "minBalance", argTypes, term427708, args);
    }

};


