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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;

public class FsePaymentRequest_getToClassicAddresses_76400293210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350934;

    public FsePaymentRequest_getToClassicAddresses_76400293210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term350983 = new ArrayList();
        Long term351052 = new Long(-3708632729138387526L);
        Class<? extends Object> term351225 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term351224 = ((Class) term351225).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term351224).setAccessible(true);
        Object enum682 = ((Field) term351224).get((Object) null);
        Long term351106 = new Long(2359134970522271046L);
        Class<? extends Object> term351653 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term351652 = ((Class) term351653).getDeclaredField((String) "MONTHLY");
        ((Field) term351652).setAccessible(true);
        Object enum683 = ((Field) term351652).get((Object) null);
        term350934 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term350999 = newInstance(Class.forName("java.util.Date"));
        Object term351119 = newInstance(Class.forName("java.util.Date"));
        setField(term350934, term350934.getClass(), "memo", "OLziNMZeIz");
        setField(term350934, term350934.getClass(), "fromClassicAddress", "ZtxRaargvH");
        setField(term350934, term350934.getClass(), "fromSigningPublicKey", "KllSVUGQSW");
        setField(term350934, term350934.getClass(), "fromPrivateKey", "ITqIOsXfUJ");
        setField(term350934, term350934.getClass(), "toClassicAddresses", term350983);
        setField(term350934, term350934.getClass(), "amount", "cgVlVAtNlm");
        setLongField(term350999, term350999.getClass(), "fastTime", 1848128420821L);
        setField(term350999, term350999.getClass(), "cdate", null);
        setField(term350934, term350934.getClass(), "startTime", term350999);
        setField(term350934, term350934.getClass(), "destinationTag", "ZgJCdjqDAL");
        setField(term350934, term350934.getClass(), "trustlineIssuerClassicAddress", "qpbSvvkYtX");
        setField(term350934, term350934.getClass(), "currencyName", "hqDAOUCzIF");
        setBooleanField(term350934, term350934.getClass(), "agreeFee", false);
        setField(term350934, term350934.getClass(), "maxXrpFeePerTransaction", "GPYpSLUunt");
        setBooleanField(term350934, term350934.getClass(), "globalIdVerified", true);
        setBooleanField(term350934, term350934.getClass(), "useBlacklist", false);
        setField(term350934, term350934.getClass(), "retryOfId", term351052);
        setField(term350934, term350934.getClass(), "paymentType", enum682);
        setField(term350934, term350934.getClass(), "snapshotTrustlineIssuerClassicAddress", "JwUkPqRLxz");
        setField(term350934, term350934.getClass(), "snapshotCurrencyName", "iNBLECkovg");
        setField(term350934, term350934.getClass(), "nftIssuingAddress", "aUjUtfxzEa");
        setField(term350934, term350934.getClass(), "nftTaxon", term351106);
        setField(term350934, term350934.getClass(), "frequency", enum683);
        setLongField(term351119, term351119.getClass(), "fastTime", 1647766351255L);
        setField(term351119, term351119.getClass(), "cdate", null);
        setField(term350934, term350934.getClass(), "repeatUntilDate", term351119);
        setField(term350934, term350934.getClass(), "email", "UghbKcUNlZ");
        setBooleanField(term350934, term350934.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToClassicAddresses", argTypes, term350934, args);
    }

};


