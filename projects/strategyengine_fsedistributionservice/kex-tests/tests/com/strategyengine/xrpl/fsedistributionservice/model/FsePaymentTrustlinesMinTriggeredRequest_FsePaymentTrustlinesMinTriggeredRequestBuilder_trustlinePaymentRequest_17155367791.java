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

public class FsePaymentTrustlinesMinTriggeredRequest_FsePaymentTrustlinesMinTriggeredRequestBuilder_trustlinePaymentRequest_17155367791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559383;
     Object term559552;

    public FsePaymentTrustlinesMinTriggeredRequest_FsePaymentTrustlinesMinTriggeredRequestBuilder_trustlinePaymentRequest_17155367791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term559473 = new Integer(1236004505);
        Double term559475 = new Double(0.5657654165545906);
        Double term559477 = new Double(0.6382060245198228);
        Long term559491 = new Long(-7235419481645807819L);
        Class<? extends Object> term559783 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term559782 = ((Class) term559783).getDeclaredField((String) "FLAT");
        ((Field) term559782).setAccessible(true);
        Object enum1064 = ((Field) term559782).get((Object) null);
        Class<? extends Object> term560177 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term560176 = ((Class) term560177).getDeclaredField((String) "DAILY");
        ((Field) term560176).setAccessible(true);
        Object enum1065 = ((Field) term560176).get((Object) null);
        term559383 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest$FsePaymentTrustlinesMinTriggeredRequestBuilder"));
        Object term559384 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term559525 = newInstance(Class.forName("java.util.Date"));
        Object term559536 = newInstance(Class.forName("java.util.Date"));
        setField(term559384, term559384.getClass(), "memo", "smEWGoimYP");
        setField(term559384, term559384.getClass(), "fromClassicAddress", "QViiWIrVBm");
        setField(term559384, term559384.getClass(), "fromSigningPublicKey", "kzXrBwaqJb");
        setField(term559384, term559384.getClass(), "fromPrivateKey", "AxcOeEhUhX");
        setField(term559384, term559384.getClass(), "trustlineIssuerClassicAddress", "iFdFaQoJtd");
        setField(term559384, term559384.getClass(), "currencyName", "jwbrWhGlmx");
        setField(term559384, term559384.getClass(), "amount", "aFJwRTUFYs");
        setBooleanField(term559384, term559384.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term559384, term559384.getClass(), "globalIdVerified", false);
        setBooleanField(term559384, term559384.getClass(), "useBlacklist", false);
        setBooleanField(term559384, term559384.getClass(), "agreeFee", false);
        setField(term559384, term559384.getClass(), "maximumTrustlines", term559473);
        setField(term559384, term559384.getClass(), "minBalance", term559475);
        setField(term559384, term559384.getClass(), "maxBalance", term559477);
        setField(term559384, term559384.getClass(), "maxXrpFeePerTransaction", "QHNzIgBvry");
        setField(term559384, term559384.getClass(), "retryOfId", term559491);
        setField(term559384, term559384.getClass(), "paymentType", enum1064);
        setField(term559384, term559384.getClass(), "snapshotTrustlineIssuerClassicAddress", "SfLSyAmQEZ");
        setField(term559384, term559384.getClass(), "snapshotCurrencyName", "tqNLzZCPHl");
        setLongField(term559525, term559525.getClass(), "fastTime", 1792971300980L);
        setField(term559525, term559525.getClass(), "cdate", null);
        setField(term559384, term559384.getClass(), "startTime", term559525);
        setField(term559384, term559384.getClass(), "frequency", enum1065);
        setLongField(term559536, term559536.getClass(), "fastTime", 1392480020740L);
        setField(term559536, term559536.getClass(), "cdate", null);
        setField(term559384, term559384.getClass(), "repeatUntilDate", term559536);
        setField(term559384, term559384.getClass(), "email", "hYTyaZYHNE");
        setBooleanField(term559384, term559384.getClass(), "autoApprove", true);
        setField(term559383, term559383.getClass(), "trustlinePaymentRequest", term559384);
        setIntField(term559383, term559383.getClass(), "minTrustLinesTriggerValue", 1725571209);
        Integer term559641 = new Integer(1050765721);
        Double term559643 = new Double(0.1849998667663698);
        Double term559645 = new Double(0.36312400202399575);
        Long term559659 = new Long(-6917021920287966282L);
        term559552 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term559685 = newInstance(Class.forName("java.util.Date"));
        Object term559687 = newInstance(Class.forName("java.util.Date"));
        setField(term559552, term559552.getClass(), "memo", "LAxSnBvfkM");
        setField(term559552, term559552.getClass(), "fromClassicAddress", "RLAVSPcIgS");
        setField(term559552, term559552.getClass(), "fromSigningPublicKey", "kUCclcwUXz");
        setField(term559552, term559552.getClass(), "fromPrivateKey", "QeLmDPNEJJ");
        setField(term559552, term559552.getClass(), "trustlineIssuerClassicAddress", "vKCMbZqDQh");
        setField(term559552, term559552.getClass(), "currencyName", "jplaiEGqAX");
        setField(term559552, term559552.getClass(), "amount", "jBEIjwXBat");
        setBooleanField(term559552, term559552.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term559552, term559552.getClass(), "globalIdVerified", false);
        setBooleanField(term559552, term559552.getClass(), "useBlacklist", false);
        setBooleanField(term559552, term559552.getClass(), "agreeFee", false);
        setField(term559552, term559552.getClass(), "maximumTrustlines", term559641);
        setField(term559552, term559552.getClass(), "minBalance", term559643);
        setField(term559552, term559552.getClass(), "maxBalance", term559645);
        setField(term559552, term559552.getClass(), "maxXrpFeePerTransaction", "YoXZiTWIfq");
        setField(term559552, term559552.getClass(), "retryOfId", term559659);
        setField(term559552, term559552.getClass(), "paymentType", enum1064);
        setField(term559552, term559552.getClass(), "snapshotTrustlineIssuerClassicAddress", "axiEfmpYKn");
        setField(term559552, term559552.getClass(), "snapshotCurrencyName", "qHOoQEXGDJ");
        setLongField(term559685, term559685.getClass(), "fastTime", 1711532631470L);
        setField(term559685, term559685.getClass(), "cdate", null);
        setField(term559552, term559552.getClass(), "startTime", term559685);
        setField(term559552, term559552.getClass(), "frequency", enum1065);
        setLongField(term559687, term559687.getClass(), "fastTime", 1376784142180L);
        setField(term559687, term559687.getClass(), "cdate", null);
        setField(term559552, term559552.getClass(), "repeatUntilDate", term559687);
        setField(term559552, term559552.getClass(), "email", "KicaFputVc");
        setBooleanField(term559552, term559552.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest$FsePaymentTrustlinesMinTriggeredRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Object[] args = new Object[1];
        args[0] = term559552;
        callMethod(klass, "trustlinePaymentRequest", argTypes, term559383, args);
    }

};


