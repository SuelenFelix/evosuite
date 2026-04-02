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
import java.lang.Boolean;

public class FsePaymentRequest_FsePaymentRequestBuilder_globalIdVerified_46673939913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term582307;
     Object term582534;

    public FsePaymentRequest_FsePaymentRequestBuilder_globalIdVerified_46673939913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term582356 = new ArrayList();
        ((ArrayList) term582356).add("ioALTdlErP");
        ((ArrayList) term582356).add("STfCNGDtwG");
        ((ArrayList) term582356).add("NobNtKSnxv");
        Long term582461 = new Long(-1658464487289836175L);
        Class<? extends Object> term582657 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term582656 = ((Class) term582657).getDeclaredField((String) "FLAT");
        ((Field) term582656).setAccessible(true);
        Object enum1096 = ((Field) term582656).get((Object) null);
        Long term582507 = new Long(-8555339910220884151L);
        Class<? extends Object> term583061 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term583060 = ((Class) term583061).getDeclaredField((String) "WEEKLY");
        ((Field) term583060).setAccessible(true);
        Object enum1097 = ((Field) term583060).get((Object) null);
        term582307 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term582408 = newInstance(Class.forName("java.util.Date"));
        Object term582519 = newInstance(Class.forName("java.util.Date"));
        setField(term582307, term582307.getClass(), "memo", "nCZmfjNayQ");
        setField(term582307, term582307.getClass(), "fromClassicAddress", "rhQpxOnBRb");
        setField(term582307, term582307.getClass(), "fromSigningPublicKey", "jMaSLvIsta");
        setField(term582307, term582307.getClass(), "fromPrivateKey", "sSyiKfZXEJ");
        setField(term582307, term582307.getClass(), "toClassicAddresses", term582356);
        setField(term582307, term582307.getClass(), "amount", "oTXsJGhPMO");
        setLongField(term582408, term582408.getClass(), "fastTime", 1768695548781L);
        setField(term582408, term582408.getClass(), "cdate", null);
        setField(term582307, term582307.getClass(), "startTime", term582408);
        setField(term582307, term582307.getClass(), "destinationTag", "VKSQjeEwka");
        setField(term582307, term582307.getClass(), "trustlineIssuerClassicAddress", "rvyeTnWWlf");
        setField(term582307, term582307.getClass(), "currencyName", "qwmljKSBGF");
        setBooleanField(term582307, term582307.getClass(), "agreeFee", false);
        setField(term582307, term582307.getClass(), "maxXrpFeePerTransaction", "ehfwuHuJCM");
        setBooleanField(term582307, term582307.getClass(), "globalIdVerified", true);
        setBooleanField(term582307, term582307.getClass(), "useBlacklist", false);
        setField(term582307, term582307.getClass(), "retryOfId", term582461);
        setField(term582307, term582307.getClass(), "paymentType", enum1096);
        setField(term582307, term582307.getClass(), "snapshotTrustlineIssuerClassicAddress", "ohwhPbAzfO");
        setField(term582307, term582307.getClass(), "snapshotCurrencyName", "oaMSqXLhMk");
        setField(term582307, term582307.getClass(), "nftIssuingAddress", "JOvcnvkLRz");
        setField(term582307, term582307.getClass(), "nftTaxon", term582507);
        setField(term582307, term582307.getClass(), "frequency", enum1097);
        setLongField(term582519, term582519.getClass(), "fastTime", 1354748133345L);
        setField(term582519, term582519.getClass(), "cdate", null);
        setField(term582307, term582307.getClass(), "repeatUntilDate", term582519);
        setField(term582307, term582307.getClass(), "email", "pxPcAihzBr");
        setBooleanField(term582307, term582307.getClass(), "autoApprove", true);
        term582534 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term582534;
        callMethod(klass, "globalIdVerified", argTypes, term582307, args);
    }

};


