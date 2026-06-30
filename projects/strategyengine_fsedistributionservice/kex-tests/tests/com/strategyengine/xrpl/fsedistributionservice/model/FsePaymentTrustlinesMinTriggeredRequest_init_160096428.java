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

public class FsePaymentTrustlinesMinTriggeredRequest_init_160096428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6401;
     Object term6578;

    public FsePaymentTrustlinesMinTriggeredRequest_init_160096428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6490 = new Integer(-1955890973);
        Double term6492 = new Double(0.7655020693602768);
        Double term6494 = new Double(0.1374549299694151);
        Long term6508 = new Long(4872422362414183754L);
        Class<? extends Object> term6661 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term6660 = ((Class) term6661).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term6660).setAccessible(true);
        Object enum12 = ((Field) term6660).get((Object) null);
        Class<? extends Object> term7079 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term7078 = ((Class) term7079).getDeclaredField((String) "MONTHLY");
        ((Field) term7078).setAccessible(true);
        Object enum13 = ((Field) term7078).get((Object) null);
        term6401 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term6550 = newInstance(Class.forName("java.util.Date"));
        Object term6563 = newInstance(Class.forName("java.util.Date"));
        setField(term6401, term6401.getClass(), "memo", "kBdSllIBVz");
        setField(term6401, term6401.getClass(), "fromClassicAddress", "TJmVBGfTML");
        setField(term6401, term6401.getClass(), "fromSigningPublicKey", "tPlsykYBqO");
        setField(term6401, term6401.getClass(), "fromPrivateKey", "bLPjGVBhlX");
        setField(term6401, term6401.getClass(), "trustlineIssuerClassicAddress", "whBvTVIIlC");
        setField(term6401, term6401.getClass(), "currencyName", "IgRJUzaCwW");
        setField(term6401, term6401.getClass(), "amount", "JUmudUmaaV");
        setBooleanField(term6401, term6401.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term6401, term6401.getClass(), "globalIdVerified", true);
        setBooleanField(term6401, term6401.getClass(), "useBlacklist", true);
        setBooleanField(term6401, term6401.getClass(), "agreeFee", true);
        setField(term6401, term6401.getClass(), "maximumTrustlines", term6490);
        setField(term6401, term6401.getClass(), "minBalance", term6492);
        setField(term6401, term6401.getClass(), "maxBalance", term6494);
        setField(term6401, term6401.getClass(), "maxXrpFeePerTransaction", "KoyGrUJeJW");
        setField(term6401, term6401.getClass(), "retryOfId", term6508);
        setField(term6401, term6401.getClass(), "paymentType", enum12);
        setField(term6401, term6401.getClass(), "snapshotTrustlineIssuerClassicAddress", "HqBOwkVqjD");
        setField(term6401, term6401.getClass(), "snapshotCurrencyName", "MAcUBcBckh");
        setLongField(term6550, term6550.getClass(), "fastTime", 1745462962080L);
        setField(term6550, term6550.getClass(), "cdate", null);
        setField(term6401, term6401.getClass(), "startTime", term6550);
        setField(term6401, term6401.getClass(), "frequency", enum13);
        setLongField(term6563, term6563.getClass(), "fastTime", 1349069753960L);
        setField(term6563, term6563.getClass(), "cdate", null);
        setField(term6401, term6401.getClass(), "repeatUntilDate", term6563);
        setField(term6401, term6401.getClass(), "email", "oVgzLbrsFr");
        setBooleanField(term6401, term6401.getClass(), "autoApprove", false);
        term6578 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term6401;
        args[1] = term6578;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


