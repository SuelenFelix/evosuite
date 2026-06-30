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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_autoApprove_18770998324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439968;
     Object term440145;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_autoApprove_18770998324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term440057 = new Integer(371943306);
        Double term440059 = new Double(0.25474180574060834);
        Double term440061 = new Double(0.9957585718901875);
        Long term440075 = new Long(5242528388479853404L);
        Class<? extends Object> term440228 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term440227 = ((Class) term440228).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term440227).setAccessible(true);
        Object enum820 = ((Field) term440227).get((Object) null);
        Class<? extends Object> term440646 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term440645 = ((Class) term440646).getDeclaredField((String) "MONTHLY");
        ((Field) term440645).setAccessible(true);
        Object enum821 = ((Field) term440645).get((Object) null);
        term439968 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term440117 = newInstance(Class.forName("java.util.Date"));
        Object term440130 = newInstance(Class.forName("java.util.Date"));
        setField(term439968, term439968.getClass(), "memo", "MbGkSEBSBU");
        setField(term439968, term439968.getClass(), "fromClassicAddress", "EpMzqYTtmB");
        setField(term439968, term439968.getClass(), "fromSigningPublicKey", "gaodnCYLnY");
        setField(term439968, term439968.getClass(), "fromPrivateKey", "uyIeisqgps");
        setField(term439968, term439968.getClass(), "trustlineIssuerClassicAddress", "yfdkQxPcSN");
        setField(term439968, term439968.getClass(), "currencyName", "mzRIvDFPYs");
        setField(term439968, term439968.getClass(), "amount", "edezuOwgXC");
        setBooleanField(term439968, term439968.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term439968, term439968.getClass(), "globalIdVerified", true);
        setBooleanField(term439968, term439968.getClass(), "useBlacklist", true);
        setBooleanField(term439968, term439968.getClass(), "agreeFee", false);
        setField(term439968, term439968.getClass(), "maximumTrustlines", term440057);
        setField(term439968, term439968.getClass(), "minBalance", term440059);
        setField(term439968, term439968.getClass(), "maxBalance", term440061);
        setField(term439968, term439968.getClass(), "maxXrpFeePerTransaction", "djqrCkWlSO");
        setField(term439968, term439968.getClass(), "retryOfId", term440075);
        setField(term439968, term439968.getClass(), "paymentType", enum820);
        setField(term439968, term439968.getClass(), "snapshotTrustlineIssuerClassicAddress", "IMmqTqRbMQ");
        setField(term439968, term439968.getClass(), "snapshotCurrencyName", "RwUWxedusR");
        setLongField(term440117, term440117.getClass(), "fastTime", 1861544991334L);
        setField(term440117, term440117.getClass(), "cdate", null);
        setField(term439968, term439968.getClass(), "startTime", term440117);
        setField(term439968, term439968.getClass(), "frequency", enum821);
        setLongField(term440130, term440130.getClass(), "fastTime", 1461369589632L);
        setField(term440130, term440130.getClass(), "cdate", null);
        setField(term439968, term439968.getClass(), "repeatUntilDate", term440130);
        setField(term439968, term439968.getClass(), "email", "vkaqRBBRBQ");
        setBooleanField(term439968, term439968.getClass(), "autoApprove", true);
        term440145 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term440145;
        callMethod(klass, "autoApprove", argTypes, term439968, args);
    }

};


