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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_repeatUntilDate_4063967622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437824;
     Object term437991;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_repeatUntilDate_4063967622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term437913 = new Integer(282916351);
        Double term437915 = new Double(0.7046974927834232);
        Double term437917 = new Double(0.6896952303224777);
        Long term437931 = new Long(-6320896470659278539L);
        Class<? extends Object> term438074 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term438073 = ((Class) term438074).getDeclaredField((String) "FLAT");
        ((Field) term438073).setAccessible(true);
        Object enum816 = ((Field) term438073).get((Object) null);
        Class<? extends Object> term438468 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term438467 = ((Class) term438468).getDeclaredField((String) "DAILY");
        ((Field) term438467).setAccessible(true);
        Object enum817 = ((Field) term438467).get((Object) null);
        term437824 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term437965 = newInstance(Class.forName("java.util.Date"));
        Object term437976 = newInstance(Class.forName("java.util.Date"));
        setField(term437824, term437824.getClass(), "memo", "RvPuKTmuhO");
        setField(term437824, term437824.getClass(), "fromClassicAddress", "bRYuMVvhgr");
        setField(term437824, term437824.getClass(), "fromSigningPublicKey", "NQpLpxNFZU");
        setField(term437824, term437824.getClass(), "fromPrivateKey", "MrOKRjSFWl");
        setField(term437824, term437824.getClass(), "trustlineIssuerClassicAddress", "jAanNWfdUH");
        setField(term437824, term437824.getClass(), "currencyName", "ZrgHSWiWuW");
        setField(term437824, term437824.getClass(), "amount", "oluLwslgub");
        setBooleanField(term437824, term437824.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term437824, term437824.getClass(), "globalIdVerified", false);
        setBooleanField(term437824, term437824.getClass(), "useBlacklist", false);
        setBooleanField(term437824, term437824.getClass(), "agreeFee", false);
        setField(term437824, term437824.getClass(), "maximumTrustlines", term437913);
        setField(term437824, term437824.getClass(), "minBalance", term437915);
        setField(term437824, term437824.getClass(), "maxBalance", term437917);
        setField(term437824, term437824.getClass(), "maxXrpFeePerTransaction", "ZpIBiZjLAq");
        setField(term437824, term437824.getClass(), "retryOfId", term437931);
        setField(term437824, term437824.getClass(), "paymentType", enum816);
        setField(term437824, term437824.getClass(), "snapshotTrustlineIssuerClassicAddress", "oVqBRwuHXG");
        setField(term437824, term437824.getClass(), "snapshotCurrencyName", "tDVqIrnItY");
        setLongField(term437965, term437965.getClass(), "fastTime", 1516529064202L);
        setField(term437965, term437965.getClass(), "cdate", null);
        setField(term437824, term437824.getClass(), "startTime", term437965);
        setField(term437824, term437824.getClass(), "frequency", enum817);
        setLongField(term437976, term437976.getClass(), "fastTime", 1648891197244L);
        setField(term437976, term437976.getClass(), "cdate", null);
        setField(term437824, term437824.getClass(), "repeatUntilDate", term437976);
        setField(term437824, term437824.getClass(), "email", "QTYhuHxYVL");
        setBooleanField(term437824, term437824.getClass(), "autoApprove", false);
        term437991 = newInstance(Class.forName("java.util.Date"));
        setLongField(term437991, term437991.getClass(), "fastTime", 1526325187733L);
        setField(term437991, term437991.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term437991;
        callMethod(klass, "repeatUntilDate", argTypes, term437824, args);
    }

};


