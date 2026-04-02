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

public class FsePaymentTrustlinesRequest_setMaxXrpFeePerTransaction_26821300046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65977;

    public FsePaymentTrustlinesRequest_setMaxXrpFeePerTransaction_26821300046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term66066 = new Integer(-1588772968);
        Double term66068 = new Double(0.0865998004187658);
        Double term66070 = new Double(0.9628647861255637);
        Long term66084 = new Long(-8652538484981166496L);
        Class<? extends Object> term66248 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term66247 = ((Class) term66248).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term66247).setAccessible(true);
        Object enum119 = ((Field) term66247).get((Object) null);
        Class<? extends Object> term66666 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term66665 = ((Class) term66666).getDeclaredField((String) "ANNUALLY");
        ((Field) term66665).setAccessible(true);
        Object enum120 = ((Field) term66665).get((Object) null);
        term65977 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term66126 = newInstance(Class.forName("java.util.Date"));
        Object term66140 = newInstance(Class.forName("java.util.Date"));
        setField(term65977, term65977.getClass(), "memo", "PwqnuJJwjR");
        setField(term65977, term65977.getClass(), "fromClassicAddress", "NFkbBiPeiw");
        setField(term65977, term65977.getClass(), "fromSigningPublicKey", "tlRvilQyjJ");
        setField(term65977, term65977.getClass(), "fromPrivateKey", "gwTUlYNpjM");
        setField(term65977, term65977.getClass(), "trustlineIssuerClassicAddress", "uXYojRmxrM");
        setField(term65977, term65977.getClass(), "currencyName", "cxRwRcodud");
        setField(term65977, term65977.getClass(), "amount", "GDGBPlYeLn");
        setBooleanField(term65977, term65977.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term65977, term65977.getClass(), "globalIdVerified", false);
        setBooleanField(term65977, term65977.getClass(), "useBlacklist", false);
        setBooleanField(term65977, term65977.getClass(), "agreeFee", false);
        setField(term65977, term65977.getClass(), "maximumTrustlines", term66066);
        setField(term65977, term65977.getClass(), "minBalance", term66068);
        setField(term65977, term65977.getClass(), "maxBalance", term66070);
        setField(term65977, term65977.getClass(), "maxXrpFeePerTransaction", "jdQANIXSTq");
        setField(term65977, term65977.getClass(), "retryOfId", term66084);
        setField(term65977, term65977.getClass(), "paymentType", enum119);
        setField(term65977, term65977.getClass(), "snapshotTrustlineIssuerClassicAddress", "stVcZLTNpu");
        setField(term65977, term65977.getClass(), "snapshotCurrencyName", "LgXdqWrsLL");
        setLongField(term66126, term66126.getClass(), "fastTime", 1758773264597L);
        setField(term66126, term66126.getClass(), "cdate", null);
        setField(term65977, term65977.getClass(), "startTime", term66126);
        setField(term65977, term65977.getClass(), "frequency", enum120);
        setLongField(term66140, term66140.getClass(), "fastTime", 1303889782295L);
        setField(term66140, term66140.getClass(), "cdate", null);
        setField(term65977, term65977.getClass(), "repeatUntilDate", term66140);
        setField(term65977, term65977.getClass(), "email", "bbHWyibNmy");
        setBooleanField(term65977, term65977.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vYYOYhWMWZ";
        callMethod(klass, "setMaxXrpFeePerTransaction", argTypes, term65977, args);
    }

};


