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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_startTime_161113325020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435258;
     Object term435435;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_startTime_161113325020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term435347 = new Integer(-916584829);
        Double term435349 = new Double(0.1858089882752998);
        Double term435351 = new Double(0.2440697646709713);
        Long term435365 = new Long(-2025074482272457806L);
        Class<? extends Object> term435518 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term435517 = ((Class) term435518).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term435517).setAccessible(true);
        Object enum811 = ((Field) term435517).get((Object) null);
        Class<? extends Object> term435936 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term435935 = ((Class) term435936).getDeclaredField((String) "MONTHLY");
        ((Field) term435935).setAccessible(true);
        Object enum812 = ((Field) term435935).get((Object) null);
        term435258 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term435407 = newInstance(Class.forName("java.util.Date"));
        Object term435420 = newInstance(Class.forName("java.util.Date"));
        setField(term435258, term435258.getClass(), "memo", "UOdzdFoNYj");
        setField(term435258, term435258.getClass(), "fromClassicAddress", "ZwBPdbsbRN");
        setField(term435258, term435258.getClass(), "fromSigningPublicKey", "IQnlZuBQxZ");
        setField(term435258, term435258.getClass(), "fromPrivateKey", "hzcJWOOcer");
        setField(term435258, term435258.getClass(), "trustlineIssuerClassicAddress", "yaNlisVBqV");
        setField(term435258, term435258.getClass(), "currencyName", "VimZthzAjg");
        setField(term435258, term435258.getClass(), "amount", "pjAQQPoGVc");
        setBooleanField(term435258, term435258.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term435258, term435258.getClass(), "globalIdVerified", false);
        setBooleanField(term435258, term435258.getClass(), "useBlacklist", false);
        setBooleanField(term435258, term435258.getClass(), "agreeFee", false);
        setField(term435258, term435258.getClass(), "maximumTrustlines", term435347);
        setField(term435258, term435258.getClass(), "minBalance", term435349);
        setField(term435258, term435258.getClass(), "maxBalance", term435351);
        setField(term435258, term435258.getClass(), "maxXrpFeePerTransaction", "EadswYFxjJ");
        setField(term435258, term435258.getClass(), "retryOfId", term435365);
        setField(term435258, term435258.getClass(), "paymentType", enum811);
        setField(term435258, term435258.getClass(), "snapshotTrustlineIssuerClassicAddress", "VMvmHcwAPc");
        setField(term435258, term435258.getClass(), "snapshotCurrencyName", "hTygVULtJv");
        setLongField(term435407, term435407.getClass(), "fastTime", 1357058409917L);
        setField(term435407, term435407.getClass(), "cdate", null);
        setField(term435258, term435258.getClass(), "startTime", term435407);
        setField(term435258, term435258.getClass(), "frequency", enum812);
        setLongField(term435420, term435420.getClass(), "fastTime", 1676560881210L);
        setField(term435420, term435420.getClass(), "cdate", null);
        setField(term435258, term435258.getClass(), "repeatUntilDate", term435420);
        setField(term435258, term435258.getClass(), "email", "WHPjgbWEQW");
        setBooleanField(term435258, term435258.getClass(), "autoApprove", false);
        term435435 = newInstance(Class.forName("java.util.Date"));
        setLongField(term435435, term435435.getClass(), "fastTime", 1331231295277L);
        setField(term435435, term435435.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term435435;
        callMethod(klass, "startTime", argTypes, term435258, args);
    }

};


