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

public class FsePaymentTrustlinesMinTriggeredRequest_getTrustlinePaymentRequest_7006320355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4237;

    public FsePaymentTrustlinesMinTriggeredRequest_getTrustlinePaymentRequest_7006320355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4327 = new Integer(-1922583790);
        Double term4329 = new Double(0.6076495596892013);
        Double term4331 = new Double(0.37773193782763337);
        Long term4345 = new Long(5270370404989704783L);
        Class<? extends Object> term4497 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term4496 = ((Class) term4497).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term4496).setAccessible(true);
        Object enum8 = ((Field) term4496).get((Object) null);
        Class<? extends Object> term4915 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term4914 = ((Class) term4915).getDeclaredField((String) "MONTHLY");
        ((Field) term4914).setAccessible(true);
        Object enum9 = ((Field) term4914).get((Object) null);
        term4237 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest"));
        Object term4238 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term4387 = newInstance(Class.forName("java.util.Date"));
        Object term4400 = newInstance(Class.forName("java.util.Date"));
        setField(term4238, term4238.getClass(), "memo", "BndsHwAFMv");
        setField(term4238, term4238.getClass(), "fromClassicAddress", "GzFkzHGYFt");
        setField(term4238, term4238.getClass(), "fromSigningPublicKey", "tShwQLRGNe");
        setField(term4238, term4238.getClass(), "fromPrivateKey", "LvtrsXUliU");
        setField(term4238, term4238.getClass(), "trustlineIssuerClassicAddress", "xLbjWUgOIL");
        setField(term4238, term4238.getClass(), "currencyName", "jDtqGUpnZN");
        setField(term4238, term4238.getClass(), "amount", "nGKItKLYNC");
        setBooleanField(term4238, term4238.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term4238, term4238.getClass(), "globalIdVerified", true);
        setBooleanField(term4238, term4238.getClass(), "useBlacklist", true);
        setBooleanField(term4238, term4238.getClass(), "agreeFee", true);
        setField(term4238, term4238.getClass(), "maximumTrustlines", term4327);
        setField(term4238, term4238.getClass(), "minBalance", term4329);
        setField(term4238, term4238.getClass(), "maxBalance", term4331);
        setField(term4238, term4238.getClass(), "maxXrpFeePerTransaction", "UiUYnPrcCi");
        setField(term4238, term4238.getClass(), "retryOfId", term4345);
        setField(term4238, term4238.getClass(), "paymentType", enum8);
        setField(term4238, term4238.getClass(), "snapshotTrustlineIssuerClassicAddress", "UoYtihxVaS");
        setField(term4238, term4238.getClass(), "snapshotCurrencyName", "JDswTTCZHV");
        setLongField(term4387, term4387.getClass(), "fastTime", 1645834034896L);
        setField(term4387, term4387.getClass(), "cdate", null);
        setField(term4238, term4238.getClass(), "startTime", term4387);
        setField(term4238, term4238.getClass(), "frequency", enum9);
        setLongField(term4400, term4400.getClass(), "fastTime", 1500721068023L);
        setField(term4400, term4400.getClass(), "cdate", null);
        setField(term4238, term4238.getClass(), "repeatUntilDate", term4400);
        setField(term4238, term4238.getClass(), "email", "onpbIeEKoi");
        setBooleanField(term4238, term4238.getClass(), "autoApprove", true);
        setField(term4237, term4237.getClass(), "trustlinePaymentRequest", term4238);
        setIntField(term4237, term4237.getClass(), "minTrustLinesTriggerValue", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrustlinePaymentRequest", argTypes, term4237, args);
    }

};


