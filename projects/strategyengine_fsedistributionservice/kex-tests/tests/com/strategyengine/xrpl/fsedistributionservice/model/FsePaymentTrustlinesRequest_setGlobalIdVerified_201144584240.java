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

public class FsePaymentTrustlinesRequest_setGlobalIdVerified_201144584240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59645;
     Object term59812;

    public FsePaymentTrustlinesRequest_setGlobalIdVerified_201144584240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term59734 = new Integer(1328271830);
        Double term59736 = new Double(0.11577948268926874);
        Double term59738 = new Double(0.5617009352394552);
        Long term59752 = new Long(7862575738391801707L);
        Class<? extends Object> term59895 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term59894 = ((Class) term59895).getDeclaredField((String) "FLAT");
        ((Field) term59894).setAccessible(true);
        Object enum107 = ((Field) term59894).get((Object) null);
        Class<? extends Object> term60289 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term60288 = ((Class) term60289).getDeclaredField((String) "DAILY");
        ((Field) term60288).setAccessible(true);
        Object enum108 = ((Field) term60288).get((Object) null);
        term59645 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term59786 = newInstance(Class.forName("java.util.Date"));
        Object term59797 = newInstance(Class.forName("java.util.Date"));
        setField(term59645, term59645.getClass(), "memo", "JKGueoHesL");
        setField(term59645, term59645.getClass(), "fromClassicAddress", "CRAUqtVBkU");
        setField(term59645, term59645.getClass(), "fromSigningPublicKey", "DddqUYfomL");
        setField(term59645, term59645.getClass(), "fromPrivateKey", "YQwoogpPyi");
        setField(term59645, term59645.getClass(), "trustlineIssuerClassicAddress", "rnPhHoorxj");
        setField(term59645, term59645.getClass(), "currencyName", "GuwJLKquuI");
        setField(term59645, term59645.getClass(), "amount", "vYMCjgnztg");
        setBooleanField(term59645, term59645.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term59645, term59645.getClass(), "globalIdVerified", false);
        setBooleanField(term59645, term59645.getClass(), "useBlacklist", false);
        setBooleanField(term59645, term59645.getClass(), "agreeFee", true);
        setField(term59645, term59645.getClass(), "maximumTrustlines", term59734);
        setField(term59645, term59645.getClass(), "minBalance", term59736);
        setField(term59645, term59645.getClass(), "maxBalance", term59738);
        setField(term59645, term59645.getClass(), "maxXrpFeePerTransaction", "YupgKTSEiI");
        setField(term59645, term59645.getClass(), "retryOfId", term59752);
        setField(term59645, term59645.getClass(), "paymentType", enum107);
        setField(term59645, term59645.getClass(), "snapshotTrustlineIssuerClassicAddress", "HuOUlaFmvJ");
        setField(term59645, term59645.getClass(), "snapshotCurrencyName", "dWVwcwFGNo");
        setLongField(term59786, term59786.getClass(), "fastTime", 1335389252058L);
        setField(term59786, term59786.getClass(), "cdate", null);
        setField(term59645, term59645.getClass(), "startTime", term59786);
        setField(term59645, term59645.getClass(), "frequency", enum108);
        setLongField(term59797, term59797.getClass(), "fastTime", 1616833468678L);
        setField(term59797, term59797.getClass(), "cdate", null);
        setField(term59645, term59645.getClass(), "repeatUntilDate", term59797);
        setField(term59645, term59645.getClass(), "email", "PNdLRrSAIY");
        setBooleanField(term59645, term59645.getClass(), "autoApprove", false);
        term59812 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term59812;
        callMethod(klass, "setGlobalIdVerified", argTypes, term59645, args);
    }

};


