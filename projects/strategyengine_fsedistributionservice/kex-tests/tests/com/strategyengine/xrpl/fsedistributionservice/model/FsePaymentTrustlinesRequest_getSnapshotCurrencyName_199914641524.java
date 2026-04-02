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

public class FsePaymentTrustlinesRequest_getSnapshotCurrencyName_199914641524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43479;

    public FsePaymentTrustlinesRequest_getSnapshotCurrencyName_199914641524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term43568 = new Integer(1876565163);
        Double term43570 = new Double(0.022483645678509023);
        Double term43572 = new Double(0.025133051616627267);
        Long term43586 = new Long(-1610676979013636850L);
        Class<? extends Object> term43738 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term43737 = ((Class) term43738).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term43737).setAccessible(true);
        Object enum77 = ((Field) term43737).get((Object) null);
        Class<? extends Object> term44156 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term44155 = ((Class) term44156).getDeclaredField((String) "ANNUALLY");
        ((Field) term44155).setAccessible(true);
        Object enum78 = ((Field) term44155).get((Object) null);
        term43479 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term43628 = newInstance(Class.forName("java.util.Date"));
        Object term43642 = newInstance(Class.forName("java.util.Date"));
        setField(term43479, term43479.getClass(), "memo", "JdOMfNWgLP");
        setField(term43479, term43479.getClass(), "fromClassicAddress", "uWqXrwAsDU");
        setField(term43479, term43479.getClass(), "fromSigningPublicKey", "hgFbWAUtsu");
        setField(term43479, term43479.getClass(), "fromPrivateKey", "HqoTWlkbwF");
        setField(term43479, term43479.getClass(), "trustlineIssuerClassicAddress", "CwNELDTAPP");
        setField(term43479, term43479.getClass(), "currencyName", "GSzQdbHLHw");
        setField(term43479, term43479.getClass(), "amount", "IkfarsYNJO");
        setBooleanField(term43479, term43479.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term43479, term43479.getClass(), "globalIdVerified", false);
        setBooleanField(term43479, term43479.getClass(), "useBlacklist", true);
        setBooleanField(term43479, term43479.getClass(), "agreeFee", true);
        setField(term43479, term43479.getClass(), "maximumTrustlines", term43568);
        setField(term43479, term43479.getClass(), "minBalance", term43570);
        setField(term43479, term43479.getClass(), "maxBalance", term43572);
        setField(term43479, term43479.getClass(), "maxXrpFeePerTransaction", "aZKOWhHMEh");
        setField(term43479, term43479.getClass(), "retryOfId", term43586);
        setField(term43479, term43479.getClass(), "paymentType", enum77);
        setField(term43479, term43479.getClass(), "snapshotTrustlineIssuerClassicAddress", "YfkhviKZwl");
        setField(term43479, term43479.getClass(), "snapshotCurrencyName", "DcOhhAfJTI");
        setLongField(term43628, term43628.getClass(), "fastTime", 1276505397937L);
        setField(term43628, term43628.getClass(), "cdate", null);
        setField(term43479, term43479.getClass(), "startTime", term43628);
        setField(term43479, term43479.getClass(), "frequency", enum78);
        setLongField(term43642, term43642.getClass(), "fastTime", 1278177575793L);
        setField(term43642, term43642.getClass(), "cdate", null);
        setField(term43479, term43479.getClass(), "repeatUntilDate", term43642);
        setField(term43479, term43479.getClass(), "email", "gYTIkBFOoS");
        setBooleanField(term43479, term43479.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSnapshotCurrencyName", argTypes, term43479, args);
    }

};


