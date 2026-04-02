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

public class FsePaymentRequest_FsePaymentRequestBuilder_paymentType_121272447416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585894;
     Object enum1102;

    public FsePaymentRequest_FsePaymentRequestBuilder_paymentType_121272447416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term585943 = new ArrayList();
        ((ArrayList) term585943).add("oPbrBDThmz");
        ((ArrayList) term585943).add("ZODtqxzDCW");
        ((ArrayList) term585943).add("zkZJHDoPhw");
        ((ArrayList) term585943).add("HQgXhFPwUc");
        ((ArrayList) term585943).add("aMWamnhwTr");
        ((ArrayList) term585943).add("HaHCKzGZQv");
        ((ArrayList) term585943).add("AbzkZFggJr");
        ((ArrayList) term585943).add("tslhBSOQwF");
        ((ArrayList) term585943).add("aodFIcJOBQ");
        Long term586120 = new Long(-815959191072093025L);
        Class<? extends Object> term586374 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term586373 = ((Class) term586374).getDeclaredField((String) "FLAT");
        ((Field) term586373).setAccessible(true);
        enum1102 = ((Field) term586373).get((Object) null);
        Long term586166 = new Long(1118770099037757943L);
        Class<? extends Object> term586778 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term586777 = ((Class) term586778).getDeclaredField((String) "WEEKLY");
        ((Field) term586777).setAccessible(true);
        Object enum1103 = ((Field) term586777).get((Object) null);
        term585894 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term586067 = newInstance(Class.forName("java.util.Date"));
        Object term586178 = newInstance(Class.forName("java.util.Date"));
        setField(term585894, term585894.getClass(), "memo", "alatWSHAtR");
        setField(term585894, term585894.getClass(), "fromClassicAddress", "TazhZNYNKv");
        setField(term585894, term585894.getClass(), "fromSigningPublicKey", "BWFimCbVSH");
        setField(term585894, term585894.getClass(), "fromPrivateKey", "eSdRlAUiRy");
        setField(term585894, term585894.getClass(), "toClassicAddresses", term585943);
        setField(term585894, term585894.getClass(), "amount", "sTtkOgTFht");
        setLongField(term586067, term586067.getClass(), "fastTime", 1828985247753L);
        setField(term586067, term586067.getClass(), "cdate", null);
        setField(term585894, term585894.getClass(), "startTime", term586067);
        setField(term585894, term585894.getClass(), "destinationTag", "rlGSusXzPG");
        setField(term585894, term585894.getClass(), "trustlineIssuerClassicAddress", "whEcuYLKhg");
        setField(term585894, term585894.getClass(), "currencyName", "gQBDWeRxHb");
        setBooleanField(term585894, term585894.getClass(), "agreeFee", true);
        setField(term585894, term585894.getClass(), "maxXrpFeePerTransaction", "yaQlsOUqsP");
        setBooleanField(term585894, term585894.getClass(), "globalIdVerified", true);
        setBooleanField(term585894, term585894.getClass(), "useBlacklist", true);
        setField(term585894, term585894.getClass(), "retryOfId", term586120);
        setField(term585894, term585894.getClass(), "paymentType", enum1102);
        setField(term585894, term585894.getClass(), "snapshotTrustlineIssuerClassicAddress", "YGhgJpKqvy");
        setField(term585894, term585894.getClass(), "snapshotCurrencyName", "wmQJCThqui");
        setField(term585894, term585894.getClass(), "nftIssuingAddress", "LPKxpcUvxv");
        setField(term585894, term585894.getClass(), "nftTaxon", term586166);
        setField(term585894, term585894.getClass(), "frequency", enum1103);
        setLongField(term586178, term586178.getClass(), "fastTime", 1402960883581L);
        setField(term586178, term586178.getClass(), "cdate", null);
        setField(term585894, term585894.getClass(), "repeatUntilDate", term586178);
        setField(term585894, term585894.getClass(), "email", "nRWGYtemZz");
        setBooleanField(term585894, term585894.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Object[] args = new Object[1];
        args[0] = enum1102;
        callMethod(klass, "paymentType", argTypes, term585894, args);
    }

};


