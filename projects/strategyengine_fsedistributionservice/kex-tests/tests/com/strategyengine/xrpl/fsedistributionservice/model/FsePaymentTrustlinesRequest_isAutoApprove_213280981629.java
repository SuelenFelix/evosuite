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

public class FsePaymentTrustlinesRequest_isAutoApprove_213280981629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48841;

    public FsePaymentTrustlinesRequest_isAutoApprove_213280981629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term48930 = new Integer(-14890619);
        Double term48932 = new Double(0.6767213143579776);
        Double term48934 = new Double(0.48862955528902696);
        Long term48948 = new Long(305759998609888272L);
        Class<? extends Object> term49099 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term49098 = ((Class) term49099).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term49098).setAccessible(true);
        Object enum87 = ((Field) term49098).get((Object) null);
        Class<? extends Object> term49517 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term49516 = ((Class) term49517).getDeclaredField((String) "MONTHLY");
        ((Field) term49516).setAccessible(true);
        Object enum88 = ((Field) term49516).get((Object) null);
        term48841 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term48990 = newInstance(Class.forName("java.util.Date"));
        Object term49003 = newInstance(Class.forName("java.util.Date"));
        setField(term48841, term48841.getClass(), "memo", "xypryEkUPF");
        setField(term48841, term48841.getClass(), "fromClassicAddress", "zyZTzHNjQr");
        setField(term48841, term48841.getClass(), "fromSigningPublicKey", "YSrFKQQwXE");
        setField(term48841, term48841.getClass(), "fromPrivateKey", "qxhOsmyyjm");
        setField(term48841, term48841.getClass(), "trustlineIssuerClassicAddress", "DuKcNfVVYR");
        setField(term48841, term48841.getClass(), "currencyName", "fRujHWvXjJ");
        setField(term48841, term48841.getClass(), "amount", "EAIAAStlTz");
        setBooleanField(term48841, term48841.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term48841, term48841.getClass(), "globalIdVerified", false);
        setBooleanField(term48841, term48841.getClass(), "useBlacklist", false);
        setBooleanField(term48841, term48841.getClass(), "agreeFee", true);
        setField(term48841, term48841.getClass(), "maximumTrustlines", term48930);
        setField(term48841, term48841.getClass(), "minBalance", term48932);
        setField(term48841, term48841.getClass(), "maxBalance", term48934);
        setField(term48841, term48841.getClass(), "maxXrpFeePerTransaction", "yIWXcOQTgy");
        setField(term48841, term48841.getClass(), "retryOfId", term48948);
        setField(term48841, term48841.getClass(), "paymentType", enum87);
        setField(term48841, term48841.getClass(), "snapshotTrustlineIssuerClassicAddress", "xAWekqanqc");
        setField(term48841, term48841.getClass(), "snapshotCurrencyName", "GSOWFHMlbF");
        setLongField(term48990, term48990.getClass(), "fastTime", 1689428810999L);
        setField(term48990, term48990.getClass(), "cdate", null);
        setField(term48841, term48841.getClass(), "startTime", term48990);
        setField(term48841, term48841.getClass(), "frequency", enum88);
        setLongField(term49003, term49003.getClass(), "fastTime", 1570714321079L);
        setField(term49003, term49003.getClass(), "cdate", null);
        setField(term48841, term48841.getClass(), "repeatUntilDate", term49003);
        setField(term48841, term48841.getClass(), "email", "vpZIqpFbKM");
        setBooleanField(term48841, term48841.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAutoApprove", argTypes, term48841, args);
    }

};


