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

public class FsePaymentTrustlinesRequest_setFromClassicAddress_167342023733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52025;

    public FsePaymentTrustlinesRequest_setFromClassicAddress_167342023733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term52114 = new Integer(-1786399638);
        Double term52116 = new Double(0.8924855581421237);
        Double term52118 = new Double(0.32237559209193944);
        Long term52132 = new Long(-6723783499250797216L);
        Class<? extends Object> term52285 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term52284 = ((Class) term52285).getDeclaredField((String) "FLAT");
        ((Field) term52284).setAccessible(true);
        Object enum93 = ((Field) term52284).get((Object) null);
        Class<? extends Object> term52679 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term52678 = ((Class) term52679).getDeclaredField((String) "DAILY");
        ((Field) term52678).setAccessible(true);
        Object enum94 = ((Field) term52678).get((Object) null);
        term52025 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term52166 = newInstance(Class.forName("java.util.Date"));
        Object term52177 = newInstance(Class.forName("java.util.Date"));
        setField(term52025, term52025.getClass(), "memo", "EHoNUaeyvT");
        setField(term52025, term52025.getClass(), "fromClassicAddress", "ZwKmasCVIy");
        setField(term52025, term52025.getClass(), "fromSigningPublicKey", "pxokrVaeMd");
        setField(term52025, term52025.getClass(), "fromPrivateKey", "ujxmmZZcbT");
        setField(term52025, term52025.getClass(), "trustlineIssuerClassicAddress", "BOvgwHfoHQ");
        setField(term52025, term52025.getClass(), "currencyName", "hPpFNeDBIb");
        setField(term52025, term52025.getClass(), "amount", "DNOtiLPAIY");
        setBooleanField(term52025, term52025.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term52025, term52025.getClass(), "globalIdVerified", true);
        setBooleanField(term52025, term52025.getClass(), "useBlacklist", true);
        setBooleanField(term52025, term52025.getClass(), "agreeFee", false);
        setField(term52025, term52025.getClass(), "maximumTrustlines", term52114);
        setField(term52025, term52025.getClass(), "minBalance", term52116);
        setField(term52025, term52025.getClass(), "maxBalance", term52118);
        setField(term52025, term52025.getClass(), "maxXrpFeePerTransaction", "FnEkAHBfyV");
        setField(term52025, term52025.getClass(), "retryOfId", term52132);
        setField(term52025, term52025.getClass(), "paymentType", enum93);
        setField(term52025, term52025.getClass(), "snapshotTrustlineIssuerClassicAddress", "VfmNFpEuax");
        setField(term52025, term52025.getClass(), "snapshotCurrencyName", "ANHjlWPmZG");
        setLongField(term52166, term52166.getClass(), "fastTime", 1825608844992L);
        setField(term52166, term52166.getClass(), "cdate", null);
        setField(term52025, term52025.getClass(), "startTime", term52166);
        setField(term52025, term52025.getClass(), "frequency", enum94);
        setLongField(term52177, term52177.getClass(), "fastTime", 1465782799700L);
        setField(term52177, term52177.getClass(), "cdate", null);
        setField(term52025, term52025.getClass(), "repeatUntilDate", term52177);
        setField(term52025, term52025.getClass(), "email", "SibzENsyyy");
        setBooleanField(term52025, term52025.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mrqGHotaef";
        callMethod(klass, "setFromClassicAddress", argTypes, term52025, args);
    }

};


