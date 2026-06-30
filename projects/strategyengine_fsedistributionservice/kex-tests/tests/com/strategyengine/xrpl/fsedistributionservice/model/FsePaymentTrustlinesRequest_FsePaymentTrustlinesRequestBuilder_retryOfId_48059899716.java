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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_retryOfId_48059899716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430932;
     Object term431100;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_retryOfId_48059899716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term431021 = new Integer(548228925);
        Double term431023 = new Double(0.23129126164078717);
        Double term431025 = new Double(0.6047138318674447);
        Long term431039 = new Long(8578275227150470673L);
        Class<? extends Object> term431183 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term431182 = ((Class) term431183).getDeclaredField((String) "FLAT");
        ((Field) term431182).setAccessible(true);
        Object enum803 = ((Field) term431182).get((Object) null);
        Class<? extends Object> term431577 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term431576 = ((Class) term431577).getDeclaredField((String) "WEEKLY");
        ((Field) term431576).setAccessible(true);
        Object enum804 = ((Field) term431576).get((Object) null);
        term430932 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term431073 = newInstance(Class.forName("java.util.Date"));
        Object term431085 = newInstance(Class.forName("java.util.Date"));
        setField(term430932, term430932.getClass(), "memo", "BbWYbJZcOk");
        setField(term430932, term430932.getClass(), "fromClassicAddress", "rclaaiJLVZ");
        setField(term430932, term430932.getClass(), "fromSigningPublicKey", "yQuEIHUdPd");
        setField(term430932, term430932.getClass(), "fromPrivateKey", "YGcdcqZBhD");
        setField(term430932, term430932.getClass(), "trustlineIssuerClassicAddress", "YIiYmjYKPu");
        setField(term430932, term430932.getClass(), "currencyName", "BNzmlooMdf");
        setField(term430932, term430932.getClass(), "amount", "txAQLBXsin");
        setBooleanField(term430932, term430932.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term430932, term430932.getClass(), "globalIdVerified", true);
        setBooleanField(term430932, term430932.getClass(), "useBlacklist", false);
        setBooleanField(term430932, term430932.getClass(), "agreeFee", false);
        setField(term430932, term430932.getClass(), "maximumTrustlines", term431021);
        setField(term430932, term430932.getClass(), "minBalance", term431023);
        setField(term430932, term430932.getClass(), "maxBalance", term431025);
        setField(term430932, term430932.getClass(), "maxXrpFeePerTransaction", "ZxLrAouHPX");
        setField(term430932, term430932.getClass(), "retryOfId", term431039);
        setField(term430932, term430932.getClass(), "paymentType", enum803);
        setField(term430932, term430932.getClass(), "snapshotTrustlineIssuerClassicAddress", "YsBtkFntbK");
        setField(term430932, term430932.getClass(), "snapshotCurrencyName", "iaYOIMpvRZ");
        setLongField(term431073, term431073.getClass(), "fastTime", 1488280711575L);
        setField(term431073, term431073.getClass(), "cdate", null);
        setField(term430932, term430932.getClass(), "startTime", term431073);
        setField(term430932, term430932.getClass(), "frequency", enum804);
        setLongField(term431085, term431085.getClass(), "fastTime", 1717831623082L);
        setField(term431085, term431085.getClass(), "cdate", null);
        setField(term430932, term430932.getClass(), "repeatUntilDate", term431085);
        setField(term430932, term430932.getClass(), "email", "sTmWbdFIlX");
        setBooleanField(term430932, term430932.getClass(), "autoApprove", true);
        term431100 = new Long(-2637969624924642017L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term431100;
        callMethod(klass, "retryOfId", argTypes, term430932, args);
    }

};


