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
import java.lang.Boolean;

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_newTrustlinesOnly_2979133328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422348;
     Object term422525;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_newTrustlinesOnly_2979133328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term422437 = new Integer(-1222614956);
        Double term422439 = new Double(0.6428742553484879);
        Double term422441 = new Double(0.6584165706677267);
        Long term422455 = new Long(280552269591781447L);
        Class<? extends Object> term422608 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term422607 = ((Class) term422608).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term422607).setAccessible(true);
        Object enum787 = ((Field) term422607).get((Object) null);
        Class<? extends Object> term423026 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term423025 = ((Class) term423026).getDeclaredField((String) "MONTHLY");
        ((Field) term423025).setAccessible(true);
        Object enum788 = ((Field) term423025).get((Object) null);
        term422348 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term422497 = newInstance(Class.forName("java.util.Date"));
        Object term422510 = newInstance(Class.forName("java.util.Date"));
        setField(term422348, term422348.getClass(), "memo", "gsnDoCKSDa");
        setField(term422348, term422348.getClass(), "fromClassicAddress", "igCjeeKwSN");
        setField(term422348, term422348.getClass(), "fromSigningPublicKey", "UwqxIAgbVI");
        setField(term422348, term422348.getClass(), "fromPrivateKey", "ZNRLQRfFIP");
        setField(term422348, term422348.getClass(), "trustlineIssuerClassicAddress", "bnnAetbkOZ");
        setField(term422348, term422348.getClass(), "currencyName", "wMjxNGGfFZ");
        setField(term422348, term422348.getClass(), "amount", "wsirPqRrlc");
        setBooleanField(term422348, term422348.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term422348, term422348.getClass(), "globalIdVerified", true);
        setBooleanField(term422348, term422348.getClass(), "useBlacklist", false);
        setBooleanField(term422348, term422348.getClass(), "agreeFee", true);
        setField(term422348, term422348.getClass(), "maximumTrustlines", term422437);
        setField(term422348, term422348.getClass(), "minBalance", term422439);
        setField(term422348, term422348.getClass(), "maxBalance", term422441);
        setField(term422348, term422348.getClass(), "maxXrpFeePerTransaction", "gkEkytWJJj");
        setField(term422348, term422348.getClass(), "retryOfId", term422455);
        setField(term422348, term422348.getClass(), "paymentType", enum787);
        setField(term422348, term422348.getClass(), "snapshotTrustlineIssuerClassicAddress", "KQaBgHpPTE");
        setField(term422348, term422348.getClass(), "snapshotCurrencyName", "ftWAuQBFQb");
        setLongField(term422497, term422497.getClass(), "fastTime", 1864852605780L);
        setField(term422497, term422497.getClass(), "cdate", null);
        setField(term422348, term422348.getClass(), "startTime", term422497);
        setField(term422348, term422348.getClass(), "frequency", enum788);
        setLongField(term422510, term422510.getClass(), "fastTime", 1727484096990L);
        setField(term422510, term422510.getClass(), "cdate", null);
        setField(term422348, term422348.getClass(), "repeatUntilDate", term422510);
        setField(term422348, term422348.getClass(), "email", "GDIImTLJuG");
        setBooleanField(term422348, term422348.getClass(), "autoApprove", false);
        term422525 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term422525;
        callMethod(klass, "newTrustlinesOnly", argTypes, term422348, args);
    }

};


