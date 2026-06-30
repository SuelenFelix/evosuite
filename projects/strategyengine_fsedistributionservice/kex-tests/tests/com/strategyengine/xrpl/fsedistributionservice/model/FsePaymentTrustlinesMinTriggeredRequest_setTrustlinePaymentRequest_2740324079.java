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

public class FsePaymentTrustlinesMinTriggeredRequest_setTrustlinePaymentRequest_2740324079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7481;
     Object term7660;

    public FsePaymentTrustlinesMinTriggeredRequest_setTrustlinePaymentRequest_2740324079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7571 = new Integer(-2038273078);
        Double term7573 = new Double(0.7031006357544823);
        Double term7575 = new Double(0.9527281779865117);
        Long term7589 = new Long(6811161968424632369L);
        Class<? extends Object> term7909 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term7908 = ((Class) term7909).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term7908).setAccessible(true);
        Object enum14 = ((Field) term7908).get((Object) null);
        Class<? extends Object> term8327 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term8326 = ((Class) term8327).getDeclaredField((String) "MONTHLY");
        ((Field) term8326).setAccessible(true);
        Object enum15 = ((Field) term8326).get((Object) null);
        term7481 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest"));
        Object term7482 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term7631 = newInstance(Class.forName("java.util.Date"));
        Object term7644 = newInstance(Class.forName("java.util.Date"));
        setField(term7482, term7482.getClass(), "memo", "vQVyKLdtaz");
        setField(term7482, term7482.getClass(), "fromClassicAddress", "OWKQODBLzb");
        setField(term7482, term7482.getClass(), "fromSigningPublicKey", "wGmYcqUkgE");
        setField(term7482, term7482.getClass(), "fromPrivateKey", "idgaQsnJpQ");
        setField(term7482, term7482.getClass(), "trustlineIssuerClassicAddress", "VgZnGoIFwQ");
        setField(term7482, term7482.getClass(), "currencyName", "jUbSRrkrYZ");
        setField(term7482, term7482.getClass(), "amount", "bWWfajKbEX");
        setBooleanField(term7482, term7482.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term7482, term7482.getClass(), "globalIdVerified", true);
        setBooleanField(term7482, term7482.getClass(), "useBlacklist", true);
        setBooleanField(term7482, term7482.getClass(), "agreeFee", true);
        setField(term7482, term7482.getClass(), "maximumTrustlines", term7571);
        setField(term7482, term7482.getClass(), "minBalance", term7573);
        setField(term7482, term7482.getClass(), "maxBalance", term7575);
        setField(term7482, term7482.getClass(), "maxXrpFeePerTransaction", "cAPeiZHKGJ");
        setField(term7482, term7482.getClass(), "retryOfId", term7589);
        setField(term7482, term7482.getClass(), "paymentType", enum14);
        setField(term7482, term7482.getClass(), "snapshotTrustlineIssuerClassicAddress", "LvJFtLBaxj");
        setField(term7482, term7482.getClass(), "snapshotCurrencyName", "PHvxnGHptP");
        setLongField(term7631, term7631.getClass(), "fastTime", 1706078172457L);
        setField(term7631, term7631.getClass(), "cdate", null);
        setField(term7482, term7482.getClass(), "startTime", term7631);
        setField(term7482, term7482.getClass(), "frequency", enum15);
        setLongField(term7644, term7644.getClass(), "fastTime", 1863631094992L);
        setField(term7644, term7644.getClass(), "cdate", null);
        setField(term7482, term7482.getClass(), "repeatUntilDate", term7644);
        setField(term7482, term7482.getClass(), "email", "TimdotUuNC");
        setBooleanField(term7482, term7482.getClass(), "autoApprove", false);
        setField(term7481, term7481.getClass(), "trustlinePaymentRequest", term7482);
        setIntField(term7481, term7481.getClass(), "minTrustLinesTriggerValue", -2038273078);
        Integer term7749 = new Integer(1227103734);
        Double term7751 = new Double(0.9828442029246764);
        Double term7753 = new Double(0.2779719046761513);
        Long term7767 = new Long(-7237588299778557629L);
        Class<? extends Object> term8810 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term8809 = ((Class) term8810).getDeclaredField((String) "FLAT");
        ((Field) term8809).setAccessible(true);
        Object enum16 = ((Field) term8809).get((Object) null);
        Class<? extends Object> term9204 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term9203 = ((Class) term9204).getDeclaredField((String) "WEEKLY");
        ((Field) term9203).setAccessible(true);
        Object enum17 = ((Field) term9203).get((Object) null);
        term7660 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term7801 = newInstance(Class.forName("java.util.Date"));
        Object term7813 = newInstance(Class.forName("java.util.Date"));
        setField(term7660, term7660.getClass(), "memo", "PkWMRdJcBb");
        setField(term7660, term7660.getClass(), "fromClassicAddress", "jSpAteRute");
        setField(term7660, term7660.getClass(), "fromSigningPublicKey", "swZVeJAxjt");
        setField(term7660, term7660.getClass(), "fromPrivateKey", "xOcJIiQQDu");
        setField(term7660, term7660.getClass(), "trustlineIssuerClassicAddress", "GVizqqzXpy");
        setField(term7660, term7660.getClass(), "currencyName", "JqXGgAhZPl");
        setField(term7660, term7660.getClass(), "amount", "jiKYgYHqIS");
        setBooleanField(term7660, term7660.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term7660, term7660.getClass(), "globalIdVerified", false);
        setBooleanField(term7660, term7660.getClass(), "useBlacklist", true);
        setBooleanField(term7660, term7660.getClass(), "agreeFee", true);
        setField(term7660, term7660.getClass(), "maximumTrustlines", term7749);
        setField(term7660, term7660.getClass(), "minBalance", term7751);
        setField(term7660, term7660.getClass(), "maxBalance", term7753);
        setField(term7660, term7660.getClass(), "maxXrpFeePerTransaction", "DfISiziTgG");
        setField(term7660, term7660.getClass(), "retryOfId", term7767);
        setField(term7660, term7660.getClass(), "paymentType", enum16);
        setField(term7660, term7660.getClass(), "snapshotTrustlineIssuerClassicAddress", "XqgfKFvPSD");
        setField(term7660, term7660.getClass(), "snapshotCurrencyName", "JiVRgTZvKc");
        setLongField(term7801, term7801.getClass(), "fastTime", 1882638884364L);
        setField(term7801, term7801.getClass(), "cdate", null);
        setField(term7660, term7660.getClass(), "startTime", term7801);
        setField(term7660, term7660.getClass(), "frequency", enum17);
        setLongField(term7813, term7813.getClass(), "fastTime", 1437757323580L);
        setField(term7813, term7813.getClass(), "cdate", null);
        setField(term7660, term7660.getClass(), "repeatUntilDate", term7813);
        setField(term7660, term7660.getClass(), "email", "XPKmummaqg");
        setBooleanField(term7660, term7660.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Object[] args = new Object[1];
        args[0] = term7660;
        callMethod(klass, "setTrustlinePaymentRequest", argTypes, term7481, args);
    }

};


