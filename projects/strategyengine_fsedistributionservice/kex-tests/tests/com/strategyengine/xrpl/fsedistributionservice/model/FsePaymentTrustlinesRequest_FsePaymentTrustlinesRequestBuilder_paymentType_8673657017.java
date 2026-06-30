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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_paymentType_8673657017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431976;
     Object enum805;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_paymentType_8673657017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term432065 = new Integer(-749861210);
        Double term432067 = new Double(0.5597136413549945);
        Double term432069 = new Double(0.28292420012823627);
        Long term432083 = new Long(1486119760230388070L);
        Class<? extends Object> term432235 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term432234 = ((Class) term432235).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term432234).setAccessible(true);
        enum805 = ((Field) term432234).get((Object) null);
        Class<? extends Object> term432653 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term432652 = ((Class) term432653).getDeclaredField((String) "ANNUALLY");
        ((Field) term432652).setAccessible(true);
        Object enum806 = ((Field) term432652).get((Object) null);
        term431976 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term432125 = newInstance(Class.forName("java.util.Date"));
        Object term432139 = newInstance(Class.forName("java.util.Date"));
        setField(term431976, term431976.getClass(), "memo", "wAunlbFkbk");
        setField(term431976, term431976.getClass(), "fromClassicAddress", "MphslRDPYz");
        setField(term431976, term431976.getClass(), "fromSigningPublicKey", "RIZmTXYeSJ");
        setField(term431976, term431976.getClass(), "fromPrivateKey", "oNrGulyKDD");
        setField(term431976, term431976.getClass(), "trustlineIssuerClassicAddress", "LsZMMPfJyo");
        setField(term431976, term431976.getClass(), "currencyName", "DIjPJLZkuN");
        setField(term431976, term431976.getClass(), "amount", "mFGvDIAaPV");
        setBooleanField(term431976, term431976.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term431976, term431976.getClass(), "globalIdVerified", false);
        setBooleanField(term431976, term431976.getClass(), "useBlacklist", false);
        setBooleanField(term431976, term431976.getClass(), "agreeFee", false);
        setField(term431976, term431976.getClass(), "maximumTrustlines", term432065);
        setField(term431976, term431976.getClass(), "minBalance", term432067);
        setField(term431976, term431976.getClass(), "maxBalance", term432069);
        setField(term431976, term431976.getClass(), "maxXrpFeePerTransaction", "tSBiNpJBCG");
        setField(term431976, term431976.getClass(), "retryOfId", term432083);
        setField(term431976, term431976.getClass(), "paymentType", enum805);
        setField(term431976, term431976.getClass(), "snapshotTrustlineIssuerClassicAddress", "NoJsnVjWEQ");
        setField(term431976, term431976.getClass(), "snapshotCurrencyName", "ZgJlwtRyss");
        setLongField(term432125, term432125.getClass(), "fastTime", 1533344214271L);
        setField(term432125, term432125.getClass(), "cdate", null);
        setField(term431976, term431976.getClass(), "startTime", term432125);
        setField(term431976, term431976.getClass(), "frequency", enum806);
        setLongField(term432139, term432139.getClass(), "fastTime", 1336055249844L);
        setField(term432139, term432139.getClass(), "cdate", null);
        setField(term431976, term431976.getClass(), "repeatUntilDate", term432139);
        setField(term431976, term431976.getClass(), "email", "jaUSNGgyPJ");
        setBooleanField(term431976, term431976.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Object[] args = new Object[1];
        args[0] = enum805;
        callMethod(klass, "paymentType", argTypes, term431976, args);
    }

};


