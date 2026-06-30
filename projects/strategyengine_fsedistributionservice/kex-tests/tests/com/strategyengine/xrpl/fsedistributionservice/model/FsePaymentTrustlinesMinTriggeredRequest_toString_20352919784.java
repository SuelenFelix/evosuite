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
import java.lang.Object;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;

public class FsePaymentTrustlinesMinTriggeredRequest_toString_20352919784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3197;

    public FsePaymentTrustlinesMinTriggeredRequest_toString_20352919784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3287 = new Integer(391863371);
        Double term3289 = new Double(0.2641345529914265);
        Double term3291 = new Double(0.36923381893433327);
        Long term3305 = new Long(-8400487765614892086L);
        Class<? extends Object> term3447 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term3446 = ((Class) term3447).getDeclaredField((String) "FLAT");
        ((Field) term3446).setAccessible(true);
        Object enum6 = ((Field) term3446).get((Object) null);
        Class<? extends Object> term3841 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term3840 = ((Class) term3841).getDeclaredField((String) "DAILY");
        ((Field) term3840).setAccessible(true);
        Object enum7 = ((Field) term3840).get((Object) null);
        term3197 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest"));
        Object term3198 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term3339 = newInstance(Class.forName("java.util.Date"));
        Object term3350 = newInstance(Class.forName("java.util.Date"));
        setField(term3198, term3198.getClass(), "memo", "SbAoxhfrkn");
        setField(term3198, term3198.getClass(), "fromClassicAddress", "kuTXqwMtDB");
        setField(term3198, term3198.getClass(), "fromSigningPublicKey", "Ghbwtircqb");
        setField(term3198, term3198.getClass(), "fromPrivateKey", "xrwlQZdwCp");
        setField(term3198, term3198.getClass(), "trustlineIssuerClassicAddress", "IDCWpPLRkE");
        setField(term3198, term3198.getClass(), "currencyName", "nyiiPDVjAc");
        setField(term3198, term3198.getClass(), "amount", "aKnKipADSo");
        setBooleanField(term3198, term3198.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term3198, term3198.getClass(), "globalIdVerified", true);
        setBooleanField(term3198, term3198.getClass(), "useBlacklist", true);
        setBooleanField(term3198, term3198.getClass(), "agreeFee", false);
        setField(term3198, term3198.getClass(), "maximumTrustlines", term3287);
        setField(term3198, term3198.getClass(), "minBalance", term3289);
        setField(term3198, term3198.getClass(), "maxBalance", term3291);
        setField(term3198, term3198.getClass(), "maxXrpFeePerTransaction", "wSQxaModmm");
        setField(term3198, term3198.getClass(), "retryOfId", term3305);
        setField(term3198, term3198.getClass(), "paymentType", enum6);
        setField(term3198, term3198.getClass(), "snapshotTrustlineIssuerClassicAddress", "UlajhuVLaP");
        setField(term3198, term3198.getClass(), "snapshotCurrencyName", "gGSMzuGICf");
        setLongField(term3339, term3339.getClass(), "fastTime", 1429023851389L);
        setField(term3339, term3339.getClass(), "cdate", null);
        setField(term3198, term3198.getClass(), "startTime", term3339);
        setField(term3198, term3198.getClass(), "frequency", enum7);
        setLongField(term3350, term3350.getClass(), "fastTime", 1495357463288L);
        setField(term3350, term3350.getClass(), "cdate", null);
        setField(term3198, term3198.getClass(), "repeatUntilDate", term3350);
        setField(term3198, term3198.getClass(), "email", "hxCBltsObl");
        setBooleanField(term3198, term3198.getClass(), "autoApprove", false);
        setField(term3197, term3197.getClass(), "trustlinePaymentRequest", term3198);
        setIntField(term3197, term3197.getClass(), "minTrustLinesTriggerValue", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3197, args);
    }

};


