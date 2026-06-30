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

public class FsePaymentTrustlinesMinTriggeredRequest_FsePaymentTrustlinesMinTriggeredRequestBuilder_toString_479639484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562773;

    public FsePaymentTrustlinesMinTriggeredRequest_FsePaymentTrustlinesMinTriggeredRequestBuilder_toString_479639484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term562863 = new Integer(-249614216);
        Double term562865 = new Double(0.3238255203811462);
        Double term562867 = new Double(0.2843894095932772);
        Long term562881 = new Long(1095152021713790235L);
        Class<? extends Object> term563023 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term563022 = ((Class) term563023).getDeclaredField((String) "FLAT");
        ((Field) term563022).setAccessible(true);
        Object enum1070 = ((Field) term563022).get((Object) null);
        Class<? extends Object> term563417 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term563416 = ((Class) term563417).getDeclaredField((String) "DAILY");
        ((Field) term563416).setAccessible(true);
        Object enum1071 = ((Field) term563416).get((Object) null);
        term562773 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest$FsePaymentTrustlinesMinTriggeredRequestBuilder"));
        Object term562774 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term562915 = newInstance(Class.forName("java.util.Date"));
        Object term562926 = newInstance(Class.forName("java.util.Date"));
        setField(term562774, term562774.getClass(), "memo", "xALGJngydr");
        setField(term562774, term562774.getClass(), "fromClassicAddress", "RZwoyRjDOK");
        setField(term562774, term562774.getClass(), "fromSigningPublicKey", "TinAcWXQIH");
        setField(term562774, term562774.getClass(), "fromPrivateKey", "fAiOxsidjq");
        setField(term562774, term562774.getClass(), "trustlineIssuerClassicAddress", "zZrLslNfIn");
        setField(term562774, term562774.getClass(), "currencyName", "GqIrvlDQGl");
        setField(term562774, term562774.getClass(), "amount", "OXxIPHzoVa");
        setBooleanField(term562774, term562774.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term562774, term562774.getClass(), "globalIdVerified", true);
        setBooleanField(term562774, term562774.getClass(), "useBlacklist", true);
        setBooleanField(term562774, term562774.getClass(), "agreeFee", false);
        setField(term562774, term562774.getClass(), "maximumTrustlines", term562863);
        setField(term562774, term562774.getClass(), "minBalance", term562865);
        setField(term562774, term562774.getClass(), "maxBalance", term562867);
        setField(term562774, term562774.getClass(), "maxXrpFeePerTransaction", "VABzGvaFoV");
        setField(term562774, term562774.getClass(), "retryOfId", term562881);
        setField(term562774, term562774.getClass(), "paymentType", enum1070);
        setField(term562774, term562774.getClass(), "snapshotTrustlineIssuerClassicAddress", "OJfzqZgyhr");
        setField(term562774, term562774.getClass(), "snapshotCurrencyName", "veGctJDCVu");
        setLongField(term562915, term562915.getClass(), "fastTime", 1438625687257L);
        setField(term562915, term562915.getClass(), "cdate", null);
        setField(term562774, term562774.getClass(), "startTime", term562915);
        setField(term562774, term562774.getClass(), "frequency", enum1071);
        setLongField(term562926, term562926.getClass(), "fastTime", 1538848765076L);
        setField(term562926, term562926.getClass(), "cdate", null);
        setField(term562774, term562774.getClass(), "repeatUntilDate", term562926);
        setField(term562774, term562774.getClass(), "email", "qWiNHIOSQh");
        setBooleanField(term562774, term562774.getClass(), "autoApprove", true);
        setField(term562773, term562773.getClass(), "trustlinePaymentRequest", term562774);
        setIntField(term562773, term562773.getClass(), "minTrustLinesTriggerValue", 1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest$FsePaymentTrustlinesMinTriggeredRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term562773, args);
    }

};


