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

public class FsePaymentRequest_getMemo_2311725466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346020;

    public FsePaymentRequest_getMemo_2311725466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term346069 = new ArrayList();
        ((ArrayList) term346069).add("VttmtsKyxG");
        ((ArrayList) term346069).add("khWWCkfcej");
        ((ArrayList) term346069).add("oLcqGUafTJ");
        ((ArrayList) term346069).add("tpCyOHBwCr");
        ((ArrayList) term346069).add("bYzsBKdrQG");
        Long term346198 = new Long(-1719189544794576143L);
        Class<? extends Object> term346411 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term346410 = ((Class) term346411).getDeclaredField((String) "FLAT");
        ((Field) term346410).setAccessible(true);
        Object enum674 = ((Field) term346410).get((Object) null);
        Long term346244 = new Long(60910260492008727L);
        Class<? extends Object> term346815 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term346814 = ((Class) term346815).getDeclaredField((String) "DAILY");
        ((Field) term346814).setAccessible(true);
        Object enum675 = ((Field) term346814).get((Object) null);
        term346020 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term346145 = newInstance(Class.forName("java.util.Date"));
        Object term346255 = newInstance(Class.forName("java.util.Date"));
        setField(term346020, term346020.getClass(), "memo", "AENfrCHOWz");
        setField(term346020, term346020.getClass(), "fromClassicAddress", "vOizGhjCwb");
        setField(term346020, term346020.getClass(), "fromSigningPublicKey", "gRxfRNHbpA");
        setField(term346020, term346020.getClass(), "fromPrivateKey", "RousChzHaG");
        setField(term346020, term346020.getClass(), "toClassicAddresses", term346069);
        setField(term346020, term346020.getClass(), "amount", "mpbJPoDJrt");
        setLongField(term346145, term346145.getClass(), "fastTime", 1784358717925L);
        setField(term346145, term346145.getClass(), "cdate", null);
        setField(term346020, term346020.getClass(), "startTime", term346145);
        setField(term346020, term346020.getClass(), "destinationTag", "zgNKRTasbS");
        setField(term346020, term346020.getClass(), "trustlineIssuerClassicAddress", "MWoRTqbNjN");
        setField(term346020, term346020.getClass(), "currencyName", "vkfjosBNuv");
        setBooleanField(term346020, term346020.getClass(), "agreeFee", false);
        setField(term346020, term346020.getClass(), "maxXrpFeePerTransaction", "iLDMxuomcS");
        setBooleanField(term346020, term346020.getClass(), "globalIdVerified", false);
        setBooleanField(term346020, term346020.getClass(), "useBlacklist", true);
        setField(term346020, term346020.getClass(), "retryOfId", term346198);
        setField(term346020, term346020.getClass(), "paymentType", enum674);
        setField(term346020, term346020.getClass(), "snapshotTrustlineIssuerClassicAddress", "ZKAeSUzlfH");
        setField(term346020, term346020.getClass(), "snapshotCurrencyName", "DhaSZfoyDB");
        setField(term346020, term346020.getClass(), "nftIssuingAddress", "ilrkwpiztX");
        setField(term346020, term346020.getClass(), "nftTaxon", term346244);
        setField(term346020, term346020.getClass(), "frequency", enum675);
        setLongField(term346255, term346255.getClass(), "fastTime", 1662200363293L);
        setField(term346255, term346255.getClass(), "cdate", null);
        setField(term346020, term346020.getClass(), "repeatUntilDate", term346255);
        setField(term346020, term346020.getClass(), "email", "GJNAZXvWWN");
        setBooleanField(term346020, term346020.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemo", argTypes, term346020, args);
    }

};


