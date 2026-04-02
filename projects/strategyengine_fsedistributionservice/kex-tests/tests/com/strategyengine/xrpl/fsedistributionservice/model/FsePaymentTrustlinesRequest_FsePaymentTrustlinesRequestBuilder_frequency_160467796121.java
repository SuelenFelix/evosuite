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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_frequency_160467796121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436338;
     Object enum815;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_frequency_160467796121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term436427 = new Integer(-2131181468);
        Double term436429 = new Double(0.7977455176064363);
        Double term436431 = new Double(0.5329919447422633);
        Long term436445 = new Long(-5564465000971559787L);
        Class<? extends Object> term436608 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term436607 = ((Class) term436608).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term436607).setAccessible(true);
        Object enum813 = ((Field) term436607).get((Object) null);
        Class<? extends Object> term437026 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term437025 = ((Class) term437026).getDeclaredField((String) "MONTHLY");
        ((Field) term437025).setAccessible(true);
        Object enum814 = ((Field) term437025).get((Object) null);
        term436338 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term436487 = newInstance(Class.forName("java.util.Date"));
        Object term436500 = newInstance(Class.forName("java.util.Date"));
        setField(term436338, term436338.getClass(), "memo", "OXBxOEoBXG");
        setField(term436338, term436338.getClass(), "fromClassicAddress", "qunJPciJWS");
        setField(term436338, term436338.getClass(), "fromSigningPublicKey", "ucJGaAjWGS");
        setField(term436338, term436338.getClass(), "fromPrivateKey", "thdbTbQhSP");
        setField(term436338, term436338.getClass(), "trustlineIssuerClassicAddress", "TnvDurRKCl");
        setField(term436338, term436338.getClass(), "currencyName", "wKWVWhtCTC");
        setField(term436338, term436338.getClass(), "amount", "KyKQStmGux");
        setBooleanField(term436338, term436338.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term436338, term436338.getClass(), "globalIdVerified", false);
        setBooleanField(term436338, term436338.getClass(), "useBlacklist", true);
        setBooleanField(term436338, term436338.getClass(), "agreeFee", true);
        setField(term436338, term436338.getClass(), "maximumTrustlines", term436427);
        setField(term436338, term436338.getClass(), "minBalance", term436429);
        setField(term436338, term436338.getClass(), "maxBalance", term436431);
        setField(term436338, term436338.getClass(), "maxXrpFeePerTransaction", "TLJEXuSRxb");
        setField(term436338, term436338.getClass(), "retryOfId", term436445);
        setField(term436338, term436338.getClass(), "paymentType", enum813);
        setField(term436338, term436338.getClass(), "snapshotTrustlineIssuerClassicAddress", "JWZFPLoHkl");
        setField(term436338, term436338.getClass(), "snapshotCurrencyName", "kWjqFgZlvD");
        setLongField(term436487, term436487.getClass(), "fastTime", 1767400601277L);
        setField(term436487, term436487.getClass(), "cdate", null);
        setField(term436338, term436338.getClass(), "startTime", term436487);
        setField(term436338, term436338.getClass(), "frequency", enum814);
        setLongField(term436500, term436500.getClass(), "fastTime", 1421960467917L);
        setField(term436500, term436500.getClass(), "cdate", null);
        setField(term436338, term436338.getClass(), "repeatUntilDate", term436500);
        setField(term436338, term436338.getClass(), "email", "MGUVOXFsPy");
        setBooleanField(term436338, term436338.getClass(), "autoApprove", true);
        Class<? extends Object> term437429 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term437428 = ((Class) term437429).getDeclaredField((String) "ANNUALLY");
        ((Field) term437428).setAccessible(true);
        enum815 = ((Field) term437428).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Object[] args = new Object[1];
        args[0] = enum815;
        callMethod(klass, "frequency", argTypes, term436338, args);
    }

};


