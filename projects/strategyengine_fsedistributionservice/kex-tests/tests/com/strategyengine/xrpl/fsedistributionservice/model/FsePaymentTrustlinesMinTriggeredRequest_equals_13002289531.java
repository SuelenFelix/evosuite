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

public class FsePaymentTrustlinesMinTriggeredRequest_equals_13002289531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term170;

    public FsePaymentTrustlinesMinTriggeredRequest_equals_13002289531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term91 = new Integer(568599855);
        Double term93 = new Double(0.13238746331190498);
        Double term95 = new Double(0.3455959125047594);
        Long term109 = new Long(2442117782898005296L);
        Class<? extends Object> term276 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term275 = ((Class) term276).getDeclaredField((String) "FLAT");
        ((Field) term275).setAccessible(true);
        Object enum0 = ((Field) term275).get((Object) null);
        Class<? extends Object> term712 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term711 = ((Class) term712).getDeclaredField((String) "DAILY");
        ((Field) term711).setAccessible(true);
        Object enum1 = ((Field) term711).get((Object) null);
        term1 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest"));
        Object term2 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term143 = newInstance(Class.forName("java.util.Date"));
        Object term154 = newInstance(Class.forName("java.util.Date"));
        setField(term2, term2.getClass(), "memo", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "fromClassicAddress", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "fromSigningPublicKey", "MuLcgQHgqz");
        setField(term2, term2.getClass(), "fromPrivateKey", "xxtlPwDYFs");
        setField(term2, term2.getClass(), "trustlineIssuerClassicAddress", "jJCZpVmanW");
        setField(term2, term2.getClass(), "currencyName", "EGtDIRbSSb");
        setField(term2, term2.getClass(), "amount", "SzjVpOQTyS");
        setBooleanField(term2, term2.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term2, term2.getClass(), "globalIdVerified", false);
        setBooleanField(term2, term2.getClass(), "useBlacklist", false);
        setBooleanField(term2, term2.getClass(), "agreeFee", false);
        setField(term2, term2.getClass(), "maximumTrustlines", term91);
        setField(term2, term2.getClass(), "minBalance", term93);
        setField(term2, term2.getClass(), "maxBalance", term95);
        setField(term2, term2.getClass(), "maxXrpFeePerTransaction", "MjGYSRKTNF");
        setField(term2, term2.getClass(), "retryOfId", term109);
        setField(term2, term2.getClass(), "paymentType", enum0);
        setField(term2, term2.getClass(), "snapshotTrustlineIssuerClassicAddress", "hRNSzYYIrc");
        setField(term2, term2.getClass(), "snapshotCurrencyName", "RMFIsYGgne");
        setLongField(term143, term143.getClass(), "fastTime", 1345871412244L);
        setField(term143, term143.getClass(), "cdate", null);
        setField(term2, term2.getClass(), "startTime", term143);
        setField(term2, term2.getClass(), "frequency", enum1);
        setLongField(term154, term154.getClass(), "fastTime", 1480438351369L);
        setField(term154, term154.getClass(), "cdate", null);
        setField(term2, term2.getClass(), "repeatUntilDate", term154);
        setField(term2, term2.getClass(), "email", "NRdvgJlhkX");
        setBooleanField(term2, term2.getClass(), "autoApprove", true);
        setField(term1, term1.getClass(), "trustlinePaymentRequest", term2);
        setIntField(term1, term1.getClass(), "minTrustLinesTriggerValue", 568599855);
        term170 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term170;
        callMethod(klass, "equals", argTypes, term1, args);
    }

};


