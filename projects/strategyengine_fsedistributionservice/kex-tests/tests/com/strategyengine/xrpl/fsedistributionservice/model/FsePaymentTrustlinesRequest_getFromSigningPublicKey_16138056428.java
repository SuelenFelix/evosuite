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

public class FsePaymentTrustlinesRequest_getFromSigningPublicKey_16138056428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26395;

    public FsePaymentTrustlinesRequest_getFromSigningPublicKey_16138056428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26484 = new Integer(-1275173084);
        Double term26486 = new Double(0.9737083944266686);
        Double term26488 = new Double(0.0668892744806211);
        Long term26502 = new Long(4044358158040652353L);
        Class<? extends Object> term26653 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term26652 = ((Class) term26653).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term26652).setAccessible(true);
        Object enum45 = ((Field) term26652).get((Object) null);
        Class<? extends Object> term27071 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term27070 = ((Class) term27071).getDeclaredField((String) "MONTHLY");
        ((Field) term27070).setAccessible(true);
        Object enum46 = ((Field) term27070).get((Object) null);
        term26395 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term26544 = newInstance(Class.forName("java.util.Date"));
        Object term26557 = newInstance(Class.forName("java.util.Date"));
        setField(term26395, term26395.getClass(), "memo", "tIpkeYIezR");
        setField(term26395, term26395.getClass(), "fromClassicAddress", "YkZtEtthvz");
        setField(term26395, term26395.getClass(), "fromSigningPublicKey", "dwlZSxlXOo");
        setField(term26395, term26395.getClass(), "fromPrivateKey", "lKrEAkypza");
        setField(term26395, term26395.getClass(), "trustlineIssuerClassicAddress", "KtuuNAqGCQ");
        setField(term26395, term26395.getClass(), "currencyName", "OGQsfjmReM");
        setField(term26395, term26395.getClass(), "amount", "YsUtbngnRO");
        setBooleanField(term26395, term26395.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term26395, term26395.getClass(), "globalIdVerified", true);
        setBooleanField(term26395, term26395.getClass(), "useBlacklist", false);
        setBooleanField(term26395, term26395.getClass(), "agreeFee", false);
        setField(term26395, term26395.getClass(), "maximumTrustlines", term26484);
        setField(term26395, term26395.getClass(), "minBalance", term26486);
        setField(term26395, term26395.getClass(), "maxBalance", term26488);
        setField(term26395, term26395.getClass(), "maxXrpFeePerTransaction", "JisaWUxcNb");
        setField(term26395, term26395.getClass(), "retryOfId", term26502);
        setField(term26395, term26395.getClass(), "paymentType", enum45);
        setField(term26395, term26395.getClass(), "snapshotTrustlineIssuerClassicAddress", "NxgmYPzWCI");
        setField(term26395, term26395.getClass(), "snapshotCurrencyName", "SqjyKmayBx");
        setLongField(term26544, term26544.getClass(), "fastTime", 1876872800559L);
        setField(term26544, term26544.getClass(), "cdate", null);
        setField(term26395, term26395.getClass(), "startTime", term26544);
        setField(term26395, term26395.getClass(), "frequency", enum46);
        setLongField(term26557, term26557.getClass(), "fastTime", 1304532099366L);
        setField(term26557, term26557.getClass(), "cdate", null);
        setField(term26395, term26395.getClass(), "repeatUntilDate", term26557);
        setField(term26395, term26395.getClass(), "email", "XjDhvToxJy");
        setBooleanField(term26395, term26395.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromSigningPublicKey", argTypes, term26395, args);
    }

};


