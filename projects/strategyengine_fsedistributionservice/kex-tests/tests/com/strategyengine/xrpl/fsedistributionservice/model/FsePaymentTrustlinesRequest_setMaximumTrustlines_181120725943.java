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

public class FsePaymentTrustlinesRequest_setMaximumTrustlines_181120725943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62813;
     Object term62980;

    public FsePaymentTrustlinesRequest_setMaximumTrustlines_181120725943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term62902 = new Integer(-1371869594);
        Double term62904 = new Double(0.5644914462415626);
        Double term62906 = new Double(0.509895859167191);
        Long term62920 = new Long(6005241913654469005L);
        Class<? extends Object> term63063 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term63062 = ((Class) term63063).getDeclaredField((String) "FLAT");
        ((Field) term63062).setAccessible(true);
        Object enum113 = ((Field) term63062).get((Object) null);
        Class<? extends Object> term63457 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term63456 = ((Class) term63457).getDeclaredField((String) "DAILY");
        ((Field) term63456).setAccessible(true);
        Object enum114 = ((Field) term63456).get((Object) null);
        term62813 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term62954 = newInstance(Class.forName("java.util.Date"));
        Object term62965 = newInstance(Class.forName("java.util.Date"));
        setField(term62813, term62813.getClass(), "memo", "AxfSZmaiyA");
        setField(term62813, term62813.getClass(), "fromClassicAddress", "lBpveIKbea");
        setField(term62813, term62813.getClass(), "fromSigningPublicKey", "uyLBVQYcOV");
        setField(term62813, term62813.getClass(), "fromPrivateKey", "PoTZjDuBHa");
        setField(term62813, term62813.getClass(), "trustlineIssuerClassicAddress", "MIwvgVrhzP");
        setField(term62813, term62813.getClass(), "currencyName", "HcUUieXdep");
        setField(term62813, term62813.getClass(), "amount", "AbonCTtbef");
        setBooleanField(term62813, term62813.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term62813, term62813.getClass(), "globalIdVerified", true);
        setBooleanField(term62813, term62813.getClass(), "useBlacklist", false);
        setBooleanField(term62813, term62813.getClass(), "agreeFee", false);
        setField(term62813, term62813.getClass(), "maximumTrustlines", term62902);
        setField(term62813, term62813.getClass(), "minBalance", term62904);
        setField(term62813, term62813.getClass(), "maxBalance", term62906);
        setField(term62813, term62813.getClass(), "maxXrpFeePerTransaction", "maXrGOGoKA");
        setField(term62813, term62813.getClass(), "retryOfId", term62920);
        setField(term62813, term62813.getClass(), "paymentType", enum113);
        setField(term62813, term62813.getClass(), "snapshotTrustlineIssuerClassicAddress", "zAkgWQVCpM");
        setField(term62813, term62813.getClass(), "snapshotCurrencyName", "yQUDyOroXU");
        setLongField(term62954, term62954.getClass(), "fastTime", 1618594705278L);
        setField(term62954, term62954.getClass(), "cdate", null);
        setField(term62813, term62813.getClass(), "startTime", term62954);
        setField(term62813, term62813.getClass(), "frequency", enum114);
        setLongField(term62965, term62965.getClass(), "fastTime", 1584136591305L);
        setField(term62965, term62965.getClass(), "cdate", null);
        setField(term62813, term62813.getClass(), "repeatUntilDate", term62965);
        setField(term62813, term62813.getClass(), "email", "xweqkPdyJH");
        setBooleanField(term62813, term62813.getClass(), "autoApprove", false);
        term62980 = new Integer(-2095575670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term62980;
        callMethod(klass, "setMaximumTrustlines", argTypes, term62813, args);
    }

};


