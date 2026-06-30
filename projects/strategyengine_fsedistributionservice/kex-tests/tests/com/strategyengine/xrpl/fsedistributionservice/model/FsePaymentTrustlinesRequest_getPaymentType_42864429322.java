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

public class FsePaymentTrustlinesRequest_getPaymentType_42864429322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41319;

    public FsePaymentTrustlinesRequest_getPaymentType_42864429322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term41408 = new Integer(-602026508);
        Double term41410 = new Double(0.13246999699526574);
        Double term41412 = new Double(0.9126850255993704);
        Long term41426 = new Long(7994303628307559416L);
        Class<? extends Object> term41577 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term41576 = ((Class) term41577).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term41576).setAccessible(true);
        Object enum73 = ((Field) term41576).get((Object) null);
        Class<? extends Object> term41995 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term41994 = ((Class) term41995).getDeclaredField((String) "MONTHLY");
        ((Field) term41994).setAccessible(true);
        Object enum74 = ((Field) term41994).get((Object) null);
        term41319 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term41468 = newInstance(Class.forName("java.util.Date"));
        Object term41481 = newInstance(Class.forName("java.util.Date"));
        setField(term41319, term41319.getClass(), "memo", "mRBtFTxVdE");
        setField(term41319, term41319.getClass(), "fromClassicAddress", "IVacFDAZcj");
        setField(term41319, term41319.getClass(), "fromSigningPublicKey", "EEYmuwyVDP");
        setField(term41319, term41319.getClass(), "fromPrivateKey", "EWFbEDAVrE");
        setField(term41319, term41319.getClass(), "trustlineIssuerClassicAddress", "EMiMtYgfvr");
        setField(term41319, term41319.getClass(), "currencyName", "OyYyYYnJuF");
        setField(term41319, term41319.getClass(), "amount", "aYLvcxZohT");
        setBooleanField(term41319, term41319.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term41319, term41319.getClass(), "globalIdVerified", false);
        setBooleanField(term41319, term41319.getClass(), "useBlacklist", true);
        setBooleanField(term41319, term41319.getClass(), "agreeFee", false);
        setField(term41319, term41319.getClass(), "maximumTrustlines", term41408);
        setField(term41319, term41319.getClass(), "minBalance", term41410);
        setField(term41319, term41319.getClass(), "maxBalance", term41412);
        setField(term41319, term41319.getClass(), "maxXrpFeePerTransaction", "mnHyQbMyld");
        setField(term41319, term41319.getClass(), "retryOfId", term41426);
        setField(term41319, term41319.getClass(), "paymentType", enum73);
        setField(term41319, term41319.getClass(), "snapshotTrustlineIssuerClassicAddress", "KHtaDOIcJZ");
        setField(term41319, term41319.getClass(), "snapshotCurrencyName", "vgdwrCZczl");
        setLongField(term41468, term41468.getClass(), "fastTime", 1345923503543L);
        setField(term41468, term41468.getClass(), "cdate", null);
        setField(term41319, term41319.getClass(), "startTime", term41468);
        setField(term41319, term41319.getClass(), "frequency", enum74);
        setLongField(term41481, term41481.getClass(), "fastTime", 1838357779277L);
        setField(term41481, term41481.getClass(), "cdate", null);
        setField(term41319, term41319.getClass(), "repeatUntilDate", term41481);
        setField(term41319, term41319.getClass(), "email", "gKMNrpKBpu");
        setBooleanField(term41319, term41319.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPaymentType", argTypes, term41319, args);
    }

};


