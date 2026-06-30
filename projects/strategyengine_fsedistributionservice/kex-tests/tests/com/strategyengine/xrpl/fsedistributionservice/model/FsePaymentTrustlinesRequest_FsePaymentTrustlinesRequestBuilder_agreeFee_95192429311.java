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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_agreeFee_95192429311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term425588;
     Object term425755;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_agreeFee_95192429311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term425677 = new Integer(-2104981311);
        Double term425679 = new Double(0.9276995636844321);
        Double term425681 = new Double(0.7636130748477434);
        Long term425695 = new Long(-6690821836959514088L);
        Class<? extends Object> term425838 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term425837 = ((Class) term425838).getDeclaredField((String) "FLAT");
        ((Field) term425837).setAccessible(true);
        Object enum793 = ((Field) term425837).get((Object) null);
        Class<? extends Object> term426232 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term426231 = ((Class) term426232).getDeclaredField((String) "DAILY");
        ((Field) term426231).setAccessible(true);
        Object enum794 = ((Field) term426231).get((Object) null);
        term425588 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term425729 = newInstance(Class.forName("java.util.Date"));
        Object term425740 = newInstance(Class.forName("java.util.Date"));
        setField(term425588, term425588.getClass(), "memo", "yKOwtIGejO");
        setField(term425588, term425588.getClass(), "fromClassicAddress", "eKWlJDvRzQ");
        setField(term425588, term425588.getClass(), "fromSigningPublicKey", "rCUCVDsyQP");
        setField(term425588, term425588.getClass(), "fromPrivateKey", "zjPsshCNVy");
        setField(term425588, term425588.getClass(), "trustlineIssuerClassicAddress", "DRCHHWDnEN");
        setField(term425588, term425588.getClass(), "currencyName", "EvkrAYYQdd");
        setField(term425588, term425588.getClass(), "amount", "ecpuRvtEYD");
        setBooleanField(term425588, term425588.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term425588, term425588.getClass(), "globalIdVerified", true);
        setBooleanField(term425588, term425588.getClass(), "useBlacklist", false);
        setBooleanField(term425588, term425588.getClass(), "agreeFee", true);
        setField(term425588, term425588.getClass(), "maximumTrustlines", term425677);
        setField(term425588, term425588.getClass(), "minBalance", term425679);
        setField(term425588, term425588.getClass(), "maxBalance", term425681);
        setField(term425588, term425588.getClass(), "maxXrpFeePerTransaction", "DoOdWGphdi");
        setField(term425588, term425588.getClass(), "retryOfId", term425695);
        setField(term425588, term425588.getClass(), "paymentType", enum793);
        setField(term425588, term425588.getClass(), "snapshotTrustlineIssuerClassicAddress", "oLrpPSByjw");
        setField(term425588, term425588.getClass(), "snapshotCurrencyName", "SZgtAalZXH");
        setLongField(term425729, term425729.getClass(), "fastTime", 1508856470866L);
        setField(term425729, term425729.getClass(), "cdate", null);
        setField(term425588, term425588.getClass(), "startTime", term425729);
        setField(term425588, term425588.getClass(), "frequency", enum794);
        setLongField(term425740, term425740.getClass(), "fastTime", 1726891147809L);
        setField(term425740, term425740.getClass(), "cdate", null);
        setField(term425588, term425588.getClass(), "repeatUntilDate", term425740);
        setField(term425588, term425588.getClass(), "email", "yRAXrykXQM");
        setBooleanField(term425588, term425588.getClass(), "autoApprove", false);
        term425755 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term425755;
        callMethod(klass, "agreeFee", argTypes, term425588, args);
    }

};


