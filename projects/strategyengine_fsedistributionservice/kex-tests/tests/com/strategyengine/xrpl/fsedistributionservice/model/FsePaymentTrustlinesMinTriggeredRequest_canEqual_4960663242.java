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

public class FsePaymentTrustlinesMinTriggeredRequest_canEqual_4960663242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1108;
     Object term1278;

    public FsePaymentTrustlinesMinTriggeredRequest_canEqual_4960663242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1198 = new Integer(1162663216);
        Double term1200 = new Double(0.5523635872663106);
        Double term1202 = new Double(0.544608645520025);
        Long term1216 = new Long(6375119433582206027L);
        Class<? extends Object> term1360 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term1359 = ((Class) term1360).getDeclaredField((String) "FLAT");
        ((Field) term1359).setAccessible(true);
        Object enum2 = ((Field) term1359).get((Object) null);
        Class<? extends Object> term1754 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term1753 = ((Class) term1754).getDeclaredField((String) "WEEKLY");
        ((Field) term1753).setAccessible(true);
        Object enum3 = ((Field) term1753).get((Object) null);
        term1108 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest"));
        Object term1109 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term1250 = newInstance(Class.forName("java.util.Date"));
        Object term1262 = newInstance(Class.forName("java.util.Date"));
        setField(term1109, term1109.getClass(), "memo", "uuaPigETmJ");
        setField(term1109, term1109.getClass(), "fromClassicAddress", "MxlszYVzRf");
        setField(term1109, term1109.getClass(), "fromSigningPublicKey", "LQFpaHEwXR");
        setField(term1109, term1109.getClass(), "fromPrivateKey", "oVcInYnLWB");
        setField(term1109, term1109.getClass(), "trustlineIssuerClassicAddress", "aJlieCFVtF");
        setField(term1109, term1109.getClass(), "currencyName", "ZiaGIbnzTs");
        setField(term1109, term1109.getClass(), "amount", "tbcdzjIfER");
        setBooleanField(term1109, term1109.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term1109, term1109.getClass(), "globalIdVerified", true);
        setBooleanField(term1109, term1109.getClass(), "useBlacklist", true);
        setBooleanField(term1109, term1109.getClass(), "agreeFee", false);
        setField(term1109, term1109.getClass(), "maximumTrustlines", term1198);
        setField(term1109, term1109.getClass(), "minBalance", term1200);
        setField(term1109, term1109.getClass(), "maxBalance", term1202);
        setField(term1109, term1109.getClass(), "maxXrpFeePerTransaction", "HyxfbSQYBe");
        setField(term1109, term1109.getClass(), "retryOfId", term1216);
        setField(term1109, term1109.getClass(), "paymentType", enum2);
        setField(term1109, term1109.getClass(), "snapshotTrustlineIssuerClassicAddress", "pCTimMblYc");
        setField(term1109, term1109.getClass(), "snapshotCurrencyName", "hNxWaHcfhY");
        setLongField(term1250, term1250.getClass(), "fastTime", 1610940182830L);
        setField(term1250, term1250.getClass(), "cdate", null);
        setField(term1109, term1109.getClass(), "startTime", term1250);
        setField(term1109, term1109.getClass(), "frequency", enum3);
        setLongField(term1262, term1262.getClass(), "fastTime", 1606045635837L);
        setField(term1262, term1262.getClass(), "cdate", null);
        setField(term1109, term1109.getClass(), "repeatUntilDate", term1262);
        setField(term1109, term1109.getClass(), "email", "RkybSrpybU");
        setBooleanField(term1109, term1109.getClass(), "autoApprove", true);
        setField(term1108, term1108.getClass(), "trustlinePaymentRequest", term1109);
        setIntField(term1108, term1108.getClass(), "minTrustLinesTriggerValue", 1162663216);
        term1278 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1278;
        callMethod(klass, "canEqual", argTypes, term1108, args);
    }

};


