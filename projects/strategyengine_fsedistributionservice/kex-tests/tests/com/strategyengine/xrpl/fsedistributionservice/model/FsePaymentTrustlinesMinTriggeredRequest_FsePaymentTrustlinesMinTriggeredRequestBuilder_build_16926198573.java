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

public class FsePaymentTrustlinesMinTriggeredRequest_FsePaymentTrustlinesMinTriggeredRequestBuilder_build_16926198573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561729;

    public FsePaymentTrustlinesMinTriggeredRequest_FsePaymentTrustlinesMinTriggeredRequestBuilder_build_16926198573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term561819 = new Integer(-1656687479);
        Double term561821 = new Double(0.9184034277897645);
        Double term561823 = new Double(0.9457448635091538);
        Long term561837 = new Long(-562805980132245735L);
        Class<? extends Object> term561980 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term561979 = ((Class) term561980).getDeclaredField((String) "FLAT");
        ((Field) term561979).setAccessible(true);
        Object enum1068 = ((Field) term561979).get((Object) null);
        Class<? extends Object> term562374 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term562373 = ((Class) term562374).getDeclaredField((String) "WEEKLY");
        ((Field) term562373).setAccessible(true);
        Object enum1069 = ((Field) term562373).get((Object) null);
        term561729 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest$FsePaymentTrustlinesMinTriggeredRequestBuilder"));
        Object term561730 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term561871 = newInstance(Class.forName("java.util.Date"));
        Object term561883 = newInstance(Class.forName("java.util.Date"));
        setField(term561730, term561730.getClass(), "memo", "fZOYubmjQr");
        setField(term561730, term561730.getClass(), "fromClassicAddress", "NgDePNgOTA");
        setField(term561730, term561730.getClass(), "fromSigningPublicKey", "vSBdHCYUVt");
        setField(term561730, term561730.getClass(), "fromPrivateKey", "THvGTpdqrf");
        setField(term561730, term561730.getClass(), "trustlineIssuerClassicAddress", "ucbQApFAaL");
        setField(term561730, term561730.getClass(), "currencyName", "ZxAIlRffKc");
        setField(term561730, term561730.getClass(), "amount", "WazDBkwTAD");
        setBooleanField(term561730, term561730.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term561730, term561730.getClass(), "globalIdVerified", true);
        setBooleanField(term561730, term561730.getClass(), "useBlacklist", false);
        setBooleanField(term561730, term561730.getClass(), "agreeFee", false);
        setField(term561730, term561730.getClass(), "maximumTrustlines", term561819);
        setField(term561730, term561730.getClass(), "minBalance", term561821);
        setField(term561730, term561730.getClass(), "maxBalance", term561823);
        setField(term561730, term561730.getClass(), "maxXrpFeePerTransaction", "OMMiKBeIDF");
        setField(term561730, term561730.getClass(), "retryOfId", term561837);
        setField(term561730, term561730.getClass(), "paymentType", enum1068);
        setField(term561730, term561730.getClass(), "snapshotTrustlineIssuerClassicAddress", "VVatnPtgTf");
        setField(term561730, term561730.getClass(), "snapshotCurrencyName", "UQKKIKJhBm");
        setLongField(term561871, term561871.getClass(), "fastTime", 1524029387695L);
        setField(term561871, term561871.getClass(), "cdate", null);
        setField(term561730, term561730.getClass(), "startTime", term561871);
        setField(term561730, term561730.getClass(), "frequency", enum1069);
        setLongField(term561883, term561883.getClass(), "fastTime", 1577756357524L);
        setField(term561883, term561883.getClass(), "cdate", null);
        setField(term561730, term561730.getClass(), "repeatUntilDate", term561883);
        setField(term561730, term561730.getClass(), "email", "fXkuwVyxxe");
        setBooleanField(term561730, term561730.getClass(), "autoApprove", false);
        setField(term561729, term561729.getClass(), "trustlinePaymentRequest", term561730);
        setIntField(term561729, term561729.getClass(), "minTrustLinesTriggerValue", -883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest$FsePaymentTrustlinesMinTriggeredRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term561729, args);
    }

};


