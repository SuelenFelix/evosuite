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

public class FsePaymentTrustlinesRequest_getFrequency_8725947026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45603;

    public FsePaymentTrustlinesRequest_getFrequency_8725947026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term45692 = new Integer(-1016503459);
        Double term45694 = new Double(0.7154795600170818);
        Double term45696 = new Double(0.6355029654528058);
        Long term45710 = new Long(-8658027316505137504L);
        Class<? extends Object> term45861 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term45860 = ((Class) term45861).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term45860).setAccessible(true);
        Object enum81 = ((Field) term45860).get((Object) null);
        Class<? extends Object> term46279 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term46278 = ((Class) term46279).getDeclaredField((String) "MONTHLY");
        ((Field) term46278).setAccessible(true);
        Object enum82 = ((Field) term46278).get((Object) null);
        term45603 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term45752 = newInstance(Class.forName("java.util.Date"));
        Object term45765 = newInstance(Class.forName("java.util.Date"));
        setField(term45603, term45603.getClass(), "memo", "gbbYBYyfvr");
        setField(term45603, term45603.getClass(), "fromClassicAddress", "SrWMUlbtWV");
        setField(term45603, term45603.getClass(), "fromSigningPublicKey", "VePIumgrrU");
        setField(term45603, term45603.getClass(), "fromPrivateKey", "DPwIqlszZo");
        setField(term45603, term45603.getClass(), "trustlineIssuerClassicAddress", "mNgDshwZNc");
        setField(term45603, term45603.getClass(), "currencyName", "pDqgDbJoFw");
        setField(term45603, term45603.getClass(), "amount", "iVOvTzOxwt");
        setBooleanField(term45603, term45603.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term45603, term45603.getClass(), "globalIdVerified", true);
        setBooleanField(term45603, term45603.getClass(), "useBlacklist", true);
        setBooleanField(term45603, term45603.getClass(), "agreeFee", false);
        setField(term45603, term45603.getClass(), "maximumTrustlines", term45692);
        setField(term45603, term45603.getClass(), "minBalance", term45694);
        setField(term45603, term45603.getClass(), "maxBalance", term45696);
        setField(term45603, term45603.getClass(), "maxXrpFeePerTransaction", "BjZQdecXvB");
        setField(term45603, term45603.getClass(), "retryOfId", term45710);
        setField(term45603, term45603.getClass(), "paymentType", enum81);
        setField(term45603, term45603.getClass(), "snapshotTrustlineIssuerClassicAddress", "iUkOOQhEkw");
        setField(term45603, term45603.getClass(), "snapshotCurrencyName", "wmVoFoUVmU");
        setLongField(term45752, term45752.getClass(), "fastTime", 1713891155263L);
        setField(term45752, term45752.getClass(), "cdate", null);
        setField(term45603, term45603.getClass(), "startTime", term45752);
        setField(term45603, term45603.getClass(), "frequency", enum82);
        setLongField(term45765, term45765.getClass(), "fastTime", 1663413767651L);
        setField(term45765, term45765.getClass(), "cdate", null);
        setField(term45603, term45603.getClass(), "repeatUntilDate", term45765);
        setField(term45603, term45603.getClass(), "email", "lLiSiPCciB");
        setBooleanField(term45603, term45603.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrequency", argTypes, term45603, args);
    }

};


