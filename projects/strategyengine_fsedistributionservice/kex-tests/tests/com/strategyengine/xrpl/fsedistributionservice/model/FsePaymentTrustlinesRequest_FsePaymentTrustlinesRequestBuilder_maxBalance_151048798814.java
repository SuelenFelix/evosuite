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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_maxBalance_151048798814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term428752;
     Object term428929;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_maxBalance_151048798814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term428841 = new Integer(-1347358701);
        Double term428843 = new Double(0.6054109236809134);
        Double term428845 = new Double(0.9165240441138934);
        Long term428859 = new Long(-7304801244306393588L);
        Class<? extends Object> term429012 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term429011 = ((Class) term429012).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term429011).setAccessible(true);
        Object enum799 = ((Field) term429011).get((Object) null);
        Class<? extends Object> term429430 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term429429 = ((Class) term429430).getDeclaredField((String) "MONTHLY");
        ((Field) term429429).setAccessible(true);
        Object enum800 = ((Field) term429429).get((Object) null);
        term428752 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term428901 = newInstance(Class.forName("java.util.Date"));
        Object term428914 = newInstance(Class.forName("java.util.Date"));
        setField(term428752, term428752.getClass(), "memo", "EmDmkDpxon");
        setField(term428752, term428752.getClass(), "fromClassicAddress", "VvItpTBxIr");
        setField(term428752, term428752.getClass(), "fromSigningPublicKey", "lRNmJJNKCh");
        setField(term428752, term428752.getClass(), "fromPrivateKey", "wQjEhEbcxP");
        setField(term428752, term428752.getClass(), "trustlineIssuerClassicAddress", "WQWajfRESR");
        setField(term428752, term428752.getClass(), "currencyName", "FpLNKrgBfH");
        setField(term428752, term428752.getClass(), "amount", "eOMULntXto");
        setBooleanField(term428752, term428752.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term428752, term428752.getClass(), "globalIdVerified", false);
        setBooleanField(term428752, term428752.getClass(), "useBlacklist", true);
        setBooleanField(term428752, term428752.getClass(), "agreeFee", false);
        setField(term428752, term428752.getClass(), "maximumTrustlines", term428841);
        setField(term428752, term428752.getClass(), "minBalance", term428843);
        setField(term428752, term428752.getClass(), "maxBalance", term428845);
        setField(term428752, term428752.getClass(), "maxXrpFeePerTransaction", "wGroGsyEBE");
        setField(term428752, term428752.getClass(), "retryOfId", term428859);
        setField(term428752, term428752.getClass(), "paymentType", enum799);
        setField(term428752, term428752.getClass(), "snapshotTrustlineIssuerClassicAddress", "ytRmDKVnzC");
        setField(term428752, term428752.getClass(), "snapshotCurrencyName", "xIlQLEFozf");
        setLongField(term428901, term428901.getClass(), "fastTime", 1341535651611L);
        setField(term428901, term428901.getClass(), "cdate", null);
        setField(term428752, term428752.getClass(), "startTime", term428901);
        setField(term428752, term428752.getClass(), "frequency", enum800);
        setLongField(term428914, term428914.getClass(), "fastTime", 1410723475322L);
        setField(term428914, term428914.getClass(), "cdate", null);
        setField(term428752, term428752.getClass(), "repeatUntilDate", term428914);
        setField(term428752, term428752.getClass(), "email", "vjkUeksZSx");
        setBooleanField(term428752, term428752.getClass(), "autoApprove", true);
        term428929 = new Double(0.22227423914231126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term428929;
        callMethod(klass, "maxBalance", argTypes, term428752, args);
    }

};


